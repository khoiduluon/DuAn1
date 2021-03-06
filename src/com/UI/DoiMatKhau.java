/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.dao.NguoiDungDAO;
import com.entity.NguoiDung;
import util.MsgBox;
import util.setColorSystem;

/**
 *
 * @author Rom
 */
public class DoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhau() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblIconAn.setVisible(false);
        lblAnMK.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTenDN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtXacNhanMK = new javax.swing.JPasswordField();
        txtMKMoi = new javax.swing.JPasswordField();
        lblIconAn = new javax.swing.JLabel();
        lblAnMK = new javax.swing.JLabel();
        lblHienmk = new javax.swing.JLabel();
        lblIconHien = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMKCu = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Tên đăng nhập:");

        jLabel2.setText("Mật khẩu mới:");

        jLabel3.setText("Xác nhận mật khẩu:");

        lblIconAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/invisible_24px.png"))); // NOI18N
        lblIconAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconAnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconAnMousePressed(evt);
            }
        });

        lblAnMK.setForeground(new java.awt.Color(0, 102, 255));
        lblAnMK.setText("Ẩn mật khẩu");
        lblAnMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAnMKMousePressed(evt);
            }
        });

        lblHienmk.setForeground(new java.awt.Color(0, 102, 255));
        lblHienmk.setText("Hiện mật khẩu");
        lblHienmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHienmkMousePressed(evt);
            }
        });

        lblIconHien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eye_24px.png"))); // NOI18N
        lblIconHien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconHienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconHienMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconHienMousePressed(evt);
            }
        });

        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        jLabel4.setText("Mật khẩu cũ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblIconHien)
                                        .addComponent(lblIconAn))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAnMK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHienmk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDoiMatKhau)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(101, 101, 101)
                            .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconHien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconAn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHienmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDoiMatKhau)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIconAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIconAnMouseClicked

    private void lblIconAnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconAnMousePressed
        // TODO add your handling code here:
        AnMk();
    }//GEN-LAST:event_lblIconAnMousePressed

    private void lblAnMKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnMKMousePressed
        // TODO add your handling code here:
        AnMk();
    }//GEN-LAST:event_lblAnMKMousePressed

    private void lblHienmkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHienmkMousePressed
        // TODO add your handling code here:
        HienMK();
    }//GEN-LAST:event_lblHienmkMousePressed

    private void lblIconHienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIconHienMouseClicked

    private void lblIconHienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHienMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_lblIconHienMouseEntered

    private void lblIconHienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHienMousePressed
        // TODO add your handling code here:
        HienMK();
    }//GEN-LAST:event_lblIconHienMousePressed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        if(checkError()==true){
            DoiMK();
        }
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
        new DangNhap().setVisible(true);
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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAnMK;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHienmk;
    private javax.swing.JLabel lblIconAn;
    private javax.swing.JLabel lblIconHien;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JTextField txtTenDN;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables
    
    NguoiDungDAO dao=new NguoiDungDAO();
    boolean checkError(){
        if(txtTenDN.getText().equals("")){
            MsgBox.alert(this,"Vui lòng điền tên đăng nhập!");
            return false;
        }
        if(txtMKMoi.getText().equals("")){
            MsgBox.alert(this,"Vui lòng điền mật khẩu!");
            return false;
        }
        if(txtXacNhanMK.getText().equals("")){
            MsgBox.alert(this,"Vui lòng xác nhận mật khẩu!");
            return false;
        }
        if(!txtMKMoi.getText().trim().equals(txtXacNhanMK.getText().trim())){
            MsgBox.alert(this,"Xác nhận mật khẩu không đúng!");
            return false;
        }
        return true;
    }
    void DoiMK(){
        NguoiDung nguoidung=dao.selectByid(txtTenDN.getText().trim());
        NguoiDung nd=getFrom();
        try {
            if(nguoidung.getUser().equals(nd.getUser()) && nguoidung.getMatKhau().equals(txtMKCu.getText())){
                dao.update1(nd);
                MsgBox.alert(this, "Đổi mật khẩu thành công!");
                new DangNhap().setVisible(true);
                this.dispose();
            }else{
                MsgBox.alert(this, "Đổi mật khẩu thất bại!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    NguoiDung getFrom(){
        NguoiDung nd=new NguoiDung();
        nd.setUser(txtTenDN.getText().trim());
        nd.setMatKhau(txtMKMoi.getText().trim());
        return nd;
    }
    void AnMk(){
        lblIconAn.setVisible(false);
        lblAnMK.setVisible(false);
        lblIconHien.setVisible(true);
        lblHienmk.setVisible(true);
        txtMKCu.setEchoChar('*');
        txtMKMoi.setEchoChar('*');
        txtXacNhanMK.setEchoChar('*');
    }
    void HienMK(){
        lblIconHien.setVisible(false);
        lblHienmk.setVisible(false);
        lblIconAn.setVisible(true);
        lblAnMK.setVisible(true);
        txtMKCu.setEchoChar((char)0);
        txtMKMoi.setEchoChar((char)0);
        txtXacNhanMK.setEchoChar((char)0);
    }

}
