package com.directi.training.ocp.exercise_refactored;

public abstract class Resource
{
    public abstract void markResourceSlotFree();
    public abstract void markResourceSlotBusy();
    public abstract int  findFreeResourceSlot();

}
