package lv.ldn.scalaoop.java.responses;

public class Handler {

    public void handle(Response response) {
        if (response instanceof Success) {
            Success success = (Success) response;
            System.out.println("Success: " + success.getResult());
        } else if (response instanceof Redirect) {
            Redirect redirect = (Redirect) response;
            System.out.println("Redirect: " + redirect.getUrl().getAddress());
        } else if (response instanceof BadRequest) {
            BadRequest badRequest = (BadRequest) response;
            System.out.println("Failed: " + badRequest.getReason());
        } else {
            throw new IllegalArgumentException("Unexpected response instance");
        }
    }

}
