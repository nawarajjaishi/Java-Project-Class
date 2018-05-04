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

//this is a best example of aggregation using "has-a" relation by using inheritance
public class Employee {
        int id;
        String name;
        Address address;

    public Employee(int id, String name,Address address) {
        this.id=id;
        this.name=name;
        this.address=address;
    }
        
     public void display(){
         System.out.println("Your Detail as follows : ");
         System.out.println("Employee ID :\t"+id+"\n"
                            +"Name :\t"+name+"\n" );
         System.out.println("Your Address : \n"
                            +"City :\t"+address.city+"\n"
                            +"State :\t"+address.state+"\n"
                            +"Country :\t"+address.country+"\n");
                           
     }
     public static void main(String[] args) {
        Address ad=new Address("ktm", "2", "Nepal"),ad1=new Address("kolti", "7", "Nepal");
        Employee em=new Employee(12,"nawaraj jaishi", ad1),em1=new Employee(12,"manjit karna", ad);
        em.display();
        em1.display();
    }
    
}
