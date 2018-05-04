/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelsedemo;

import com.sun.javafx.css.SubCssMetaData;
import java.util.Scanner;

/**
 *
 * @author Jaction76
 */
public class IFExample2 {

    private String sname, section, clzname;
    private int Rollno;
    private int sub;
    private float marks = 0, percentage, decider;
    Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        IFExample2 e2 = new IFExample2();
        e2.studentInfo();
        e2.marksInfo();
        e2.display();
    }

    private void studentInfo() {
        System.out.println("Please Enter Your Name : ");
        sname = sn.nextLine();
        System.out.println("Please Enter Your Roll No. :");
        Rollno = sn.nextInt();
        System.out.println("Please Enter Your Section :");
        section = sn.next();
        System.out.println("Please Enter Your College Name : ");
        clzname = sn.next();
    }

    private void marksInfo() {
        System.out.println("How many Subject You Are Studing Now ? ");
        sub = sn.nextInt();
        int subMarks[] = new int[sub];
        for (int i = 0; i < sub; i++) {
            System.out.println("Please Enter your marks of Subject " + (i + 1));
            subMarks[i] = sn.nextInt();
            if (subMarks[i] < 35) {
                System.out.println("\nSorry !!! You Are Failed");
                decider = 0;
                break;
            } else {
                marks = marks + subMarks[i];
                decider = 1;
            }
        }
    }

    private void display() {
        System.out.println("Your Information");
        System.out.println("-------------------");
        System.out.println("Name         : " + sname);
        System.out.println("Roll No.     : " + Rollno);
        System.out.println("Section      : " + section);
        System.out.println("College Name : " + clzname);
        System.out.println("\nResult Status");
        System.out.println("-----------------");
        if (decider == 1) {            
            calculateResult();            
        } else {
            System.out.println("Fail");
        }
        note();
    }

    private void note() {
        System.out.println("\n * Note : ");
        System.out.println("If Marks<35 in any subject           : Fail");
        System.out.println("If percentage>=35 && percentage<50   : Grade 'D'");
        System.out.println("If percentage>=50 && percentage<60   : Grade 'C'");
        System.out.println("If percentage>=60 && percentage<70   : Grade 'B'");
        System.out.println("If percentage>=70 && percentage<80   : Grade 'A'");
        System.out.println("If percentage>=80 && percentage<=100 : Grade 'A+'");
    }

    private void calculateResult() {
        percentage = marks / sub;
        if (percentage >= 35 && percentage < 50) {
            System.out.println("Congratulation You Got Gread 'D'" + "\nWith " + percentage + "%");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Congratulation You Got Gread 'C'" + "\nWith " + percentage + "%");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Congratulation You Got Gread 'B'" + "\nWith " + percentage + "%");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Congratulation You Got Gread 'A'" + "\nWith " + percentage + "%");
        } else if (percentage >= 80 && percentage <= 100) {
            System.out.println("Congratulation You Got Gread 'A+'" + "\nWith " + percentage + "%");
        }
    }

}
