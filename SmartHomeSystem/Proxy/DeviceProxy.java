package proxy;

import devices.Device;

public class DeviceProxy extends Device {
    private Device realDevice;

    public DeviceProxy(Device device) {
        super(device.getId(), device.getType());
        this.realDevice = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Proxy: Authorizing turnOn for device " + id);
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Proxy: Authorizing turnOff for device " + id);
        realDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return realDevice.getStatus();
    }
}
