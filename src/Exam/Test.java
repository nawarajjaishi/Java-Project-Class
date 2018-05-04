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
public class Test extends StudentDemo{
        double marks1,marks2;

        public void readMarks(double m1,double m2){
            this.marks1=m1;
            this.marks2=m2;            
        }
        
        public void displayMarks(){
            System.out.println("your marks of "+"\n"+"subject 1 is :"+marks1+ "\n"+"subject 2 is :"+marks2);
        }
}
