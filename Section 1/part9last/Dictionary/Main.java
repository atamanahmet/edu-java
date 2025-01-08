package Dictionary;

public class Main {
    public static void main(String[] args) {
        // SaveableDictionary dictionary = new SaveableDictionary();
        // dictionary.add("apina", "monkey");
        // dictionary.add("banaani", "banana");
        // dictionary.add("ohjelmointi", "programming");
        // dictionary.delete("apina");
        // dictionary.delete("banana");

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("monkey"));
        // System.out.println(dictionary.translate("banana"));
        // System.out.println(dictionary.translate("banaani"));
        // System.out.println(dictionary.translate("ohjelmointi"));
        // dictionary.load();
        SaveableDictionary dictionary = new SaveableDictionary(
                "C:\\Users\\Fox\\Desktop\\Java\\Section 1\\part9last\\Dictionary\\words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }
        dictionary.add("fck", "not");
        dictionary.add("fcc", "of");

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("ohjelmointi"));
        // System.out.println(dictionary.translate("alla oleva"));
        wasSuccessful = dictionary.save();
        if (wasSuccessful) {
            System.out.println("Successfully saved the dictionary from file");
        }
    }
}