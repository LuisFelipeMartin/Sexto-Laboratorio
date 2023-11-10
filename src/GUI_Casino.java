public class GUI_Casino extends javax.swing.JFrame 
{
    int rul, cab;
    public GUI_Casino() 
    {
        initComponents();
        rul = 0;
        cab = 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        BotCaballo = new javax.swing.JButton();
        BotRuleta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BotSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 36, 19));

        jLabel1.setForeground(new java.awt.Color(98, 153, 104));
        jLabel1.setText("Casino medio feo :(");

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        Titulo.setForeground(new java.awt.Color(179, 190, 171));
        Titulo.setText("CASINO GENERICO");

        BotCaballo.setBackground(new java.awt.Color(39, 91, 52));
        BotCaballo.setFont(new java.awt.Font("Segoe UI", 3, 46)); // NOI18N
        BotCaballo.setForeground(new java.awt.Color(98, 153, 104));
        BotCaballo.setText("Caballos");
        BotCaballo.setBorder(null);
        BotCaballo.setBorderPainted(false);
        BotCaballo.setDefaultCapable(false);
        BotCaballo.setFocusPainted(false);
        BotCaballo.setFocusable(false);
        BotCaballo.setRequestFocusEnabled(false);
        BotCaballo.setRolloverEnabled(false);
        BotCaballo.setVerifyInputWhenFocusTarget(false);
        BotCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCaballoActionPerformed(evt);
            }
        });

        BotRuleta.setBackground(new java.awt.Color(39, 91, 52));
        BotRuleta.setFont(new java.awt.Font("Segoe UI", 3, 46)); // NOI18N
        BotRuleta.setForeground(new java.awt.Color(98, 153, 104));
        BotRuleta.setText("Ruleta");
        BotRuleta.setBorder(null);
        BotRuleta.setBorderPainted(false);
        BotRuleta.setDefaultCapable(false);
        BotRuleta.setFocusPainted(false);
        BotRuleta.setFocusable(false);
        BotRuleta.setRequestFocusEnabled(false);
        BotRuleta.setRolloverEnabled(false);
        BotRuleta.setVerifyInputWhenFocusTarget(false);
        BotRuleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRuletaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(179, 190, 171));
        jLabel2.setText("Ingrese el saldo");

        jTextField1.setBackground(new java.awt.Color(179, 190, 171));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(21, 36, 19));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(null);

        BotSaldo.setBackground(new java.awt.Color(39, 91, 52));
        BotSaldo.setFont(new java.awt.Font("Segoe UI", 3, 29)); // NOI18N
        BotSaldo.setForeground(new java.awt.Color(98, 153, 104));
        BotSaldo.setText("Enter");
        BotSaldo.setBorder(null);
        BotSaldo.setBorderPainted(false);
        BotSaldo.setDefaultCapable(false);
        BotSaldo.setFocusPainted(false);
        BotSaldo.setFocusable(false);
        BotSaldo.setRequestFocusEnabled(false);
        BotSaldo.setRolloverEnabled(false);
        BotSaldo.setVerifyInputWhenFocusTarget(false);
        BotSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(BotCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BotSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(BotSaldo))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCaballoActionPerformed
        while(cab==0)
        {
            GUI_Caballos Caballos = new GUI_Caballos();
            Caballos.setVisible(true); 
            cab++;
        }
    }//GEN-LAST:event_BotCaballoActionPerformed

    private void BotRuletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRuletaActionPerformed
        while(rul==0)
        {
           int saldoI=Integer.parseInt(jTextField1.getText());
           GUI_Ruleta Ruleta = new GUI_Ruleta();
           Ruleta.setVisible(true); 
           rul++;
        }
    }//GEN-LAST:event_BotRuletaActionPerformed

    private void BotSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSaldoActionPerformed
        
    }//GEN-LAST:event_BotSaldoActionPerformed

    public static void main(String args[])
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GUI_Casino().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotCaballo;
    private javax.swing.JButton BotRuleta;
    private javax.swing.JButton BotSaldo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
