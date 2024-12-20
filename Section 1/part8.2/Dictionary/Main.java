import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        map.put("a", list);
        System.out.println(map.get("a"));
    }
}
