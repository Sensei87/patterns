package com.pov.behavioral_patterns.chain_of_responsibility;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) {
        this.mask = mask;
    }
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}