/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jayana Citra
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jJabatan = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtnama = new javax.swing.JTextField();
        jtxtttl = new javax.swing.JTextField();
        jtxtfb = new javax.swing.JTextField();
        jtxttw = new javax.swing.JTextField();
        jtxtig = new javax.swing.JTextField();
        jtxtmotivasi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pengurus Perpustakaan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 280, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SMK TELKOM MALANG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 30, 230, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Angkatan 24");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 50, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pilih Jabatan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 110, 30);

        jJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jabatan--", "Ketua", "Sekertaris", "Bendahara", "Sie Humas", "Sie SDM", "Sie Mading", "Sie Sarpra", "Sie Sirkulasi", "Sie Litbang", "Sie SPP", "Sie Piket" }));
        jJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJabatanActionPerformed(evt);
            }
        });
        getContentPane().add(jJabatan);
        jJabatan.setBounds(210, 100, 160, 30);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel5.setText("Nama");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 20, 60, 14);

        jLabel6.setText("TTL");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 60, 60, 14);

        jLabel7.setText("Facebook");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 100, 46, 14);

        jLabel8.setText("Twitter");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 140, 34, 14);

        jLabel9.setText("Instagram");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 180, 49, 14);

        jLabel10.setText("Motivasi");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 220, 39, 14);
        jPanel1.add(jtxtnama);
        jtxtnama.setBounds(180, 10, 200, 30);
        jPanel1.add(jtxtttl);
        jtxtttl.setBounds(180, 50, 200, 30);
        jPanel1.add(jtxtfb);
        jtxtfb.setBounds(180, 90, 200, 30);
        jPanel1.add(jtxttw);
        jtxttw.setBounds(180, 130, 200, 30);
        jPanel1.add(jtxtig);
        jtxtig.setBounds(180, 170, 200, 30);
        jPanel1.add(jtxtmotivasi);
        jtxtmotivasi.setBounds(180, 210, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 160, 450, 260);

        setBounds(0, 0, 585, 486);
    }// </editor-fold>//GEN-END:initComponents

    private void jJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJabatanActionPerformed
        // TODO add your handling code here:
        if(jJabatan.getSelectedItem().equals("Ketua"))
         {
             jtxtnama.setText("Karlina Widyastuti");
             jtxtttl.setText("Denpasar, 13 November 1999");
             jtxtfb.setText("Nana Karlina");
             jtxttw.setText("@nana_karlina");
             jtxtig.setText("@iitutsa");
             jtxtmotivasi.setText("LIVE ON");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sekertaris"))
            {
             jtxtnama.setText("Anggarda Paramita");
             jtxtttl.setText("Malang, 25 Maret 2000");
             jtxtfb.setText("Anggarda Paramita");
             jtxttw.setText("@anggarda06");
             jtxtig.setText("@anggardaprmt");
             jtxtmotivasi.setText("WHATEVER MAKES YOU SAD LEAVE IT AND WHATEVER MAKES YOU SMILE HOLD IT");
         }
         else
            if(jJabatan.getSelectedItem().equals("Bendahara"))
            {
             jtxtnama.setText("Bernadeth Rosalia Cika Andhini");
             jtxtttl.setText("Semarang, 24 Mei 2000");
             jtxtfb.setText("Rosalia Cika");
             jtxttw.setText("@andicika2");
             jtxtig.setText("@begidakan_");
             jtxtmotivasi.setText("DO SMALL WITH A GREAT LOVE");
         }
         else    
            if(jJabatan.getSelectedItem().equals("Sie Humas"))
         {
             jtxtnama.setText("Mileyanda Qurrota A'yun");
             jtxtttl.setText("Banyuwangi, 6 Maret 2000");
             jtxtfb.setText("Mileyanda Qurrota");
             jtxttw.setText("@mileyanda");
             jtxtig.setText("@mileyanda");
             jtxtmotivasi.setText("I'M LIMITED EDITION PERSON");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie SDM"))
            {
             jtxtnama.setText("Jayana Citra Agung Pramu Putra");
             jtxtttl.setText("Jombang, 15 Oktober 1999");
             jtxtfb.setText("Jayana Citra Agung");
             jtxttw.setText("-");
             jtxtig.setText("@jayana_citra");
             jtxtmotivasi.setText("FLY HIGH AND GET IT");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie Mading"))
         {
             jtxtnama.setText("Gupita Zahra Laksmi Mahardhika");
             jtxtttl.setText("Sidoarjo, 25 Oktober 1999");
             jtxtfb.setText("Mahardhika");
             jtxttw.setText("@soediek");
             jtxtig.setText("@soediek");
             jtxtmotivasi.setText("NO ONE CAN TEACH HOW TO STAND IN THE TOP. YOU NEED TO FIND YOUR OWN INGRIDIENTS");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie Sarpra"))
            {
             jtxtnama.setText("Andreas Susanto Putra");
             jtxtttl.setText("Mojokerto, 6 Desember 1999");
             jtxtfb.setText("Andreas Susanto");
             jtxttw.setText("-");
             jtxtig.setText("@andreaspopo");
             jtxtmotivasi.setText("SUATU SAAT AKAN DATANG HARI DI MANA SEMUA AKAN MENJADI KENANGAN");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie Sirkulasi"))
            {
             jtxtnama.setText("Roa Nuha Kalijaga");
             jtxtttl.setText("Malang, 5 Maret 2000");
             jtxtfb.setText("R Hasan Nuha K");
             jtxttw.setText("-");
             jtxtig.setText("@roa_nuh");
             jtxtmotivasi.setText("POSITIVE IN ANY CONDITION THAT THE BEST CHOICE FRON GOD");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie Litbang"))
            {
             jtxtnama.setText("Arthur Persada Heryana");
             jtxtttl.setText("Nganjuk, 23 Oktober 1999");
             jtxtfb.setText("Persada Arthur");
             jtxttw.setText("-");
             jtxtig.setText("@arthurart_");
             jtxtmotivasi.setText("DON'T WASTE YOUR TIME LOOKING BACK YOU'RE NOT GOING THAT WAY");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie SPP"))
            {
             jtxtnama.setText("Rizaldi Wahaz");
             jtxtttl.setText("Kediri, 20 November 1999");
             jtxtfb.setText("Rizaldi Wahaz");
             jtxttw.setText("@rizaldi_wahaz");
             jtxtig.setText("@rizaldi_wahaz");
             jtxtmotivasi.setText("BE YOURSELF :v");
         }
         else
            if(jJabatan.getSelectedItem().equals("Sie Piket"))
            {
             jtxtnama.setText("Wildan Ziaulhaq");
             jtxtttl.setText("Ponorogo, 28 Maret 2000");
             jtxtfb.setText("Wildan Ziaulhaq");
             jtxttw.setText("-");
             jtxtig.setText("-");
             jtxtmotivasi.setText("BE PREPARED");
         }
    }//GEN-LAST:event_jJabatanActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtfb;
    private javax.swing.JTextField jtxtig;
    private javax.swing.JTextField jtxtmotivasi;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtttl;
    private javax.swing.JTextField jtxttw;
    // End of variables declaration//GEN-END:variables
}
