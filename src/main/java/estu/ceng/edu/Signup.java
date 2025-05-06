package estu.ceng.edu;

public class Signup extends AuthService {
    public void register(String username, String email, String password) throws UsernameAlreadyTakenException, EmailAlreadyTakenException, WeakPasswordException {
        if (!isEmpty()) {
            if (storedUsername.equals(username)) {
                throw new UsernameAlreadyTakenException();
            }
            if (storedEmail.equals(email)) {
                throw new EmailAlreadyTakenException();
            }
        }

        if (password.length() < 6) {
            throw new WeakPasswordException();
        }

        storedUsername = username;
        storedEmail = email;
        storedPassword = password;

        System.out.println("Signup successful.");
    }
}