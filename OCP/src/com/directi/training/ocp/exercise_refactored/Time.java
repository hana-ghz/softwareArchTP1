package com.directi.training.ocp.exercise;

public class Time extends Resource
{
    private final int _resourceId;


    public Time(double resourceId)
    {
        _resourceId = resourceId;
    }

    @Override
    public void markResourceSlotFree(int resourceId)
    {
    }

    @Override
    public void markResourceSlotBusy(int resourceId)
    {
    }

    @Override
    public int findFreeResourceSlot()
    {
        return 0;
    }
}