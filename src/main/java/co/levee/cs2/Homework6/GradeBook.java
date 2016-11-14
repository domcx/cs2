package co.levee.cs2.Homework6;

// GradeBook.java
// GradeBook class using a two-dimensional array to store grades.
public class GradeBook {
    private String courseName; // name of course this grade book represents
    private int[][] grades; // two-dimensional array of student grades

    // two-argument constructor initializes courseName and grades array
    public GradeBook(String name, int[][] gradesArray) {
        courseName = name; // initialize courseName
        grades = gradesArray; // store grades
    } // end two-argument GradeBook constructor

    // method to set the course name
    public void setCourseName(String name) {
        courseName = name; // store the course name
    } // end method setCourseName

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    } // end method getCourseName

    // display a welcome message to the GradeBook user
    public void displayMessage() {
// getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());
    } // end method displayMessage

    // perform various operations on the data
    public void processGrades() {
// output grades array
        outputGrades();
// call methods getMinimum and getMaximum
        System.out.printf("\n%s %d\n%s %d\n\n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
// output grade distribution chart of all grades on all tests
        outputBarChart();
    } // end method processGrades

    public int getMinimum() {
        int lowest = -1;
        for (int[] a : grades) {
            for (int v : a)
                if (lowest == -1 || v < lowest) lowest = v;
        }
        return lowest;
    }

    public int getMaximum() {
        int max = -1;
        for (int[] a : grades) {
            for (int v : a)
                if (v > max) max = v;
        }
        return max;
    }

    public double avgGrade(int stu) {
        double buf = 0;
        for (int v : grades[stu])
            buf += v;
        return buf / grades[stu].length;
    }

    public void outputBarChart() {
        int[] distrib = new int[10];
        for (int[] a : grades) {
            for (int v : a) {
                int dis = (v / 10);
                if (dis == 10) dis--;
                distrib[dis]++;
            }
        }
        for (int i = 0; i < distrib.length; i++) {
            System.out.printf(" (%02d-%02d)%s", i * 10, ((i == 9) ? 100 : i * 10 + 9), i == 9 ? " " : "  ");
            for (int a = 0; a < distrib[i]; a++) {
                System.out.print("|");
            }
            System.out.println();
        }

    }

    public void outputGrades() {
        for (int[] anA : grades) {
            for (int anAnA : anA) {
                System.out.printf("%s ", anAnA);
            }
            System.out.println();
        }
    }

} // end class GradeBook
