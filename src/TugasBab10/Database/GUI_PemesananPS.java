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
public class GUI_PemesananPS extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PemesananPS
     */
    public GUI_PemesananPS() {
        initComponents();
        tampil();
        koneksi();
        txtKodeSewa.requestFocus();
    }

    public Connection conn;
    public void koneksi(){
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_rentalps?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_PemesananPS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_PemesananPS.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_PemesananPS.class.getName()).log(Level.SEVERE, null, es);
        }
    }
    public void batal() {
        txtKodeSewa.setText("");
        txtNama.setText("");
        txtStok.setText("");
        txtWaktu.setText("");
        btngrpOrder.clearSelection();
        cmbStatus.setSelectedIndex(0);
        txtTotal.setText("");
    }

    //masukkan conection (public Connection conn;)
    
    String Kode1, Nama1, jenisps1, Stok1, Waktu1, Status1, Harga1, Total1;
    
    //masukkan method itempilih()
    public void itempilih() {
        txtKodeSewa.setText(Kode1);
        txtNama.setText(Nama1);
        if(jenisps1.equalsIgnoreCase("PS2")){
            rdbtnPS2.setSelected(true);
        }else if(jenisps1.equalsIgnoreCase("PS3")){
            rdbtnPS2.setSelected(true);
        }else if(jenisps1.equalsIgnoreCase("PS4")){
            rdbtnPS2.setSelected(true);
        }else if(jenisps1.equalsIgnoreCase("PS5")){
            rdbtnPS2.setSelected(true);
        }
        txtStok.setText(Stok1);
        txtWaktu.setText(Waktu1);
        if(Status1.equalsIgnoreCase("Sudah Bayar")) {
            cmbStatus.setSelectedItem(true);
        } else {
            cmbStatus.setSelectedItem(true);
        }
        txtTotal.setText(Total1);
    }

    //masukkan method koneksi()
    
    //masukkan method tampil()
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("Kode_sewa");
        tabelhead.addColumn("Nama");
        tabelhead.addColumn("Jenis_ps");
        tabelhead.addColumn("Stok");
        tabelhead.addColumn("Harga");
        tabelhead.addColumn("Waktu");
        tabelhead.addColumn("Status_pembayaran");
        tabelhead.addColumn("Total_harga");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_pemesananps";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6),res.getString(7),res.getString(8),});
            }
            table_data_pemesanan.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }
    //masukkan method delete()
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_pemesananps WHERE Kode_sewa='" + txtKodeSewa.getText() + "'";
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
                String sql = "SELECT * FROM tb_pemesananps WHERE `Kode_sewa`  LIKE '%" + txtCari.getText() + "%'";
                ResultSet rs = statement.executeQuery(sql); //menampilkan data dari sql query
                if (rs.next()) // .next() = scanner method
                {
                    txtKodeSewa.setText(rs.getString(1));
                    txtNama.setText(rs.getString(2));
                    String jnsPS = rs.getString(3);
                    String harga = rs.getString(6);
                    if(jnsPS.equalsIgnoreCase("PS2")){
                        rdbtnPS2.setSelected(true);
                    }else if(jnsPS.equalsIgnoreCase("PS3")){
                        rdbtnPS2.setSelected(true);
                    }else if(jnsPS.equalsIgnoreCase("PS4")){
                        rdbtnPS2.setSelected(true);
                    }else if(jnsPS.equalsIgnoreCase("PS5")){
                        rdbtnPS2.setSelected(true);
                    }
                    txtStok.setText(rs.getString(4));
                    txtWaktu.setText(rs.getString(5));
                    String stts = rs.getString(7);
                    if(stts.equalsIgnoreCase("Sudah Bayar")) {
                        cmbStatus.setSelectedItem(true);
                    } else {
                        cmbStatus.setSelectedItem(true);
                    }
                    txtTotal.setText(rs.getString(8));
                } else {
                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error." + ex);
        }
    }

    public double TotalBiaya() {
        double waktu, harga, hasil;
        harga = 0;
        waktu = Integer.parseInt(txtWaktu.getText());
        if(rdbtnPS2.isSelected()){
            harga = 2000;
        }else if(rdbtnPS3.isSelected()){
            harga = 5000;
        }else if(rdbtnPS4.isSelected()){
            harga = 7000;
        }else if(rdbtnPS5.isSelected()){
            harga = 10000;
        }
        hasil = waktu * harga;
        txtTotal.setText(Double.toString(hasil));
        return hasil;
    }
    
    //masukkan method update()
    public void update() {
        String Kodesw = txtKodeSewa.getText();
        String Nama = txtNama.getText();
        String jnsPS = "";
        String Harga = "";
        if (rdbtnPS2.isSelected()) {
            jnsPS = "PS2";
            Harga = "2000";
        }else if(rdbtnPS3.isSelected()){
            jnsPS = "PS3";
            Harga = "5000";
        }else if(rdbtnPS4.isSelected()){
            jnsPS = "PS4";
            Harga = "7000";
        }else if(rdbtnPS5.isSelected()){
            jnsPS = "PS5";
            Harga = "10000";
        }
        String Stok = txtStok.getText();
        String Waktu = txtWaktu.getText();
        String Total = txtTotal.getText();
        String status;
        if(cmbStatus.getSelectedIndex() == 0){
            status = "Sudah Bayar";
        }else{
            status = "Belum Bayar";
        }
        String Kode_lama = Kode1;
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_pemesananps SET Kode_sewa='" + Kodesw + "'," + "Nama='" + Nama + "',"
                    + "Jenis_ps='" + jnsPS + "'" + ",Stok='" + Stok + ",Harga='" + Harga + "',Waktu='" + Waktu + "',Status_pembayaran='"
                    + status + ",Total_harga='" + Total + "' WHERE Kode_sewa = '" + Kode_lama + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Mahasiswa Berhasil!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }

    //masukkan method refresh()
    public void refresh() {
        new GUI_PemesananPS().setVisible(true);
        this.setVisible(false);
    }
    //masukkan method insert()
    public void insert() {
        String Kodesw = txtKodeSewa.getText();
        String Nama = txtNama.getText();
        String jnsPS = "";
        String Harga = "";
        if (rdbtnPS2.isSelected()) {
            jnsPS = "PS2";
            Harga = "2000";
        }else if(rdbtnPS3.isSelected()){
            jnsPS = "PS3";
            Harga = "5000";
        }else if(rdbtnPS4.isSelected()){
            jnsPS = "PS4";
            Harga = "7000";
        }else if(rdbtnPS5.isSelected()){
            jnsPS = "PS5";
            Harga = "10000";
        }
        String Stok = txtStok.getText();
        String Waktu = txtWaktu.getText();
        String Total = txtTotal.getText();
        String status;
        if(cmbStatus.getSelectedIndex() == 0){
            status = "Sudah Bayar";
        }else{
            status = "Belum Bayar";
        }
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_pemesananps VALUES('" + Kodesw + "','" + Nama + "','" + jnsPS + "','" + Stok + "','" + Harga + "','" + Waktu + "','" + status + "','" + Total + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Pemesanan!" + "\n" + Total);
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

        btngrpOrder = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtKodeSewa = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rdbtnPS2 = new javax.swing.JRadioButton();
        rdbtnPS3 = new javax.swing.JRadioButton();
        rdbtnPS4 = new javax.swing.JRadioButton();
        rdbtnPS5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_pemesanan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtWaktu = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnForm = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("STLiti", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemesanan PlayStation");

        jLabel2.setText("Nama Penyewa");

        jLabel3.setText("Jenis PS");

        jLabel4.setText("Kode Sewa");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sudah Bayar", "Belum Bayar" }));

        jLabel5.setText("Stok");

        btngrpOrder.add(rdbtnPS2);
        rdbtnPS2.setText("PS2");

        btngrpOrder.add(rdbtnPS3);
        rdbtnPS3.setText("PS3");

        btngrpOrder.add(rdbtnPS4);
        rdbtnPS4.setText("PS4");

        btngrpOrder.add(rdbtnPS5);
        rdbtnPS5.setText("PS5");

        jLabel6.setText("Status Pembayaran");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        table_data_pemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Sewa", "Nama", "Jenis PS", "Stok", "Harga/Jam", "Waktu Sewa", "Status Pembayaran", "Total Harga"
            }
        ));
        table_data_pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_pemesananMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_data_pemesanan);

        jLabel7.setText("Waktu Sewa");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnForm.setText("Form Rental PS");
        btnForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(88, 88, 88))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6))
                                            .addGap(38, 38, 38)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbtnPS3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                        .addComponent(rdbtnPS5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbtnPS2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdbtnPS4))
                                    .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtWaktu)
                                    .addComponent(txtStok)
                                    .addComponent(txtNama)
                                    .addComponent(txtKodeSewa)
                                    .addComponent(txtTotal))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnUpdate)
                                .addGap(44, 44, 44)
                                .addComponent(btnClose)
                                .addGap(83, 83, 83)
                                .addComponent(btnForm)
                                .addGap(100, 100, 100))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCari))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdbtnPS4)
                                    .addComponent(rdbtnPS2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdbtnPS3)
                                    .addComponent(rdbtnPS5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKodeSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus)
                            .addComponent(btnSimpan)
                            .addComponent(btnForm)
                            .addComponent(btnClose)
                            .addComponent(btnUpdate)
                            .addComponent(btnBatal))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        insert();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_txtCariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TotalBiaya();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Close();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormActionPerformed
        // TODO add your handling code here:
        new GUI_RentalPS().setVisible(true);
    }//GEN-LAST:event_btnFormActionPerformed

    private void table_data_pemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_pemesananMouseClicked
        // TODO add your handling code here:
        int tabel = table_data_pemesanan.getSelectedRow();
        Kode1 = table_data_pemesanan.getValueAt(tabel, 0).toString();
        Nama1 = table_data_pemesanan.getValueAt(tabel, 1).toString();
        jenisps1 = table_data_pemesanan.getValueAt(tabel, 2).toString();
        Stok1 = table_data_pemesanan.getValueAt(tabel, 3).toString();
        Harga1 = table_data_pemesanan.getValueAt(tabel, 4).toString();
        Waktu1 = table_data_pemesanan.getValueAt(tabel, 5).toString();
        Status1 = table_data_pemesanan.getValueAt(tabel, 6).toString();
        Total1 = table_data_pemesanan.getValueAt(tabel, 7).toString();
        itempilih();
    }//GEN-LAST:event_table_data_pemesananMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_PemesananPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PemesananPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PemesananPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PemesananPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUI_PemesananPS().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnForm;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup btngrpOrder;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbtnPS2;
    private javax.swing.JRadioButton rdbtnPS3;
    private javax.swing.JRadioButton rdbtnPS4;
    private javax.swing.JRadioButton rdbtnPS5;
    private javax.swing.JTable table_data_pemesanan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKodeSewa;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
