package ExceptionHanding;

class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}