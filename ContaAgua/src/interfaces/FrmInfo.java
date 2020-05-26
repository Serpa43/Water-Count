/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Informacoes;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Erick hayakawa
 */
public class FrmInfo extends javax.swing.JFrame {

    /**
     * Creates new form teste2
     */
    Informacoes info = new Informacoes();
    //double format
    NumberFormat double_format = new DecimalFormat("##.###");

    public Informacoes getInfo() {
        return info;
    }

    public void setInfo(Informacoes info) {
        this.info = info;
    }

    public FrmInfo() {
        initComponents();
        setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/imgs/pingoAgua.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url).getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        this.setIconImage(iconeTitulo);
        escondeComp();
    }

    public void escondeComp() {
        //coloca tds os campos de digitação sem visibilidade para o usuario
        //Chuveiro
        chuveiro.setVisible(false);
        lblChuveiro.setVisible(false);
        //Descarga
        lblDescarga.setVisible(false);
        descarga.setVisible(false);
        //Pia do Banheiro
        lblPiaBanheiro.setVisible(false);
        piaBanheiro.setVisible(false);
        //maquina de lavar Roupa
        maquinaRoupa.setVisible(false);
        lblMaquinaLavarRoupa.setVisible(false);
        //tanque
        lblTanque.setVisible(false);
        TanqueRoupa.setVisible(false);
        //maquina de lavar louça
        lblMaquinaLavarLouca.setVisible(false);
        maquinaLouca.setVisible(false);
        //pia da cozinha
        lblPiaCozinha.setVisible(false);
        piaCozinha.setVisible(false);
        //Calçada
        lblCalcada.setVisible(false);
        calcada.setVisible(false);
        //Carro
        lblCarro.setVisible(false);
        carro.setVisible(false);
        //Plantas
        lblPlantas.setVisible(false);
        plantas.setVisible(false);        
    }

    public void calcularValor() {
        //int metros_cubicos = (int) Math.ceil(info.getTotalm3());
        int metros_cubicos = (int) Math.round(info.getTotalm3());
        
        double[] tarifas = {26.18, 3.65, 5.61, 5.61, 6.71}; //0 a 10     11 a 20     21 a 30          31 a 50        50+
        double[] tarifas_esgoto = {21, 2.88, 4.48, 4.48, 5.34}; //0 a 10 11 a 20     21 a 30          31 a 50        50+
        double subtotal = 0;
        double subtotal_esgoto = 0;
        
        //Calculando o valor total (água)
        if (info.getTotalm3() == 0) {
            subtotal = 0;
        } else if (metros_cubicos <= 10) {
            subtotal += tarifas[0];
        } else if (metros_cubicos <= 20) {
            subtotal += tarifas[0] + tarifas[1]*(metros_cubicos-10);
        } else if (metros_cubicos <= 30) {
            subtotal += tarifas[0] + tarifas[1]*10 + tarifas[2]*(metros_cubicos - 20);
        } else if (metros_cubicos <= 40) {
            subtotal += tarifas[0] + tarifas[1]*10 + tarifas[2]*10 + tarifas[3]*(metros_cubicos-30);
        } else if (metros_cubicos <= 50) {
            subtotal += tarifas[0] + tarifas[1]*10 + tarifas[2]*10 + tarifas[3]*10 + tarifas[3]*(metros_cubicos-40);
        } else if (metros_cubicos > 50) {
            subtotal += tarifas[0] + tarifas[1]*10 + tarifas[2]*10 + tarifas[3]*20 + tarifas[4]*(metros_cubicos-50);
        }
        info.setValorAgua(subtotal);

        //Calculando o valor total (esgoto)
        if (info.getTotalm3() == 0) {
            subtotal_esgoto = 0;
        } else if (metros_cubicos <= 10) {
            subtotal_esgoto += tarifas_esgoto[0];
        } else if (metros_cubicos <= 20) {
            subtotal_esgoto += tarifas_esgoto[0] + tarifas_esgoto[1]*(metros_cubicos-10);
        } else if (metros_cubicos <= 30) {
            subtotal_esgoto += tarifas_esgoto[0] + tarifas_esgoto[1]*10 + tarifas_esgoto[2]*(metros_cubicos - 20);
        } else if (metros_cubicos <= 40) {
            subtotal_esgoto += tarifas_esgoto[0] + tarifas_esgoto[1]*10 + tarifas_esgoto[2]*10 + tarifas_esgoto[3]*(metros_cubicos-30);
        } else if (metros_cubicos <= 50) {
            subtotal_esgoto += tarifas_esgoto[0] + tarifas_esgoto[1]*10 + tarifas_esgoto[2]*10 + tarifas_esgoto[3]*10 + tarifas_esgoto[3]*(metros_cubicos-40);
        } else if (metros_cubicos > 50) {
            subtotal_esgoto += tarifas_esgoto[0] + tarifas_esgoto[1]*10 + tarifas_esgoto[2]*10 + tarifas_esgoto[3]*20 + tarifas_esgoto[4]*(metros_cubicos-50);
        }
        info.setValorEsgoto(subtotal_esgoto);
    }

    public void mostrarValores() {
        info.setTotalLitros();
        info.setTotalm3();
        setLbltotalM(String.valueOf(double_format.format(info.getTotalm3())));
        setLblTotal(String.valueOf(double_format.format(info.getTotalLitros())));
        setLblChuveiro(String.valueOf(double_format.format(info.getChuveiro())));
        setLbldescarga(String.valueOf(double_format.format(info.getPrivada())));
        setLblMaquinaLavarLouca(String.valueOf(double_format.format(info.getMaquinaLavarLouca())));
        setLblMaquinaLavarRoupa(String.valueOf(double_format.format(info.getMaquinaLavarRoupa())));
        setLbltanque(String.valueOf(double_format.format(info.getTanque())));
        setLblPiaBanheiro(String.valueOf(double_format.format(info.getPiaBanheiro())));
        setLblPiaCozinha(String.valueOf(double_format.format(info.getPiaCozinha())));
        setLblCalcada(String.valueOf(double_format.format(info.getCalcada())));
        setLblCarro(String.valueOf(double_format.format(info.getCarro())));
        setLblPlantas(String.valueOf(double_format.format(info.getPlantas())));
    }

    // metodos para setar o valor enviado de litros para cada objeto
    public void setLbltotalM(String lbltotalM) {
        this.lblTotalM3.setText(lbltotalM + " m³");
    }

    public void setLblTotal(String lblTotal) {
        this.lblTotal.setText(lblTotal + " L");
    }

    public void setLblChuveiro(String lblChuveiro) {
        this.lblChuveiro.setText(lblChuveiro + " L");
    }

    public void setLbldescarga(String lbldescarga) {
        this.lblDescarga.setText(lbldescarga + " L");
    }

    public void setLblMaquinaLavarLouca(String lblMaquinaLavarLouca) {
        this.lblMaquinaLavarLouca.setText(lblMaquinaLavarLouca + " L");
    }

    public void setLblMaquinaLavarRoupa(String lblMaquinaLavarRoupa) {
        this.lblMaquinaLavarRoupa.setText(lblMaquinaLavarRoupa + " L");
    }

    public void setLbltanque(String lbltanque) {
        this.lblTanque.setText(lbltanque + " L");
    }

    public void setLblPiaBanheiro(String lblPiaBanheiro) {
        this.lblPiaBanheiro.setText(lblPiaBanheiro + " L");
    }

    public void setLblPiaCozinha(String lblPiaCozinha) {
        this.lblPiaCozinha.setText(lblPiaCozinha + " L");
    }
    
    public void setLblCalcada(String lblCalcada) {
        this.lblCalcada.setText(lblCalcada + " L");
    }
    
    public void setLblCarro(String lblCarro) {
        this.lblCarro.setText(lblCarro + " L");
    }
    
    public void setLblPlantas(String lblPlantas) {
        this.lblPlantas.setText(lblPlantas + " L");
    }

    //metodos utilizados para habilitar a visualização de um objeto ou a não visualização
    public void Chuveiro() {
        chuveiro.setVisible(true);
        lblChuveiro.setVisible(true);
    }

    public void Descarga() {
        lblDescarga.setVisible(true);
        descarga.setVisible(true);
    }

    public void PiaBanheiro() {
        lblPiaBanheiro.setVisible(true);
        piaBanheiro.setVisible(true);
    }

    public void MaquinaLavarRoupa() {
        maquinaRoupa.setVisible(true);
        lblMaquinaLavarRoupa.setVisible(true);
    }

    public void Tanque() {
        lblTanque.setVisible(true);
        TanqueRoupa.setVisible(true);
    }

    public void MaquinaLavarLouca() {
        lblMaquinaLavarLouca.setVisible(true);
        maquinaLouca.setVisible(true);
    }

    public void PiaCozinha() {
        lblPiaCozinha.setVisible(true);
        piaCozinha.setVisible(true);
    }
    
    public void Calcada() {
        lblCalcada.setVisible(true);
        calcada.setVisible(true);
    }
    
    public void Carro() {
        lblCarro.setVisible(true);
        carro.setVisible(true);
    }
    
    public void Plantas() {
        lblPlantas.setVisible(true);
        plantas.setVisible(true);
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
        Quantas = new javax.swing.JLabel();
        chuveiro = new javax.swing.JLabel();
        descarga = new javax.swing.JLabel();
        piaBanheiro = new javax.swing.JLabel();
        maquinaRoupa = new javax.swing.JLabel();
        TanqueRoupa = new javax.swing.JLabel();
        piaCozinha = new javax.swing.JLabel();
        maquinaLouca = new javax.swing.JLabel();
        Proximo = new javax.swing.JButton();
        lblChuveiro = new javax.swing.JLabel();
        lblDescarga = new javax.swing.JLabel();
        lblPiaBanheiro = new javax.swing.JLabel();
        lblMaquinaLavarRoupa = new javax.swing.JLabel();
        lblTanque = new javax.swing.JLabel();
        lblPiaCozinha = new javax.swing.JLabel();
        lblMaquinaLavarLouca = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        TotalM = new javax.swing.JLabel();
        lblTotalM3 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        calcada = new javax.swing.JLabel();
        carro = new javax.swing.JLabel();
        plantas = new javax.swing.JLabel();
        lblCalcada = new javax.swing.JLabel();
        lblCarro = new javax.swing.JLabel();
        lblPlantas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Total de água gasto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Quantas.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        Quantas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Quantas.setText("Gasto mensal");
        jPanel1.add(Quantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 375, -1));

        chuveiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        chuveiro.setText("Chuveiro");
        jPanel1.add(chuveiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        descarga.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        descarga.setText("Descarga");
        jPanel1.add(descarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        piaBanheiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        piaBanheiro.setText("Pia do banheiro");
        jPanel1.add(piaBanheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        maquinaRoupa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        maquinaRoupa.setText("Máquina de lavar roupa");
        jPanel1.add(maquinaRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        TanqueRoupa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        TanqueRoupa.setText("Tanque de lavar roupa");
        jPanel1.add(TanqueRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        piaCozinha.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        piaCozinha.setText("Pia da cozinha");
        jPanel1.add(piaCozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        maquinaLouca.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        maquinaLouca.setText("Máquina de lavar louça");
        jPanel1.add(maquinaLouca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Proximo.setBackground(new java.awt.Color(255, 255, 255));
        Proximo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Proximo.setText("Próximo");
        Proximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });
        jPanel1.add(Proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        lblChuveiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblChuveiro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblChuveiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, 16));

        lblDescarga.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblDescarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblDescarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 160, 16));

        lblPiaBanheiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblPiaBanheiro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblPiaBanheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 16));

        lblMaquinaLavarRoupa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblMaquinaLavarRoupa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblMaquinaLavarRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, 16));

        lblTanque.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblTanque.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 160, 16));

        lblPiaCozinha.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblPiaCozinha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblPiaCozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 16));

        lblMaquinaLavarLouca.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblMaquinaLavarLouca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblMaquinaLavarLouca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 160, 16));

        Total.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Total.setText("TOTAL em Litros");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblTotal.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 180, 16));

        TotalM.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        TotalM.setText("TOTAL em M³");
        jPanel1.add(TotalM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        lblTotalM3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblTotalM3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblTotalM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 180, 16));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        calcada.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        calcada.setText("Lavar calçada");
        jPanel1.add(calcada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        carro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        carro.setText("Lavar o carro");
        jPanel1.add(carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        plantas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        plantas.setText("Regar plantas");
        jPanel1.add(plantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lblCalcada.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblCalcada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblCalcada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 16));

        lblCarro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblCarro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 160, 16));

        lblPlantas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblPlantas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 160, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
        this.setVisible(false);
        calcularValor();
        FrmResultado form = new FrmResultado();//instancia o Jframe3
        form.setarValores(info);
        form.setVisible(true);//deixa visivel o 3º JFrame
    }//GEN-LAST:event_ProximoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        FrmColetarInfo f = new FrmColetarInfo();
        f.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proximo;
    private javax.swing.JLabel Quantas;
    private javax.swing.JLabel TanqueRoupa;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalM;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel calcada;
    private javax.swing.JLabel carro;
    private javax.swing.JLabel chuveiro;
    private javax.swing.JLabel descarga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCalcada;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblChuveiro;
    private javax.swing.JLabel lblDescarga;
    private javax.swing.JLabel lblMaquinaLavarLouca;
    private javax.swing.JLabel lblMaquinaLavarRoupa;
    private javax.swing.JLabel lblPiaBanheiro;
    private javax.swing.JLabel lblPiaCozinha;
    private javax.swing.JLabel lblPlantas;
    private javax.swing.JLabel lblTanque;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalM3;
    private javax.swing.JLabel maquinaLouca;
    private javax.swing.JLabel maquinaRoupa;
    private javax.swing.JLabel piaBanheiro;
    private javax.swing.JLabel piaCozinha;
    private javax.swing.JLabel plantas;
    // End of variables declaration//GEN-END:variables
}
