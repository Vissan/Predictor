package oshi;


import org.junit.Test;
import oshi.hardware.CentralProcessor;

import java.util.List;

public class CentralProcessorTest {

    public void getProcessor() {
        SystemInfo si = new SystemInfo();
        CentralProcessor p = si.getHardware().getProcessor();
        CentralProcessor.ProcessorIdentifier pi = p.getProcessorIdentifier();
        System.out.println(pi.getVendor());
        System.out.println(pi.getMicroarchitecture());
        System.out.println(pi.getProcessorID());
        System.out.println(pi.getModel());
        System.out.println(pi.getName());
        System.out.println(pi.getVendorFreq());
    }

    @Test
    public void test() {
        new CentralProcessorTest().getProcessor();
    }


}
