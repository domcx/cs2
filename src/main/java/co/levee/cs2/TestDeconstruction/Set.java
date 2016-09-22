package co.levee.cs2.TestDeconstruction;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Set {
    private String parent;
    private Result[] results;

    public Set(String parent, Result[] results) {
        this.parent = parent;
        this.results = results;
    }

    public String getParent() {
        return parent;
    }

    public Result[] getResults() {
        return results;
    }
}
