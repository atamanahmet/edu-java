public class Loops {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // String items = ["asd","bsd","zxc"];
        for (int i = 0; i < 10; i++) {
            System.out.println("5x" + i + " : " + 5 * i);
        }
        // items.forEach(e){
        // e
        // }
        int counter = 1;
        for (int i = 1; i < 30; i++) {
            if (counter != 11) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    System.out.println("Counter: " + counter);
                    counter++;
                }
            }

        }

    }
}