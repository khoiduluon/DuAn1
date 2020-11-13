/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.dao.NguoiDungDAO;
import com.entity.NguoiDung;
import util.setColorSystem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import util.Auth;
import util.MsgBox;
//import sun.lwawt.macosx.CocoaConstants;

public class DangNhap extends javax.swing.JFrame {

    public DangNhap() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(232,232,232));
        this.mouseHover();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDangNhap = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        txtTenDN = new javax.swing.JTextField();
        lblQuenMK = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblDangKy = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDangNhap.setBackground(new java.awt.Color(102, 102, 102));
        lblDangNhap.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblDangNhap.setText("Tên đăng nhập:");
        jPanel1.add(lblDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtMatKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMatKhau.setAlignmentX(1.0F);
        txtMatKhau.setAlignmentY(1.0F);
        txtMatKhau.setBorder(null);
        txtMatKhau.setPreferredSize(new java.awt.Dimension(266, 30));
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, -1));

        txtTenDN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTenDN.setAlignmentX(1.0F);
        txtTenDN.setAlignmentY(1.0F);
        txtTenDN.setBorder(null);
        txtTenDN.setPreferredSize(new java.awt.Dimension(266, 30));
        jPanel1.add(txtTenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, -1));

        lblQuenMK.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblQuenMK.setForeground(new java.awt.Color(0, 102, 255));
        lblQuenMK.setText("<html>\n<body>\n<u>Quên mật khẩu ?</u>\n</body>\n</html>");
        lblQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseExited(evt);
            }
        });
        jPanel1.add(lblQuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        lblMatKhau.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        lblMatKhau.setText("Mật khẩu:");
        jPanel1.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lblDangKy.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblDangKy.setForeground(new java.awt.Color(0, 102, 255));
        lblDangKy.setText("<html> <body> <u>Bạn chưa có tài khoản ?</u> </body> </html>");
        lblDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangKyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangKyMouseExited(evt);
            }
        });
        jPanel1.add(lblDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, 30));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 30));

        btnDangNhap.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setPreferredSize(new java.awt.Dimension(114, 30));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        setColorSystem cl = new setColorSystem();
        cl.setBorder(lblExit);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        setColorSystem cl = new setColorSystem();
        cl.reSetBorder(lblExit);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblQuenMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseEntered
       setColorSystem cl = new setColorSystem();
       cl.setColor(lblQuenMK);
    }//GEN-LAST:event_lblQuenMKMouseEntered

    private void lblQuenMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseExited
         setColorSystem cl = new setColorSystem();
         cl.resetColor(lblQuenMK);
    }//GEN-LAST:event_lblQuenMKMouseExited

    private void lblDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMouseEntered
         setColorSystem cl = new setColorSystem();
         cl.setColor(lblDangKy);
    }//GEN-LAST:event_lblDangKyMouseEntered

    private void lblDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMouseExited
         setColorSystem cl = new setColorSystem();
         cl.resetColor(lblDangKy);
    }//GEN-LAST:event_lblDangKyMouseExited

    private void lblDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMouseClicked
        new DangKy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblDangKyMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        dangNhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblQuenMK;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables

    public void mouseHover() {
        lblQuenMK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblDangKy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDangNhap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    NguoiDungDAO ngdao = new NguoiDungDAO();
    
    public void openDangNhap(){
        new DangNhap().setVisible(true);
    }
    
    public void thongBao(){
        //loi
    }
    
    public void checkLoi(){
        //detrong
        //mk,taikhoan
    }

    
       void dangNhap(){
       String manv = txtTenDN.getText();
       String matKhau = txtMatKhau.getText();
      NguoiDung nguoidung = ngdao.selectByid(manv);
       if(nguoidung==null){
           MsgBox.alert(this, "Sai ten dang nhap");
       } else if(!matKhau.equals(nguoidung.getMatKhau())){
           MsgBox.alert(this, "Sai mat khau");
       } else {
           Auth.user = nguoidung;
           new QuanLy().setVisible(true);
           this.dispose();
       }
   }
}
