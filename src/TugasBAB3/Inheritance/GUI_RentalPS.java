package TugasBAB3.Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import javax.swing.JOptionPane;

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
        RentalPS rental = new RentalPS();
        txtHarga.setText("");
        txtHarga.setEnabled(false);
        memoRentalPS.setEnabled(false);
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
        jLabel7 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        txtWaktu = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoRentalPS = new javax.swing.JTextArea();
        btnCetak = new javax.swing.JButton();
        radiobtnPS2 = new javax.swing.JRadioButton();
        radiobtnPS5 = new javax.swing.JRadioButton();
        radiobtnPS3 = new javax.swing.JRadioButton();
        txtNama = new javax.swing.JTextField();

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

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel7.setText("Biaya Sewa");

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

        memoRentalPS.setColumns(20);
        memoRentalPS.setRows(5);
        jScrollPane1.setViewportView(memoRentalPS);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radiobtnPS3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radiobtnPS5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radiobtnPS2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radiobtnPS4)))
                                        .addGap(0, 138, Short.MAX_VALUE))
                                    .addComponent(txtKode)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtWaktu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTgl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHarga))))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCetak)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnClose))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobtnPS3)
                            .addComponent(radiobtnPS5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCetak, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiobtnPS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS4ActionPerformed
        // TODO add your handling code here:
        txtHarga.setText("7000"); // Menetukan harga sewaPS4
    }//GEN-LAST:event_radiobtnPS4ActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // Bersihkan memoRentalPS
        memoRentalPS.setText("");
        RentalPS rental = new RentalPS(); // Memebuat object RentalPS baru
        
        // Ambil dan Masukkan data kode sewa dan nama penyewa
        rental.dataKodeSewa(txtKode.getText());
        rental.dataNamaPenyewa(txtNama.getText());
        
        // Tentukan jenis PS berdasarkan RadioButton yang dipilih
        String JenisPS = "";
        if (radiobtnPS2.isSelected()) {
            JenisPS = "PS2";
        } else if (radiobtnPS3.isSelected()) {
            JenisPS = "PS3";
        } else if (radiobtnPS4.isSelected()) {
            JenisPS = "PS4";
        } else if (radiobtnPS5.isSelected()) {
            JenisPS = "PS5";
        }
        
        // Ambil dan masukkan data tanggal sewa
        rental.dataTanggalSewa(txtTgl.getText());
        
        //Konversi waktu sewa ke integer
        int waktuSewa = 0;
        try {
            waktuSewa = Integer.parseInt(txtWaktu.getText());
        } catch (NumberFormatException ex) {
        // Handle kesalahan jika waktu sewa bukan angka
        JOptionPane.showMessageDialog(null, "Waktu Sewa harus berupa angka.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return; // Hentikan eksekusi jika terjadi kesalahan
        }
        rental.dataWaktuSewa(waktuSewa);
        int hargaSewa = 0; // Inisialisasi variabel hargaSewa
        try {
            hargaSewa = Integer.parseInt(txtHarga.getText()); // Mengonversi teks ke int
        } catch (NumberFormatException ex) { 
            // Handle kesalahan jika input bukan angka
            JOptionPane.showMessageDialog(null, "Harga Sewa harus berupa angka.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return; // Hentikan eksekusi jika terjadi kesalahan
        }
        // Hitung Total biaya
        int totalBiaya = hargaSewa * waktuSewa;
        rental.dataTotalBiaya(totalBiaya);
        
        // Tampilkan hasil pada memoRentalPS
        memoRentalPS.append("\tRental PlayStation\n");
        memoRentalPS.append("-------------------------------------------------------------------\n");
        memoRentalPS.append("Kode Sewa    : " + rental.getKodeSewa()+"\n");
        memoRentalPS.append("Jenis PS     : " + JenisPS + "\n");
        memoRentalPS.append("Nama Penyewa : " + rental.getNamaPenyewa()+ "\n");
        memoRentalPS.append("Tanggal Sewa : " + rental.getTanggalSewa()+"\n");
        memoRentalPS.append("Waktu Sewa   : " + rental.getWaktuSewa()+ " Jam\n");
        memoRentalPS.append("Harga/Jam    : " + hargaSewa + "\n");
        memoRentalPS.append("Total Biaya  : " + rental.getTotalBiaya()+ "\n");
        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void radiobtnPS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS2ActionPerformed
        // TODO add your handling code here:
        txtHarga.setText("3000"); // Menentukan harga sewa PS2
    }//GEN-LAST:event_radiobtnPS2ActionPerformed

    private void radiobtnPS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS5ActionPerformed
        // TODO add your handling code here:
        txtHarga.setText("10000"); // Menetukan Harga sewa PS5
    }//GEN-LAST:event_radiobtnPS5ActionPerformed

    private void radiobtnPS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPS3ActionPerformed
        // TODO add your handling code here:
        txtHarga.setText("5000"); // Menetukan harga sewa PS3
    }//GEN-LAST:event_radiobtnPS3ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Menghapus atau membersihkan pada seluruh textfield dan memo
        txtKode.setText("");
        txtNama.setText("");
        txtTgl.setText("");
        txtWaktu.setText("");
        txtHarga.setText("");
        memoRentalPS.setText("");
        btnGroupPS.clearSelection();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea memoRentalPS;
    private javax.swing.JRadioButton radiobtnPS2;
    private javax.swing.JRadioButton radiobtnPS3;
    private javax.swing.JRadioButton radiobtnPS4;
    private javax.swing.JRadioButton radiobtnPS5;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
