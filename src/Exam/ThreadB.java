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
public class ThreadB {
    int i;
    public void oddNumber(){     
    System.out.println("Following is the list of odd number from 100 to 200 :");
        for(i=50;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
