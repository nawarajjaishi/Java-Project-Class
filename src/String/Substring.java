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
public class Substring {

    private String s1 = "A part of string is called substring. In other words, substring is a subset of another string."
            + " In case of substring startIndex is inclusive and endIndex is exclusive.";

    public static void main(String[] args) {
        Substring sb = new Substring();
        sb.example1();
        sb.example2();
    }

    private void example1() {
        System.out.println("this is a Example of cutting String by providing starting index of string with substring() method.");
        System.out.println(s1.substring(52));
    }

    private void example2() {
        System.out.println("\nthis is a Example of cutting String  providing starting index and ending index of string with substring() method."); //
        System.out.println(s1.substring(0,52));
    }

}
