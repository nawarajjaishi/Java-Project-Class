/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Jaction76
 */
//this is a example of radio buttion creation in AWT by using CheckboxGroup component
public class RadioButtonDemo {

    public RadioButtonDemo() {
        Frame fm = new Frame("Radio Button Demo");

        fm.setSize(600, 400);
        fm.setLayout(new GridLayout(1,5));
        fm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        Checkbox cb1 = new Checkbox();
        Checkbox cb2 = new Checkbox("Chcck Box2");
        Checkbox cb3 = new Checkbox("Check Box3", true);
        cb1.setLabel("Check BOx1");
        cb3.setState(false);
        fm.add(cb1);
        fm.add(cb2);
        fm.add(cb3);

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb4 = new Checkbox("Check Box4", cg, true);
        Checkbox cb5 = new Checkbox("Check Box5", false, cg);
        fm.add(cb4);
        fm.add(cb5);
        

        fm.setVisible(true);
    }

    public static void main(String[] args) {
        RadioButtonDemo rbd = new RadioButtonDemo();
    }
}
