package oshi;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerMonitor {
    public interface IOKit extends Library {
        IOKit INSTANCE = Native.load("IOKit", IOKit.class);

        int kIOMasterPortDefault = 0;
        int kIOPlatformPluginType = ('p' << 24) + ('l' << 16) + ('a' << 8) + 't';
        int kIOBatteryInfoKey = ('b' << 24) + ('a' << 16) + ('t' << 8) + 't';

        class CFTypeRef extends Structure {
            public Pointer pointer;

            @Override
            protected java.util.List<String> getFieldOrder() {
                return java.util.Collections.singletonList("pointer");
            }
        }

        Pointer IOServiceGetMatchingService(int masterPort, CFTypeRef matching);
        Pointer IORegistryEntryCreateCFProperty(int entry, CFTypeRef key, int allocator, int options);
        int IOObjectRelease(int object);
    }

    public static void main(String[] args) {
        int masterPort = IOKit.kIOMasterPortDefault;
        IOKit.CFTypeRef matching = new IOKit.CFTypeRef();
        Pointer service = IOKit.INSTANCE.IOServiceGetMatchingService(masterPort, matching);
        IntByReference entry = new IntByReference(service.getInt(0));

        IOKit.CFTypeRef key = new IOKit.CFTypeRef();
        key.pointer = Pointer.createConstant(IOKit.kIOBatteryInfoKey);

        Pointer batteryInfo = IOKit.INSTANCE.IORegistryEntryCreateCFProperty(entry.getValue(), key, 0, 0);

        // 解析 batteryInfo，并输出电池信息
        System.out.println("Battery Info: " + batteryInfo);

    }
}
