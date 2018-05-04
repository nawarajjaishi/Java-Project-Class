/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author Jaction76
 */
import java.lang.String;

public class StringDemo {

    public static void main(String[] args) {
        String arr[] = {"Nepal", "America", "India", "Bangladesh", "Srilanka", "Paragbey", "Austriliya", "chili", "Argentina", "France"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("a")) {
                System.out.println(arr[i]);
            }
        }
        float s = 20.45f;
        String v = String.valueOf(s);
        System.out.println(v);
    }
}
