package JavaBasics;

public class Strings {

    static String s = "";

//    String is Immutable

    public static void main(String[] args) {
        s = s.replace("foo", "FOO");

        s = new StringBuilder(s).reverse().toString();
    }
}
