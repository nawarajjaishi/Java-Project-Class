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
public class Test2 {

    public static void main(String[] args) {        
        Banks b = new SanimaBank();
        Banks b1 = new NepalBank();
        Banks b2 = new NMBBank();

        System.out.println("Interest rate of Nepal Bank is : " + b.rateOfInterest());
        System.out.println("Interest rate of Sanima Bank is : " + b1.rateOfInterest());
        System.out.println("Interest rate of NMB Bank is : " + b2.rateOfInterest());
    }

}
