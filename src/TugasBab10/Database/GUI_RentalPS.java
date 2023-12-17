package TugasBab10.Database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class GUI_RentalPS extends javax.swing.JFrame {

    
    /**
     * Creates new form GUI_RentalPS
     */
    public GUI_RentalPS() {
        initComponents();
        koneksi();
        tampil();
        tampil_pemesanan();
        tampil_member();
        cmbKodeSewa.requestFocus();
    }

    
    String kodesw1, idmmbr1, jenisps1, nama1, tgl1, waktu1, harga1, total1;
    public Connection conn;
    
    //masukkan method koneksi()
    public void koneksi(){
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_rentalps?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_RentalPS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_RentalPS.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_RentalPS.class.getName()).log(Level.SEVERE, null, es);
        }
    }

    //masukkan method tampil()
    public void tampil() {
            DefaultTableModel tabelhead = new DefaultTableModel();
            tabelhead.addColumn("Kode_sewa");
            tabelhead.addColumn("ID_Member");
            tabelhead.addColumn("Jenis_ps");
            tabelhead.addColumn("Nama");
            tabelhead.addColumn("Tanggal");
            tabelhead.addColumn("Waktu_sewa");
            tabelhead.addColumn("Harga");
            tabelhead.addColumn("Total_Biaya");
            try {
                koneksi();
                String sql = "SELECT * FROM tb_rentalps";
                Statement stat = conn.createStatement();
                ResultSet res = stat.executeQuery(sql);
                while (res.next()) {
                    tabelhead.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8),});
                }
                table_data_rentalPS.setModel(tabelhead);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
            }
        }

    //masukka method tampil_mhs() dibawah sini
    public void tampil_pemesanan() {
            try {
                koneksi();
                String sql = "SELECT Kode_sewa FROM tb_pemesananps order by Kode_sewa asc";
                Statement stt = conn.createStatement();
                ResultSet res = stt.executeQuery(sql);
                while (res.next()) {
                    Object[] ob = new Object[3];
                    ob[0] = res.getString(1);
                    cmbKodeSewa.addItem((String) ob[0]);
                }
                res.close();
                stt.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }

    //masukkan method tampil_mk()
    public void tampil_member() {
        try {
            koneksi();
            String sql = "SELECT Id_member FROM tb_member order by Id_member asc";
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[3];
                ob[0] = res.getString(1);
                cmbMember.addItem((String) ob[0]);
            }
            res.close();
            stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //masukkan method refresh()
    public void refresh() {
        new GUI_RentalPS().setVisible(true);
        this.setVisible(false);
    }

    //masukkan method insert()
    public void insert() {
        String kodesw = cmbKodeSewa.getSelectedItem().toString();
        String idMember = cmbMember.getSelectedItem().toString();
        String jenisPS = "";
        String harga = "";
        if(rdbtnps2.isSelected()){
            jenisPS = "PS2";
            harga = "2000";
        }else if(rdbtnps3.isSelected()){
            jenisPS = "PS3";
            harga = "5000";
        }else if(rdbtnps4.isSelected()){
            jenisPS = "PS4";
            harga = "7000";
        }else if(rdbtnps5.isSelected()){
            jenisPS = "PS5";
            harga = "10000";
        }
        String nama = txtNama.getText();
        String tanggal = txtTgl.getText();
        String waktu  = txtWaktu.getText();
        String total = txtTotal.getText();
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_rentalps (Kode_sewa, Id_Member,Jenis_ps, Nama, Tanggal,Waktu_sewa,Harga,Total_Biaya)"
                    + "VALUES('" + kodesw + "','" + idMember + "','" + jenisPS + "','" + nama + "','" + tanggal + "','" + waktu +"','" + harga +"','" + total + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Rental PS!!" + "\n" + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
        }
        refresh();
    }   

    //masukkan method update()  
    public void update() {
        String KodeSewa = cmbKodeSewa.getSelectedItem().toString();
        String IdMember = cmbMember.getSelectedItem().toString();
        String Nama = txtNama.getText();
        String Tanggal = txtTgl.getText();
        String Waktu = txtWaktu.getText();
        String Total = txtTotal.getText();
        String jenisPS = "";
        String harga = "";
        if(rdbtnps2.isSelected()){
            jenisPS = "PS2";
            harga = "2000";
        }else if(rdbtnps3.isSelected()){
            jenisPS = "PS3";
            harga = "5000";
        }else if(rdbtnps4.isSelected()){
            jenisPS = "PS4";
            harga = "7000";
        }else if(rdbtnps5.isSelected()){
            jenisPS = "PS5";
            harga = "10000";
        }
        String kodesw_lama = kodesw1;
        String idmmbr_lama = idmmbr1;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_rentalps SET Kode_sewa='" + KodeSewa + "'," + "Id_Member='" + IdMember + "'"
                    + "',Jenis_ps='" + jenisPS + ",Nama='" + Nama + "',Tanggal='" + Tanggal + "',Waktu_sewa='" + Waktu + "',Harga='" + harga + "',Total_Biaya='" + Total + "' WHERE Kode_sewa ='" + kodesw_lama + "' AND Id_Member='" + idmmbr_lama + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Rental PS!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }

    //masukkan method NilaiAkhir()
    public double TotalBiaya() {
        double waktu, harga, hasil;
        harga = 0;
        waktu = Integer.parseInt(txtWaktu.getText());
        if(rdbtnps2.isSelected()){
            harga = 2000;
        }else if(rdbtnps3.isSelected()){
            harga = 5000;
        }else if(rdbtnps4.isSelected()){
            harga = 7000;
        }else if(rdbtnps5.isSelected()){
            harga = 10000;
        }
        hasil = waktu * harga;
        txtTotal.setText(Double.toString(hasil));
        return hasil;
    }

    //masukkan method itempilih()
    void itempilih() {
        cmbKodeSewa.setSelectedItem(kodesw1);
        cmbMember.setSelectedItem(kodesw1);
        if(jenisps1.equalsIgnoreCase("PS2")){
            rdbtnps2.setSelected(true);
        }else if(jenisps1.equalsIgnoreCase("PS3")){
            rdbtnps3.setSelected(true);
        }else if(jenisps1.equalsIgnoreCase("PS4")){
            rdbtnps4.setSelected(true);
        }else if(jenisps1.equalsIgnoreCase("PS5")){
            rdbtnps5.setSelected(true);
        }
        txtNama.setText(nama1);
        txtTgl.setText(tgl1);
        txtWaktu.setText(waktu1);
        txtTotal.setText(total1);
    }

    //masukkan method batal() 
    public void batal(){
        txtNama.setText("");
        txtTgl.setText("");
        txtWaktu.setText("");
        txtTotal.setText("");
        btnGroupPS.clearSelection();
    }

    //masukkan method delete()
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_rentalps WHERE Kode_sewa='" + cmbKodeSewa.getSelectedItem() + "' AND Id_Member='" + cmbMember.getSelectedItem() + "'";
                PreparedStatement stmt = conn.prepareStatement(sql);
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
                String sql = "SELECT * FROM tb_rentalps WHERE `Kode_sewa` LIKE '%" + txtCari.getText() + "%'";
                ResultSet rs = statement.executeQuery(sql);
                //menampilkan data dari sql query
                if (rs.next()) // .next() = scanner method
                {
                    cmbKodeSewa.setSelectedItem(rs.getString(1));
                    cmbMember.setSelectedItem(rs.getString(2));
                    String jenisps = rs.getString(3);
                    String harga = rs.getString(7);
                    if(jenisps.equalsIgnoreCase("PS2")){
                        rdbtnps2.setSelected(true);
                    }else if(jenisps.equalsIgnoreCase("PS3")){
                        rdbtnps3.setSelected(true);
                    }else if(jenisps.equalsIgnoreCase("PS4")){
                        rdbtnps4.setSelected(true);
                    }else if(jenisps.equalsIgnoreCase("PS5")){
                        rdbtnps5.setSelected(true);
                    }
                    txtNama.setText(rs.getString(4));
                    txtTgl.setText(rs.getString(5));
                    txtWaktu.setText(rs.getString(6));
                    txtTotal.setText(rs.getString(8));

                } else {
                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error." + ex);
        }
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

        btnGroupPS = new javax.swing.ButtonGroup();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTgl = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        txtWaktu = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_rentalPS = new javax.swing.JTable();
        btnKdsewa = new javax.swing.JButton();
        cmbKodeSewa = new javax.swing.JComboBox<>();
        btnIdMmbr = new javax.swing.JButton();
        cmbMember = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rdbtnps2 = new javax.swing.JRadioButton();
        rdbtnps3 = new javax.swing.JRadioButton();
        rdbtnps4 = new javax.swing.JRadioButton();
        rdbtnps5 = new javax.swing.JRadioButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RENTAL PlayStation");

        jLabel5.setText("Tanggal Sewa");

        jLabel6.setText("Waktu Sewa(Jam)");

        txtTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        table_data_rentalPS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Sewa", "Id Member", "Jenis PS", "Nama Penyewa", "Tanggal", "Waktu Sewa", "Harga", "Total Biaya"
            }
        ));
        table_data_rentalPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_rentalPSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_data_rentalPS);

        btnKdsewa.setText("Kode Sewa");
        btnKdsewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKdsewaActionPerformed(evt);
            }
        });

        cmbKodeSewa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Kode Sewa --" }));

        btnIdMmbr.setText("ID Member");
        btnIdMmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdMmbrActionPerformed(evt);
            }
        });

        cmbMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- ID Member --" }));

        jLabel2.setText("Nama Penyewa");

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Biaya");

        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Jenis PS");

        btnGroupPS.add(rdbtnps2);
        rdbtnps2.setText("PS2");

        btnGroupPS.add(rdbtnps3);
        rdbtnps3.setText("PS3");

        btnGroupPS.add(rdbtnps4);
        rdbtnps4.setText("PS4");

        btnGroupPS.add(rdbtnps5);
        rdbtnps5.setText("PS5");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnKdsewa)
                                            .addComponent(btnIdMmbr)
                                            .addComponent(jLabel4))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbKodeSewa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbMember, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbtnps2)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbtnps3)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbtnps4)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbtnps5)
                                                .addGap(0, 22, Short.MAX_VALUE)))))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtNama))
                                    .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtWaktu)
                                            .addComponent(txtTgl)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(38, 38, 38)
                                .addComponent(btnHapus)
                                .addGap(36, 36, 36)
                                .addComponent(jButton5)
                                .addGap(36, 36, 36)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                                .addComponent(btnClose))
                            .addComponent(jScrollPane2))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKdsewa)
                            .addComponent(cmbKodeSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIdMmbr)
                            .addComponent(cmbMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rdbtnps2)
                            .addComponent(rdbtnps3)
                            .addComponent(rdbtnps4)
                            .addComponent(rdbtnps5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnProses)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        insert();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Close();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        TotalBiaya();
    }//GEN-LAST:event_btnProsesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        update();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        batal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table_data_rentalPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_rentalPSMouseClicked
        int tabel = table_data_rentalPS.getSelectedRow();
        kodesw1 = table_data_rentalPS.getValueAt(tabel, 0).toString();
        idmmbr1 = table_data_rentalPS.getValueAt(tabel, 1).toString();
        jenisps1 = table_data_rentalPS.getValueAt(tabel, 2).toString();
        nama1 = table_data_rentalPS.getValueAt(tabel, 3).toString();
        tgl1 = table_data_rentalPS.getValueAt(tabel, 4).toString();
        waktu1 = table_data_rentalPS.getValueAt(tabel, 5).toString();
        harga1 = table_data_rentalPS.getValueAt(tabel, 6).toString();
        total1 = table_data_rentalPS.getValueAt(tabel, 7).toString();
        itempilih();
    }//GEN-LAST:event_table_data_rentalPSMouseClicked

    private void btnKdsewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKdsewaActionPerformed
        // TODO add your handling code here:
        new GUI_PemesananPS().setVisible(true);
    }//GEN-LAST:event_btnKdsewaActionPerformed

    private void btnIdMmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdMmbrActionPerformed
        // TODO add your handling code here:
        new GUI_MemberRentalPS().setVisible(true);
    }//GEN-LAST:event_btnIdMmbrActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RentalPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClose;
    private javax.swing.ButtonGroup btnGroupPS;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnIdMmbr;
    private javax.swing.JButton btnKdsewa;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbKodeSewa;
    private javax.swing.JComboBox<String> cmbMember;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbtnps2;
    private javax.swing.JRadioButton rdbtnps3;
    private javax.swing.JRadioButton rdbtnps4;
    private javax.swing.JRadioButton rdbtnps5;
    private javax.swing.JTable table_data_rentalPS;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
