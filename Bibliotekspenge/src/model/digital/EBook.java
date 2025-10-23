package model.digital;

public class EBook extends NetTitle {

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use,
                 int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    @Override
    protected double calculatePoints() {
        double calculatedPages = calculatedPages();
        return calculateNetPoints(calculatedPages) ;
    }

    private double calculatedPages(){
        double pages = (characters / 1800.0) + 20;
        if (illustrated){
            pages = pages * 1.1; // Tilføjer 10% hvis illustreret
        }
        return pages;
    }

    public int getCharacters() {
        return characters;
    }

    public boolean isIllustrated() {
        return illustrated;
    }
}
