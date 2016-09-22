package co.levee.cs2.TestDeconstruction;

import com.sun.xml.internal.stream.events.XMLEventAllocatorImpl;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dominic Moorman on 9/13/16.
 *
 */
public class TestReader {
    private int total, passsed;

    private XMLStreamReader xmlr;
    private XMLInputFactory xmlif;

    private Result current;

    private List<Result> results;

    private String parent;

    private boolean exists = true;

    public TestReader(Class c) throws XMLStreamException {
        String file = "./tests/" + c.getSimpleName() + "Test.xml";
        parent = c.getSimpleName();
        results = new ArrayList<>();
        xmlif = XMLInputFactory.newInstance();
        xmlif.setEventAllocator(new XMLEventAllocatorImpl());
        try {
            xmlr = xmlif.createXMLStreamReader(file, new FileInputStream(file));
        }catch (FileNotFoundException e) {
            exists = false;
        }
    }

    public TestReader read() throws Exception {
        if (!exists) return this;
        int eventType = xmlr.getEventType();
        if (eventType != XMLEvent.START_DOCUMENT)
            throw new Exception("Start of document not found.");

        boolean reading = false;

        while (xmlr.hasNext()) {
            xmlr.next();
            if (xmlr.isStartElement() || xmlr.isEndElement()) {
                String elementName = xmlr.getName().toString();

                if (elementName.equals("test")) {
                    if (xmlr.isStartElement())
                        setup();
                    else
                        flush();
                }
                else if (elementName.equals("output"))
                    reading = xmlr.isStartElement();

            }  else if (xmlr.isCharacters() && reading) {
                current.append(xmlr.getText());
            }
        }
        return this;
    }

    private void setup() {
        current = new Result(Integer.parseInt(xmlr.getAttributeValue(0)), xmlr.getAttributeValue(2), xmlr.getAttributeValue(3).equals("passed"), "");
    }

    private void flush() {
        results.add(current);
        current = null;
    }

    public Set result() {
        if (!exists) return null;
        return new Set(parent, results.toArray(new Result[]{}));
    }
}
