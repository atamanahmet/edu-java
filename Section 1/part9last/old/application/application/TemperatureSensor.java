package application;

public class TemperatureSensor implements Sensor {
    private boolean sensorState;
    private int sensorValue;

    public TemperatureSensor() {
        this.sensorState = false;

    }

    public boolean isOn() {
        return this.sensorState;
    }

    public void setOn() {
        this.sensorState = true;
    }

    public void setOff() {
        this.sensorState = false;

    }

    public int read() {
        if (sensorState == false) {
            throw new IllegalStateException();
        }
        Double d = Double.valueOf(Math.floor((Math.random() * 60) + 1) - 30);
        sensorValue = d.intValue();
        return sensorValue;
    }
}
