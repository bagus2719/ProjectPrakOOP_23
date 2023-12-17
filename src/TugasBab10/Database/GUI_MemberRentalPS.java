/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasBab10.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class GUI_MemberRentalPS extends javax.swing.JFrame {

    /**
     * Creates new form GUI_MemberRentalPS
     */
    public GUI_MemberRentalPS() {
        initComponents();
        koneksi();
        tampil();
        txtId.requestFocus();
    }

    public Connection conn;
    
    //masukkan method koneksi()
    public void koneksi(){
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_rentalps?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(Level.SEVERE, null, es);
        }
    }
    public void batal() {
        txtId.setText("");
        txtNama.setText("");
        txtTotal.setText("");
        cmbjenisMember.setSelectedIndex(0);
        txtAkhir.setText("");
    }
    
    String Id1, Nama1, Member1, Diskon1, Total1, BA1;
    
    //masukkan method itempilih()
    public void itempilih() {
        txtId.setText(Id1);
        txtNama.setText(Nama1);
        txtTotal.setText(Total1);
        if(Member1.equalsIgnoreCase("Non-Member")){
            cmbjenisMember.setSelectedItem(true);
        }else if(Member1.equalsIgnoreCase("Member Silver")){
            cmbjenisMember.setSelectedItem(true);
        }else if(Member1.equalsIgnoreCase("Member Gold")){
            cmbjenisMember.setSelectedItem(true);
        }else if(Member1.equalsIgnoreCase("Member Platinum")){
            cmbjenisMember.setSelectedItem(true);
        }
        txtAkhir.setText(BA1);
    }

    //masukkan method tampil()
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("Id_member");
        tabelhead.addColumn("Nama");
        tabelhead.addColumn("Jenis_member");
        tabelhead.addColumn("Biaya_awal");
        tabelhead.addColumn("Diskon");
        tabelhead.addColumn("Biaya_akhir");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_member";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6),});
            }
            table_data_member.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }
    //masukkan method delete()
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_member WHERE Id_member='" + txtId.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                batal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
        refresh();
    }

    //masukkan method cari()
    public void cari() {
        try {
            try ( Statement statement = conn.createStatement()) {
                String sql = "SELECT * FROM tb_member WHERE `Id_member`  LIKE '%" + txtCari.getText() + "%'";
                ResultSet rs = statement.executeQuery(sql); //menampilkan data dari sql query
                if (rs.next()) // .next() = scanner method
                {
                    txtId.setText(rs.getString(1));
                    txtNama.setText(rs.getString(2));
                    String jnsMmbr = rs.getString(3);
                    String diskon = rs.getString(5);
                    if(jnsMmbr.equalsIgnoreCase("PS2")){
                        cmbjenisMember.setSelectedItem(true);
                    }else if(jnsMmbr.equalsIgnoreCase("PS3")){
                        cmbjenisMember.setSelectedItem(true);
                    }else if(jnsMmbr.equalsIgnoreCase("PS4")){
                        cmbjenisMember.setSelectedItem(true);
                    }else if(jnsMmbr.equalsIgnoreCase("PS5")){
                        cmbjenisMember.setSelectedItem(true);
                    }
                    txtTotal.setText(rs.getString(4));
                    txtAkhir.setText(rs.getString(6));
                } else {
                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error." + ex);
        }
    }

    public double TotalBiaya() {
        double awal, diskon, potongan, hasil;
        awal = Integer.parseInt(txtTotal.getText());
        diskon = 0.0;
        if(cmbjenisMember.getSelectedIndex() == 0){
            diskon = 0.0;
        }else if(cmbjenisMember.getSelectedIndex() == 1){
            diskon = 0.10;
        }else if(cmbjenisMember.getSelectedIndex() == 2){
            diskon = 0.15;
        }else if(cmbjenisMember.getSelectedIndex() == 3){
            diskon = 0.25;
        }
        potongan = awal * diskon;
        hasil = awal - potongan;
        txtAkhir.setText(Double.toString(hasil));
        return hasil;
    }
    
    //masukkan method update()
    public void update() {
        String Id = txtId.getText();
        String Nama = txtNama.getText();
        String jnsMmbr = "";
        String Diskon = "";
        if(cmbjenisMember.getSelectedIndex() == 0){
            jnsMmbr = "Non-Member";
            Diskon = "Tidak mendapat diskon";
        }else if(cmbjenisMember.getSelectedIndex() == 1){
            jnsMmbr = "Member Silver";
            Diskon = "10%";
        }else if(cmbjenisMember.getSelectedIndex() == 2){
            jnsMmbr = "Member Gold";
            Diskon = "15%";
        }else if(cmbjenisMember.getSelectedIndex() == 3){
            jnsMmbr = "Member Platinum";
            Diskon = "25%";
        }
        String awal = txtTotal.getText();
        String akhir = txtAkhir.getText();
        String Id_lama = Id1;
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_member SET Id_member='" + Id + "'," + "Nama='" + Nama + "',"
                    + "Jenis_member='" + jnsMmbr + "'" + ",Biaya_awal='" + awal + ",Diskon='" + Diskon + "',Biaya_akhir='" + akhir
                    + "' WHERE Id_member = '" + Id_lama + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Member Rental PS Berhasil!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }

    //masukkan method refresh()
    public void refresh() {
        new GUI_MemberRentalPS().setVisible(true);
        this.setVisible(false);
    }
    //masukkan method insert()
    public void insert() {
        String Id = txtId.getText();
        String Nama = txtNama.getText();
        String jnsMmbr = "";
        String Diskon = "";
        if(cmbjenisMember.getSelectedIndex() == 0){
            jnsMmbr = "Non-Member";
            Diskon = "Tidak mendapat diskon";
        }else if(cmbjenisMember.getSelectedIndex() == 1){
            jnsMmbr = "Member Silver";
            Diskon = "10%";
        }else if(cmbjenisMember.getSelectedIndex() == 2){
            jnsMmbr = "Member Gold";
            Diskon = "15%";
        }else if(cmbjenisMember.getSelectedIndex() == 3){
            jnsMmbr = "Member Platinum";
            Diskon = "25%";
        }
        String awal = txtTotal.getText();
        String akhir = txtAkhir.getText();
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_member VALUES('" + Id + "','" + Nama + "','" + jnsMmbr + "','" + awal + "','" + Diskon + "','" + akhir + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Member Rental PS!" + "\n" + akhir);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
        }
        refresh();
    }
    public void Close(){
        // Untuk menampilkan popup keluar dari program atau tidak
        String tanya = "Apakah Anda Yakin Ingin Keluar?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)
            == JOptionPane.YES_OPTION;
        if (yakin) {
            System.exit(0);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbjenisMember = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_member = new javax.swing.JTable();
        btnProses = new javax.swing.JButton();
        txtAkhir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("STLiti", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Member Rental PlayStation");
        jLabel1.setToolTipText("");

        jLabel2.setText("ID Member");

        jLabel3.setText("Nama Member");

        jLabel5.setText("Jenis Member");

        cmbjenisMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-Member", "Member Silver", "Member Gold", "Member Platinum" }));
        cmbjenisMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjenisMemberActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel6.setText("Biaya Awal");

        table_data_member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Member", "Nama", "Jenis Member", "Biaya Awal", "Diskon", "Biaya Akhir"
            }
        ));
        table_data_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_memberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_data_member);

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        jLabel4.setText("Biaya Akhir");

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnForm.setText("Form Rental PS");
        btnForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(cmbjenisMember, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapus)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnClose)
                                    .addGap(65, 65, 65)
                                    .addComponent(btnForm))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbjenisMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnProses)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnUpdate)
                            .addComponent(btnBatal)
                            .addComponent(btnHapus)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose)
                    .addComponent(btnForm))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbjenisMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjenisMemberActionPerformed
    }//GEN-LAST:event_cmbjenisMemberActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        TotalBiaya();
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        Close();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormActionPerformed
        new GUI_RentalPS().setVisible(true);
    }//GEN-LAST:event_btnFormActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_data_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_memberMouseClicked
        // TODO add your handling code here:
        int tabel = table_data_member.getSelectedRow();
        Id1 = table_data_member.getValueAt(tabel, 0).toString();
        Nama1 = table_data_member.getValueAt(tabel, 1).toString();
        Member1 = table_data_member.getValueAt(tabel, 2).toString();
        Total1 = table_data_member.getValueAt(tabel, 3).toString();
        Diskon1 = table_data_member.getValueAt(tabel, 4).toString();
        BA1 = table_data_member.getValueAt(tabel, 5).toString();
        itempilih();
    }//GEN-LAST:event_table_data_memberMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_MemberRentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_MemberRentalPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnForm;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbjenisMember;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_data_member;
    private javax.swing.JTextField txtAkhir;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
