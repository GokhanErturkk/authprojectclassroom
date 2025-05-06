package estu.ceng.edu;

public class Signup extends AuthService {
    public void register(String username, String email, String password) throws Exception {
        if (!isEmpty()) {
            if (storedUsername.equals(username)) {
                throw new Exception("Username is already taken.");
            }
            if (storedEmail.equals(email)) {
                throw new Exception("Email is already taken.");
            }
        }

        if (password.length() < 6) {
            throw new Exception("Password must be at least 6 characters.");
        }

        storedUsername = username;
        storedEmail = email;
        storedPassword = password;

        System.out.println("Signup successful.");
    }
}
