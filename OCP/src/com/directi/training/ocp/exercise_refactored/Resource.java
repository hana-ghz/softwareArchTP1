package com.directi.training.ocp.exercise;

public abstract class Resource
{
    public abstract void markResourceSlotFree();
    public abstract void markResourceSlotBusy();
    public abstract int  findFreeResourceSlot();

}
