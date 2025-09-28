package devices;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(int id) {
        super(id, "thermostat");
        this.temperature = 70; // default temperature
    }

    @Override
    public void turnOn() { } // no-op for thermostat
    @Override
    public void turnOff() { } // no-op

    public void setTemperature(int temp) { temperature = temp; }
    public int getTemperature() { return temperature; }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + "°F";
    }
}
