package org.scnu.hardwareObject;

import com.alibaba.fastjson2.util.DoubleToDecimal;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HardwareInfo {
    private String ClassName;

    private String OperationSystem;

    private Integer processorNum;

    private Long processorFreq;

    private Long MaxVirtualMemory;

    private Long virtualMemoryInUse;

    private Double DesignPowerCapacity;

    private Double PowerUsageRate;

    private Long duringTime;

    private Double CpuInLoad;


    public HardwareInfo(String ClassName, String operationSystem, Integer processorNum, Long processorFreq, Long maxVirtualMemory, Long virtualMemoryInUse, Double designPowerCapacity, Double powerUsageRate, Long duringTime, Double cpuInLoad) {
        this.ClassName = ClassName;
        OperationSystem = operationSystem;
        this.processorNum = processorNum;
        this.processorFreq = processorFreq;
        MaxVirtualMemory = maxVirtualMemory;
        this.virtualMemoryInUse = virtualMemoryInUse;
        DesignPowerCapacity = designPowerCapacity;
        PowerUsageRate = powerUsageRate;
        this.duringTime = duringTime;
        CpuInLoad = cpuInLoad;
    }
}