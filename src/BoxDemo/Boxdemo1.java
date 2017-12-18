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
public class Boxdemo1 {
    // This is the example of declare one box object
    public static void main(String[] args) {
        Box mybox=new Box();
        double vol;
            //assigning values to the mybox's instance variables
        mybox.height=56;
        mybox.depth=50;
        mybox.width=56;
            //compute volume of box
        vol=mybox.height*mybox.width*mybox.depth;
        System.out.println("The Volume of The BOX is : "+vol+"cm^3");
    }
       
}
