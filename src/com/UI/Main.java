/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

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
//            e.printStackTrace^
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DangNhap dn = new DangNhap();
                //com.sun.awt.AWTUtilities.setWindowOpacity(dn, (float) 0.7f);
                dn.setVisible(true);
            }
        });
    }
}
