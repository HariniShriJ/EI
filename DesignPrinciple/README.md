This project demonstrates six different Software Design Patterns in Java, split into three categories:

Behavioural Patterns (2 use cases)
Creational Patterns (2 use cases)
Structural Patterns (2 use cases)

Each pattern has its own directory containing all Java classes and a *Demo.java file to run the example.

📂 Project Structure
Behavioural/
Observer/ -- News Agency example (Observer Pattern)
Strategy/ -- Shipping cost strategies (Strategy Pattern)
Creational/
Factory/ -- Document creation system (Factory Method Pattern)
Singleton_Builder/ -- Application configuration (Singleton + Builder)
Structural/
Adapter/ -- Media player adapter (Adapter Pattern)
Decorator/ -- Text decorations (Decorator Pattern)
🚀 How to Run

Clone the repository:

git clone https://github.com/HariniShriJ/EI.git
cd DesignPatterns


Compile and run any demo from its folder. Example (Observer Pattern):

cd Behavioural/Observer
javac *.java
java ObserverDemo


You’ll see output showing how the pattern works.

📘 Patterns Explained
Behavioural Patterns
Observer Pattern -- NewsAgency publishes news; multiple Subscribers are notified automatically.
Strategy Pattern -- Shipping cost can be calculated using different strategies (Ground, Air, Drone).
Creational Patterns
Factory Method Pattern -- Abstract creator creates different document types (PDF, Word, HTML) without changing client code.
Singleton + Builder Pattern -- Global AppConfig object is built flexibly with Builder, but only one instance exists across the app.
Structural Patterns
Adapter Pattern -- AudioPlayer adapts incompatible classes (VlcPlayer, etc.) into a common interface.
Decorator Pattern -- Text components are decorated dynamically with borders, scrolling, etc.
🛠 Requirements
Java 8 or higher
Command-line or any IDE (IntelliJ IDEA, Eclipse, VS Code with Java)
📄 License

This project is for educational purposes as part of Exercise 1: Problem Statement on Design Patterns.
Feel free to fork, modify, and use for learning.
