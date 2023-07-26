package org.example.single;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveToFile(Report report, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(report.generateReport());
            writer.close();
            System.out.println("Report saved to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving report to file: " + e.getMessage());
        }
    }
}
