public class Ifelseif {
    public static void main(String[] args) {
        int grif = 100;
        int raven = 500;

        if (grif - raven >= 300) {
            System.out.println("Griffindor 1st");
        } else if (grif >= raven && grif - raven < 300) {
            System.out.println("Griffindor 2th");
        } else if (raven - grif <= 100 && raven - grif >= 0) {
            System.out.println("Griffindor 3th");
        } else if (raven - grif > 100) {
            System.out.println("Griffindor 4th");
        }
    }
}