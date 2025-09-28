# SmartHomeSystem

## Description
A simulation of a Smart Home System where a central hub controls smart devices like lights, thermostats, and door locks. 
This project demonstrates:

- **Observer Pattern** — Hub updates devices.
- **Factory Method Pattern** — Devices created dynamically.
- **Proxy Pattern** — Controlled access to devices.

## Project Structure
- `devices/` - Device classes & factory
- `hub/` - Central hub, scheduler, triggers
- `proxy/` - Proxy for device access control
- `main/` - Entry point `SmartHomeDemo.java`

## How to Run
1. Compile all Java files:
   ```bash
   javac devices/*.java hub/*.java proxy/*.java main/*.java
