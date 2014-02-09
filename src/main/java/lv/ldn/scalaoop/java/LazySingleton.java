package lv.ldn.scalaoop.java;

public enum LazySingleton {
    INSTANCE;

    private final String[] values = new String[]{"foo", "bar", "baz"};

    public String getValue(int index) {
        return values[index];
    }

}
