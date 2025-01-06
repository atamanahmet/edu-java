import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<String> lines = new ArrayList<>();

    public List<String> readFile() throws Exception {
        Files.lines(Paths.get("test.txt")).forEach(line -> lines.add(line));
        return lines;
    }
}
