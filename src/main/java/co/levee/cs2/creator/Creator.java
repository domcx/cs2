package co.levee.cs2.creator;

import co.levee.cs2.Homework3.LetterGrade;
import co.levee.cs2.Homework3.YourCarTrip;
import co.levee.cs2.InClass.Account;
import co.levee.cs2.uml.Engine;
import com.google.gson.Gson;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Creator {
    Engine engine = new Engine();
    Gson gson = new Gson();

    public void test() throws Exception {
        System.out.println(gson.toJson(new Problem(engine, "problem1", LetterGrade.class)));
    }

    public static void main(String[] args) throws Exception {
        Creator creator = new Creator();
        creator.test();
    }
}
