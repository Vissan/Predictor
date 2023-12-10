package oshi;

import org.junit.Test;
import oshi.hardware.*;
import oshi.software.os.OperatingSystem;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SystemInfoTest {

    public void getPlatformEnum() {
        PlatformEnum platform = SystemInfo.getCurrentPlatform();
        System.out.println(platform.getName());
        // Exercise the main method
    }

    public static void getOperationSystem() {
        SystemInfo si = new SystemInfo();
        OperatingSystem os = si.getOperatingSystem();
        System.out.println(String.valueOf(os));
    }

    public static void getHardwareInfo() {
        HardwareAbstractionLayer abstractionLayer = new SystemInfo().getHardware();
        ComputerSystem computerSystem = abstractionLayer.getComputerSystem();
        CentralProcessor processor = abstractionLayer.getProcessor();
        VirtualMemory virtualMemory = abstractionLayer.getMemory().getVirtualMemory();
        List<PowerSource> powerSources = abstractionLayer.getPowerSources();
        System.out.println("cs: "+ computerSystem.getModel()+" processor: "+processor.getLogicalProcessorCount()+" Freq: "+ Arrays.toString(processor.getCurrentFreq()) +
                " vMMax: "+virtualMemory.getVirtualMax() + " vMInUse: " + virtualMemory.getVirtualInUse() + " PowerSources: " + powerSources);
        System.out.println("*****");
        String string = abstractionLayer.getPowerSources().toString();
        String[] split = string.split(",");
        System.out.println(split[5] + " " + split[14]);

    }

    public static void getPowerSources() {
        HardwareAbstractionLayer abstractionLayer = new SystemInfo().getHardware();
        String string = abstractionLayer.getPowerSources().toString();
        String[] split = string.split(",");
        String s = split[14].split(": ")[1];
        System.out.println(s);
    }

    @Test
    public void test() {
        SystemInfoTest.getPowerSources();
    }
}
