package edu.slsu.it205.lab09;

// Product
public class ReportConfig {

    private final String title;
    private final String author;
    private final boolean includeCover;
    private final String pageSize;

    // Private constructor
    private ReportConfig(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.includeCover = builder.includeCover;
        this.pageSize = builder.pageSize;
    }

    public void displayConfig() {
        System.out.println("Report Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Include Cover: " + includeCover);
        System.out.println("Page Size: " + pageSize);
    }

    // Builder class
    public static class Builder {

        private String title = "Untitled Report";
        private String author = "Unknown";
        private boolean includeCover = false;
        private String pageSize = "A4";

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder includeCover(boolean includeCover) {
            this.includeCover = includeCover;
            return this;
        }

        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public ReportConfig build() {
            return new ReportConfig(this);
        }
    }
}