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
public class String_Concatenation {  
    private String s1 = "Hi,I'm Nawaraj Jaishi.";
    private String s2 = " I'm studying BIM at Kist College";
    private String s4 = "I'm a stupied Guy";
    private String s5 = " Who does't khow about what happining in my daly life ";

    public static void main(String[] args) {
        String_Concatenation sc = new String_Concatenation();
        sc.plus_operator();
        sc.by_concat_method();
    }

    private void plus_operator() {
        String s3 = s1+s2;
        System.out.println(s3);
        
        //OR we can contact string When defining like as:
        String s4="Hi,I'm Nawaraj Jaishi."+" I'm studying BIM at Kist College";
        System.out.println(s4);
        
        // this can be done
        String s=50+30+"Sachin"+40+40;  
        System.out.println(s);//80Sachin4040
        }

    private void by_concat_method() {
        String s3=s4.concat(s5);  
        System.out.println(s3);//I'm a stupied Guy Who does't khow about what happining in my daly life
        
        }

}
