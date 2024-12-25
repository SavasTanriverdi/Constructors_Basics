public class ConstructorsBasics {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        User user1 = new User();
        user1.displayUserInfo();

        // Creating an object using the parameterized constructor
        User user2 = new User("Alice", 25);
        user2.displayUserInfo();
    }
}