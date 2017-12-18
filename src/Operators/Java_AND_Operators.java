/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

/**
 *
 * @author Jaction76
 */
public class Java_AND_Operators {
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        int c=20;  
        System.out.println(a<b&&a++<c);//false && true = false  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a<b&a++<c);//false && true = false  
        System.out.println(a);//11 because second condition is checked  
}
    
}
