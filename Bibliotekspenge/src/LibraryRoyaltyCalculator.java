import model.*;
import model.physical.*;
import model.digital.*;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        System.out.println("== FYSISKE TITLER ==");
        Author olgaRavn = new Author("Olga Ravn");

        // Bog 1
        PrintedBook celestinePrint = new PrintedBook("Celestine", "SKØN", 166, 140);

        olgaRavn.addTitle(celestinePrint);
        // Bog 2
        AudioBook celestineAudio = new AudioBook("Celestine (Audio)", "SKØN", 192, 140);
        olgaRavn.addTitle(celestineAudio);
        // Bog 3
        PrintedBook deAnsatte = new PrintedBook("De Ansatte", "SKØN", 136, 236);
        olgaRavn.addTitle(deAnsatte);

        // Kalder metode til at printe alle tiler i arraylist med indtjening inkluderet.
//        olgaRavn.RoyaltyPerTitle();

        // Udskriver den samlede fortjeneste på alle titler.
        printRoyalties(olgaRavn);


    }

    private static void printRoyalties(Author author) {
        double royalties = author.calculateRoyalties();
        System.out.println(author.getName() + " har på " + author.getArraySize() +
                " title(r) tjent: " + author.calculateRoyalties() + "kr");

        System.out.println("Royalty for title(r):");
        for (Title title : author.getTitles()) {
            double Royalty = (Math.round(title.calculateRoyalty() * 100.0) / 100.0);
            System.out.println(title.getTitle() + ": " + Royalty + "kr.");
        }
    }
}
