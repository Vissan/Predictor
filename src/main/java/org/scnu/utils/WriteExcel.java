package org.scnu.utils;

import org.apache.commons.math3.analysis.function.Add;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.scnu.hardwareObject.AstInfo;
import org.scnu.hardwareObject.HardwareInfo;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    public void WriteToExcel(HardwareInfo hardwareInfo, AstInfo astInfo) {
        // 创建一个新的工作簿
        try (Workbook workbook = new XSSFWorkbook()) {
            // 创建一个工作表
            Sheet sheet = workbook.createSheet("predictorMessage");

            // 创建第一行，写入属性
            Row headerRow = sheet.createRow(0);
            String[] attributes = {"操作系统", "处理器个数", "处理器频率", "最大内存 MB", "占用内存", "设计电池容量", "使用能量", "持续时间",
                    "局部变量数", "函数调用数", "条件语句数", "迭代语句数", "输入语句数", "输出语句数", "使用函数调用来赋值数", "选择语句数", "赋值语句数"};
            for (int i = 0; i < attributes.length; i++) {
                headerRow.createCell(i).setCellValue(attributes[i]);
            }

            Double[] values = new Double[17];
            AddValueToArray(values, hardwareInfo, astInfo);
            // 创建第二行，依次填入values数组的值
            Row valuesRow = sheet.createRow(1);
            valuesRow.createCell(0).setCellValue(hardwareInfo.getOperationSystem());
            for (int i = 1; i < values.length; i++) {
                valuesRow.createCell(i).setCellValue(values[i]);
            }

            // 将工作簿保存到文件
            try (FileOutputStream fileOut = new FileOutputStream("predictorMessage.xlsx")) {
                workbook.write(fileOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void AddValueToArray(Double[] values, HardwareInfo hardwareInfo, AstInfo astInfo) {
        values[1] = Double.valueOf(hardwareInfo.getProcessorNum());
        values[2] = Double.valueOf(hardwareInfo.getProcessorFreq());
        values[3] = Double.valueOf(hardwareInfo.getMaxVirtualMemory());
        values[4] = Double.valueOf(hardwareInfo.getVirtualMemoryInUse());
        values[5] = hardwareInfo.getDesignPowerCapacity();
        values[6] = hardwareInfo.getPowerUsageRate();
        values[7] = Double.valueOf(hardwareInfo.getDuringTime());

        values[8] = Double.valueOf(astInfo.getLocalVariable());
        values[9] = Double.valueOf(astInfo.getMethodCall());
        values[10] = Double.valueOf(astInfo.getCondition());
        values[11] = Double.valueOf(astInfo.getCycle());
        values[12] = Double.valueOf(astInfo.getIn());
        values[13] = Double.valueOf(astInfo.getOut());
        values[14] = Double.valueOf(astInfo.getAssignMethodCall());
        values[15] = Double.valueOf(astInfo.getSwitch());
        values[16] = Double.valueOf(astInfo.getAssign());
    }
}
