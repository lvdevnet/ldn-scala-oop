package lv.ldn.scalaoop.java.responses;

public final class Success implements Response {

    private final int code;
    private final Object result;

    public Success(int code, Object result) {
        this.code = code;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public Object getResult() {
        return result;
    }

}
