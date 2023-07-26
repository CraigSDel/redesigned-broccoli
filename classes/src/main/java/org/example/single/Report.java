package org.example.single;

public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // This method generates the report
    public String generateReport() {
        // Some logic to generate the report
        return "Report: " + title + "\n" + content;
    }
}


