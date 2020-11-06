/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import javafx.scene.control.ProgressBar;
import util.setColorSystem;

/**
 *
 * @author trantrung
 */
public class QuanLy extends javax.swing.JFrame {

    /**
     * Creates new form QuanLy
     */
    public QuanLy() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        pnlBg.setBackground(new Color(0, 0, 0, 0));
        cardLayout = (CardLayout) pnlTabs.getLayout();
        mouseHover();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        pnlleft = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlKeHoach = new javax.swing.JPanel();
        lblLogoQL = new javax.swing.JLabel();
        lblQuanLy = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        lblLogoQL1 = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        pnlLichSu = new javax.swing.JPanel();
        lblLogoLS = new javax.swing.JLabel();
        lblLichSu = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        pnlTabs = new javax.swing.JPanel();
        pnlTab1 = new javax.swing.JPanel();
        pnltop = new javax.swing.JPanel();
        lblTenMT = new javax.swing.JLabel();
        lblTenMT1 = new javax.swing.JLabel();
        lblTenMT2 = new javax.swing.JLabel();
        txtTenMTK = new javax.swing.JTextField();
        txtGiaTri = new javax.swing.JTextField();
        cboThoiGianTK = new javax.swing.JComboBox<>();
        pnlButton = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTietKiem = new javax.swing.JButton();
        pnlbottom = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        pnlTab2 = new javax.swing.JPanel();
        lblMucTietKiem = new javax.swing.JLabel();
        cboMucTietKiem = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        pgbTienDo = new javax.swing.JProgressBar();
        lblTienDaTK = new javax.swing.JLabel();
        txtTienDaTK = new javax.swing.JTextField();
        lblThoiGianCon = new javax.swing.JLabel();
        txtThoiGian = new javax.swing.JTextField();
        pnlTab3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLichSu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlBg.setPreferredSize(new java.awt.Dimension(700, 474));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlleft.setBackground(new java.awt.Color(73, 84, 100));
        pnlleft.setPreferredSize(new java.awt.Dimension(150, 100));
        pnlleft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setText("Logo");
        pnlleft.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        pnlKeHoach.setBackground(new java.awt.Color(73, 84, 100));
        pnlKeHoach.setPreferredSize(new java.awt.Dimension(150, 40));
        pnlKeHoach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKeHoachMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlKeHoachMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlKeHoachMouseEntered(evt);
            }
        });
        pnlKeHoach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoQL.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-a_home.png"))); // NOI18N
        pnlKeHoach.add(lblLogoQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 40));

        lblQuanLy.setBackground(new java.awt.Color(204, 204, 204));
        lblQuanLy.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLy.setText("Quản Lý");
        pnlKeHoach.add(lblQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        pnlleft.add(pnlKeHoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, 40));

        pnlThongKe.setBackground(new java.awt.Color(73, 84, 100));
        pnlThongKe.setPreferredSize(new java.awt.Dimension(150, 40));
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseEntered(evt);
            }
        });
        pnlThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoQL1.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoQL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-delivery_settings.png"))); // NOI18N
        pnlThongKe.add(lblLogoQL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        lblThongKe.setBackground(new java.awt.Color(204, 204, 204));
        lblThongKe.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setText("Thống kê");
        pnlThongKe.add(lblThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        pnlleft.add(pnlThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 150, 40));

        pnlLichSu.setBackground(new java.awt.Color(73, 84, 100));
        pnlLichSu.setPreferredSize(new java.awt.Dimension(150, 40));
        pnlLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLichSuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLichSuMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLichSuMouseEntered(evt);
            }
        });
        pnlLichSu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoLS.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-activity_history.png"))); // NOI18N
        pnlLichSu.add(lblLogoLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        lblLichSu.setBackground(new java.awt.Color(204, 204, 204));
        lblLichSu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblLichSu.setForeground(new java.awt.Color(255, 255, 255));
        lblLichSu.setText("Lịch sử");
        pnlLichSu.add(lblLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, -1));

        pnlleft.add(pnlLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 40));

        btnExit.setText("Thoát");
        pnlleft.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        pnlBg.add(pnlleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        pnlTabs.setLayout(new java.awt.CardLayout());

        pnltop.setBackground(new java.awt.Color(187, 191, 202));
        pnltop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenMT.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTenMT.setForeground(new java.awt.Color(51, 51, 51));
        lblTenMT.setText("Thời gian tiết kiệm:");
        pnltop.add(lblTenMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lblTenMT1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTenMT1.setForeground(new java.awt.Color(51, 51, 51));
        lblTenMT1.setText("Tên mục tiết kiệm:");
        pnltop.add(lblTenMT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTenMT2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTenMT2.setForeground(new java.awt.Color(51, 51, 51));
        lblTenMT2.setText("Giá trị:");
        pnltop.add(lblTenMT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtTenMTK.setPreferredSize(new java.awt.Dimension(140, 24));
        pnltop.add(txtTenMTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        txtGiaTri.setPreferredSize(new java.awt.Dimension(140, 24));
        pnltop.add(txtGiaTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 140, 30));

        cboThoiGianTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 tháng", "3 tháng", "6 tháng", "12 tháng" }));
        pnltop.add(cboThoiGianTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 140, 30));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(lblExit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlButton.add(jPanel1);

        btnThem.setText("Thêm mới");
        pnlButton.add(btnThem);

        btnSua.setText("Chỉnh sửa");
        pnlButton.add(btnSua);

        btnXoa.setText("Xoá MTK");
        pnlButton.add(btnXoa);

        btnTietKiem.setText("Tiết Kiệm");
        pnlButton.add(btnTietKiem);

        pnltop.add(pnlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 160, 190));

        pnlbottom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDanhSach);

        pnlbottom.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 280));

        javax.swing.GroupLayout pnlTab1Layout = new javax.swing.GroupLayout(pnlTab1);
        pnlTab1.setLayout(pnlTab1Layout);
        pnlTab1Layout.setHorizontalGroup(
            pnlTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(pnlTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTab1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnltop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlbottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlTab1Layout.setVerticalGroup(
            pnlTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(pnlTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTab1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnltop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnlbottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlTabs.add(pnlTab1, "card1");

        lblMucTietKiem.setText("Mục tiết kiệm:");

        cboMucTietKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTienDaTK.setText("Số tiền đã tiết kiệm được:");

        lblThoiGianCon.setText("Thời gian còn lại:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(pgbTienDo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThoiGian)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblThoiGianCon)
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTienDaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTienDaTK))))
                .addGap(224, 224, 224))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgbTienDo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTienDaTK)
                        .addGap(18, 18, 18)
                        .addComponent(txtTienDaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblThoiGianCon)
                        .addGap(18, 18, 18)
                        .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTab2Layout = new javax.swing.GroupLayout(pnlTab2);
        pnlTab2.setLayout(pnlTab2Layout);
        pnlTab2Layout.setHorizontalGroup(
            pnlTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTab2Layout.createSequentialGroup()
                .addGroup(pnlTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTab2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblMucTietKiem)
                        .addGap(18, 18, 18)
                        .addComponent(cboMucTietKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTab2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        pnlTab2Layout.setVerticalGroup(
            pnlTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTab2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMucTietKiem)
                    .addComponent(cboMucTietKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTabs.add(pnlTab2, "card2");

        btnTimKiem.setText("Tìm Kiếm");

        tblLichSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblLichSu);

        javax.swing.GroupLayout pnlTab3Layout = new javax.swing.GroupLayout(pnlTab3);
        pnlTab3.setLayout(pnlTab3Layout);
        pnlTab3Layout.setHorizontalGroup(
            pnlTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(pnlTab3Layout.createSequentialGroup()
                        .addComponent(txtTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem)))
                .addContainerGap())
        );
        pnlTab3Layout.setVerticalGroup(
            pnlTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTabs.add(pnlTab3, "card3");

        pnlBg.add(pnlTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 550, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlKeHoachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKeHoachMouseEntered
        setColorSystem cl = new setColorSystem();
        cl.setColor(pnlKeHoach);
    }//GEN-LAST:event_pnlKeHoachMouseEntered

    private void pnlKeHoachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKeHoachMouseExited
        setColorSystem cl = new setColorSystem();
        cl.resetColor(pnlKeHoach);
    }//GEN-LAST:event_pnlKeHoachMouseExited

    private void pnlKeHoachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKeHoachMouseClicked
        cardLayout.show(pnlTabs, "card1");
    }//GEN-LAST:event_pnlKeHoachMouseClicked

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

    private void pnlThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseEntered
          setColorSystem cl = new setColorSystem();
        cl.setColor(pnlThongKe);
    }//GEN-LAST:event_pnlThongKeMouseEntered

    private void pnlThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseExited
          setColorSystem cl = new setColorSystem();
        cl.resetColor(pnlThongKe);
    }//GEN-LAST:event_pnlThongKeMouseExited

    private void pnlThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseClicked
         cardLayout.show(pnlTabs, "card2");
    }//GEN-LAST:event_pnlThongKeMouseClicked

    private void pnlLichSuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLichSuMouseEntered
          setColorSystem cl = new setColorSystem();
        cl.setColor(pnlLichSu);
    }//GEN-LAST:event_pnlLichSuMouseEntered

    private void pnlLichSuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLichSuMouseExited
         setColorSystem cl = new setColorSystem();
        cl.resetColor(pnlLichSu);
    }//GEN-LAST:event_pnlLichSuMouseExited

    private void pnlLichSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLichSuMouseClicked
         cardLayout.show(pnlTabs, "card3");
    }//GEN-LAST:event_pnlLichSuMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTietKiem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMucTietKiem;
    private javax.swing.JComboBox<String> cboThoiGianTK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLichSu;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoLS;
    private javax.swing.JLabel lblLogoQL;
    private javax.swing.JLabel lblLogoQL1;
    private javax.swing.JLabel lblMucTietKiem;
    private javax.swing.JLabel lblQuanLy;
    private javax.swing.JLabel lblTenMT;
    private javax.swing.JLabel lblTenMT1;
    private javax.swing.JLabel lblTenMT2;
    private javax.swing.JLabel lblThoiGianCon;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTienDaTK;
    private javax.swing.JProgressBar pgbTienDo;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlKeHoach;
    private javax.swing.JPanel pnlLichSu;
    private javax.swing.JPanel pnlTab1;
    private javax.swing.JPanel pnlTab2;
    private javax.swing.JPanel pnlTab3;
    private javax.swing.JPanel pnlTabs;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlbottom;
    private javax.swing.JPanel pnlleft;
    private javax.swing.JPanel pnltop;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTable tblLichSu;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtTenMTK;
    private javax.swing.JTextField txtThoiGian;
    private javax.swing.JTextField txtTienDaTK;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    
    CardLayout cardLayout;
    public void mouseHover() {
        pnlKeHoach.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnlThongKe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pnlLichSu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}