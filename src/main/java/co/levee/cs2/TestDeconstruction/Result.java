package co.levee.cs2.TestDeconstruction;

public class Result {
    private boolean passed;
    private int duration;
    private String name;
    private String output;

    public Result(int duration, String name, boolean passed, String output) {
        this.name = name.substring(name.indexOf(".") + 1);
        this.passed = passed;
        this.duration = duration;
        this.output = output;
    }

    public boolean isPassed() {
        return passed;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public String getOutput() {
        return output;
    }

    public void append(String string) {
        output += string;
    }

    @Override
    public String toString() {
        return "Set '" + name + "' lasted " + duration + "ms and " + (passed ? "passed" : "failed");
    }
}
