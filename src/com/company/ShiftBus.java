package com.company;

public class ShiftBus  extends Bus{

    public ShiftBus() {
        this.setRunForBehavior(new RunForShiftServices());
        this.setRunInBehavior(new RunInIntercity());
        this.setFillBehavior(new FillWithGas());
    }

    @Override
    public void display() {
        System.out.println("I'm a double-decker shift bus");
    }
}
