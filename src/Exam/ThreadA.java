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
public class ThreadA {

    int i;
    String color="blue";

    public void evenNumber() {
        System.out.println("Following is the list of even number from 50 to 100 :");
        for (i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
