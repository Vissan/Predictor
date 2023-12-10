package oshi;

import cn.hutool.system.oshi.CpuInfo;
import cn.hutool.system.oshi.OshiUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import oshi.hardware.CentralProcessor;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;


import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class Test {

    /**
     * 获取cpu利用率
     */
    public static void getOsInfo() {
        CpuInfo cpuInfo = OshiUtil.getCpuInfo();
        double free = cpuInfo.getFree();
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("cpu利用率：" + Double.parseDouble(format.format(100.0D - free)));
    }

    /**
     * 获取内存数据
     */
    public static void getMemoryInfo() {
        System.out.println("内存总量：" + OshiUtil.getMemory().getTotal() / 1024 / 1024);
        System.out.println("已用内存：" + OshiUtil.getMemory().getAvailable() / 1024 / 1024);
    }

    public static void testSystemUsage() throws InterruptedException {
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        long[] prevTicks = processor.getSystemCpuLoadTicks();
        long[][] prevProcTicks = processor.getProcessorCpuLoadTicks();
        //Running code
        Thread.sleep(1000);
        long[] ticks = processor.getSystemCpuLoadTicks();
        long user = ticks[CentralProcessor.TickType.USER.getIndex()] - prevTicks[CentralProcessor.TickType.USER.getIndex()];
        long nice = ticks[CentralProcessor.TickType.NICE.getIndex()] - prevTicks[CentralProcessor.TickType.NICE.getIndex()];
        long sys = ticks[CentralProcessor.TickType.SYSTEM.getIndex()] - prevTicks[CentralProcessor.TickType.SYSTEM.getIndex()];
        long idle = ticks[CentralProcessor.TickType.IDLE.getIndex()] - prevTicks[CentralProcessor.TickType.IDLE.getIndex()];
        long iowait = ticks[CentralProcessor.TickType.IOWAIT.getIndex()] - prevTicks[CentralProcessor.TickType.IOWAIT.getIndex()];
        long irq = ticks[CentralProcessor.TickType.IRQ.getIndex()] - prevTicks[CentralProcessor.TickType.IRQ.getIndex()];
        long softirq = ticks[CentralProcessor.TickType.SOFTIRQ.getIndex()] - prevTicks[CentralProcessor.TickType.SOFTIRQ.getIndex()];
        long steal = ticks[CentralProcessor.TickType.STEAL.getIndex()] - prevTicks[CentralProcessor.TickType.STEAL.getIndex()];
        long totalCpu = user + nice + sys + idle + iowait + irq + softirq + steal;
        System.out.println(String.format(Locale.ROOT, "CPU load: %.1f%%",
                processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100));
        //average core load
//        double[] loadAverage = processor.getSystemLoadAverage(3);
//        System.out.println("CPU load averages:"
//                + (loadAverage[0] < 0 ? " N/A" : String.format(Locale.ROOT, " %.2f", loadAverage[0]))
//                + (loadAverage[1] < 0 ? " N/A" : String.format(Locale.ROOT, " %.2f", loadAverage[1]))
//                + (loadAverage[2] < 0 ? " N/A" : String.format(Locale.ROOT, " %.2f", loadAverage[2])));
//        System.out.println(Arrays.stream(loadAverage).average());
    }

    public static void testCpu() {
        CpuInfo cpuInfo = OshiUtil.getCpuInfo();
        double free = cpuInfo.getFree();
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("cpu利用率：" + Double.parseDouble(format.format(100.0D - free)));
    }

    //get most cpu loads of threads
    public static void getFirstCpuUsed() {
        OperatingSystem os = new SystemInfo().getOperatingSystem();
        List<OSProcess> procs = os.getProcesses(OperatingSystem.ProcessFiltering.ALL_PROCESSES, OperatingSystem.ProcessSorting.CPU_DESC, 5);
        for (OSProcess process : procs) {
            //进程名，进程ID，进程CPU使用率
            System.out.println(String.format("name:%s PID: %d CPU:%.3f",
                    process.getName(),process.getProcessID(),
                    process.getProcessCpuLoadCumulative()));
        }
    }

    @org.junit.Test
    public void test() throws InterruptedException {
        System.out.println();
    }
}
