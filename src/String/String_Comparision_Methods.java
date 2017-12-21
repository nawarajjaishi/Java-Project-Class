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
public class String_Comparision_Methods {

    private String s1 = "I'm Nawaraj Jaishi";
    private String s2 = "I'm Nawaraj Jaishi";
    private String s3 = "Hi, I'm Nawaraj Jaishi.I studying BIM at Kist College";

    //this following s4 variable hold all uppercase latter of s3 variables which is converted by toUpperCase()method
    private String s4 = s3.toUpperCase();

    

    //This Method perform the action of Compare two String by using equals() method
    public void equals_method() {
        System.out.println("This is the Example of Comparing Strings By Using 'equals()' method : ");
        System.out.println(s1.equals(s2));//true  
        System.out.println(s1.equals(s3));//false  

    }

    public void ignorecase() {
        System.out.println("\nThis is the Example of Comparing Strings By Using 'equls() & equalsIgnoreCase()' method : ");
        System.out.println(s3.equals(s4));//false  
        System.out.println(s3.equalsIgnoreCase(s4));//true 
    }

    public void by_equals_operator() {
        System.out.println("\nThis is the Example of Comparing Strings By Using 'equls(==)' operator : ");
        System.out.println(s1 == s3);//false 
        System.out.println(s1 == s2);//true (because both refer to same instance)but it doesn't true whne case sensetative 
        String s5 = new String("I'm Nawaraj Jaishi");
        System.out.println(s1 == s5);//false(because s5 refers to instance created in nonpool) 
    }

    public void compare_to_method() {
        /*  The String compareTo() method compares values lexicographically and returns an integer value that describes 
            if first string is less than, equal to or greater than second string.
            Suppose s1 and s2 are two string variables. If:
            s1 == s2 :0
            s1 > s2   :positive value
            s1 < s2   :negative value
         */
        System.out.println("This is a examaple of compare_to_method() :");
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s3>s1)  
        System.out.println(s3.compareTo(s1));//-1(because s1 < s3 ) 
    }

}
