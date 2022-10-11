package com.directi.training.ocp.exercise;

public class ResourceAllocator
{

    public int allocate( Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeResourceSlot();
        markResourceSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource)
    {
       resource.markResourceSlotFree() 
    }

}
