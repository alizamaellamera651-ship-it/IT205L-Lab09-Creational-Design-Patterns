LABORATORY ACTIVITY 9: CREATIONAL DESIGN PATTERNS

COURSE: IT 205L – Object-Oriented Programming
PROJECT: Lab09CreationalPatterns
PACKAGE: edu.slsu.it205.lab09

==================================================
1. PROJECT DESCRIPTION
==================================================

This project demonstrates three creational design patterns in Java:

1. Factory Method
2. Builder
3. Singleton

These patterns help organize object creation and make programs easier to maintain and extend.

==================================================
2. PROJECT STRUCTURE
==================================================

Lab09CreationalPatterns/
|
|-- edu/
|   |-- slsu/
|       |-- it205/
|           |-- lab09/
|               |-- ReportExporter.java
|               |-- PdfExporter.java
|               |-- CsvExporter.java
|               |-- ExporterFactory.java
|               |-- PdfExporterFactory.java
|               |-- CsvExporterFactory.java
|               |-- ReportConfig.java
|               |-- AppConfig.java
|               |-- Main.java
|
|-- PATTERN_NOTES.md
|-- POSTLAB.md
|-- README.txt
|-- .gitignore
|-- screenshots/

==================================================
3. IMPLEMENTED DESIGN PATTERNS
==================================================

A. FACTORY METHOD

Purpose:
Creates objects through factory methods instead of directly creating concrete products in the client code.

Participants:
- Product: ReportExporter
- Concrete Products: PdfExporter, CsvExporter
- Creator: ExporterFactory
- Concrete Creators: PdfExporterFactory, CsvExporterFactory

B. BUILDER

Purpose:
Constructs complex objects step by step without requiring many overloaded constructors.

Product:
ReportConfig

Builder:
ReportConfig.Builder

Properties:
- Title
- Author
- Include Cover
- Page Size

C. SINGLETON

Purpose:
Ensures that only one shared instance is used.

Implementation:
AppConfig uses an enum Singleton.

Setting:
Application Name: IT205 Report Management System

The program checks instance identity using the == operator.

==================================================
4. HOW TO COMPILE AND RUN
==================================================

Open Git Bash inside the project folder.

Compile:

javac edu/slsu/it205/lab09/*.java

Run:

java edu.slsu.it205.lab09.Main

==================================================
5. TEST RESULTS
==================================================

Factory Method:
- PDF exporter created successfully.
- CSV exporter created successfully.

Builder:
- First report configuration created successfully.
- Second report configuration created successfully.

Singleton:
- Application name displayed successfully.
- Both references point to the same instance.
- Identity comparison returned true.

Overall Result: ALL THREE PATTERNS WORKED SUCCESSFULLY.

==================================================
6. DOCUMENTATION
==================================================

PATTERN_NOTES.md contains the discussion of the three patterns, their trade-offs, and testability.

POSTLAB.md contains the answers to all five post-lab questions.

==================================================
7. REFERENCES
==================================================

Freeman, E., & Robson, E. (2021). Head First Design Patterns (2nd ed.). O'Reilly Media.

Schildt, H., & Coward, D. (2024). Java: The Complete Reference (13th ed.). McGraw-Hill Education.

Oracle. (2025). The Java Tutorials.
https://docs.oracle.com/javase/tutorial/