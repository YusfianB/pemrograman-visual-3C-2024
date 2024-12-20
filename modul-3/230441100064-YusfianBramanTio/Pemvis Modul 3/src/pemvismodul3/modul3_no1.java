/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Yusfian Braman Tio
 */
public class modul3_no1 extends javax.swing.JFrame {

    /**
     * Creates new form modul3no1
     */
    public modul3_no1() {
        initComponents();
        tftotal.setEditable(false);
        tfkembali.setEditable(false);
        
        tfcash.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                penghitungan();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbParacetamol = new javax.swing.JCheckBox();
        cbObatDiabetes = new javax.swing.JCheckBox();
        obat1 = new javax.swing.JCheckBox();
        obat6 = new javax.swing.JCheckBox();
        cbAntasida = new javax.swing.JCheckBox();
        cbObatBatuk = new javax.swing.JCheckBox();
        obat2 = new javax.swing.JCheckBox();
        obat7 = new javax.swing.JCheckBox();
        cbObatTekananDarahTinggi = new javax.swing.JCheckBox();
        cbObatKolesterol = new javax.swing.JCheckBox();
        obat3 = new javax.swing.JCheckBox();
        obat8 = new javax.swing.JCheckBox();
        cbAntihistamin = new javax.swing.JCheckBox();
        cbAntibiotik = new javax.swing.JCheckBox();
        obat4 = new javax.swing.JCheckBox();
        obat9 = new javax.swing.JCheckBox();
        cbObatMaag = new javax.swing.JCheckBox();
        cbVitamindanSuplemen = new javax.swing.JCheckBox();
        obat5 = new javax.swing.JCheckBox();
        obat10 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        tftotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfcash = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfkembali = new javax.swing.JTextField();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Apotek Langkap");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\pharmacy1.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new java.awt.BorderLayout(10, 10));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("@copyright2024");
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 660, 20));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout(10, 2, 10, 10));

        cbParacetamol.setText("Paracetamol");
        cbParacetamol.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\paracetamol2.jpg")); // NOI18N
        cbParacetamol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbParacetamolMouseClicked(evt);
            }
        });
        cbParacetamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParacetamolActionPerformed(evt);
            }
        });
        jPanel3.add(cbParacetamol);

        cbObatDiabetes.setText("Obat Diabetes");
        cbObatDiabetes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\diabetes1.jpg")); // NOI18N
        cbObatDiabetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbObatDiabetesMouseClicked(evt);
            }
        });
        jPanel3.add(cbObatDiabetes);

        obat1.setText("Rp. 7.000");
        jPanel3.add(obat1);

        obat6.setText("Rp. 25.000");
        jPanel3.add(obat6);

        cbAntasida.setText("Antasida");
        cbAntasida.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\antasida.jpg")); // NOI18N
        cbAntasida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAntasidaMouseClicked(evt);
            }
        });
        jPanel3.add(cbAntasida);

        cbObatBatuk.setText("Obat Batuk");
        cbObatBatuk.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\obakbatuk1.jpg")); // NOI18N
        cbObatBatuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbObatBatukMouseClicked(evt);
            }
        });
        cbObatBatuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbObatBatukActionPerformed(evt);
            }
        });
        jPanel3.add(cbObatBatuk);

        obat2.setText("Rp. 10.000");
        jPanel3.add(obat2);

        obat7.setText("Rp. 5.000");
        jPanel3.add(obat7);

        cbObatTekananDarahTinggi.setText("Obat Tekanan Darah Tinggi");
        cbObatTekananDarahTinggi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\tekanandarahtinggi1.jpg")); // NOI18N
        cbObatTekananDarahTinggi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbObatTekananDarahTinggiMouseClicked(evt);
            }
        });
        jPanel3.add(cbObatTekananDarahTinggi);

        cbObatKolesterol.setText("Obat Kolesterol");
        cbObatKolesterol.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\kolesterol1.jpg")); // NOI18N
        cbObatKolesterol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbObatKolesterolMouseClicked(evt);
            }
        });
        jPanel3.add(cbObatKolesterol);

        obat3.setText("Rp. 15.000");
        jPanel3.add(obat3);

        obat8.setText("Rp. 19.000");
        jPanel3.add(obat8);

        cbAntihistamin.setText("Antihistamin");
        cbAntihistamin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\antihistamin1.jpg")); // NOI18N
        cbAntihistamin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAntihistaminMouseClicked(evt);
            }
        });
        jPanel3.add(cbAntihistamin);

        cbAntibiotik.setText("Antibiotik");
        cbAntibiotik.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\antibiotik1.jpg")); // NOI18N
        cbAntibiotik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAntibiotikMouseClicked(evt);
            }
        });
        jPanel3.add(cbAntibiotik);

        obat4.setText("Rp. 10.000");
        jPanel3.add(obat4);

        obat9.setText("Rp. 12.000");
        jPanel3.add(obat9);

        cbObatMaag.setText("Obat Maag");
        cbObatMaag.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\maag1.jpg")); // NOI18N
        cbObatMaag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbObatMaagMouseClicked(evt);
            }
        });
        jPanel3.add(cbObatMaag);

        cbVitamindanSuplemen.setText("Vitamin dan Suplemen");
        cbVitamindanSuplemen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yusfian Braman Tio\\Downloads\\vitamin1.jpg")); // NOI18N
        cbVitamindanSuplemen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbVitamindanSuplemenMouseClicked(evt);
            }
        });
        jPanel3.add(cbVitamindanSuplemen);

        obat5.setText("Rp. 20.000");
        jPanel3.add(obat5);

        obat10.setText("Rp. 30.000");
        jPanel3.add(obat10);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 420, 460));

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setText("JUMLAH");

        btntotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntotal.setText("Total");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        tftotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Cash");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        tfcash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(tfcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 30));

        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel6.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Kembalian");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        tfkembali.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(tfkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 30));

        btnkeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel6.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 30));

        jPanel4.add(jPanel6);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 270, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void penghitungan() {
        try {
            double harga = Double.parseDouble(tftotal.getText()); 
            double uang = Double.parseDouble(tfcash.getText());
            double kembalian = uang - harga;

            if (kembalian >= 0) {
                tfkembali.setText(String.valueOf(kembalian));
            } else {
                tfkembali.setText("Uang Tidak Cukup");
            }
        } catch (NumberFormatException e) {
            tfkembali.setText("");
        }
    }
        
    private void cbParacetamolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbParacetamolMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Demam, sakit kepala, nyeri otot, nyeri sendi, nyeri haid.\n" +
