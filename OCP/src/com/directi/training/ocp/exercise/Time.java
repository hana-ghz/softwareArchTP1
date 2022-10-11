package com.directi.training.ocp.exercise;

public class Time extends Resource
{
    private final int _resourceId;


    public Time(double resourceId)
    {
        _resourceId = resourceId;
    }

    @Override
    public markResourceSlotFree()
    {
    }

    @Override
    public double markResourceSlotBusy()
    {
    }

    @Override
    public double findFreeResourceSlot()
    {
        return 0;
    }
}
