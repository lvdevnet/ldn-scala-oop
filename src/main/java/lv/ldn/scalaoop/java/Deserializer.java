package lv.ldn.scalaoop.java;

import java.util.Date;

public class Deserializer {

    public <T> T deserialize(String data, Class<T> klass) {
        try {
            T instance = klass.newInstance();
            // deserialization magic
            return instance;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Deserializer().deserialize("2014-02-15", Date.class);
    }

}
