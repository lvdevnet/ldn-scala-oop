package lv.ldn.scalaoop.java;

public final class VolatileResult2 {

    private VolatileResult2() {
    }

    public interface VolatileResult {
        Object get();
    }

    public abstract class Result implements VolatileResult {
        protected final Object object;

        protected Result(Object object) {
            this.object = object;
        }

        public Object get() {
            return object;
        }
    }

    public class Success<T> extends Result {
        public Success(T object) {
            super(object);
        }
    }

    public class Failure extends Result {
        public Failure(String message) {
            super(message);
        }
    }

    private void run() {
        printResult(new Success<>(42));
        printResult(new Failure("couldn't do it"));

    }

    private void printResult(VolatileResult result) {
        if (result instanceof Success) {
            System.out.println("Success: " + result.get());
        } else if (result instanceof Failure) {
            System.out.println("Faiure: " + result.get());
        } else {
            throw new IllegalArgumentException("Unexpected result instance");
        }
    }

    public static void main(String[] args) {
        new VolatileResult2().run();
    }

}
