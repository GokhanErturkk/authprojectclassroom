package estu.ceng.edu;

public class WeakPasswordException extends Exception {
    public WeakPasswordException() {
        super("Password must be at least 6 characters.");
    }
}