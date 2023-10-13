package ait.stringbuilder;

public class StringReverse {
    public static void main(String[] args) {
        String reverse = reversOrder("Ukraine");
        System.out.println(reverse);
        reverse = reversOrder1("Ukraine");
        System.out.println(reverse);
        reverse = reversOrder2("Ukraine");
        System.out.println(reverse);
    }

    public static String reversOrder(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String reverse = builder.toString();
        return reverse;
    }

    public static String reversOrder1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reversOrder2(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;
    }
}
