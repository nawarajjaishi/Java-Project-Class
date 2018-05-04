/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Jaction76
 */
public class Student {

    private int id;
    private String name;
    private String rollNo;

    public static void main(String[] args) {
        Student st = new Student();
        st.valueset();
        st.display();
    }

    private void valueset() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter your Name ");
        name = sn.nextLine();
        System.out.println("Enter your ID ");
        id = sn.nextInt();
        System.out.println("Enter your Roll NO.");
        rollNo = sn.next();
    }

    private void display() {
        System.out.println("You provide Your Info as follow,Is this Correct ?");
        System.out.println("Your Name : " + name);
        System.out.println("Your ID : " + id);
        System.out.println("Your Roll NO. :" + rollNo);
    }
}
