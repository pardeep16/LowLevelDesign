package com.design.principles.isp.problematic;

// This class represents a Book.
// It violates the Interface Segregation Principle (ISP) by forcing all classes that implement this interface
// to implement methods that may not be relevant to them.
// For example, a physical book may not have an audio URI or an eBook URI.
public interface Book {

    public int getNumberOfPages();
    public String getTitle();
    public String getAuthor();
    public String getAudioURI();
    public String getEBookURI();
}
