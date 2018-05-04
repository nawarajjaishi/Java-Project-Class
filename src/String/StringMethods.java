/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Jaction76
 */
public class StringMethods {

    private String st = "The java.lang.String class provides a lot of methods to work on string. By the help "
                        + "of these methods, we can perform operations on string such as trimming, concatenating, converting, "
                        + "comparing, replacing strings etc.\n" + "Java String is a powerful concept because everything is "
                        + "treated as a string if you submit any form in window based, web based or mobile application.";

    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        sm.toUppercase();
        sm.toLowercase();

    }

    private void toUppercase() {
        String s = st.toUpperCase();
        System.out.println("This is a Example of Change Given String into Uppercase Latter");
        System.out.println(s+"\n");

    }

    private void toLowercase() {
        String s = st.toLowerCase();
        System.out.println("\nThis is a Example of Change Given String into Lowercase Latter");
        System.out.println(s);

    }

}
