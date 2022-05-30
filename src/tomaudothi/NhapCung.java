/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tomaudothi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thuan
 */
public class NhapCung extends javax.swing.JFrame {
    Graph G =  new Graph();
    private int n,m,u,v,i=1;
    ToMau tomau = new ToMau();
    String ketquaThamLam = new String();
    String ketquaWP = new String();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form NhapCung
     */
    public NhapCung() {
        initComponents();
        model = (DefaultTableModel) cungTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhapDinhLabel = new javax.swing.JLabel();
        soDinhTextField = new javax.swing.JTextField();
        soCanhTextField = new javax.swing.JTextField();
        soCanhLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cungTable = new javax.swing.JTable();
        thamLamLable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        thamLamArea = new javax.swing.JTextArea();
        wpLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        wpArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        maTranArea = new javax.swing.JTextArea();
        toMauButton = new javax.swing.JButton();
        tieuDe2Label = new javax.swing.JLabel();
        dinh1Label = new javax.swing.JLabel();
        dinh1TextField = new javax.swing.JTextField();
        dinh2Label = new javax.swing.JLabel();
        dinh2TextField = new javax.swing.JTextField();
        nhapCungButton = new javax.swing.JButton();
        nhapDoThiButton = new javax.swing.JButton();
        tieuDeLabel = new javax.swing.JLabel();
        troLaiButton = new javax.swing.JButton();
        maTranLabel = new javax.swing.JLabel();
        xuatFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tô Màu Đồ Thị");

        nhapDinhLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nhapDinhLabel.setText("Nhập số đỉnh");

        soCanhLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        soCanhLabel.setText("Nhập số cung");

        cungTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cung", "Đỉnh", "Đỉnh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cungTable);

        thamLamLable.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        thamLamLable.setText("Kết quả thuật toán tham lam");

        thamLamArea.setColumns(20);
        thamLamArea.setRows(5);
        jScrollPane2.setViewportView(thamLamArea);

        wpLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        wpLabel.setText("Kết quả thuật toán Whelsh Powell");

        wpArea.setColumns(20);
        wpArea.setRows(5);
        jScrollPane4.setViewportView(wpArea);

        maTranArea.setColumns(20);
        maTranArea.setRows(5);
        jScrollPane1.setViewportView(maTranArea);

        toMauButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        toMauButton.setText("Tô màu");
        toMauButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        toMauButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMauButtonActionPerformed(evt);
            }
        });

        tieuDe2Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tieuDe2Label.setText("Nhập danh sách cung");

        dinh1Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dinh1Label.setText("Đỉnh đầu");

        dinh2Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dinh2Label.setText("Đỉnh cuối");

        nhapCungButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nhapCungButton.setText("Nhập cung");
        nhapCungButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        nhapCungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapCungButtonActionPerformed(evt);
            }
        });

        nhapDoThiButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nhapDoThiButton.setText("Tạo đồ thị");
        nhapDoThiButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        nhapDoThiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapDoThiButtonActionPerformed(evt);
            }
        });

        tieuDeLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        tieuDeLabel.setText("NHẬP ĐỒ THỊ BẰNG DANH SÁCH CUNG");

        troLaiButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        troLaiButton.setText("Trở lại");
        troLaiButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        troLaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troLaiButtonActionPerformed(evt);
            }
        });

        maTranLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        maTranLabel.setText("Ma trận của đồ thị vừa nhập");

        xuatFileButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        xuatFileButton.setText("Xuất File");
        xuatFileButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        xuatFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nhapDoThiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(soCanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(nhapDinhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(soDinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(soCanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(maTranLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(toMauButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(xuatFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tieuDe2Label)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(dinh2Label)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(dinh2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(dinh1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(dinh1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(nhapCungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(wpLabel))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(thamLamLable, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(troLaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tieuDeLabel)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tieuDeLabel)
                .addGap(1, 1, 1)
                .addComponent(troLaiButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soDinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapDinhLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soCanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soCanhLabel))
                        .addGap(18, 18, 18)
                        .addComponent(nhapDoThiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tieuDe2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dinh1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dinh1Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dinh2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dinh2Label)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nhapCungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toMauButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(xuatFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(thamLamLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maTranLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(wpLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toMauButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMauButtonActionPerformed
        try {
            ketquaThamLam=tomau.run(G, n);
            ketquaWP=tomau.run_wp(G, n);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NhapCung.class.getName()).log(Level.SEVERE, null, ex);
        }
        wpArea.setText(ketquaWP);
        thamLamArea.setText(ketquaThamLam);
    }//GEN-LAST:event_toMauButtonActionPerformed

    private void nhapCungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapCungButtonActionPerformed
        u = Integer.parseInt(dinh1TextField.getText());
        v = Integer.parseInt(dinh2TextField.getText());        
        if (u == v) {
            JOptionPane.showMessageDialog(this, "Hai đỉnh phải khác nhau", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else if (u*v <= 0 || u > G.getN() || v > G.getN()) {
            JOptionPane.showMessageDialog(this, "Hai đỉnh không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            if(i <= m){

            if(!G.check_Edge(G, u, v)){
                G.add_edge(G, u, v);
                maTranArea.setText(G.in(G));
                model.addRow(new Object[]{
                i++,u,v
                });     
            }
            else   
                JOptionPane.showMessageDialog(this, "Cung đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_nhapCungButtonActionPerformed

    private void nhapDoThiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapDoThiButtonActionPerformed
        n = Integer.parseInt(soDinhTextField.getText());
        m = Integer.parseInt(soCanhTextField.getText());
        if ( n*m <= 0) {
            JOptionPane.showMessageDialog(this, "Nhập số đỉnh và cung lớn hơn 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        G.init_graph(G, n);
        maTranArea.setText(G.in(G));

    }//GEN-LAST:event_nhapDoThiButtonActionPerformed

    private void troLaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troLaiButtonActionPerformed
        TrangChu tc = new TrangChu();
        tc.setVisible(true);
        tc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_troLaiButtonActionPerformed

    private void xuatFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatFileButtonActionPerformed
        String tenFile = JOptionPane.showInputDialog(this, "Nhập tên file", "Xuất file", JOptionPane.DEFAULT_OPTION);
        File file = new File(tenFile);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(NhapFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NhapFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        pw.println(G.getN() + " " + G.getM());
        pw.print(maTranArea.getText());
        pw.println("Thuat toan tham lam");
        pw.println(ketquaThamLam);
        pw.println("Thuat toan Whelsh Powell");
        pw.println(ketquaWP);
        pw.close();
        JOptionPane.showConfirmDialog(this, "Lưu file hành công", "Thành công", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_xuatFileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NhapCung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapCung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapCung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapCung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhapCung nc = new NhapCung();
                nc.setVisible(true);
                nc.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cungTable;
    private javax.swing.JLabel dinh1Label;
    private javax.swing.JTextField dinh1TextField;
    private javax.swing.JLabel dinh2Label;
    private javax.swing.JTextField dinh2TextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea maTranArea;
    private javax.swing.JLabel maTranLabel;
    private javax.swing.JButton nhapCungButton;
    private javax.swing.JLabel nhapDinhLabel;
    private javax.swing.JButton nhapDoThiButton;
    private javax.swing.JLabel soCanhLabel;
    private javax.swing.JTextField soCanhTextField;
    private javax.swing.JTextField soDinhTextField;
    private javax.swing.JTextArea thamLamArea;
    private javax.swing.JLabel thamLamLable;
    private javax.swing.JLabel tieuDe2Label;
    private javax.swing.JLabel tieuDeLabel;
    private javax.swing.JButton toMauButton;
    private javax.swing.JButton troLaiButton;
    private javax.swing.JTextArea wpArea;
    private javax.swing.JLabel wpLabel;
    private javax.swing.JButton xuatFileButton;
    // End of variables declaration//GEN-END:variables
}
