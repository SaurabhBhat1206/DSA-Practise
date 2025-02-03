package solid.SingleResponsibility;


/*
1. Single Responsibility Principle (SRP)
Definition: A class should have only one reason to change. It should only have one responsibility.

Simple Words: A class should do one thing and do it well.
*/

// Violates SRP: Handles both user and report responsibilities
class User {
    void saveUser() {
        // Save user details
    }

    void generateReport() {
        // Generate report for the user
    }
}

// Follows SRP: Separate classes for separate responsibilities
class User1 {
    void saveUser() {
        // Save user details
    }
}

class Report {
    void generateReport() {
        // Generate report
    }
}