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
public class Result extends Test {

    double total;

    public void calculate() {        
         total = marks1 + marks2;
    }

    public void displayTolal() {
        System.out.println("Your total marks is : " + total);
    }    

}
