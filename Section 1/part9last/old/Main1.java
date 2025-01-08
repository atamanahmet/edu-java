public class Main1 {
    public static void main(String[] args) {

        OneItemBox box = new OneItemBox();
        box.add(new Item2("Saludo", 5));
        box.add(new Item2("Pirkka", 5));

        System.out.println(box.isInBox(new Item2("Saludo")));
        System.out.println(box.isInBox(new Item2("Pirkka")));
    }
}
