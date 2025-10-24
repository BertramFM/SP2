import model.*;
import model.physical.*;
import model.digital.*;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("TEST 1: FYSISKE TITLER");
        System.out.println("============================");

        //1. Forfatter
        Author olgaRavn = new Author("Olga Ravn");

        PrintedBook celestinePrint = new PrintedBook("Celestine", "SKØN", 166, 140);
        AudioBook celestineAudio = new AudioBook("Celestine (Audio)", "SKØN", 192, 140);
        PrintedBook deAnsatte = new PrintedBook("De Ansatte", "SKØN", 136, 236);
        olgaRavn.addTitle(celestinePrint);
        olgaRavn.addTitle(celestineAudio);
        olgaRavn.addTitle(deAnsatte);

        printRoyalties(olgaRavn);

        // ===============

        System.out.println("\n============================");
        System.out.println("TEST 2: Netbaserede titler");
        System.out.println("============================");

        // 2. Forfatter
        Author forfatter2 = new Author("Digital Forfatter");

        EBook javaE = new EBook("Java 1.0", "FAG", 97, 50, 205, 360000, true);
        EAudioBook javaLyd = new EAudioBook("Java på lyd", "SKØN", 80, 40, 150, 240);
        forfatter2.addTitle(javaE);
        forfatter2.addTitle(javaLyd);

        printRoyalties(forfatter2);

        // ===============

        System.out.println("\n============================");
        System.out.println("TEST 3: Blandet forfatter");
        System.out.println("============================");

        //3. Forfatter
        Author blandetForfatter = new Author("Poly Forfatter");

        PrintedBook html = new PrintedBook("HTML", "TE", 50, 120);
        blandetForfatter.addTitle(html);

        EBook eHTML = new EBook("Digital HTMl", "BI", 98, 60, 300, 180000, true);
        blandetForfatter.addTitle(eHTML);

        printRoyalties(blandetForfatter);
    }

    private static void printRoyalties(Author author) {
        double royalties = author.calculateRoyalties();
        System.out.println(author.getName() + " har på " + author.getArraySize() +
                " title(r) tjent: " + author.calculateRoyalties() + "kr");

        System.out.println("\nDetaljer:");
        for (Title title : author.getTitles()) {
            double Royalty = (Math.round(title.calculateRoyalty() * 100.0) / 100.0);
            System.out.println(title.getTitle() + ": " + Royalty + "kr.");
        }
    }
}
