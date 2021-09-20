package com.company;

public class SchoolBus extends Bus{

    public SchoolBus() {
        this.setRunForBehavior(new RunForSchoolServices());
        this.setRunInBehavior(new RunInCity());
        this.setFillBehavior(new FillWithGasoline());
    }

    @Override
    public void display() {
        System.out.println("I'm school bus");
    }
}
