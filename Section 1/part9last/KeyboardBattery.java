import com4j.*;

public class KeyboardBattery {
    public static void main(String[] args) {
        try {
            String query = "SELECT * FROM Win32_Battery";
            IEnumWbemClassObject enumerator = WbemcliUtil.query(query);

            while (enumerator != null) {
                for (IWbemClassObject wbemObj : enumerator) {
                    Variant batteryLevel = wbemObj.get("EstimatedChargeRemaining");
                    System.out.println("Battery Level: " + batteryLevel.intValue() + "%");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
