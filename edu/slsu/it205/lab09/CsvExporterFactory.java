package edu.slsu.it205.lab09;

// Concrete Creator
public class CsvExporterFactory extends ExporterFactory {

    @Override
    public ReportExporter create() {
        return new CsvExporter();
    }
}