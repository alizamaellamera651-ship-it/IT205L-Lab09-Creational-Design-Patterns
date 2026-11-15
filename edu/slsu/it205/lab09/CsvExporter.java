package edu.slsu.it205.lab09;

// Concrete Product
public class CsvExporter implements ReportExporter {

    @Override
    public void export(String reportContent) {
        System.out.println("Exporting report as CSV...");
        System.out.println("CSV Content: " + reportContent);
        System.out.println("CSV export successful!");
    }
}