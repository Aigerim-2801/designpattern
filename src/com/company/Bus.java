package com.company;

public abstract class Bus {
    private RunInBehavior runInBehavior;
    private RunForBehavior runForBehavior;
    private FillBehavior fillBehavior;

    public Bus(RunInBehavior runInBehavior, RunForBehavior runForBehavior, FillBehavior fillBehavior){
        this.runInBehavior =runInBehavior;
        this.runForBehavior = runForBehavior;
        this.fillBehavior = fillBehavior;
    }

    protected Bus() {
    }


    public void performRunIn(){ this.runInBehavior.runIn(); }

    public void performRunFor(){
        this.runForBehavior.runFor();
    }

    public void performFill(){
        this.fillBehavior.fill();
    }

    public abstract void display();

    public RunInBehavior getRunInBehavior() { return runInBehavior; }

    public void setRunInBehavior(RunInBehavior runInBehavior) { this.runInBehavior = runInBehavior; }

    public RunForBehavior getRunForBehavior() { return runForBehavior; }

    public void setRunForBehavior(RunForBehavior runForBehavior) { this.runForBehavior = runForBehavior; }

    public FillBehavior getFillBehavior() { return fillBehavior; }

    public void setFillBehavior(FillBehavior fillBehavior) { this.fillBehavior = fillBehavior; }
}
