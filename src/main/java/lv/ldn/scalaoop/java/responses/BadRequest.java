package lv.ldn.scalaoop.java.responses;

public final class BadRequest implements Response {

    private final String reason;

    public BadRequest(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

}
