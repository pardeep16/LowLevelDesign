package com.design.principles.isp.problematic;

// This class represents a Book.
// It violates the Interface Segregation Principle (ISP) by forcing all classes that implement this interface
// to implement methods that may not be relevant to them.
// For example, a physical book may not have an audio URI or an eBook URI.
public class BookService implements Book {

    private String title;
    private String author;
    private int numberOfPages;
    private String audioURI;
    private String eBookURI;

    public BookService(String title, String author, int numberOfPages, String audioURI, String eBookURI) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.audioURI = audioURI;
        this.eBookURI = eBookURI;
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

    @Override
    public String getAudioURI() {
        return audioURI;
    }

    @Override
    public String getEBookURI() {
        return eBookURI;
    }
}
