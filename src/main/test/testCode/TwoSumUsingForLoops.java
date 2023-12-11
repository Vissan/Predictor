package testCode;

import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;

public class TwoSumUsingForLoops {
    public CpuAndMemInUse findTwoSum(int[] list, int sum) {
        if (list == null || list.length < 2 ) return null;
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int [] twoSumArray = new int[2];
        L1:for (int i= 0;i<list.length;i++)
        {
            for (int j=i+1; j<list.length;j++){
                if (list[i]+list[i+j]== sum) {
                    twoSumArray[0] = i;
                    twoSumArray[1] = i+j;
                    break L1;
                }
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

}