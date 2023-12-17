package TugasBAB8.Interface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
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
        RentalPS rental;
        rental = new PemesananPS();
        table_data_rentalPS.setEnabled(false);
        DefaultTableModel dataModel = (DefaultTableModel) table_data_rentalPS.getModel();
        int rowCount = dataModel.getRowCount();
        while(rowCount > 0){
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
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
        radiobtnPS4 = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        txtWaktu = new javax.swing.JTextField();
        btnCetak = new javax.swing.JButton();
        radiobtnPS2 = new javax.swing.JRadioButton();
        radiobtnPS5 = new javax.swing.JRadioButton();
        radiobtnPS3 = new javax.swing.JRadioButton();
        txtNama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_rentalPS = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cmb_jenismember = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGroupPS.add(radiobtnPS4);
        radiobtnPS4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        radiobtnPS4.setText("PS4");
        radiobtnPS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnPS4ActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RENTAL PlayStation");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel2.setText("Kode Sewa");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel3.setText("Jenis PS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel4.setText("Nama Penyewa");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel5.setText("Tanggal Sewa");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel6.setText("Waktu Sewa(Jam)");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCetak.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnGroupPS.add(radiobtnPS2);
        radiobtnPS2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        radiobtnPS2.setText("PS2");
        radiobtnPS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnPS2ActionPerformed(evt);
            }
        });

        btnGroupPS.add(radiobtnPS5);
        radiobtnPS5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        radiobtnPS5.setText("PS5");
        radiobtnPS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnPS5ActionPerformed(evt);
            }
        });

        btnGroupPS.add(radiobtnPS3);
        radiobtnPS3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        radiobtnPS3.setText("PS3");
        radiobtnPS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnPS3ActionPerformed(evt);
            }
        });

        table_data_rentalPS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Sewa", "Jenis PS", "Nama", "Tanggal", "Waktu Penyewaan", "Harga", "Total Biaya Awal", "Diskon", "Biaya AKhir"
            }
        ));
        jScrollPane2.setViewportView(table_data_rentalPS);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel7.setText("Jenis Member");

        cmb_jenismember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-Member", "Member Silver", "Member Gold", "Member Platinum" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCetak)
                        .addGap(64, 64, 64)
                        .addComponent(btnClear)
                        .addGap(71, 71, 71)
                        .addComponent(btnClose))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNama))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radiobtnPS2)
                                        .addComponent(radiobtnPS3))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radiobtnPS5)
                                        .addComponent(radiobtnPS4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtTgl)
                                .addComponent(cmb_jenismember, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(radiobtnPS2)
                            .addComponent(radiobtnPS4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobtnPS3)
                            .addComponent(radiobtnPS5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_jenismember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCetak)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose))
                        .addGap(8, 8, 8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiobtnPS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS4ActionPerformed
    }//GEN-LAST:event_radiobtnPS4ActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // Menampilkan pesan dialog bahwa data telah ditambahkan ke tabel
        JOptionPane.showMessageDialog(null, "Data Ditambahkan Ke tabel");

        // Mengambil model data dari tabel
        DefaultTableModel dataModel = (DefaultTableModel) table_data_rentalPS.getModel();
       // Dynamic static polimorfisme
        PemesananPS rental = new PemesananPS();
        MemberRentalPS rental1 = new MemberRentalPS();
        // Ambil dan Masukkan data kode sewa dan nama penyewa
        rental.dataKodeSewa(txtKode.getText());
        rental.dataNamaPenyewa(txtNama.getText()); // Menggunakan method dataNamaPenyewa
        
        String jenisPS = ""; // Menginisialisasi variabel jenisPS berdasarkan pilihan dari radio button
        // Menentukan jenisPS berdasarkan radio button yang dipilih
        if (radiobtnPS2.isSelected()) {
            jenisPS = "PS2";
        } else if (radiobtnPS3.isSelected()) {
            jenisPS = "PS3";
        } else if (radiobtnPS4.isSelected()) {
            jenisPS = "PS4";
        } else if (radiobtnPS5.isSelected()) {
            jenisPS = "PS5";
        }
        rental.dataJenisPS(jenisPS); // Mengisi data jenis PS menggunakan method dataJenisPS

        // Ambil dan masukkan data tanggal sewa
        rental.dataTanggalSewa(txtTgl.getText());

        // Konversi waktu sewa ke integer
        rental.dataWaktuSewa(Integer.parseInt(txtWaktu.getText()));
        rental1.dataWaktuSewa(Integer.parseInt(txtWaktu.getText()));
        
        String JenisMember = ""; // Variabel JenisMember digunakan untuk menyimpan jenis member berdasarkan pilihan combo box
        double diskon = 0.0; // Variabel diskon digunakan untuk menyimpan nilai diskon yang sesuai dengan jenis member
        String disc = "";
        // Menggunakan combo box (cmbjenisMember) untuk menentukan jenis member
        if(cmb_jenismember.getSelectedIndex() == 0){
            JenisMember = "Non-Member";
            disc = "Tidak Mendapat Diskon";
            diskon = 0.0;
        }else if(cmb_jenismember.getSelectedIndex() == 1){
            JenisMember = "Member Silver";
            disc = "10%";
            diskon = 0.10;
        }else if(cmb_jenismember.getSelectedIndex() == 2){
            JenisMember = "Member Gold";
            disc = "15%";
            diskon = 0.15;
        }else if(cmb_jenismember.getSelectedIndex() == 3){
            JenisMember = "Member Platinum";
            disc = "25%";
            diskon = 0.25;
        }
        rental1.TotalBiaya = rental.hitTotalBiaya(); // Menginisialisasi data Total biaya pada objek rental1 = hit totalbiaya objek rental
        double diskonAmount = rental1.TotalBiaya * diskon; // Menghitung jumlah diskon berdasarkan jenis member yang telah dipilih
        double biayaSetelahDiskon = rental1.TotalBiaya - diskonAmount; // Menghitung total biaya setelah diberikan diskon
        
        // Tambahkan data ke list
        List<Object> list = new ArrayList<>();
        list.add(rental.getKodeSewa());
        list.add(rental.getJenisPS());
        list.add(rental.getNamaPenyewa()); // Menggunakan method getNamaPenyewa
        list.add(rental.getTanggalSewa());
        list.add(rental.getWaktuSewa() + " Jam");
        list.add("Rp " + rental.getHargaPerJam() + "/Jam");
        list.add("Rp " + rental.hitTotalBiaya()); // Menggunakan method getTotalBiaya
        list.add(disc);
        list.add(biayaSetelahDiskon);
        
        dataModel.addRow(list.toArray());
        
        txtKode.setText("");
        txtNama.setText("");
        txtTgl.setText("");
        txtWaktu.setText("");
        btnGroupPS.clearSelection();
    }//GEN-LAST:event_btnCetakActionPerformed

    private void radiobtnPS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS2ActionPerformed
    }//GEN-LAST:event_radiobtnPS2ActionPerformed

    private void radiobtnPS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS5ActionPerformed
    }//GEN-LAST:event_radiobtnPS5ActionPerformed

    private void radiobtnPS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS3ActionPerformed
    }//GEN-LAST:event_radiobtnPS3ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        DefaultTableModel dataModel = (DefaultTableModel) table_data_rentalPS.getModel();
        int rowCount = dataModel.getRowCount();
        while(rowCount > 0){
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
        }
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RentalPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUI_RentalPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.ButtonGroup btnGroupPS;
    private javax.swing.JComboBox<String> cmb_jenismember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radiobtnPS2;
    private javax.swing.JRadioButton radiobtnPS3;
    private javax.swing.JRadioButton radiobtnPS4;
    private javax.swing.JRadioButton radiobtnPS5;
    private javax.swing.JTable table_data_rentalPS;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
