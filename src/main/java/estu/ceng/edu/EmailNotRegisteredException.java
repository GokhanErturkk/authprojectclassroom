package estu.ceng.edu;

public class EmailNotRegisteredException extends Exception {
    public EmailNotRegisteredException() {
        super("Email is not registered.");
    }
}
