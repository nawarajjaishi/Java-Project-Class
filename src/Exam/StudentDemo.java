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
public class StudentDemo {
    int roll_no;
    
   public void read(int r){
       this.roll_no=r;
   }
   public void display(){
       System.out.println("Your Roll no  : "+roll_no);
   }
   
   public static void main(String[] args) {
        Result rs = new Result();
        rs.read(12);
        rs.readMarks(67.88, 90.90);
        rs.display();
        rs.calculate();
        rs.displayMarks();
        rs.displayTolal();

    }
}
