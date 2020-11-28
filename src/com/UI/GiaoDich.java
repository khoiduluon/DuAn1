/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.dao.ThongKe_ThuChi_DAO;
import com.dao.ThuChiDAO;
import com.entity.ThuChi;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JRadioButton;
import util.Auth;
import util.JDBC;
import util.MsgBox;
import util.setColorSystem;
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
        this.setLocationRelativeTo(null);

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
        lblExit = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(302, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel2.setText("Số tiền:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        txtSoTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoTienKeyPressed(evt);
            }
        });
        jPanel1.add(txtSoTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 210, -1));

        jLabel3.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel3.setText("Loại giao dịch:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

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
        rdoThu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdoThuKeyPressed(evt);
            }
        });
        jPanel1.add(rdoThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

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
        rdoChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdoChiKeyPressed(evt);
            }
        });
        jPanel1.add(rdoChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel4.setText("Ngày:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        jLabel5.setText("Chọn nhóm: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnThem.setText("Thêm giao dịch");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        cboThu.setFont(new java.awt.Font("Quicksand", 0, 13)); // NOI18N
        cboThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lương", "Bán đồ", "Thưởng", "Khoản thu khác", " " }));
        cboThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThuActionPerformed(evt);
            }
        });
        cboThu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboThuKeyPressed(evt);
            }
        });
        jPanel1.add(cboThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        cboChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền nhà", "Điện, nước, gas", "Giải trí", "Di chuyển", "Mua sắm", "Khoản thu khác" }));
        cboChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChiActionPerformed(evt);
            }
        });
        cboChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboChiKeyPressed(evt);
            }
        });
        jPanel1.add(cboChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        dcsNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcsNgayKeyPressed(evt);
            }
        });
        jPanel1.add(dcsNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, -1));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 30));

        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
        });
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (checkError() == true) {
            insert();

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void backgroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backgroundKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_backgroundKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void cboChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChiActionPerformed

    private void cboThuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboThuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (checkError() == true) {
                insert();
            }
        }
    }//GEN-LAST:event_cboThuKeyPressed

    private void cboChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboChiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (checkError() == true) {
                insert();
            }
        }
    }//GEN-LAST:event_cboChiKeyPressed

    private void dcsNgayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcsNgayKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (checkError() == true) {
                insert();
            }
        }
    }//GEN-LAST:event_dcsNgayKeyPressed

    private void txtSoTienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoTienKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (checkError() == true) {
                insert();
            }
        }
    }//GEN-LAST:event_txtSoTienKeyPressed

    private void rdoThuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdoThuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (checkError() == true) {
                insert();
            }
        }
    }//GEN-LAST:event_rdoThuKeyPressed

    private void rdoChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdoChiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (checkError() == true) {
                insert();
            }
        }
    }//GEN-LAST:event_rdoChiKeyPressed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
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
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GiaoDich().setVisible(true);
//            }
//        });
//    }

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
    private javax.swing.JLabel lblExit;
    private javax.swing.JRadioButton rdoChi;
    private javax.swing.JRadioButton rdoThu;
    private javax.swing.JTextField txtSoTien;
    // End of variables declaration//GEN-END:variables

    ThuChiDAO dao = new ThuChiDAO();
    ThongKe_ThuChi_DAO tkctDAO = new ThongKe_ThuChi_DAO();

    ThuChi getInfoGiaoDich() {
        ThuChi qltc = new ThuChi();
        qltc.setUsername(Auth.user.getUser());
        qltc.setSoTien(Double.valueOf(txtSoTien.getText()));
        if (rdoThu.isSelected()) {
            qltc.setLoaiGD(rdoThu.getText().trim());
            qltc.setTenGD(cboThu.getSelectedItem().toString());
        } else {
            qltc.setLoaiGD(rdoChi.getText().trim());
            qltc.setTenGD(cboChi.getSelectedItem().toString());
        }
        qltc.setNgayGD(fmDate.toString(dcsNgay.getDate(), "yyyy-MM-dd"));
        return qltc;
    }

    public void clear() {
        txtSoTien.setText("");
        rdoThu.setSelected(true);
        cboThu.setVisible(true);
    }
    public void insert() {
        ThuChi qltc = getInfoGiaoDich();
        QuanLy ql = new QuanLy();
        try {
            dao.insert(qltc);
            MsgBox.alert(this, "Thêm thành công!");
            ql.fillTableChiThu();
            new QuanLy().setVisible(false);
            new QuanLy().setVisible(true);
            clear();
        } catch (Exception e) {
            MsgBox.alert(this, e.toString());
        }
    }

    boolean checkError() {
        if (txtSoTien.getText().matches(".*[a-zA-Z].*")) {
            MsgBox.alert(this, "Vui lòng điền số!");
            return false;
        } else if (txtSoTien.getText().equals("")) {
            MsgBox.alert(this, "Số tiền không được để trống!");
            return false;
        } else if (Double.valueOf(txtSoTien.getText()) < 0) {
            MsgBox.alert(this, "Không nhập số âm!");
            return false;
        }
        return true;
    }

}
