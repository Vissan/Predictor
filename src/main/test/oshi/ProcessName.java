package oshi;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;

//cannot working
public class ProcessName {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String processName = runtimeMXBean.getName();
//        设置进程名
        Field jvmField = runtimeMXBean.getClass().getDeclaredField("jvm");
        jvmField.setAccessible(true);
        jvmField.set(runtimeMXBean, "test");
        System.out.println(runtimeMXBean.getName());
    }
}
