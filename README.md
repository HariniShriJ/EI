HC-2025-26 – Design Pattern Coding Exercises

This repository contains my submission for the HC-2025-26 Coding Exercises.
It demonstrates behavioural, creational, and structural design patterns, SOLID principles, and clean OOP design in Java.

 EI/
├─ DesignPattern/
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
└─ SmartHomeSystem/
    └─ SmartHomeSystem/

Exercise 1 – Design Pattern Demonstrations

Six small console-based Java projects:

Pattern Type	Folder	What it Shows
Behavioural	Observer	News Agency example (Observer Pattern).
Behavioural	Strategy	Shipping cost calculation using Strategy Pattern.
Creational	Factory	Document creation using Factory Method Pattern.
Creational	Singleton_Builder	Singleton + Builder pattern for AppConfig management.
Structural	Adapter	Media player adapter wrapping incompatible classes.
Structural	Decorator	Dynamic text decorations using Decorator Pattern.

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

git clone https://github.com/HariniShriJ/EI.git
cd EI


Compile DesignPrinciple or SmartHomeSystem Java files separately.

Example for Smart Home System:

javac EI/SmartHomeSystem/Devices/*.java \
      EI/SmartHomeSystem/Hub/*.java \
      EI/SmartHomeSystem/Proxy/*.java \
      EI/SmartHomeSystem/main/*.java


Run the main demo:

java -cp . main.SmartHomeDemo


For Exercise 1, navigate to the desired pattern folder and run its *Demo.java.

Notes

All projects follow SOLID principles for maintainable and scalable design.

Demonstrates practical usage of behavioural, creational, and structural design patterns.

Each module is self-contained with clean OOP architecture, proper encapsulation, and polymorphism.

Console-based outputs illustrate how each pattern works in real scenarios
