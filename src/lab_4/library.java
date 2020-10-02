package lab_4;

import java.util.ArrayList;
import java.util.HashMap;

public class library {
    private static String[] BOOKS = {"Priests Of Dawn",
            "Chicken Abroad",
            "Lord With Sins",
            "Chicken Abroad",
            "Fish And Horses",
            "Mistress Of Devotion",
            "Bandit Of The Void",
            "Lord With Sins",
            "Guardians And Gangsters",
            "Lions Of Dread",
            "Chicken Abroad",
            "Future Of Fire",
            "Priests Of Dawn",
            "Fish And Horses",
            "Chicken Abroad",
            "Fish And Horses",
            "Guardians And Gangsters",
            "Inception Of Heaven",
            "Lord With Sins",
            "Future Of Fire",
            "Driving Into The Depths",
            "Starting The Demons",
            "Maid With Blue Eyes",
            "Mistress Of Devotion",
            "Lovers In The Forest",
            "Fish And Horses",
            "Maid With Blue Eyes",
            "Destruction Of The Faceless Ones",
            "Guardians And Gangsters",
            "Chicken Abroad"};

    public static HashMap<String, Integer> createBooksCounter(String[] books) {
        HashMap<String, Integer> bookCounter = new HashMap<>();
        for (String book : books){
            if(bookCounter.containsKey(book))
                bookCounter.put(book , bookCounter.get(book) + 1);
            else bookCounter.put(book , 1);
        }
        return bookCounter;
    }


    public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter) {
        ArrayList<String> whiteRavens = new ArrayList<>();
        booksCounter.forEach((book , amount) -> {
            if(amount == 1) whiteRavens.add(book);
        });
        return whiteRavens;
    }

    public static void printWhiteRavens(ArrayList<String> whiteRavens) {
        for (String book :
                whiteRavens) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> bookCounter = createBooksCounter(BOOKS);
        ArrayList<String> whiteRavens = findWhiteRavens(bookCounter);
        printWhiteRavens(whiteRavens);
    }
}
