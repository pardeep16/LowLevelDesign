package com.design.principles.isp.optimal;

// This class represents a Book.
// It adheres to the Interface Segregation Principle (ISP) by defining a minimal interface
// that only includes methods relevant to the Book class.
// This allows for better separation of concerns and ensures that classes implementing this interface
public class AudioBookImpl implements AudioBook{
    private String title;
    private String author;
    private int numberOfPages;
    private String audioURI;
    private String eBookURI;

    public AudioBookImpl(String title, String author, int numberOfPages, String audioURI, String eBookURI) {
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
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getAudioURI() {
        return this.audioURI;
    }

    @Override
    public String getEBookURI() {
        return this.eBookURI;
    }
}
