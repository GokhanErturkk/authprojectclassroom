package estu.ceng.edu;

public class UsernameAlreadyTakenException extends Exception {
    public UsernameAlreadyTakenException() {
        super("Username is already taken.");
    }
}