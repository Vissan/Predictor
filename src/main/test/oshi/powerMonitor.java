package oshi;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class powerMonitor {
    public void getPowerReport() {ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // Run the task repeatedly at a fixed interval
        executor.scheduleAtFixedRate(() -> {
            try {
                // Execute powercfg command to get power information
                ProcessBuilder processBuilder = new ProcessBuilder("powercfg", "/batteryreport");
                Process process = processBuilder.start();

                // Read the output of the command
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;

                // Get today's date
                LocalDate today = LocalDate.now();

                // Parse the output to find today's usage information
                boolean startPrinting = false;
                boolean endPrinting = false;

                while ((line = reader.readLine()) != null) {
                    if (line.contains(today.toString())) {
                        startPrinting = true; // Start printing from today's date
                    }

                    if (startPrinting) {
                        if (line.isEmpty()) {
                            endPrinting = true; // Stop printing when encountering an empty line
                        }
                        if (!endPrinting) {
                            System.out.println(line);
                        }
                    }
                }

                // Wait for the command to complete
                int exitCode = process.waitFor();
                if (exitCode == 0) {
                    System.out.println("Today's power usage information retrieved successfully.");
                } else {
                    System.out.println("Failed to retrieve today's power usage information.");
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 5, TimeUnit.SECONDS); // Change the interval as needed (e.g., 5 seconds)

        // Schedule the task for a fixed duration (e.g., 1 minute)
        executor.schedule(() -> {
            executor.shutdown();
        }, 1, TimeUnit.MINUTES);
    }

    @Test
    public void test() {
        new powerMonitor().getPowerReport();
    }
}
