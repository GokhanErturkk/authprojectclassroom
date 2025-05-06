package estu.ceng.edu;

public abstract class AuthService {
    protected static String storedUsername = null;
    protected static String storedEmail = null;
    protected static String storedPassword = null;

    public static boolean isEmpty() {
        return storedEmail == null;
    }
}