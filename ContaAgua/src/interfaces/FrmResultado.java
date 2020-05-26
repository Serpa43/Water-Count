package interfaces;

import classes.Informacoes;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class FrmResultado extends javax.swing.JFrame {
    
    FrmInfo form = new FrmInfo();
    Informacoes infor = form.getInfo();
    double M3 = 0.0;
    
    public Informacoes getInfo() {
        return infor;
    }

    public void setInfo(Informacoes info) {
        this.infor = info;
    }
    
    public FrmResultado() {
        initComponents();
        setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/imgs/pingoAgua.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url).getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        this.setIconImage(iconeTitulo);
    }
    
    public void setarValores(Informacoes infor){
        NumberFormat double_format = new DecimalFormat("##.###");
        lbltotalAgua.setText("R$ " + String.valueOf(double_format.format(infor.getValorAgua())));
        lbltotalEsgoto.setText("R$ " + String.valueOf(double_format.format(infor.getValorEsgoto())));
        lbltotalReais.setText("R$ " + String.valueOf(double_format.format(infor.getValorAgua() + infor.getValorEsgoto())));
        lblM3total.setText(String.valueOf(double_format.format(infor.getTotalm3()) + " m³"));
        M3 = infor.getTotalm3();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Vazamento = new javax.swing.JLabel();
        lblReaisAgua = new javax.swing.JLabel();
        lbltotalAgua = new javax.swing.JLabel();
        lblM3 = new javax.swing.JLabel();
        lblM3total = new javax.swing.JLabel();
        btnProximo1 = new javax.swing.JButton();
        BtnCont = new javax.swing.JButton();
        lblReais = new javax.swing.JLabel();
        lblReaisEsgoto = new javax.swing.JLabel();
        lbltotalReais = new javax.swing.JLabel();
        lbltotalEsgoto = new javax.swing.JLabel();
        btnTabelaPreco = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        Preco = new javax.swing.JLabel();
        lblReaisEsgoto1 = new javax.swing.JLabel();
        CGm3 = new javax.swing.JSpinner();
        Preco2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultado");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vazamento.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        Vazamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Vazamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, 40));

        lblReaisAgua.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblReaisAgua.setText("Tarifas de água");
        jPanel1.add(lblReaisAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 24));

        lbltotalAgua.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lbltotalAgua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbltotalAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 170, 24));

        lblM3.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblM3.setText("Gasto (mês)");
        jPanel1.add(lblM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 24));

        lblM3total.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblM3total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblM3total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, 24));

        btnProximo1.setBackground(new java.awt.Color(255, 255, 255));
        btnProximo1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnProximo1.setText("Reiniciar");
        btnProximo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        BtnCont.setBackground(new java.awt.Color(92, 184, 92));
        BtnCont.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        BtnCont.setText("Verificar");
        BtnCont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        lblReais.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblReais.setForeground(new java.awt.Color(217, 83, 79));
        lblReais.setText("Total em reais");
        jPanel1.add(lblReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 24));

        lblReaisEsgoto.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblReaisEsgoto.setText("M³ da sua conta");
        jPanel1.add(lblReaisEsgoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 24));

        lbltotalReais.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lbltotalReais.setForeground(new java.awt.Color(217, 83, 79));
        lbltotalReais.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbltotalReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, 24));

        lbltotalEsgoto.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lbltotalEsgoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbltotalEsgoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 24));

        btnTabelaPreco.setBackground(new java.awt.Color(2, 117, 216));
        btnTabelaPreco.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnTabelaPreco.setText("Tabela de Preço");
        btnTabelaPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTabelaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaPrecoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTabelaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        btnFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarbtnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        Preco.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        Preco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Preco.setText("Preço estimado");
        jPanel1.add(Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, -1));

        lblReaisEsgoto1.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblReaisEsgoto1.setText("Tarifas de esgoto");
        jPanel1.add(lblReaisEsgoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 24));

        CGm3.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        CGm3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        CGm3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(CGm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, -1));

        Preco2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        Preco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Preco2.setText("Vamos verificar se há vazamento?");
        jPanel1.add(Preco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        this.setVisible(false);
        FrmColetarInfo f = new FrmColetarInfo();
        f.setVisible(true);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        FrmInfo form = new FrmInfo();
        Informacoes infor = form.getInfo();
        if (M3 != 0){
            if(M3 + M3 * 0.2 <= Integer.parseInt(CGm3.getValue().toString())){
                Vazamento.setForeground(new Color(217, 83, 79));
                Vazamento.setText("Há vazamento!");
            }
            else if(M3 + M3 * 0.1 <= Integer.parseInt(CGm3.getValue().toString())){
                Vazamento.setForeground(new Color (240, 173, 78));
                Vazamento.setText("Há um possível vazamento!");
            }
            else{
                Vazamento.setForeground(new Color (92, 184, 92));
                Vazamento.setText("Não há vazamento!");
            }
        } else {
            Vazamento.setForeground(new Color (92, 184, 92));
            Vazamento.setText("Não há vazamento!");
        }
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnTabelaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaPrecoActionPerformed
        //Instanciando a tabela
        TabelaPrecos tabela = new TabelaPrecos(new javax.swing.JFrame(), true);
        tabela.setResizable(false);
        tabela.setVisible(true);
    }//GEN-LAST:event_btnTabelaPrecoActionPerformed

    private void btnFinalizarbtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarbtnFinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinalizarbtnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCont;
    private javax.swing.JSpinner CGm3;
    private javax.swing.JLabel Preco;
    private javax.swing.JLabel Preco2;
    private javax.swing.JLabel Vazamento;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnProximo1;
    private javax.swing.JButton btnTabelaPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblM3;
    private javax.swing.JLabel lblM3total;
    private javax.swing.JLabel lblReais;
    private javax.swing.JLabel lblReaisAgua;
    private javax.swing.JLabel lblReaisEsgoto;
    private javax.swing.JLabel lblReaisEsgoto1;
    private javax.swing.JLabel lbltotalAgua;
    private javax.swing.JLabel lbltotalEsgoto;
    private javax.swing.JLabel lbltotalReais;
    // End of variables declaration//GEN-END:variables
}
