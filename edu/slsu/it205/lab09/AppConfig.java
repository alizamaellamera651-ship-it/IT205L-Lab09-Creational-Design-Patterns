package edu.slsu.it205.lab09;

// Singleton using enum
public enum AppConfig {

    INSTANCE;

    private final String appName = "IT205 Report Management System";

    public String getAppName() {
        return appName;
    }
}