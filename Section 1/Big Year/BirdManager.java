import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birdList = new ArrayList<>();

    public BirdManager() {

    }

    public void add(String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    }

    public void observation(String birdSearch) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(birdSearch)) {
                bird.setObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printBirds() {
        for (Bird bird : birdList) {
            System.out.println(
                    bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservationCount() + " observations");
        }
    }

    public void printBird() {

        System.out.println(
                birdList.get(0).getName() + " (" + birdList.get(0).getLatinName() + "): "
                        + birdList.get(0).getObservationCount() + " observations");

    }
}
