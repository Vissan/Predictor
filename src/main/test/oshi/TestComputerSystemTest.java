package oshi;

import org.junit.Test;
import oshi.hardware.ComputerSystem;

public class TestComputerSystemTest {

    @Test
    public void testComputerSystem() {
        SystemInfo si = new SystemInfo();
        ComputerSystem cs = si.getHardware().getComputerSystem();
        System.out.println(cs.getFirmware());
        System.out.println(cs.getBaseboard());
    }

}
