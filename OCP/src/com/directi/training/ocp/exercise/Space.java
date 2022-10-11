package com.directi.training.ocp.exercise;

public class Space extends Resource
{
    private final int _resourceId;

    public Space(double resourceId)
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
