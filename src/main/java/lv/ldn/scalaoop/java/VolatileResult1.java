package lv.ldn.scalaoop.java;

public final class VolatileResult1<T> {

    private final boolean success;
    private final T result;
    private final String message;

    private VolatileResult1(boolean success, T result, String message) {
        this.success = success;
        this.result = result;
        this.message = message;
    }

    public static <T> VolatileResult1<T> success(T value) {
        return new VolatileResult1<>(true, value, null);
    }

    public static <T> VolatileResult1<T> failure(String message) {
        return new VolatileResult1<>(false, null, message);
    }

    public boolean isSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        printResult(VolatileResult1.success(42));
        printResult(VolatileResult1.failure("couldn't do it"));
    }

    private static <T> void printResult(VolatileResult1<T> result) {
        if (result.isSuccess()) {
            System.out.println("Success: " + result.getResult());
        } else {
            System.out.println("Failure: " + result.getMessage());
        }
    }

}
