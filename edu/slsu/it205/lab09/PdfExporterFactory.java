package edu.slsu.it205.lab09;

// Concrete Creator
public class PdfExporterFactory extends ExporterFactory {

    @Override
    public ReportExporter create() {
        return new PdfExporter();
    }
}