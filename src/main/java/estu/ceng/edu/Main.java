package estu.ceng.edu;

public class Main {
    public static void main(String[] args) {
        Signup signup = new Signup();
        Login login = new Login();

        try {
            signup.register("gokhan", "gokhan@example.com", "secret123");
            login.login("gokhan@example.com", "secret123");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
