package org.scnu.runningCode.testSort;

import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;

public class RunCode {

    public CpuAndMemInUse insertSort(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            if (i == array.length / 2) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
            }
            array[preIndex + 1] = current;
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }
}
