// Class representing a basic user
class User {
    private String name;
    private int age;

    // Default constructor
    public User() {
        this.name = "Default Name";
        this.age = 0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display user information
    public void displayUserInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}