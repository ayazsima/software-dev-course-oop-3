package org.example;

public class Book extends LibraryItem{
    protected int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }
    public void readBook(){
        System.out.println("You are reading the book.");
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ")" + " - " + pageCount + " pages";
    }
}
