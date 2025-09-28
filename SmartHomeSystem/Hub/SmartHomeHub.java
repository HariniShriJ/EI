package hub;

import devices.Device;
import java.util.*;

public class SmartHomeHub {
    private List<DeviceObserver> observers = new ArrayList<>();
    private Map<Integer, Device> devices = new HashMap<>();

    public void addDevice(Device device) {
        devices.put(device.getId(), device);
        System.out.println("Added device: " + device.getType() + " " + device.getId());
    }

    public void removeDevice(int id) {
        Device d = devices.remove(id);
        if (d != null) System.out.println("Removed device: " + d.getType() + " " + d.getId());
    }

    public void attach(DeviceObserver observer) { observers.add(observer); }
    public void detach(DeviceObserver observer) { observers.remove(observer); }

    public void notifyAllObservers(String message) {
        for (DeviceObserver observer : observers) {
            observer.update(message);
        }
    }

    public Device getDevice(int id) { return devices.get(id); }

    public void showStatus() {
        System.out.println("--- Status Report ---");
        devices.values().forEach(d -> System.out.println(d.getStatus()));
        System.out.println("--------------------");
    }
}
