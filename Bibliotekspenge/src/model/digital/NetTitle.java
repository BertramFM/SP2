package model.digital;

import model.Title;

public abstract class NetTitle extends Title {
    private int availability; // Antal kommuner, der har udlånt bogen
    private int reach; // Antal kommuner, der har bogen til udlån
    private int use; // Antal udlån

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    protected double calculateNetPoints(double calculatedPagesOrDuration){
        return calculatedPagesOrDuration * convertLiteratureType() *
                ((reach * 5) + (availability * 0.5) + use);
    }

    public int getUseFactor() {
        return use;
    }

    public int getAvailability() {
        return availability;
    }

    public int getReach() {
        return reach;
    }
}
