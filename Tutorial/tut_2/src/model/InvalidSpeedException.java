package model;

public class InvalidSpeedException  extends Exception{
    private String code;

    public InvalidSpeedException (String code, String message) {
        super(message);
        this.setCode(code);
    }

    public InvalidSpeedException (String code, String message, Throwable cause) {
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
