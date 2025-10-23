package model;

import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties(){
        double sum = 0.0;
        for (Title title : titles){
            sum += title.calculateRoyalty();
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }
}
