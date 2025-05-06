package estu.ceng.edu;

public class IncorrectCredentialsException extends Exception {
    public IncorrectCredentialsException() {
        super("Email or password is incorrect.");
    }
}
