package model.digital;

public class EAudioBook extends NetTitle {

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach,
                      int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double calculatedDuretion = durationInMinutes / 2.0;
        return calculateNetPoints(calculatedDuretion);
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
