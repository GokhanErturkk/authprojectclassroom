package estu.ceng.edu;

public class Login extends AuthService {
    public void login(String email, String password) throws EmailNotRegisteredException, IncorrectCredentialsException {
        if (isEmpty()) {
            throw new EmailNotRegisteredException();
        }

        if (!storedEmail.equals(email) || !storedPassword.equals(password)) {
            throw new IncorrectCredentialsException();
        }

        System.out.println("Login successful.");
    }
}