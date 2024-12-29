import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aaa {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        List<String[]> listBuffer = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv")).map(line -> line.split(","))
                    .map(arr -> new String[] { arr[0], arr[1], arr[2] }).forEach(arr -> list.add(arr));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        list.stream().forEach(arr -> System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]));

    }

}
