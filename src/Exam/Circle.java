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

// best example of "is-a" relation of inheritance
public class Circle {

    Operation op;//aggregation  
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).  
        return pi * rsquare;
    }

    public static void main(String args[]) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }

}
