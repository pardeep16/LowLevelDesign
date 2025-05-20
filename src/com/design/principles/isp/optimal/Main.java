package com.design.principles.isp.optimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interface Segregation Principle");
        System.out.println("The Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use.");
        System.out.println("This principle is about creating smaller, more specific interfaces rather than a large, general-purpose interface.");
        System.out.println("This helps in reducing the impact of changes and makes the code more understandable and maintainable.");

        Book book = new SimpleBook("Effective Java", "Joshua Bloch", 416);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Number of Pages: " + book.getNumberOfPages());
        // The following lines would not compile because the SimpleBook class does not implement the AudioBook interface
        // System.out.println("Audio URI: " + book.getAudioURI());
        // System.out.println("EBook URI: " + book.getEBookURI());

        AudioBook audioBook = new AudioBookImpl("The Great Gatsby", "F. Scott Fitzgerald", 180, "audioURI", "eBookURI");
        System.out.println("Audio Book Title: " + audioBook.getTitle());
        System.out.println("Audio Book Author: " + audioBook.getAuthor());
        System.out.println("Audio Book Number of Pages: " + audioBook.getNumberOfPages());
        System.out.println("Audio Book Audio URI: " + audioBook.getAudioURI());
        System.out.println("Audio Book EBook URI: " + audioBook.getEBookURI());

    }
}
