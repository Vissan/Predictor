package org.scnu.utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerMonitor {
    public void getPowerReport() {
        try {
            // Execute powercfg command to get power information
            ProcessBuilder processBuilder = new ProcessBuilder("powercfg", "/batteryreport");
            Process process = processBuilder.start();

            // Read the output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            boolean recentUsage = false;

            // Parse the output to find recent usage information
            while ((line = reader.readLine()) != null) {
                if (line.contains("Recent Usage")) {
                    recentUsage = true;
                    continue;
                }
                if (recentUsage) {
                    System.out.println(line);
                    // Assuming the relevant recent usage information ends after a certain section
                    if (line.isEmpty()) {
                        break;
                    }
                }
            }

            // Wait for the command to complete
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Recent power usage information retrieved successfully.");
            } else {
                System.out.println("Failed to retrieve recent power usage information.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
