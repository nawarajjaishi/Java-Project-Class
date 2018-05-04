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
public class FrameDemo extends Frame {

    FrameDemo() {
        Label name = new Label("Name : ");
        name.setBounds(50, 100, 80, 30);
        add(name);

        TextField nametext = new TextField("Nawaraj jaishi");
        nametext.setBounds(140, 100, 100, 30);
        add(nametext);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);

            }
        });
    }

    public static void main(String[] args) {
        FrameDemo fm = new FrameDemo();
    }
}
