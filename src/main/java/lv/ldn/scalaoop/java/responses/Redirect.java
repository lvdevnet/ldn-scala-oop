package lv.ldn.scalaoop.java.responses;

public final class Redirect implements Response {

    private final int code;
    private final URL url;

    public Redirect(int code, URL url) {
        this.code = code;
        this.url = url;
    }

    public int getCode() {
        return code;
    }

    public URL getUrl() {
        return url;
    }

}
