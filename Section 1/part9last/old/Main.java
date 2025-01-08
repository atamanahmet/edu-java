package Dictionary.dictionary;

import Dictionary.dictionary.SaveableDictionary;

public class Main {
    SaveableDictionary dictionary = new SaveableDictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("apina", "apfe");
    
    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("monkey"));
    System.out.println(dictionary.translate("ohjelmointi"));
    System.out.println(dictionary.translate("banana"));
}
