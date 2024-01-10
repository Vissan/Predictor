package org.scnu.runningCode.testSort;

import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;


public class RunTwo {

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

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1] % 4) {
                    case 1:
                        if (array[i] == 2) {
                            int xx = getValues(15);
                            System.out.println("Case 2");
                            someFunction(1026);
                        } else {
                            System.out.println("Case 2");
                            someFunction(695);
                        }
                        break;
                    case 2:
                        if (array[i] == 3) {
                            int xxx = getValues(145);
                            someFunction(333);
                        } else {
                            System.out.println("Case 2");
                        }
                        break;
                    case 3:
                        if (array[i] == 1) {
                            someFunction(961);
                        } else {
                            someFunction(231);
                        }
                        break;
                    // Add more cases here as needed
                    default:
                        someFunction(114);
                        break;
                }
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

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1] % 4) {
                    case 1:
                        if (array[i] == 2) {
                            int xx = getValues(15);
                            int xxxs = getValues(15);
                            int xxsf = getValues(15);
                            System.out.println("Case 2");
                            someFunction(1026);someFunction(961);
                        } else {
                            System.out.println("Case 3");
                            System.out.println("Case 3");
                            someFunction(695);
                        }
                        break;
                    case 2:
                        if (array[i] == 3) {
                            int xxx = getValues(145);
                            someFunction(333);
                        } else {
                            System.out.println("Case 2");
                            System.out.println("Case 3");
                        }
                        break;
                    case 3:
                        if (array[i] == 1) {
                            someFunction(961);
                            someFunction(961);
                        } else {
                            someFunction(231);
                        }
                        break;
                    // Add more cases here as needed
                    default:
                        someFunction(114);
                        break;
                }
            }
            array[preIndex + 1] = current;
            switch (array[i] % 4) {
                case 1:
                    if (array[i + 1] == 2) {
                        System.out.println("Case 2");
                    } else {
                        System.out.println("Case 2");
                    }
                    break;
                case 2:
                    if (array[i + 1] == 3) {
                        System.out.println("Case 2");
                        someFunction(532);
                    } else {
                        System.out.println("Case 2");
                        someFunction(44);
                    }
                    break;
                case 3:
                    if (array[i + 1] == 1) {
                        System.out.println("Case 2");
                    } else {
                        someFunction(2);
                    }
                    break;
                // Add more cases here as needed
                default:
                    someFunction(23);
                    break;
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

                // Add a switch statement to handle different cases based on array[preIndex + 1] value
                switch (array[preIndex + 1] % 4) {
                    case 1:
                        if (array[i] == 2) {
                            int xx = getValues(15);
                            int xxxs = getValues(15);
                            int xxsf = getValues(15);
                            System.out.println("Case 2");
                            someFunction(1026);someFunction(961);
                        } else {
                            System.out.println("Case 3");
                            System.out.println("Case 3");
                            someFunction(695);
                        }
                        break;
                    case 2:
                        if (array[i] == 3) {
                            int xxx = getValues(145);
                            someFunction(333);
                        } else {
                            System.out.println("Case 2");
                            System.out.println("Case 3");
                        }
                        break;
                    case 3:
                        if (array[i] == 1) {
                            someFunction(961);
                            someFunction(961);
                        } else {
                            someFunction(231);
                        }
                        break;
                    // Add more cases here as needed
                    default:
                        someFunction(114);
                        break;
                }
            }
            array[preIndex + 1] = current;

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
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public CpuAndMemInUse test3(int[] array) {
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
                cpuLoadAverage = new SystemInfo().getCpuLoadAverage();
                memoryInUse = new SystemInfo().getVirtualMemoryInUse();
                switch (array[preIndex + 1] % 4) {
                    case 1:
                        if (array[i] == 2) {
                            getValues(15);
                            int x = getValues(15);
                            getValues(15);
                            someFunction(1026);
                            someFunction(961);
                        } else {
                            someFunction(695);
                        }
                        break;
                    case 2:
                        if (array[i] == 3) {
                            int y = getValues(145);
                            someFunction(333);
                        } else {
                            someFunction(231);
                            System.out.println("sdfsa");
                        }
                        break;
                    case 3:
                        if (array[i] == 1) {
                            someFunction(961);
                        } else {
                            someFunction(231);
                        }
                        break;
                    default:
                        someFunction(114);
                        break;
                }
            }
            array[preIndex + 1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 7 == 0) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    public void someFunction(int x) {
        while (x != 0) {
            if (x % 2 == 0)
                x /= 2;
            else
                x -= 1;
        }
    }

    public int getValues(int x) {
        return x*6/3 + 122 * 21 - x*4;
    }

}
