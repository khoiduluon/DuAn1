/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import java.awt.Color;
import util.setColorSystem;

/**
 *
 * @author trantrung
 */
public class DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        this.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTenDN = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtNhapLaiMK = new javax.swing.JTextField();
        lblNhapLaiMK = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnDangKy = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(293, 444));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenDN.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblTenDN.setText("Tên đăng nhập:");
        jPanel1.add(lblTenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtTenDN.setPreferredSize(new java.awt.Dimension(84, 30));
        jPanel1.add(txtTenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, -1));

        txtMatKhau.setPreferredSize(new java.awt.Dimension(84, 30));
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, -1));

        lblMatKhau.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblMatKhau.setText("Mật khẩu:");
        jPanel1.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtNhapLaiMK.setPreferredSize(new java.awt.Dimension(84, 30));
        jPanel1.add(txtNhapLaiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, -1));

        lblNhapLaiMK.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblNhapLaiMK.setText("Nhập lại mật khẩu:");
        jPanel1.add(lblNhapLaiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtHoTen.setPreferredSize(new java.awt.Dimension(84, 30));
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, -1));

        lblHoTen.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblHoTen.setText("Họ và tên:");
        jPanel1.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblGioiTinh.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblGioiTinh.setText("Giới tính:");
        jPanel1.add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        rdoNam.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        rdoNam.setText("Nam");
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        rdoNu.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        rdoNu.setText("Nữ");
        jPanel1.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        btnDangKy.setText("Đăng ký");
        jPanel1.add(btnDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
        });
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Background_dangky.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        setColorSystem cl = new setColorSystem();
        cl.reSetBorder(lblExit);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        setColorSystem cl = new setColorSystem();
        cl.setBorder(lblExit);
    }//GEN-LAST:event_lblExitMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangKy dk = new DangKy();
                dk.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNhapLaiMK;
    private javax.swing.JLabel lblTenDN;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNhapLaiMK;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables

    public void addToDataBase() {

    }

    public void thongBao() {

    }

    public void checkLoi() {
        //trung id
        //mk ko trung
        //bo trong
        //
    }

}
