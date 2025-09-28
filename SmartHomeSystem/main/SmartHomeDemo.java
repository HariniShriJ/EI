package main;

import devices.*;
import hub.*;
import proxy.DeviceProxy;

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        // Create devices via Factory
        Device light1 = new DeviceProxy(DeviceFactory.createDevice(1, "light"));
        Device thermostat = new DeviceProxy(DeviceFactory.createDevice(2, "thermostat"));
        Device door = new DeviceProxy(DeviceFactory.createDevice(3, "door"));

        // Add devices to hub
        hub.addDevice(light1);
        hub.addDevice(thermostat);
        hub.addDevice(door);

        // Turn devices on/off via proxy
        light1.turnOn();
        door.turnOff(); // lock
        ((Thermostat) ((DeviceProxy) thermostat).realDevice).setTemperature(72);

        // Show status
        hub.showStatus();

        // Schedule tasks
        Scheduler scheduler = new Scheduler();
        scheduler.schedule(2, "06:00", "Turn On");
        scheduler.showSchedule();

        // Automated trigger example
        Trigger t = new Trigger("temperature > 75", "turnOff(1)");
        System.out.println("Automated Trigger: " + t);
    }
}
