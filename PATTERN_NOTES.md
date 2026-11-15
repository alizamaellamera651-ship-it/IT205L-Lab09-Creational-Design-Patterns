# Creational Design Patterns – Discussion

## 1. Factory Method Pattern

Factory Method separates object creation from the code that uses the object. The Creator defines a factory method, while its subclasses decide which concrete product to create.

In this project, `PdfExporterFactory` creates a `PdfExporter`, while `CsvExporterFactory` creates a `CsvExporter`.

**Advantage:** New exporter types can be added without changing the existing exporter interface.

## 2. Builder Pattern

Builder solves the problem of creating objects with several optional properties. It avoids the need for many overloaded constructors, also known as telescoping constructors.

In this project, `ReportConfig.Builder` allows users to set the title, author, cover option, and page size using fluent methods.

**Advantage:** Object creation becomes clearer, more flexible, and easier to understand.

## 3. Singleton Pattern

Singleton ensures that only one shared instance of a class is used.

In this project, `AppConfig` uses an enum Singleton to store the application name.

**Advantage:** It provides a simple way to access one shared configuration instance.

**When NOT to use Singleton:**
- When multiple independent instances are needed.
- When shared state makes testing difficult.
- When it creates unnecessary global dependencies.
- When ordinary objects can solve the problem more simply.

## 4. Testability Comparison

Factory Method and Builder generally make testing easier because objects can be created explicitly with different configurations or implementations.

Singleton can make testing more difficult because different parts of the application share the same instance and potentially the same state.

For example, changing shared Singleton data during one test may affect another test.

## 5. Conclusion

Factory Method, Builder, and Singleton solve different object-creation problems. They should be used when they provide a clear benefit rather than adding unnecessary complexity.