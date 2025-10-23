import model.*;
import model.physical.AudioBook;
import model.physical.PrintedBook;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author olgaRavn = new Author("Olga Ravn");

        PrintedBook celestinePrint = new PrintedBook("Celestine", "SKØN", 166, 140);
        olgaRavn.addTitle(celestinePrint);

        AudioBook celestineAudio = new AudioBook("Celestine", "SKØN", 192, 140);
        olgaRavn.addTitle(celestineAudio);

        PrintedBook deAnsatte = new PrintedBook("De Ansatte", "Skøn", 136, 236);
        olgaRavn.addTitle(deAnsatte);


    }
}