"Cara kerja: Mengurangi produksi prostaglandin, zat yang menyebabkan rasa sakit dan peradangan.\nFungsi: Mengatasi demam dan nyeri ringan hingga sedang, seperti sakit kepala, nyeri otot, dan nyeri haid.\n" +
"Merek dagang: Bodrex, Panadol, Pyrex, dll.", "Informasi Paracetamol", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbParacetamolMouseClicked

    private void cbParacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParacetamolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbParacetamolActionPerformed

    private void cbAntasidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAntasidaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Perut kembung, mulas, heartburn, asam lambung naik.\n" +
"Cara kerja: Menetralkan asam lambung berlebih.\nFungsi: Mengatasi masalah pencernaan seperti maag, mulas, dan heartburn.\n" +
"Merek dagang: Mylanta, Tums, Magnesia, dll.", "Informasi Antasida", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbAntasidaMouseClicked

    private void cbObatBatukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbObatBatukMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Batuk kering, batuk berdahak, hidung tersumbat, tenggorokan gatal.\n" +
"Cara kerja: Mengencerkan dahak, meredakan peradangan pada saluran pernapasan, dan menekan batuk.\nFungsi: Meredakan gejala batuk, baik batuk kering maupun batuk berdahak.\n" +
"Merek dagang: Procold, Dexamethasone, Ambroxol, dll.", "Informasi Obat Batuk", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbObatBatukMouseClicked

    private void cbAntihistaminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAntihistaminMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Bersin-bersin, hidung meler, mata berair, gatal-gatal, ruam kulit (karena alergi).\n" +
"Cara kerja: Mencegah pelepasan histamin, zat yang menyebabkan reaksi alergi.\nFungsi: Mengatasi alergi, seperti bersin-bersin, hidung tersumbat, dan mata berair.\n" +
"Merek dagang: Cetirizine, Loratadine, Diphenhydramine, dll.", "Informasi Antihistamin", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbAntihistaminMouseClicked

    private void cbObatMaagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbObatMaagMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Nyeri ulu hati, mual, muntah, kembung, perih di perut.\n" +
"Cara kerja: Mengurangi produksi asam lambung, melindungi dinding lambung, dan mempercepat penyembuhan luka pada lambung.\nFungsi: Mengatasi sakit maag yang lebih kronis, seperti tukak lambung.\n" +
"Merek dagang: Omeprazole, Ranitidine, Famotidine, dll.", "Informasi Obat Maag", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbObatMaagMouseClicked

    private void cbObatDiabetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbObatDiabetesMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Rasa haus yang berlebihan, sering buang air kecil, mudah lelah, penglihatan kabur, luka yang sulit sembuh.\n" +
"Cara kerja: Mengatur kadar gula darah dengan cara meningkatkan produksi insulin, meningkatkan sensitivitas sel terhadap insulin, atau mengurangi produksi glukosa oleh hati.\nFungsi: Mengontrol kadar gula darah pada penderita diabetes.\n" +
"Merek dagang: Metformin, Glibenclamide, Glipizide, dll.", "Informasi Obat Diabetes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbObatDiabetesMouseClicked

    private void cbObatTekananDarahTinggiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbObatTekananDarahTinggiMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Tidak selalu menunjukkan gejala, namun jika tekanan darah tinggi sudah parah bisa menyebabkan sakit kepala, pusing, hidung berdarah, sesak napas, dan nyeri dada.\n" +
