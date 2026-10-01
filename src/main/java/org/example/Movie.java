package org.example;

public class Movie extends LibraryItem{
    protected int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " by " + author + " (" + year + ")" + " - " + durationInMinutes + " minutes";
    }
}
