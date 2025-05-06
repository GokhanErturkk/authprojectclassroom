package estu.ceng.edu;

public class Login extends AuthService {
    public void login(String email, String password) throws Exception {
        if (isEmpty()) {
            throw new Exception("Email is not registered.");
        }

        if (!storedEmail.equals(email) || !storedPassword.equals(password)) {
            throw new Exception("Email or password is incorrect.");
        }

        System.out.println("Login successful.");
    }
}
