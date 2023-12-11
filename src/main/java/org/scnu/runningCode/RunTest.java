package org.scnu.runningCode;

import org.junit.Test;
import org.scnu.ast.util.JavaParserUtil;
import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.AstInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;
import org.scnu.hardwareObject.HardwareInfo;
import org.scnu.runningCode.testSort.RunCode;
import org.scnu.utils.ReadArray;
import org.scnu.utils.WriteExcel;
import testCode.TwoSumUsingForLoops;

import java.util.concurrent.locks.ReentrantLock;

public class RunTest {

    public void detectSort() throws Exception {
        //引入系统监测工具
        SystemInfo si = new SystemInfo();
        //得到不变的系统参数
        String os = si.getOperationSystem();
        Integer processorCount = si.getProcessorCount();
        Long processorFreq = si.getProcessorFreq();
        Long virtualMemoryMax = si.getVirtualMemoryMax();
        Double powerSourcesCapacity = si.getPowerSourcesCapacity();
        Double prePowerUse = si.getPowerSourcesUseRate();
        Long prememInUse = si.getVirtualMemoryInUse();
        //从文件中读入一个数组,此处先模拟
        int[] nums = ReadArray.GenerateArray();
        ReentrantLock lock = new ReentrantLock();
        long beginTime = System.nanoTime();
        lock.lock();
        //此处需要加一个锁来保证测试代码的独立执行
        assert nums != null;
        CpuAndMemInUse inUse = new RunCode().insertSort(nums);
//        Thread.sleep(10000);
        Double postPowerUse = si.getPowerSourcesUseRate();
        lock.unlock();
        long endTime = System.nanoTime();
        //转换成毫秒
        long duringTime = (endTime - beginTime) / 1000000;
        Long memInUse = inUse.getMemoryInUse() - prememInUse;
        Double cpuLoadInUse = inUse.getCpuLoadInUse();
        Double powerUsageRate = postPowerUse - prePowerUse;
        String fileName = "/Users/vissan/IdeaProjects/Predictor/src/main/java/org/scnu/runningCode/testSort/RunCode.java";
        String methodName = "insertSort";
        AstInfo astInfo = JavaParserUtil.parseMethod(fileName, methodName);
        HardwareInfo hardwareInfo = new HardwareInfo(fileName, os, processorCount, processorFreq, virtualMemoryMax, memInUse, powerSourcesCapacity, powerUsageRate, duringTime, cpuLoadInUse);
        new WriteExcel().WriteToExcel(hardwareInfo, astInfo, nums.length);
    }

    @Test
    public void test() throws Exception {
        new RunTest().detectSort();
    }

}
