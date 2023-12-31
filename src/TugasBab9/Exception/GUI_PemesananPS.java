/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasBab9.Exception;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableColumnModel;
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
        PemesananPS pesanan = new PemesananPS(); // Membuat objek pemesanan PS
        DefaultTableModel dataModel = (DefaultTableModel)table_data_pemesanan.getModel(); // Mengambil model data dari tabel
        int rowCount = dataModel.getRowCount(); // Variabel untuk mengambil jumlah baris saat ini dalam model data tabel
        // Menghapus semua baris pada model data tabel menggunakan perulangan while
        while(rowCount > 0){
            dataModel.removeRow(rowCount - 1); // Menghapus baris terakhir
            rowCount = dataModel.getRowCount(); // Mengambil jumlah baris setelah dihapus
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
        txtKodeSeri = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rdbtnPS2 = new javax.swing.JRadioButton();
        rdbtnPS3 = new javax.swing.JRadioButton();
        rdbtnPS4 = new javax.swing.JRadioButton();
        rdbtnPS5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnPesan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_pemesanan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtWaktu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("STLiti", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemesanan PlayStation");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Nama Penyewa");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Jenis PS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Kode Seri PS");

        txtNama.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        txtKodeSeri.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        txtStok.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        cmbStatus.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sudah Bayar", "Belum Bayar" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Stok");

        btngrpOrder.add(rdbtnPS2);
        rdbtnPS2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        rdbtnPS2.setText("PS2");

        btngrpOrder.add(rdbtnPS3);
        rdbtnPS3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        rdbtnPS3.setText("PS3");

        btngrpOrder.add(rdbtnPS4);
        rdbtnPS4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        rdbtnPS4.setText("PS4");

        btngrpOrder.add(rdbtnPS5);
        rdbtnPS5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        rdbtnPS5.setText("PS5");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Status Pembayaran");

        btnPesan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnPesan.setText("Pesan");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        table_data_pemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Penyewa", "Jenis PS", "Kode Seri", "Stok", "Status Pembayaran", "Harga/Jam", "Waktu Sewa", "Total Harga"
            }
        ));
        jScrollPane2.setViewportView(table_data_pemesanan);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText("Waktu Sewa");

        txtWaktu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbtnPS3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                        .addComponent(rdbtnPS5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbtnPS2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdbtnPS4))
                                    .addComponent(txtNama)
                                    .addComponent(txtKodeSeri)
                                    .addComponent(txtStok)
                                    .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtWaktu))))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnPS2)
                            .addComponent(rdbtnPS4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnPS3)
                            .addComponent(rdbtnPS5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKodeSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        DefaultTableModel dataModel = (DefaultTableModel) table_data_pemesanan.getModel();
        int selectedRow = table_data_pemesanan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih pesanan yang ingin dibatalkan.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            dataModel.removeRow(selectedRow); 
            JOptionPane.showMessageDialog(this, "Data Dibatalkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        try{
            DefaultTableModel dataModel = (DefaultTableModel) table_data_pemesanan.getModel();
            PemesananPS pesanan = new PemesananPS();
            
            // memeriksa semua inputan data, jika ada yang kosong akan menmapilkan pesan
            if (txtKodeSeri.getText().isEmpty() || txtNama.getText().isEmpty() || txtStok.getText().isEmpty() || txtWaktu.getText().isEmpty()){
                    throw new Exception("Terdapat Input Data Yang Kosong");
            }
            
            pesanan.dataNamaPenyewa(txtNama.getText());
            
            String jenisPS = "";
            if (jenisPS.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pilih jenis PS terlebih dahulu.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            if (rdbtnPS2.isSelected()) {
                jenisPS = "PS2";
            } else if (rdbtnPS3.isSelected()) {
                jenisPS = "PS3";
            } else if (rdbtnPS4.isSelected()) {
                jenisPS = "PS4";
            } else if (rdbtnPS5.isSelected()) {
                jenisPS = "PS5";
            }
            pesanan.dataJenisPS(jenisPS);
            pesanan.dataSeriPS(txtKodeSeri.getText());
            try {
                pesanan.stok = Integer.parseInt(txtStok.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Stok Menggunakan Format Angka", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(cmbStatus.getSelectedIndex() == 0){
                pesanan.statusPembayaran = "Sudah Bayar";
            } else{
                pesanan.statusPembayaran = "Belum Bayar";
            }
            try {
                pesanan.dataWaktuSewa(Integer.parseInt(txtWaktu.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Masukkan waktu sewa dengan format angka yang benar.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return;
            }

            List<Object> list = new ArrayList<>();
            list.add(pesanan.getNamaPenyewa());
            list.add(pesanan.getJenisPS());
            list.add(pesanan.getSeriPS());
            list.add(pesanan.getStokPS());
            list.add(pesanan.statusPembayaran);
            list.add("Rp." + pesanan.getHargaPerJam());
            list.add(pesanan.getWaktuSewa()+" Jam");
            list.add("Rp." + pesanan.hitTotalBiaya());

            dataModel.addRow(list.toArray());
            txtNama.setText("");
            txtKodeSeri.setText("");
            txtStok.setText("");
            txtWaktu.setText("");
            btngrpOrder.clearSelection();
            JOptionPane.showMessageDialog(this, "Data Ditambahkan Ke tabel", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesanActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // Untuk menampilkan popup keluar dari program atau tidak
        String tanya = "Apakah Anda Yakin Ingin Keluar?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)
            == JOptionPane.YES_OPTION;
        if (yakin) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PemesananPS().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPesan;
    private javax.swing.ButtonGroup btngrpOrder;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbtnPS2;
    private javax.swing.JRadioButton rdbtnPS3;
    private javax.swing.JRadioButton rdbtnPS4;
    private javax.swing.JRadioButton rdbtnPS5;
    private javax.swing.JTable table_data_pemesanan;
    private javax.swing.JTextField txtKodeSeri;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
