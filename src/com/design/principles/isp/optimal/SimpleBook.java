package com.design.principles.isp.optimal;
// This class represents a Book.
// It adheres to the Interface Segregation Principle (ISP) by defining a minimal interface
// that only includes methods relevant to the Book class.
// This allows for better separation of concerns and ensures that classes implementing this interface
public class SimpleBook implements Book {
    private String title;
    private String author;
    private int numberOfPages;

    public SimpleBook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
