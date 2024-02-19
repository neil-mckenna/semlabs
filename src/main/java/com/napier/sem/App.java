package com.napier.sem;

public class App {
    public static void main(String[] args)
    {

        // Create new Application
        SQLApp a = new SQLApp();

        // Connect to database
        a.connect();

        // Get Employee
        Employee emp = a.getEmployee(255530);

        // Display results
        a.displayEmployee(emp);


        // Disconnect from database
        a.disconnect();
    }



}
