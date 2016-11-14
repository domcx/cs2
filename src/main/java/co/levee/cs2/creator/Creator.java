package co.levee.cs2.creator;

import co.levee.cs2.Homework4.DaysInMonth;
import co.levee.cs2.Homework5.CalcArea;
import co.levee.cs2.Homework5.TotalArea;
import co.levee.cs2.Homework6.GradeBook;
import co.levee.cs2.Homework6.Question1;
import co.levee.cs2.Homework6.Question2;
import co.levee.cs2.Homework6.Question3;
import co.levee.cs2.uml.Engine;
import com.google.gson.Gson;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Creator {
    Engine engine = new Engine();
    Gson gson = new Gson();

    public void test() throws Exception {
        Problem[] problems = {
                new Problem(engine, "Question 1", Question1.class),
                new Problem(engine, "Question 2", Question2.class),
                new Problem(engine, "Question 3", Question3.class),
                new Problem(engine, "Question 4", GradeBook.class),
        };
        System.out.println(gson.toJson(problems));
    }

    public static void main(String[] args) throws Exception {
        Creator creator = new Creator();
        creator.test();
    }
}
