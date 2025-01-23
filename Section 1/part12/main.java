import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String row = "Party	1968	1972	1976	1980	1984	1988";
        List<String> pieces = Arrays.asList(row.split("\t"));
        for (int i = 0; i < pieces.size(); i++) {
            System.out.println(i + ": " + pieces.get(i));
        }
    }
}
