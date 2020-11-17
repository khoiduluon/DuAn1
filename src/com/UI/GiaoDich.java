/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.entity.QuanLyChi;
import com.entity.QuanLyThu;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import util.Auth;
import utils.fmDate;

/**
 *
 * @author trantrung
 */
public class GiaoDich extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDich
     */
    public GiaoDich() {
        initComponents();
        rdoThu.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSoTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdoThu = new javax.swing.JRadioButton();
        rdoChi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        cboThu = new javax.swing.JComboBox<>();
        cboChi = new javax.swing.JComboBox<>();
        dcsNgay = new com.toedter.calendar.JDateChooser();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(302, 300));
        jPanel1.setSize(new java.awt.Dimension(302, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel2.setText("Số tiền:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));
        jPanel1.add(txtSoTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 210, -1));

        jLabel3.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel3.setText("Loại giao dịch:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        buttonGroup1.add(rdoThu);
        rdoThu.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        rdoThu.setText("Thu");
        rdoThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoThuMouseClicked(evt);
            }
        });
        rdoThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoThuActionPerformed(evt);
            }
        });
        jPanel1.add(rdoThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        buttonGroup1.add(rdoChi);
        rdoChi.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        rdoChi.setText("Chi");
        rdoChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoChiMouseClicked(evt);
            }
        });
        rdoChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChiActionPerformed(evt);
            }
        });
        jPanel1.add(rdoChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel4.setText("Ngày:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel5.setText("Chọn nhóm: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnThem.setText("Thêm giao dịch");
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        cboThu.setFont(new java.awt.Font("Quicksand", 0, 13)); // NOI18N
        cboThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lương", "Bán đồ", "Thưởng", "Khoản thu khác", " " }));
        cboThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThuActionPerformed(evt);
            }
        });
        jPanel1.add(cboThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, -1));

        cboChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền nhà", "Điện, nước, gas", "Giải trí", "Di chuyển", "Mua sắm", "Khoản thu khác" }));
        jPanel1.add(cboChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, -1));
        jPanel1.add(dcsNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, -1));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 310, 308));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThuActionPerformed

    }//GEN-LAST:event_cboThuActionPerformed

    private void rdoThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoThuActionPerformed
        cboChi.setVisible(false);
        cboThu.setVisible(true);
    }//GEN-LAST:event_rdoThuActionPerformed

    private void rdoChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChiActionPerformed
        cboThu.setVisible(false);
        cboChi.setVisible(true);
    }//GEN-LAST:event_rdoChiActionPerformed

    private void rdoThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoThuMouseClicked

    }//GEN-LAST:event_rdoThuMouseClicked

    private void rdoChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoChiMouseClicked

    }//GEN-LAST:event_rdoChiMouseClicked

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
            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDich().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChi;
    private javax.swing.JComboBox<String> cboThu;
    private com.toedter.calendar.JDateChooser dcsNgay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdoChi;
    private javax.swing.JRadioButton rdoThu;
    private javax.swing.JTextField txtSoTien;
    // End of variables declaration//GEN-END:variables

    QuanLyChi getInfoGiaoDichChi() {
        QuanLyChi qlc = new QuanLyChi();
        qlc.setUsername(Auth.user.getUser());
        qlc.setSoTien(Double.valueOf(txtSoTien.getText()));
        qlc.setLoaiGD(rdoChi.getText());
        qlc.setNgayGD(fmDate.toString(dcsNgay.getDate(), "dd-MM-yyyy"));
        qlc.setNhomGD((String) cboChi.getSelectedItem());
        return qlc;
    }

    QuanLyThu getInfoGiaoDichThu() {
        QuanLyThu qlt = new QuanLyThu();
        qlt.setUsername(Auth.user.getUser());
        qlt.setSoTien(Double.valueOf(txtSoTien.getText()));
        qlt.setLoaiGD(rdoChi.getText());
        qlt.setNgayGD(fmDate.toString(dcsNgay.getDate(), "dd-MM-yyyy"));
        qlt.setNhomGD((String) cboChi.getSelectedItem());
        return qlt;
    }

    public void clear() {
        rdoThu.setSelected(true);

    }

    public void checkError() {

    }
}
