package lv.ldn.scalaoop.java;

import java.util.ArrayList;
import java.util.Arrays;

public final class JavaOddities {

    private JavaOddities() {
    }

    public static void integerCaching() {
        int a = 1000, b = 1000;
        System.out.println(a == b); // true
        Integer c = 1000, d = 1000;
        System.out.println(c == d); // false
        Integer e = 100, f = 100;
        System.out.println(e == f); // true
    }

    public static void primitiveOverloading() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int primitive = 1;
        list.remove(primitive);
        System.out.println(list); // [1, 3]

        list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Integer boxed = 1;
        list.remove(boxed);
        System.out.println(list); // [2, 3]
    }

    public static void arrayCovariance() {
        Object[] objects = new String[4];
        objects[0] = new Object(); // blows up in runtime
    }

    public static void main(String[] args) {
        integerCaching();
        primitiveOverloading();
        arrayCovariance();
    }

}
