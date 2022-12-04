package com.ysoztf.interpreter;

public class Context {
    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "Context{" +
                "input='" + input + '\'' +
                ", output='" + output + '\'' +
                '}';
    }
}