"Cara kerja: Mengupayakan agar pembuluh darah melebar sehingga tekanan darah menurun.\nFungsi: Menurunkan tekanan darah tinggi.\n" +
"Merek dagang: Losartan, Enalapril, Amlodipine, dll.", "Informasi Obat Tekanan Darah Tinggi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbObatTekananDarahTinggiMouseClicked

    private void cbObatKolesterolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbObatKolesterolMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Tidak selalu menunjukkan gejala, namun jika kadar kolesterol tinggi dalam jangka waktu lama dapat meningkatkan risiko penyakit jantung dan stroke.\n" +
"Cara kerja: Mengurangi produksi kolesterol jahat oleh hati dan meningkatkan kadar kolesterol baik.\nFungsi: Menurunkan kadar kolesterol dalam darah.\n" +
"Merek dagang: Atorvastatin, Simvastatin, Rosuvastatin, dll.", "Informasi Obat Kolesterol", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbObatKolesterolMouseClicked

    private void cbAntibiotikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAntibiotikMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Infeksi bakteri, seperti infeksi saluran pernapasan, infeksi saluran kemih, infeksi kulit, dan infeksi telinga.\n" +
"Cara kerja: Membunuh bakteri penyebab infeksi.\nFungsi: Membunuh bakteri penyebab infeksi.\n" +
"Merek dagang: Amoxicillin, Cephalosporin, Azithromycin, dll. (Penting: Antibiotik hanya boleh digunakan berdasarkan resep dokter)", "Informasi Antibiotik", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbAntibiotikMouseClicked

    private void cbVitamindanSuplemenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbVitamindanSuplemenMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gejala yang diobati: Kekurangan nutrisi, seperti kelelahan, mudah sakit, rambut rontok, kulit kering.\n" +
"Cara kerja: Melengkapi kebutuhan nutrisi tubuh yang kurang terpenuhi dari makanan.\nFungsi: Melengkapi kebutuhan nutrisi tubuh.\n" +
"Merek dagang: Multivitamin, Vitamin C, Kalsium, dll.", "Informasi Vitamin dan Suplemen", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cbVitamindanSuplemenMouseClicked

    private void cbObatBatukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbObatBatukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbObatBatukActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        // TODO add your handling code here:
//        if (bgObat.getSelection() == null) {
//            JOptionPane.showMessageDialog(null, "Anda harus memilih obat terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

        double harga = 0;

        if (obat1.isSelected()) {
            harga += 7000;
        }
        penghitungan();

        if (obat2.isSelected()) {
            harga += 10000;
        }
        penghitungan();

        if (obat3.isSelected()) {
            harga += 15000;
        }
        penghitungan();

        if (obat4.isSelected()) {
            harga += 10000;
        }
        penghitungan();

        if (obat5.isSelected()) {
            harga += 20000;
        }
        penghitungan();

        if (obat6.isSelected()) {
            harga += 25000;
        }
        penghitungan();

        if (obat7.isSelected()) {
            harga += 5000;
        }
        penghitungan();

        if (obat8.isSelected()) {
            harga += 19000;
        }
        penghitungan();

        if (obat9.isSelected()) {
            harga += 12000;
        }
        penghitungan();

        if (obat10.isSelected()) {
            harga += 30000;
        }
        tftotal.setText(String.valueOf(harga));

        penghitungan();

    }//GEN-LAST:event_btntotalActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        int jumlah = 0;
        tftotal.setText("");
        tfcash.setText("");
        tfkembali.setText("");
        tftotal.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Keluar Program?",
            "Keluar", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnkeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul3_no1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntotal;
    private javax.swing.JCheckBox cbAntasida;
    private javax.swing.JCheckBox cbAntibiotik;
    private javax.swing.JCheckBox cbAntihistamin;
    private javax.swing.JCheckBox cbObatBatuk;
    private javax.swing.JCheckBox cbObatDiabetes;
    private javax.swing.JCheckBox cbObatKolesterol;
    private javax.swing.JCheckBox cbObatMaag;
    private javax.swing.JCheckBox cbObatTekananDarahTinggi;
    private javax.swing.JCheckBox cbParacetamol;
    private javax.swing.JCheckBox cbVitamindanSuplemen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JCheckBox obat1;
    private javax.swing.JCheckBox obat10;
    private javax.swing.JCheckBox obat2;
    private javax.swing.JCheckBox obat3;
    private javax.swing.JCheckBox obat4;
    private javax.swing.JCheckBox obat5;
    private javax.swing.JCheckBox obat6;
    private javax.swing.JCheckBox obat7;
    private javax.swing.JCheckBox obat8;
    private javax.swing.JCheckBox obat9;
    private javax.swing.JTextField tfcash;
    private javax.swing.JTextField tfkembali;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
