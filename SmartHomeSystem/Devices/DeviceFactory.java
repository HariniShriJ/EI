package devices;

public class DeviceFactory {
    public static Device createDevice(int id, String type) {
        return switch (type.toLowerCase()) {
            case "light" -> new Light(id);
            case "thermostat" -> new Thermostat(id);
            case "door" -> new DoorLock(id);
            default -> throw new IllegalArgumentException("Unknown device type: " + type);
        };
    }
}
