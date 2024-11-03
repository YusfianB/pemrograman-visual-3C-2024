/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul4;
import java.util.Random;
import javax.swing.JOptionPane;

public class tebakAngka extends javax.swing.JFrame {
    int chance = 10;
    int maxAngka = 100;
    String[][] score_list = new String[10][2];
    int index = 0;
    Random rand = new Random();
    int jawaban = rand.nextInt(maxAngka) + 1; 
    

    public tebakAngka() {
        initComponents();
        this.setLocationRelativeTo(null);
        resetGame();    
    }
    
    private void resetGame() {
        chance = 10;
        jawaban = rand.nextInt(maxAngka) + 1; 
        btnTebak.setText("Tebak (" + chance + ")");
        txtTebak.setText("");
        txtJawaban.setText("");
        txtScore.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        Game = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTebak = new javax.swing.JTextField();
        txtJawaban = new javax.swing.JTextField();
        txtScore = new javax.swing.JTextField();
        btnTebak = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        btnOut = new javax.swing.JButton();
        Score = new javax.swing.JPanel();
        PanelAtas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PanelBawah = new javax.swing.JPanel();
        btnKeluar = new javax.swing.JButton();
        PanelTengah = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        scoreList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Game.setLayout(new java.awt.BorderLayout());

        TopPanel.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Schadow BT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 254, 247));
        jLabel1.setText("TEBAK ANGKA");
        TopPanel.add(jLabel1);

        Game.add(TopPanel, java.awt.BorderLayout.PAGE_START);

        CenterPanel.setBackground(new java.awt.Color(51, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setText("Tebak Angka 1 - 100");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setText("Tebak Angka");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setText("Jawaban");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setText("Score");

        txtJawaban.setEditable(false);

        txtScore.setEditable(false);
        txtScore.setText("0");

        btnTebak.setBackground(new java.awt.Color(0, 0, 0));
        btnTebak.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        btnTebak.setForeground(new java.awt.Color(255, 255, 255));
        btnTebak.setText("Tebak (10)");
        btnTebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTebakActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTebak, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnTebak)
                        .addGap(42, 42, 42)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel4)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTebak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTebak)
                    .addComponent(btnReset))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        Game.add(CenterPanel, java.awt.BorderLayout.CENTER);

        BottomPanel.setBackground(new java.awt.Color(51, 153, 255));
        BottomPanel.setMinimumSize(new java.awt.Dimension(412, 38));
        BottomPanel.setPreferredSize(new java.awt.Dimension(445, 48));
        BottomPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOut.setBackground(new java.awt.Color(255, 0, 0));
        btnOut.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        btnOut.setForeground(new java.awt.Color(255, 255, 255));
        btnOut.setText("Keluar");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        BottomPanel.add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        Game.add(BottomPanel, java.awt.BorderLayout.PAGE_END);

        TabbedPane.addTab("Game", Game);

        Score.setLayout(new java.awt.BorderLayout());

        PanelAtas.setBackground(new java.awt.Color(51, 153, 255));

        jLabel10.setFont(new java.awt.Font("Schadow BT", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(227, 254, 247));
        jLabel10.setText("SCORE");
        PanelAtas.add(jLabel10);

        Score.add(PanelAtas, java.awt.BorderLayout.PAGE_START);

        PanelBawah.setBackground(new java.awt.Color(51, 153, 255));
        PanelBawah.setPreferredSize(new java.awt.Dimension(445, 48));
        PanelBawah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKeluar.setBackground(new java.awt.Color(255, 0, 0));
        btnKeluar.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        PanelBawah.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        Score.add(PanelBawah, java.awt.BorderLayout.PAGE_END);

        PanelTengah.setBackground(new java.awt.Color(51, 204, 255));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane3.setViewportView(scoreList);

        javax.swing.GroupLayout PanelTengahLayout = new javax.swing.GroupLayout(PanelTengah);
        PanelTengah.setLayout(PanelTengahLayout);
        PanelTengahLayout.setHorizontalGroup(
            PanelTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTengahLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        PanelTengahLayout.setVerticalGroup(
            PanelTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTengahLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Score.add(PanelTengah, java.awt.BorderLayout.CENTER);

        TabbedPane.addTab("Score", Score);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTebakActionPerformed
        try {
            int hasil_tebakan = Integer.parseInt(txtTebak.getText());

            if (hasil_tebakan < 1 || hasil_tebakan > maxAngka) {
                JOptionPane.showMessageDialog(this, "TEBAKAN HARUS BERADA DI ANTARA 1 DAN " + maxAngka, "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String jwb = Integer.toString(jawaban);
            System.out.println("Komputer memilih: " + jwb);
            
            if (jawaban > hasil_tebakan) {
                chance--;
                txtJawaban.setText("Angka Tebakan Lebih Besar");
            } else if (jawaban < hasil_tebakan) {
                chance--;
                txtJawaban.setText("Angka Tebakan Lebih Kecil");
            } else {
                int hasil = chance * 10;
                txtJawaban.setText("Anda Menebak: " + jawaban);
                txtScore.setText(String.valueOf(hasil));
                JOptionPane.showMessageDialog(this, "SELAMAT TEBAKAN ANDA BENAR");

                String nama = JOptionPane.showInputDialog(this, "SILAKAN MASUKAN NAMA");
                if (index < score_list.length) {
                    score_list[index][0] = nama;
                    score_list[index][1] = String.valueOf(hasil);
                    index++; 

                    updateScoreList();
                }

                jawaban = rand.nextInt(maxAngka) + 1;
            }

            btnTebak.setText("Tebak (" + chance + ")");
            if (chance == 0) {
                JOptionPane.showMessageDialog(this, "KESEMPATAN ANDA HABIS! Angka yang benar adalah: " + jawaban);
                resetGame();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "TEBAKAN HARUS BERUPA ANGKA");
        }
    }//GEN-LAST:event_btnTebakActionPerformed
    
    private void updateScoreList() {
        String[] scores = new String[index]; // Membuat array baru untuk skor
        for (int i = 0; i < index; i++) {
            scores[i] = "Name: " + score_list[i][0] + ", Score: " + score_list[i][1];
        }
        scoreList.setListData(scores);
    }
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int reset = JOptionPane.showConfirmDialog(rootPane, "Reset Game?", "Reset", JOptionPane.YES_NO_OPTION);
        if (reset == JOptionPane.YES_OPTION) {
            resetGame();
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        int exit = JOptionPane.showConfirmDialog(null,"Keluar permainan?","Keluar",JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        int exit = JOptionPane.showConfirmDialog(null,"Keluar permainan?","Keluar",JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(tebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tebakAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel Game;
    private javax.swing.JPanel PanelAtas;
    private javax.swing.JPanel PanelBawah;
    private javax.swing.JPanel PanelTengah;
    private javax.swing.JPanel Score;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTebak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> scoreList;
    private javax.swing.JTextField txtJawaban;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtTebak;
    // End of variables declaration//GEN-END:variables
}
