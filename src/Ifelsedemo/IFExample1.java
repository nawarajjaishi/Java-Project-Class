/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelsedemo;

import java.util.Scanner;

/**
 *
 * @author Jaction76
 */
public class IFExample1 {

    private String clzname, sname, section;
    private int Rollno, sub;
    private float marks;

    public static void main(String[] args) {

        IFExample1 e1 = new IFExample1();
        e1.IFElseonly();
    }

    private void IFElseonly() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        sname = sn.nextLine();
        System.out.println("Please Enter Your Roll No. :");
        Rollno = sn.nextInt();
        System.out.println("Please Enter Your Section :");
        section = sn.nextLine();
        System.out.println("Please Enter Your College Name : ");
        clzname = sn.nextLine();
        System.out.println("Please Enter Total Subject You Studying Now : ");
        sub = sn.nextInt();
        System.out.println("Please Provide Your Total Aggregate Marks You Obtained in Your " + sub + " Subjects");
        marks = sn.nextInt();
        result();
    }

    private void result() {
        float percentage = (marks / sub);
        if (percentage <= 35) {
            System.out.println("Sorry!!" + "You Got Only " + percentage + " Percentage\n" + "Your Detail As Follows :");
            System.out.println("__________________________________");
            System.out.println(sname);
            System.out.println(Rollno);
            System.out.println(section);
            System.out.println(clzname);
            System.out.println("Result Status : Fail");
        } else {
            System.out.println("Congratulation..." + "You Got " + percentage + " Percentage\n" + "Your Detail As Follows :");
            System.out.println("__________________________________________");
            System.out.println("Name : " + sname);
            System.out.println("Roll No. : " + Rollno);
            System.out.println("Section : " + section);
            System.out.println("College Name : " + clzname);
            System.out.println("Result Status : Pass");
        }
    }

}
