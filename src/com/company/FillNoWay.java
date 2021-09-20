package com.company;

public class FillNoWay implements FillBehavior{
    @Override
    public void fill() {
        System.out.println("I can't fill");
    }
}
