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
public class Assignment_Operators_example3 {
    public static void main(String args[]){  
        short a=10;  
        short b=10;  
        //a+=b;//a=a+b internally so fine  
        a=(short)(a+b);//Compile time error because 10+10=20 now int  
        System.out.println(a);  
    }
    
}
