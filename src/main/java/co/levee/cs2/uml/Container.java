package co.levee.cs2.uml;

import java.util.ArrayList;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Container {
    private String parent;
    private Description[] methods;
    private Description[] fields;

    public Container(String parent, Description[] all) {
        this.parent = parent;
        ArrayList<Description> me = new ArrayList<>();
        ArrayList<Description> fe = new ArrayList<>();
        for (Description d : all) {
            if (d.isMethod())
                me.add(d);
            else
                fe.add(d);
        }
        methods = me.toArray(new Description[]{});
        fields = fe.toArray(new Description[]{});
    }
}
