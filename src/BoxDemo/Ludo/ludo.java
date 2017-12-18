/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo.Ludo;

import java.util.Random;

/**
 *
 * @author Jaction76
 */
public class ludo {

    public void Ludo() {

    }

    public static void main(String[] args) {
        int count12 = 0, count2 = 0;
        Random r = new Random();

        for (int i = 0; i < 10000; i++) {
            int a = r.nextInt(6) + 1;
            int b = r.nextInt(6) + 1;
            int sum = a + b;

            if (sum == 2) {
                count2 += 1;
            } else if (sum == 12) {
                count12 += 1;

            } else {

            }
        }
        System.out.println("2 occure " + count2 + " times");
        System.out.println("12 occure " + count12 + " times");
    }

}
