package co.levee.cs2.creator;

import co.levee.cs2.TestDeconstruction.Set;
import co.levee.cs2.TestDeconstruction.TestReader;
import co.levee.cs2.uml.Container;
import co.levee.cs2.uml.Engine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Problem {
    private String name;

    private List<Set> testSets = new ArrayList<>();
    private Container[] descriptions;

    public Problem(Engine eng, String name, Class... classes) throws Exception {
        this.name = name;
        for (Class c : classes) {
            Set t = new TestReader(c).read().result();
            if (t != null)
                testSets.add(t);
        }
        descriptions = eng.generate(classes);
    }

    public String getName() {
        return name;
    }

    public Container[] getDescriptions() {
        return descriptions;
    }
}
