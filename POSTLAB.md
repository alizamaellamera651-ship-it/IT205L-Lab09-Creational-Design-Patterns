# Post-Lab Questions and Answers

### 1. Which problem does Builder solve better than many constructors?

Builder solves the problem of having too many overloaded constructors when an object has several optional properties. It allows us to create objects step by step using clear and readable methods.

### 2. Name the participants in your Factory Method design.

The participants are:

- **Product:** ReportExporter
- **Concrete Products:** PdfExporter and CsvExporter
- **Creator:** ExporterFactory
- **Concrete Creators:** PdfExporterFactory and CsvExporterFactory

### 3. What is a major Singleton drawback for unit tests?

A major drawback is shared global state. Changes made to a Singleton during one test may affect another test, making tests harder to isolate and maintain.

### 4. When is Abstract Factory preferable to Factory Method?

Abstract Factory is preferable when an application needs to create families of related objects that must work together. Factory Method focuses on creating a particular product through a factory method.

### 5. Which creational pattern might appear in your Final Project and why?

Factory Method could be useful in my Computer Laboratory Equipment Borrowing System (CLEBS) if the system needs to generate reports in different formats, such as PDF and CSV. Separate factories could create the appropriate report exporters.