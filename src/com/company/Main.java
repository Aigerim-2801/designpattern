package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bus schoolBus = new SchoolBus();
        schoolBus.display();
        schoolBus.performRunFor();
        schoolBus.performRunIn();
        schoolBus.performFill();
        System.out.println();
        Bus shiftBus = new ShiftBus();
        shiftBus.display();
        shiftBus.performRunFor();
        shiftBus.performRunIn();
        shiftBus.performFill();
        System.out.println();
        Bus toyBus = new ToyBus();
        toyBus.performFill();
        toyBus.setFillBehavior(new FillWithFuel());
        toyBus.performFill();
    }
}
