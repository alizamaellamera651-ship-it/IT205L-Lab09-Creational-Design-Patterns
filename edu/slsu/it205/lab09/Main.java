package edu.slsu.it205.lab09;

public class Main {

    public static void main(String[] args) {

        // FACTORY METHOD PATTERN
        System.out.println("========== FACTORY METHOD ==========");

        String report = "Student Attendance Report";

        ExporterFactory pdfFactory = new PdfExporterFactory();
        ReportExporter pdfExporter = pdfFactory.create();
        pdfExporter.export(report);

        System.out.println();

        ExporterFactory csvFactory = new CsvExporterFactory();
        ReportExporter csvExporter = csvFactory.create();
        csvExporter.export(report);

        // BUILDER PATTERN
        System.out.println("\n========== BUILDER PATTERN ==========");

        ReportConfig config1 = new ReportConfig.Builder()
                .title("Student Attendance Report")
                .author("Aliza Mae")
                .includeCover(true)
                .pageSize("A4")
                .build();

        System.out.println("\nReport Configuration 1:");
        config1.displayConfig();

        ReportConfig config2 = new ReportConfig.Builder()
                .title("Monthly Grade Report")
                .author("BSIT Department")
                .includeCover(false)
                .pageSize("Letter")
                .build();

        System.out.println("\nReport Configuration 2:");
        config2.displayConfig();

        // SINGLETON PATTERN
        System.out.println("\n========== SINGLETON PATTERN ==========");

        AppConfig configA = AppConfig.INSTANCE;
        AppConfig configB = AppConfig.INSTANCE;

        System.out.println("Application Name: " + configA.getAppName());

        System.out.println("Are both instances identical? "
                + (configA == configB));
    }
}