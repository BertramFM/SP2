import model.Author;
import model.physical.AudioBook;
import model.physical.PrintedBook;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

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
        olgaRavn.RoyaltyPerTitle();
        // Udskriver den samlede fortjeneste på alle titler.
        System.out.println(olgaRavn.getName() + " har på " + olgaRavn.getArraySize() +
                " title(r) tjent: " + olgaRavn.calculateRoyalties() + "kr");
    }
}
