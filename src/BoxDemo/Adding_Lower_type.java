/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo;

/**
 *
 * @author Jaction76
 */
public class Adding_Lower_type {
    public static void main(String[] args){  
    byte a=10;  
    byte b=10;  
    //byte c=a+b;//Compile Time Error: because a+b=20 will be int  
    byte c=(byte)(a+b);  
    System.out.println(c);  
}
    
}
