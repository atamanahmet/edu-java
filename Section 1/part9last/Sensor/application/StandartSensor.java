
public class StandartSensor implements Sensor {
    private boolean sensorState;
    private int sensorValue;

    public StandartSensor(int value) {
        this.sensorValue = value;
        this.sensorState = true;
    }

    public boolean isOn() {
        return sensorState;
    }

    public void setOn() {
        this.sensorState = true;
    }

    public void setOff() {
        this.sensorState = false;
    }

    public int read() {
        return this.sensorValue;
    }
}
