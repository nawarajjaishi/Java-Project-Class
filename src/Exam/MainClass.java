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
public class MainClass {

    public static void main(String args[]) {
        ThreadA a = new ThreadA();
        a.evenNumber();
        ThreadB b = new ThreadB();
        b.oddNumber();
        
        System.out.println(a.color);
        
        Result rs=new Result();
        rs.read(12);
        rs.display();
        rs.readMarks(86.99, 99.40);
        rs.displayMarks();
        rs.calculate();
        rs.displayTolal();
    }

}
