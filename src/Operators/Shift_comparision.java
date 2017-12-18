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
public class Shift_comparision {
    public static void main(String args[]){  
    //For positive number, >> and >>> works same  
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  
    System.out.println(-20>>>2);  
}
    
}
