/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Jaction76
 */
public class Test_Immutable_String {
            private String s="Sachin";  
            
        public void testimmutablestring(){ 
            s.concat(" Tendulkar");//concat() method appends the string at the end
            System.out.println(s);//will print Sachin because strings are immutable objects
        }
        
        public void Solution_of_immutable_string(){
             String t=s.concat(" Tendulkar"); //concat() method appends the string at the end and assign to the variable s 
             System.out.println(t);          //will print Sachin tendulkar because concated valu is assigned to variable s.
        }        
    public static void main(String a[]){  
        Test_Immutable_String tis=new Test_Immutable_String();
        tis.testimmutablestring();
        tis.Solution_of_immutable_string();
 }  
    
}
