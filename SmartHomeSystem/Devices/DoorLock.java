package devices;

public class DoorLock extends Device {
    private boolean locked = true;

    public DoorLock(int id) { super(id, "door"); }

    @Override
    public void turnOn() { locked = false; }  // unlock
    @Override
    public void turnOff() { locked = true; }  // lock

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (locked ? "Locked" : "Unlocked");
    }
}
