package co.levee.cs2.Homework8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Dominic Moorman on 11/10/16.
 */
public class FleschKincaid {

    public static void main(String[] args) throws IOException {
        System.out.println(new FleschKincaid("./tests/testing.txt").open().read().close().readingLevel());
    }

    private String name;
    private Scanner scanner;
    private FileOutputStream outputStream;
    private int syllables, sentences, words;

    public FleschKincaid(String name) throws IOException {
        this.name = name;
    }

    public FleschKincaid open() throws IOException {
        File f = new File(name);
        scanner = new Scanner(f);
        outputStream = new FileOutputStream(f, true);
        return this;
    }

    public FleschKincaid close() throws IOException {
        scanner.close();
        outputStream.close();
        return this;
    }

    public double readingLevel() {
        return 0.39 * (words / sentences) + 11.8 * (syllables / words) - 15.59;
    }

    public FleschKincaid read() throws IOException {
        scanner.useDelimiter(Pattern.compile("[\\.|\\?|\\!]{1,3}"));
        while (scanner.hasNext()) {
            //Scan
            String eval = scanner.next();
            if (eval.length() < 1) continue; // Skip if empty
            this.sentences++;
            // Words
            String[] words = eval.split(" ");
            if (words.length < 1) continue; // Skip if empty
            System.out.println(words.length);
            this.words += words.length;
            // Syllables
            for (String s : words) {
                if (s.length() < 1) continue; // Skip if empty
                this.syllables += s.length() / 3 + 1;
            }
        }
        System.out.printf("Found %d words, %d syllables and %d sentences.\n", words, syllables, sentences);
        return this;
    }
}
