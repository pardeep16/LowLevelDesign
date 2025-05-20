package com.design.principles.isp.optimal;

// This class represents a Book.
// It adheres to the Interface Segregation Principle (ISP) by defining a minimal interface
// that only includes methods relevant to the Book class.
// This allows for better separation of concerns and ensures that classes implementing this interface
public interface Book {
    public int getNumberOfPages();
    public String getTitle();
    public String getAuthor();
}
