import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birdList = new ArrayList<>();

    public BirdManager() {

    }

    public void add(String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    }
}
