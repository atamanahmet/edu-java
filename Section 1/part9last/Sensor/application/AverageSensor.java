
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> allReadings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.allReadings = new ArrayList<>();
    }

    public void addSensor(Sensor newSensor) {
        if (!sensorList.contains(newSensor)) {
            sensorList.add(newSensor);
        }
    }

    public boolean isOn() {
        for (Sensor sensor : sensorList) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;

    }

    public void setOn() {
        sensorList.iterator().forEachRemaining(sensor -> sensor.setOn());
    }

    public void setOff() {
        sensorList.iterator().forEachRemaining(sensor -> sensor.setOff());
    }

    public int read() {
        if (sensorList.isEmpty()) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < sensorList.size(); i++) {
            if (!sensorList.get(i).isOn()) {
                throw new IllegalStateException();
            }
        }

        int sum = 0;
        for (int i = 0; i < sensorList.size(); i++) {
            int reading = sensorList.get(i).read();
            sum += reading;

        }
        int average = sum / sensorList.size();
        allReadings.add(average);
        return average;
    }

    public List<Integer> readings() {
        return allReadings;
    }
}
