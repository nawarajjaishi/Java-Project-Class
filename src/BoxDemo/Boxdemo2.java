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
public class Boxdemo2 {
    // This is the example of declare two box object :
    public static void main(String[] args) {
        Box mybox1=new Box();
        Box mybox2=new Box();
        Box mybox3=new Box();
        double vol;
            //assigning values to the mybox1's instance variables
        mybox1.height=56;
        mybox1.depth=50;
        mybox1.width=67;
        
            //assigning values to the mybox2's instance variables
        mybox2.height=30;
        mybox2.depth=200;
        mybox2.width=67;
        
            //compute volume of box 1
        vol=mybox1.height*mybox1.width*mybox1.depth;
        System.out.println("The Volume of The BOX 1 is = "+vol+"cm^3");
        
            //compute volume of box 2
        vol=mybox2.height*mybox2.width*mybox2.depth;
        System.out.println("The Volume of The BOX 2 is = "+vol+"cm^3");  
        
            //you must call all the instance of the object to calculate or you must overwrite those instancs 
        mybox3.height=56;
        mybox3.depth=50;
        vol=mybox3.height*mybox3.width*mybox3.depth;
        System.out.println("The Volume of The BOX 3 is = "+vol+"cm^2");
    }
    
}
