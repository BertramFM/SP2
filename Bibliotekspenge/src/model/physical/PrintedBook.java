package model.physical;

public class PrintedBook extends PhysicalTitle {

    private int pages;

    public PrintedBook(String title, String literatureType, int pages, int copies) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}
