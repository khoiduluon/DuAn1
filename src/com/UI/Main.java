/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author trantrung
 */
public class Main {

    public static void main(String args[]) {

//        try {
//            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel");
//                                     
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
        System.out.println("Hello");
    }
}
