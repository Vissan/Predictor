package org.scnu.runningCode.testSort;

import lombok.val;
import org.junit.Test;
import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;

import java.util.HashMap;
import java.util.Map;

public class RunCode {

    public CpuAndMemInUse test(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
            }
            array[preIndex + 1] = current;
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test1(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
            }
            array[preIndex + 1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 7 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 11 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test2(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
            }
            array[preIndex + 1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 7 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
            }
            array[preIndex + 1] = current;
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test3(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1]) {
                    case 1:
                        System.out.println("Case 1");
                        someFunction();
                        break;
                    case 2:
                        System.out.println("Case 2");
                        someFunction();
                        break;
                    case 3:
                        System.out.println("Case 3");
                        someFunction();
                        break;
                    // Add more cases here as needed
                    default:
                        System.out.println("Default case");
                        someFunction();
                        break;
                }
            }
            array[preIndex + 1] = current;

            // Add a switch statement to handle different cases based on array[i] value
            switch (array[i]) {
                case 1:
                    System.out.println("Case 1");
                    someFunction();
                    break;
                case 2:
                    System.out.println("Case 2");
                    someFunction();
                    break;
                case 3:
                    System.out.println("Case 3");
                    someFunction();
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default case");
                    someFunction();
                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test4(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1]) {
                    case 1:
                        someFunction();
                        break;
                    case 2:
                        someFunction();
                        break;
                    case 3:
                        someFunction();
                        break;
                    // Add more cases here as needed
                    default:
                        someFunction();
                        break;
                }
            }
            array[preIndex + 1] = current;

            // Add a switch statement to handle different cases based on array[i] value
            switch (array[i]) {
                case 1:
                    someFunction();
                    break;
                case 2:
                    someFunction();
                    break;
                case 3:
                    someFunction();
                    break;
                // Add more cases here as needed
                default:
                    someFunction();
                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test5(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1]) {
                    case 1:
                        if (array[i] == 2) {
                            someFunction();
                        } else {
                            someFunction();
                        }
                        break;
                    case 2:
                        if (array[i] == 3) {
                            someFunction();
                        } else {
                            someFunction();
                        }
                        break;
                    case 3:
                        if (array[i] == 1) {
                            someFunction();
                        } else {
                            someFunction();
                        }
                        break;
                    // Add more cases here as needed
                    default:
                        someFunction();
                        break;
                }
            }
            array[preIndex + 1] = current;

            // Add a switch statement to handle different cases based on array[i] value
            switch (array[i]) {
                case 1:
                    if (array[i + 1] == 2) {
                        someFunction();
                    } else {
                        someFunction();
                    }
                    break;
                case 2:
                    if (array[i + 1] == 3) {
                        someFunction();
                    } else {
                        someFunction();
                    }
                    break;
                case 3:
                    if (array[i + 1] == 1) {
                        someFunction();
                    } else {
                        someFunction();
                    }
                    break;
                // Add more cases here as needed
                default:
                    someFunction();
                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test6(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1] % 4) {
                    case 1:
                        if (array[i] == 2) {
                            System.out.println("Case 2");
                            someFunction();
                        } else {
                            System.out.println("Case 2");
                            someFunction();
                        }
                        break;
                    case 2:
                        if (array[i] == 3) {
                            System.out.println("Case 2");
                            someFunction();
                        } else {
                            System.out.println("Case 2");
                            someFunction();
                        }
                        break;
                    case 3:
                        if (array[i] == 1) {
                            System.out.println("Case 2");
                            someFunction();
                        } else {
                            someFunction();
                        }
                        break;
                    // Add more cases here as needed
                    default:
                        someFunction();
                        break;
                }
            }
            array[preIndex + 1] = current;

            // Add a switch statement to handle different cases based on array[i] value
            switch (array[i] % 4) {
                case 1:
                    if (array[i + 1] == 2) {
                        System.out.println("Case 2");
                        someFunction();
                    } else {
                        System.out.println("Case 2");
                        someFunction();
                    }
                    break;
                case 2:
                    if (array[i + 1] == 3) {
                        System.out.println("Case 2");
                        someFunction();
                    } else {
                        System.out.println("Case 2");
                        someFunction();
                    }
                    break;
                case 3:
                    if (array[i + 1] == 1) {
                        System.out.println("Case 2");
                        someFunction();
                    } else {
                        someFunction();
                    }
                    break;
                // Add more cases here as needed
                default:
                    someFunction();
                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test7(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1]) {
                    case 1:
                        someFunction();
                        break;
                    case 2:
                        someFunction();
                        someFunction();
                        break;
                    case 3:
                        long xxx = getFact(3);
                        break;
                    // Add more cases here as needed
                    default:
                        long xxxxx = getFact(3);
                        break;
                }
            }
            array[preIndex + 1] = current;

            // Add a switch statement to handle different cases based on array[i] value
            switch (array[i]) {
                case 1:
                    someFunction();
                    break;
                case 2:
                    someFunction();
                    someFunction();
                    break;
                case 3:
                    long xx = getFact(3);
                    break;
                // Add more cases here as needed
                default:
                    long x = getFact(2);
                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test8(int[] array) {
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
            if (i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1]) {
                    case 1:
                        System.out.println("Case 1: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        someFunction();
                        break;
                    case 2:
                        System.out.println("Case 2: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        break;
                    case 3:
                        System.out.println("Case 3: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        someFunction();
                        someFunction();
                        break;
                    case 4:
                        System.out.println("Case 4: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        long xyx = getFact(3);
                        break;
                    case 5:
                        System.out.println("Case 5: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        long y = getFact(3);
                        break;
                    // Add more cases here as needed
                    default:
                        System.out.println("Default Case: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        long yy = getFact(3);
                        break;
                }
            }
            array[preIndex + 1] = current;

            // Add a switch statement to handle different cases based on array[i] value
            switch (array[i]) {
                case 1:
                    System.out.println("Case 6: Array Element at index " + i);
                    long xx = getFact(3);
                    break;
                case 2:
                    System.out.println("Case 7: Array Element at index " + i);
                    long x = getFact(3);
                    break;
                case 3:
                    System.out.println("Case 8: Array Element at index " + i);
                    someFunction();
                    someFunction();
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    someFunction();
                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test9(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean condition1 = true;
        boolean condition2 = false;

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (condition1 && i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                switch (array[preIndex + 1]) {
                    case 1:
                        System.out.println("Case 1: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        someFunction();
                        break;
                    // Add more cases here as needed
                    default:
                        System.out.println("Default Case: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        long x = getFact(4);
                        break;
                }
            } else if (condition2) {
                System.out.println("Condition 2 met");
                someFunction();
            } else {
                System.out.println("Neither condition 1 nor condition 2 met");
                someFunction();
                long y = getFact(5);
            }

            array[preIndex + 1] = current;

            switch (array[i]) {
                case 1:
                    System.out.println("Case 6: Array Element at index " + i);
                    someFunction();
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    long xxx = getFact(6);
                    break;
            }

            if (array[i] % 2 == 0) {
                System.out.println("Array element is even");
                someFunction();
            } else {
                System.out.println("Array element is odd");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test10(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean condition1 = true;
        boolean condition2 = false;

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (condition1 && i == array.length / 4) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();

                switch (array[preIndex + 1]) {
                    case 1:
                        System.out.println("Case 1: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        someFunction();
                        break;
                    // Add more cases here as needed
                    default:
                        System.out.println("Default Case: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                        long x = getFact(4);
                        long v = getFact(4);
                        long b = getFact(4);
                        break;
                }
            } else if (condition2) {
                System.out.println("Condition 2 met");
                someFunction();
            } else {
                someFunction();
                long y = getFact(5);
            }

            array[preIndex + 1] = current;

            if (array[i] % 2 == 0) {
                System.out.println("Array element is even");
                someFunction();
            } else {
                long ccc = 96325;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test11(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean condition1 = true;
        boolean condition2 = false;

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (condition1 && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();

                    switch (array[preIndex + 1]) {
                        case 1:
                            System.out.println("Case 1: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                            someFunction();
                            break;
                        // Add more cases here as needed
                        default:
                            System.out.println("Default Case: CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse);
                            someFunction();
                            someFunction();
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error fetching CPU load or memory info: " + e.getMessage());
                }
            } else if (condition2) {
                System.out.println("Condition 2 met");
                long sfgs = getFact(2);
            } else {
                System.out.println("Neither condition 1 nor condition 2 met");
                someFunction();
            }

            array[preIndex + 1] = current;

            switch (array[i]) {
                case 1:
                    System.out.println("Case 6: Array Element at index " + i);
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    long sffs = getFact(3);
                    break;
            }

            if (array[i] % 2 == 0) {
                System.out.println("Array element is even");
                long sf = getFact(3);
            } else {
                System.out.println("Array element is odd");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test12(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.8) {
                        result += " - CRITICAL: High CPU Usage";
                    }
                } catch (Exception e) {
                    System.out.println("Error fetching CPU load or memory info: " + e.getMessage());
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 2 == 0) {
                    result += " - EVEN number at halfway point";
                } else {
                    result += " - ODD number at halfway point";
                }
            } else {
                long a = getFact(5);
                long b = getFact(4);
                result = "Neither condition A nor condition B met";
            }

            System.out.println(result);
            array[preIndex + 1] = current;
            someFunction();
            someFunction();
            someFunction();
            someFunction();
            switch (array[i]) {
                case 1:
                    System.out.println("Case 1: Array Element at index " + i);
                    break;
                case 2:
                    System.out.println("Case 2: Array Element at index " + i);
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    break;
            }

            if (array[i] % 2 == 0) {
                System.out.println("Array element is even");
            } else {
                System.out.println("Array element is odd");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test13(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.8) {
                        someFunction();
                        result += " - CRITICAL: High CPU Usage";
                    } else if (cpuLoadAverage > 0.5) {
                        result += " - WARNING: Moderate CPU Usage";
                    } else {
                        someFunction();
                        long a = getFact(5);
                        result += " - NORMAL: Low CPU Usage";
                    }
                } catch (Exception e) {
                    System.out.println("Error fetching CPU load or memory info: " + e.getMessage());
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 2 == 0) {
                    someFunction();
                    result += " - EVEN number at halfway point";
                } else {
                    result += " - ODD number at halfway point";
                }
            } else {
                result = "Neither condition A nor condition B met";
            }

            System.out.println(result);
            array[preIndex + 1] = current;
            someFunction();
            switch (array[i]) {
                case 1:
                    System.out.println("Case 1: Array Element at index " + i);
                    break;
                case 2:
                    long b = getFact(10);
                    System.out.println("Case 2: Array Element at index " + i);
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    break;
            }

            if (array[i] % 2 == 0) {
                System.out.println("Array element is even");
            } else {
                System.out.println("Array element is odd");
            }

            if (i % 2 == 0) {
                someFunction();
                System.out.println("Current index is even");
            } else {
                System.out.println("Current index is odd");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test14(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            long a = getFact(5);
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    switch ((int) Math.floor(cpuLoadAverage * 10)) { // convert to integer between 0-10
                        case 10:
                        case 9:
                            result += " - CRITICAL: Very High CPU Usage";
                            someFunction();
                            break;
                        case 8:
                        case 7:
                            result += " - WARNING: High CPU Usage";
                            break;
                        case 6:
                        case 5:
                            result += " - CAUTION: Moderate CPU Usage";
                            long b = getFact(3);
                            break;
                        default:
                            result += " - NORMAL: Low CPU Usage";
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error fetching CPU load or memory info: " + e.getMessage());
                    someFunction();
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                switch (array[i] % 3) { // switch based on remainder when divided by 3
                    case 0:
                        result += " - MULTIPLE OF 3 at halfway point";
                        break;
                    case 1:
                        long c = getFact(5);
                        result += " - ODD number at halfway point";
                        break;
                    case 2:
                        result += " - EVEN but not multiple of 3 at halfway point";
                        break;
                }
            } else {
                result = "Neither condition A nor condition B met";
            }
            someFunction();
            System.out.println(result);
            array[preIndex + 1] = current;

            switch (array[i]) { // switch based on array element value
                case 1:
                    System.out.println("Case 1: Array Element at index " + i);
                    break;
                case 2:
                    int b = 7;
                    System.out.println("Case 2: Array Element at index " + i);
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    break;
            }

            switch (i % 4) { // switch based on remainder when index is divided by 4
                case 0:
                    System.out.println("Current index is divisible by 4");
                    break;
                case 1:
                    long fact = getFact(5);
                    System.out.println("Current index leaves a remainder of 1 when divided by 4");
                    break;
                case 2:
                    System.out.println("Current index leaves a remainder of 2 when divided by 4");
                    break;
                case 3:
                    System.out.println("Current index leaves a remainder of 3 when divided by 4");
                    break;
            }
            if (array[i] % 2 == 0) { // even/odd check for array element value using if-else instead of switch for variety
                System.out.println("Array element is even");
            } else {
                someFunction();
                System.out.println("Array element is odd");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test15(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.9) {
                        result += " - CRITICAL: Very High CPU Usage";
                    } else if (cpuLoadAverage > 0.7) {
                        result += " - WARNING: High CPU Usage";
                    } else if (cpuLoadAverage > 0.5) {
                        result += " - CAUTION: Moderate CPU Usage";
                    } else {
                        result += " - NORMAL: Low CPU Usage";
                    }
                } catch (Exception e) {
                    System.out.println("Error fetching CPU load or memory info: " + e.getMessage());
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 3 == 0) {
                    result += " - MULTIPLE OF 3 at halfway point";
                } else if (array[i] % 3 == 1) {
                    result += " - ODD number at halfway point";
                } else {
                    result += " - EVEN but not multiple of 3 at halfway point";
                }
            } else {
                result = "Neither condition A nor condition B met";
            }

            System.out.println(result);
            array[preIndex + 1] = current;
            someFunction();
            if (array[i] == 1) {
                System.out.println("Case 1: Array Element at index " + i);
            } else if (array[i] == 2) {
                System.out.println("Case 2: Array Element at index " + i);
            } else {
                System.out.println("Default Case for Array Element at index " + i);
            }
            long a = getFact(5);
            if (i % 4 == 0) {
                System.out.println("Current index is divisible by 4");
            } else if (i % 4 == 1) {
                someFunction();
                System.out.println("Current index leaves a remainder of 1 when divided by 4");
            } else if (i % 4 == 2) {
                System.out.println("Current index leaves a remainder of 2 when divided by 4");
            } else if (i % 4 == 3) {
                System.out.println("Current index leaves a remainder of 3 when divided by 4");
            } else {
                System.out.println("Current index is not divisible by 4");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test16(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.9) {
                        result += " - CRITICAL: Very High CPU Usage";
                    } else if (cpuLoadAverage > 0.7) {
                        result += " - WARNING: High CPU Usage";
                    } else if (cpuLoadAverage > 0.5) {
                        result += " - CAUTION: Moderate CPU Usage";
                    } else {
                        result += " - NORMAL: Low CPU Usage";
                    }
                } catch (Exception e) {
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 3 == 0) {
                    result += " - MULTIPLE OF 3 at halfway point";
                } else if (array[i] % 3 == 1) {
                    result += " - ODD number at halfway point";
                } else {
                    result += " - EVEN but not multiple of 3 at halfway point";
                }
            } else {
                result = "Neither condition A nor condition B met";
            }

            System.out.println(result);
            array[preIndex + 1] = current;
            someFunction();
            if (array[i] == 1) {
                System.out.println("Case 1: Array Element at index " + i);
            } else if (array[i] == 2) {

            } else {
                System.out.println("Default Case for Array Element at index " + i);
            }
            long a = getFact(5);
            if (i % 4 == 0) {
                System.out.println("Current index is divisible by 4");
            } else if (i % 4 == 1) {
                someFunction();

            } else if (i % 4 == 2) {
                System.out.println("Current index leaves a remainder of 2 when divided by 4");
            } else if (i % 4 == 3) {

            } else {

            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test17(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            someFunction();
            int x = 5;
            int y = 6;
            long v = getFact(4);
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.9) {
                        result += " - CRITICAL: Very High CPU Usage";
                    } else if (cpuLoadAverage > 0.7) {
                        result += " - WARNING: High CPU Usage";
                    } else if (cpuLoadAverage > 0.5) {
                        result += " - CAUTION: Moderate CPU Usage";
                    } else {
                        result += " - NORMAL: Low CPU Usage";
                    }
                } catch (Exception e) {
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 3 == 0) {
                    result += " - MULTIPLE OF 3 at halfway point";
                } else if (array[i] % 3 == 1) {
                    result += " - ODD number at halfway point";
                } else {
                    result += " - EVEN but not multiple of 3 at halfway point";
                }
            } else {
                result = "Neither condition A nor condition B met";
            }

            array[preIndex + 1] = current;
            someFunction();
            if (array[i] == 1) {
                System.out.println("Case 1: Array Element at index " + i);
            } else if (array[i] == 2) {

            } else {
            }
            long a = getFact(5);
            if (i % 4 == 0) {
                System.out.println("Current index is divisible by 4");
            } else if (i % 4 == 1) {
                someFunction();

            } else if (i % 4 == 2) {
                System.out.println("Current index leaves a remainder of 2 when divided by 4");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test18(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            someFunction();
            int x = 5;
            int y = 6;
            int w = 66;
            long z = getFact(3);
            long v = getFact(4);
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.9) {
                        result += " - CRITICAL: Very High CPU Usage";
                    } else if (cpuLoadAverage > 0.7) {
                        result += " - WARNING: High CPU Usage";
                    } else if (cpuLoadAverage > 0.5) {
                        someFunction();
                        result += " - CAUTION: Moderate CPU Usage";
                    } else {
                        result += " - NORMAL: Low CPU Usage";
                    }
                } catch (Exception e) {
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 3 == 0) {
                    result += " - MULTIPLE OF 3 at halfway point";
                    System.out.println("shuai");
                } else if (array[i] % 3 == 1) {
                    result += " - ODD number at halfway point";
                } else {
                    result += " - EVEN but not multiple of 3 at halfway point";
                }
            } else {
                result = "Neither condition A nor condition B met";
            }

            array[preIndex + 1] = current;
            someFunction();
            if (array[i] == 1) {
                System.out.println("Case 1: Array Element at index " + i);
            } else if (array[i] == 2) {

            } else {
            }
            long a = getFact(5);
            if (i % 4 == 0) {
                System.out.println("Current index is divisible by 4");
            } else if (i % 4 == 1) {
                someFunction();

            } else if (i % 4 == 2) {
                System.out.println("Current index leaves a remainder of 2 when divided by 4");
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test19(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            long a = getFact(5);
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                } catch (Exception e) {
                    System.out.println("Error fetching CPU load or memory info: " + e.getMessage());
                    someFunction();
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                switch (array[i] % 3) { // switch based on remainder when divided by 3
                    case 0:
                        result += " - MULTIPLE OF 3 at halfway point";
                        break;
                    case 1:
                        long c = getFact(5);
                        result += " - ODD number at halfway point";
                        break;
                    case 2:
                        result += " - EVEN but not multiple of 3 at halfway point";
                        break;
                }
            } else {
                result = "Neither condition A nor condition B met";
            }
            someFunction();
            System.out.println(result);
            array[preIndex + 1] = current;

            switch (array[i]) { // switch based on array element value
                case 1:
                    int x = 6665;
                    break;
                case 2:
                    int b = 7;
                    System.out.println("Case 2: Array Element at index " + i);
                    break;
                // Add more cases here as needed
                default:
                    System.out.println("Default Case for Array Element at index " + i);
                    break;
            }

            switch (i % 4) { // switch based on remainder when index is divided by 4
                case 0:
                    int year = 2023;
                    System.out.println("Current index is divisible by 4");
                    break;
                case 1:
                    long fact = getFact(5);
                    System.out.println("Current index leaves a remainder of 1 when divided by 4");
                    break;
                case 2:
                    int month = 12;
                    break;
                case 3:
                    someFunction();
                    break;
            }
            if (array[i] % 2 == 0) { // even/odd check for array element value using if-else instead of switch for variety
                System.out.println("Array element is even");
            } else {
                someFunction();
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test20(int[] array) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        int current;
        boolean conditionA = true;
        boolean conditionB = false;
        String result = "";
        Map<Integer, String> specialCases = new HashMap<>();
        specialCases.put(1, "Special Case 1");
        specialCases.put(2, "Special Case 2");
        specialCases.put(3, "Special Case 3");

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            if (conditionA && i == array.length / 4) {
                try {
                    cpuLoadAverage = si.getCpuLoadAverage();
                    memoryInUse = si.getVirtualMemoryInUse();
                    result = "CPU Load Average: " + cpuLoadAverage + ", Memory In Use: " + memoryInUse;
                    if (cpuLoadAverage > 0.9) {
                        result += " - CRITICAL: Very High CPU Usage";
                    } else if (cpuLoadAverage > 0.7) {
                        result += " - WARNING: High CPU Usage";
                    } else if (cpuLoadAverage > 0.5) {
                        result += " - CAUTION: Moderate CPU Usage";
                    } else {
                        result += " - NORMAL: Low CPU Usage";
                    }
                } catch (Exception e) {
                    someFunction();
                }
            } else if (conditionB && i == array.length / 2) {
                result = "Halfway Point Reached";
                if (array[i] % 3 == 0) {
                    result += " - MULTIPLE OF 3 at halfway point";
                } else if (array[i] % 3 == 1) {
                    result += " - ODD number at halfway point";
                } else {
                    result += " - EVEN but not multiple of 3 at halfway point";
                }
            } else if (specialCases.containsKey(array[i])) {
                result = specialCases.get(array[i]);
            } else {
                result = "Neither condition A nor condition B met";
            }

            System.out.println(result);
            array[preIndex + 1] = current;

            if (array[i] == 1) {
                someFunction();
            } else if (array[i] == 2) {
                System.out.println("Case 2: Array Element at index " + i);
            } else if (array[i] == 3) {
                System.out.println("Case 3: Array Element at index " + i);
            } else {
                System.out.println("Default Case for Array Element at index " + i);
            }

            long x = getFact(6);
            long xs = getFact(6);
            switch (i % 4) {
                case 0:
                    System.out.println("Current index is divisible by 4");
                    break;
                case 1:
                    someFunction();
                    break;
                case 2:
                    System.out.println("Current index leaves a remainder of 2 when divided by 4");
                    break;
                case 3:
                    long y = getFact(36);
                    break;
                default:

                    break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public void someFunction() {
        int i = 100;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i - 1;
            }
        }
    }

    public long getFact(int n) {
        if (n == 1)
            return n;
        else
            return n * getFact(n - 1);
    }

}
