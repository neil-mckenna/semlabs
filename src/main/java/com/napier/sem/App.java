package com.napier.sem;

public class App {
    public static void main(String[] args)
    {

        // Create new Application
        SQLApp a = new SQLApp();

        // Connect to database
        a.connect();

        // Disconnect from database
        a.disconnect();
    }
}
