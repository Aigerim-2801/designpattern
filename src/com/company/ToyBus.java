package com.company;

public class ToyBus extends Bus{

    public ToyBus() {
        this.setFillBehavior(new FillNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a toy bus for children");
    }
}