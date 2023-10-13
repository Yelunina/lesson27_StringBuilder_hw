package ait.stringbuilder;

public class StringReverse {
    public static void main(String[] args) {
        String reverse = reversOrder("Ukraine");
        System.out.println(reverse);
    }

    public static String reversOrder(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse;
    }

}
