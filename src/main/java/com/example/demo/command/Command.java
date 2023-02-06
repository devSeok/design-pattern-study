package com.example.demo.command;

public interface Command extends Comparable<Command>{

    public void execute();
}
