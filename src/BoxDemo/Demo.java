/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo;

public class Demo {
    //creating instances for Demo Object  
    private int id;
    private String name;
    private float percentage;
    private double gpa;
    
    public static void main(String[] args) {
        Demo d1=new Demo();
        /* here d1 is a new one object of class Object
           AND Demo() is a default(no parameter) constructor of a class Demo */
        
        Demo d2=new Demo(18,"Nutan Swar",89.453f,3.93);
        /* here d2 is a anoteher new one object of class Object
           AND Demo(18,"Nutan Swar",89.453f,3.93) is a parameterized constructor of a class Demo 
        */
        
        Demo d3=new Demo();
        System.out.println("your id : "+d3.id);
        System.out.println("Your Name : "+d3.name);
        System.out.println("your percentage : "+d3.percentage);
        System.out.println("your GPA: "+d3.gpa+"\n");
        //here we use d3.id and so on for print something is because of non-static variables are not allowed to call from here in static method  
        
        d1.Display();
        /* Dispaly method is called for print outputs which is performed by Display method
            when method of any class want submit processed results to class then dot(.)oprator is used 
            for add method in object 
        */
        d2.Display();
        
    }
    //Demo() is a constructor of a class Demo
    Demo(){
        this.id=12;
        this.name="nawaraj jaishi";
        this.percentage = 78.5f;
        this.gpa=3.89;
    }
    //private Demo(int i, String nutan, float f, double d) is a parameterized construstor
    private Demo(int i, String nutan, float f, double d) {
       this.id=i;
       this.name=nutan;
       this.percentage=f;
       this.gpa=d;
    }
    // public void Display() is a non-parameterized mehod void is used for non-return type
    public void Display(){
        System.out.println("your id : "+id);
        System.out.println("Your Name : "+name);
        System.out.println("your percentage : "+percentage);
        System.out.println("your GPA: "+gpa+"\n");
    }
}
