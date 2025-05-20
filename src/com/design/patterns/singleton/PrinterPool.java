package com.design.patterns.singleton;

// This class represents a Printer Pool.
// It adheres to the Singleton Design Pattern, ensuring that only one instance of PrinterPool exists.
// This is useful for managing shared resources like printers in a system.
// The class provides a static method to get the single instance of PrinterPool.
public class PrinterPool {
    private static PrinterPool printerPool;

    private PrinterPool() {
        // Private constructor to prevent instantiation
    }
    // Method to get the single instance of PrinterPool
    // synchronized to ensure thread safety
    public static synchronized PrinterPool getInstance(){
        if(null == printerPool){
            printerPool = new PrinterPool();
        }
        return printerPool;
    }
}
