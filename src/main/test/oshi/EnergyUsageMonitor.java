package oshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnergyUsageMonitor {

    public static void main(String[] args) {
        try {
            // 执行系统命令并获取输出
            Process process = Runtime.getRuntime().exec("powercfg /batteryreport /output %USERPROFILE%\\Desktop\\battery_report.html");

            // 读取命令输出
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 等待命令执行完毕
            process.waitFor();

            // 打印命令执行完毕信息
            System.out.println("命令执行完毕");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
