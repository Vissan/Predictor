package org.scnu.hardwareObject;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CpuAndMemInUse {

    public Long MemoryInUse;

    public Double CpuLoadInUse;

    public CpuAndMemInUse(Long memoryInUse, Double cpuLoadInUse) {
        MemoryInUse = memoryInUse;
        CpuLoadInUse = cpuLoadInUse;
    }

    @Override
    public String toString() {
        return "CpuAndMemInUse{" +
                "MemoryInUse=" + MemoryInUse +
                ", CpuLoadInUse=" + CpuLoadInUse +
                '}';
    }
}
