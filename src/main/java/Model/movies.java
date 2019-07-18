package Model;

import org.jetbrains.annotations.NotNull;

public class movies implements Comparable<movies>{

    private int year;
    private  String name;
    private float rating;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public movies(String name, Float rating, int year){
        this.year=year;
        this.name=name;
        this.rating=rating;
    }
    @Override
    public int compareTo(@NotNull movies o) {
        return this.year-o.year;
    }
}
