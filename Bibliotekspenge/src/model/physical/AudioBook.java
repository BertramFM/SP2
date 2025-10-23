package model.physical;

public class AudioBook extends PhysicalTitle {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }
}
