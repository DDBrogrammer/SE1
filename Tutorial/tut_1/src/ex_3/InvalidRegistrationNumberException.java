package ex_3;

public class InvalidRegistrationNumberException extends Exception {
    private String code;

    public InvalidRegistrationNumberException(String code, String message) {
        super(message);
        this.setCode(code);
    }

    public InvalidRegistrationNumberException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
