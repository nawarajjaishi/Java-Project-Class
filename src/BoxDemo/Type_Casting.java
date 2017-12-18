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
public class Type_Casting {
    public static void main(String[] args){  
    float f=10.5f;  
    //int a=f;//Compile time error  
    int a=(int)f;  
    System.out.println(f);  
    System.out.println(a);  
   }
}
