package testCode;

import org.junit.Test;
import org.scnu.detect.SystemInfo;
import org.scnu.hardwareObject.CpuAndMemInUse;

public class QuickSort {
    //快速排序
    public CpuAndMemInUse quickSort(int[] arr, int left, int right) {
        SystemInfo si = new SystemInfo();
        Double cpuLoadAverage = 0d;
        Long memoryInUse = 0L;

        int l = left; //左下标
        int r = right; //右下标
        //pivot 中轴值
        int pivot = arr[(left + right) / 2];
        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的是让比pivot 值小放到左边
        //比pivot 值大放到右边
        while (l < r) {
            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while (arr[l] < pivot) {
                l += 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while (arr[r] > pivot) {
                r -= 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if (l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

//			//如果交换完后，发现这个arr[l] == pivot值 相等 r--， 前移
            if (arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个arr[r] == pivot值 相等 l++， 后移
            if (arr[r] == pivot) {
                l += 1;
            }
            cpuLoadAverage = si.getCpuLoadAverage();
            memoryInUse = si.getVirtualMemoryInUse();
        }

        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if (right > l) {
            quickSort(arr, l, right);
        }
        return new CpuAndMemInUse(memoryInUse, cpuLoadAverage);

    }

    @Test
    public void test() {
        int[] nums = new int[]{10,5,6,12,5,45,85,5};
        System.out.println(new QuickSort().quickSort(nums, 0, nums.length - 1).toString());
    }
}

