package org.example.single;

public class ReportTest {

    public static void main(String[] args) {
        Report report = new Report("The report title", "Content of the report");
        ReportSaver reportSaver = new ReportSaver();
        reportSaver.saveToFile(report,"C:\\myworkspace\\github\\redesigned-broccoli\\classes\\report\\report.txt");
    }
}
