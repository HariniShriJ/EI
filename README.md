HC-2025-26 – Design Pattern Coding Exercises

This repository contains my submission for the HC-2025-26 Coding Exercises.
It demonstrates behavioural, creational, and structural design patterns, SOLID principles, and clean OOP design in Java.

design-patterns-exercises/
│
├─ Exercise1/
│   ├─ Behavioural/
│   │   ├─ Observer/
│   │   └─ Strategy/
│   ├─ Creational/
│   │   ├─ Factory/
│   │   └─ Singleton_Builder/
│   └─ Structural/
│       ├─ Adapter/
│       └─ Decorator/
│
└─ Exercise2/
    └─ SmartHomeSystem/

Exercise 1 – Design Pattern Demonstrations

Six small console-based Java projects:

Pattern Type	Folder	What it Shows
Behavioural	observer	News Agency example (Observer Pattern).
Behavioural	strategy	Shipping cost calculation using Strategy Pattern.
Creational	factory	Document creation using Factory Method Pattern.
Creational	singleton_builder	Singleton + Builder pattern for AppConfig management.
Structural	adapter	Media player adapter wrapping incompatible classes.
Structural	decorator	Dynamic text decorations using Decorator Pattern.

Each folder contains its own *Demo.java file to run and see output.

Exercise 2 – Mini Project
Smart Home System

A console-based simulation of a Smart Home System that allows users to control smart devices (lights, thermostats, door locks) via a central hub.

Features

Initialize devices with unique IDs and types.

Turn devices on/off using a Proxy for controlled access.

View the status of all devices.

Schedule tasks to automate actions at specific times.

Automated triggers based on conditions (e.g., turn off lights if temperature exceeds a threshold).

Optional: Add or remove devices dynamically.

Modular OOP design with strong encapsulation.

Design Patterns Used

Observer – SmartHomeHub notifies devices or observers when changes occur.

Factory Method – DeviceFactory dynamically creates devices.

Proxy – DeviceProxy controls access to devices and adds authorization.

How to Run

Clone the repository:

git clone https://github.com/your-username/Design_Pattern.git
cd Design_Pattern


Compile Exercise 1 or Exercise 2 Java files separately.

Example for Smart Home System:

javac design-patterns-exercises/Exercise2/SmartHomeSystem/devices/*.java \
      design-patterns-exercises/Exercise2/SmartHomeSystem/hub/*.java \
      design-patterns-exercises/Exercise2/SmartHomeSystem/proxy/*.java \
      design-patterns-exercises/Exercise2/SmartHomeSystem/main/*.java


Run the main demo:

java -cp . main.SmartHomeDemo


For Exercise 1, navigate to the desired pattern folder and run its *Demo.java.

Notes

All projects follow SOLID principles for maintainable and scalable design.

Demonstrates practical usage of behavioural, creational, and structural design patterns.

Each module is self-contained with clean OOP architecture, proper encapsulation, and polymorphism.

Console-based outputs illustrate how each pattern works in real scenarios