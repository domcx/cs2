package co.levee.cs2.creator;

import co.levee.cs2.Homework4.DaysInMonth;
import co.levee.cs2.Homework5.CalcArea;
import co.levee.cs2.Homework5.TotalArea;
import co.levee.cs2.uml.Engine;
import com.google.gson.Gson;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Creator {
    Engine engine = new Engine();
    Gson gson = new Gson();

    public void test() throws Exception {
        System.out.println(gson.toJson(new Problem(engine, "problem 4", CalcArea.class, TotalArea.class)));
    }

    public static void main(String[] args) throws Exception {
        Creator creator = new Creator();
        creator.test();
    }
}
