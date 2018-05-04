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
public class StaticDemo {

    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String args[]) {
        int result = StaticDemo.cube(5);
        System.out.println(result);
    }
}
