package model;

public abstract class Title {
    private String title;
    private String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){
        return calculatePoints() * RATE;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        return switch (literatureType.toUpperCase()) {
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0;
        };
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }
}
