/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jaction76
 */
public class ChoiceDemo {

    public ChoiceDemo() {
        Frame fm = new Frame("Choice Demonstration");
        fm.setSize(600, 400);
        fm.setLayout(new GridLayout(1, 2));
        fm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        Label lb1 = new Label("What is  your Choice ?? ");
        fm.add(lb1);

        Choice ch = new Choice();
        ch.add("Apple");
        ch.add("Banana");
        ch.add("Mango");
        fm.add(ch);

        System.out.println("Current Selectec is : " + ch.getSelectedItem());
        System.out.println("Currently NO. of the items in the item list are : " + ch.getItemCount());

        ch.select(1);
        System.out.println("Currently selected is : " + ch.getSelectedItem());

        ch.select("Mango");
        System.out.println(" Currently Selected item is : " + ch.getSelectedItem());

        fm.setVisible(true);
    }

    public static void main(String[] args) {
        ChoiceDemo cDemo = new ChoiceDemo();
    }

}
