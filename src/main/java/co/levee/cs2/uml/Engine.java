package co.levee.cs2.uml;

import co.levee.cs2.Homework2.*;
import com.google.gson.Gson;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dominic Moorman on 9/6/16.
 */
public class Engine {

    private static final List<String> ignore = Arrays.asList("wait", "equals", "toString", "hashCode", "getClass", "notify", "notifyAll");

    public Container[] generate(Class... selectedClasses) {
        Container[] buf = new Container[selectedClasses.length];
        int i = 0;
        for (Class c : selectedClasses){
            buf[i++] = new Container(c.getSimpleName(), inspect(c));
        }
        return buf;
    }

    private Description[] inspect(Class cl) {
        ArrayList<Description> descriptions = new ArrayList<>();
        for (Field f : cl.getDeclaredFields()) {
            descriptions.add(new Description(f));
        }
        for (Constructor ctor : cl.getConstructors()) {
            descriptions.add(new Description(ctor));
        }
        for (Method method : cl.getDeclaredMethods()) {
            if (!ignore.contains(method.getName()))
                descriptions.add(new Description(method));
        }
        return descriptions.toArray(new Description[]{});
    }

    public static void main(String[] args) {
        // Tests
        Container[] out = new Engine().generate(BMICalc.class, CalcCircumference.class, SpaceDigits.class);
        Gson gson = new Gson();
        System.out.println(gson.toJson(out));
    }
}
