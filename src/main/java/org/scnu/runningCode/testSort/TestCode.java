package org.scnu.runningCode.testSort;

import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;
import testCode.QuickSort;

import java.util.Arrays;

public class TestCode {

    public CpuAndMemInUse test(int[] arr) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;
        quickSort(arr, 0, arr.length - 1);
        // 模拟查找数组元素
        int searchNum = 82137;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                cpuLoadAverage = si.getCpuLoadAverage();
                memoryInUse = si.getVirtualMemoryInUse();
                found = true;
                break;
            }
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);
    }

    // 快速排序算法
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
