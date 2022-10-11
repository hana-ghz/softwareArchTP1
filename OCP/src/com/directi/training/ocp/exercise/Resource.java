package com.directi.training.ocp.exercise;

public abstract class Resource
{
    protected ShapeType resourceId;

    public abstract double markResourceSlotFree();
    public abstract double markResourceSlotBusy();
    public abstract double findFreeResourceSlot();

}
