package org.scnu.detect;

import cn.hutool.system.oshi.CpuInfo;
import cn.hutool.system.oshi.OshiUtil;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.lang.management.MemoryManagerMXBean;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SystemInfo {

    oshi.SystemInfo systemInfo = null;

    public SystemInfo() {
        systemInfo = new oshi.SystemInfo();
    }

    public String getOperationSystem() {
        OperatingSystem os = systemInfo.getOperatingSystem();
        return os.toString();
    }

    public Integer getProcessorCount() {
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        return processor.getLogicalProcessorCount();
    }

    public Long getProcessorFreq() {
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        long sum = Arrays.stream(processor.getCurrentFreq()).sum();
        return (sum / processor.getLogicalProcessorCount());
    }

    public Long getVirtualMemoryMax() {
        return systemInfo.getHardware().getMemory().getVirtualMemory().getVirtualMax();
    }

    public Long getVirtualMemoryInUse() {
        return (OshiUtil.getMemory().getTotal() - OshiUtil.getMemory().getAvailable()) / 1024 / 1024;
    }

    public Double getPowerSourcesUseRate() {
        HardwareAbstractionLayer abstractionLayer = systemInfo.getHardware();
        String string = abstractionLayer.getPowerSources().toString();
        String[] split = string.split(",");
        String s = split[5].split(": ")[1].split("mW")[0];
        return Double.parseDouble(s);
    }

    public Double getPowerSourcesCapacity() {
        HardwareAbstractionLayer abstractionLayer = new oshi.SystemInfo().getHardware();
        String string = abstractionLayer.getPowerSources().toString();
        String[] split = string.split(",");
        String s = split[14].split(": ")[1];
        return Double.parseDouble(s);
    }

    public Double getCpuLoadAverage() {
        CpuInfo cpuInfo = OshiUtil.getCpuInfo();
        double free = cpuInfo.getFree();
        DecimalFormat format = new DecimalFormat("#.00");
        return Double.parseDouble(format.format(100.0D - free));
    }

}
