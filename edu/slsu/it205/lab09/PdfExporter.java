package edu.slsu.it205.lab09;

// Concrete Product
public class PdfExporter implements ReportExporter {

    @Override
    public void export(String reportContent) {
        System.out.println("Exporting report as PDF...");
        System.out.println("PDF Content: " + reportContent);
        System.out.println("PDF export successful!");
    }
}