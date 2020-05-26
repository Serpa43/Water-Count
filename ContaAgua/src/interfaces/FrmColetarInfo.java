package interfaces;

import classes.Informacoes;
import classes.Negativo;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class FrmColetarInfo extends javax.swing.JFrame {

    FrmInfo form = new FrmInfo();
    Informacoes infor = form.getInfo();
    //public boolean negat = false;
    public boolean flag_chuveiro = false;

    public FrmColetarInfo() {
        initComponents();
        setLocationRelativeTo(null);
        ocultar();
        URL url = this.getClass().getResource("/imgs/pingoAgua.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url).getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        this.setIconImage(iconeTitulo);
    }

    public final void limpar() {
        txtPessoas.setValue(0);
        txtChuveiroCasa.setValue(0);
        txtChuveiroApartamento.setValue(0);
        txtMaquinaLavarRoupa.setValue(0);
        txtDescarga.setValue(0);
        txtTanqueLavar.setValue(0);
        txtPiaBanheiro.setValue(0);
        txtPiaCozinha.setValue(0);
        txtMaquinaLavarLouca.setValue(0);
        txtCalcada.setValue(0);
        txtCarro.setValue(0);
        txtPlantas.setValue(0);
        chuveiro.setSelected(false);
        rbnAp.setSelected(false);
        rbnCasa.setSelected(false);
        Descarga.setSelected(false);
        PiaBanheiro.setSelected(false);
        maquinaRoupa.setSelected(false);
        tanqueRoupa.setSelected(false);
        piaCozinha.setSelected(false);
        maquinaLouca.setSelected(false);
        calcada.setSelected(false);
        carro.setSelected(false);
        plantas.setSelected(false);
        ocultar();
    }

    public final void ocultar() {
        rbnCasa.setVisible(false);
        rbnAp.setVisible(false);
        txtChuveiroApartamento.setVisible(false);
        txtChuveiroCasa.setVisible(false);
        txtMaquinaLavarLouca.setVisible(false);
        txtDescarga.setVisible(false);
        txtMaquinaLavarRoupa.setVisible(false);
        txtPiaCozinha.setVisible(false);
        txtPiaBanheiro.setVisible(false);
        txtTanqueLavar.setVisible(false);
        txtCalcada.setVisible(false);
        txtCarro.setVisible(false);
        txtPlantas.setVisible(false);
    }

    /* public void verificaNegativo(int valor) {
        if (valor <= 0) {
            negat = true;
        }
    } */

    public void verificaInfo() {
        infor.setPessoas(Integer.parseInt(txtPessoas.getValue().toString()));
        if (chuveiro.isSelected()) {
            form.Chuveiro();//faz aparecer no Jframe2 o campo chuveiro
            if (rbnCasa.isSelected()) {
                flag_chuveiro = true;
                int casa = Integer.parseInt(txtChuveiroCasa.getValue().toString());
                //verificaNegativo(casa);
                infor.setChuveiro(infor.calcularChuveiroCasa(casa));
            } else if (rbnAp.isSelected()){
                flag_chuveiro = true;
                int ap = Integer.parseInt(txtChuveiroApartamento.getValue().toString());
                //verificaNegativo(ap);
                infor.setChuveiro(infor.calcularChuveiroApartamento(ap));
            }
        }
        if (Descarga.isSelected()) {
            form.Descarga();//faz aparecer no Jframe2 o campo privada/descarga
            int descarga = Integer.parseInt(txtDescarga.getValue().toString());
            //verificaNegativo(descarga);
            infor.setPrivada(infor.calcularPrivada(descarga));
        }
        if (PiaBanheiro.isSelected()) {
            form.PiaBanheiro();//faz aparecer no Jframe2 o campo pia do banheiro
            int piaB = Integer.parseInt(txtPiaBanheiro.getValue().toString());
            //verificaNegativo(piaB);
            infor.setPiaBanheiro(infor.calcularPiaBanheiro(piaB));
        }
        if (maquinaRoupa.isSelected()) {
            form.MaquinaLavarRoupa();//faz aparecer no Jframe2 o campo maquina de lavar roupa
            int maquinaLavarRoupa = Integer.parseInt(txtMaquinaLavarRoupa.getValue().toString());
            //verificaNegativo(maquinaL);
            infor.setMaquinaLavarRoupa(infor.calcularMaquinaLavarRoupa(maquinaLavarRoupa));
        }
        if (tanqueRoupa.isSelected()) {
            form.Tanque();//faz aparecer no Jframe2 o campo tanque
            int tanque = Integer.parseInt(txtTanqueLavar.getValue().toString());
            //verificaNegativo(tanque);
            infor.setTanque(infor.calcularTanque(tanque));
        }
        if (piaCozinha.isSelected()) {
            form.PiaCozinha();//faz aparecer no Jframe2 o campo pia da cozinha
            int piaC = Integer.parseInt(txtPiaCozinha.getValue().toString());
            //verificaNegativo(piaC);
            infor.setPiaCozinha(infor.calcularPiaCozinha(piaC));
        }
        if (maquinaLouca.isSelected()) {
            form.MaquinaLavarLouca();//faz aparecer no Jframe2 o campo maquina de louça
            int maquinaLavarLouca = Integer.parseInt(txtMaquinaLavarLouca.getValue().toString());
            //verificaNegativo(maquinaL);
            infor.setMaquinaLavarLouca(infor.calcularMaquinaLavarLouca(maquinaLavarLouca));
        }
        if (calcada.isSelected()) {
            form.Calcada();//faz aparecer no Jframe2 o campo calcada
            int calc = Integer.parseInt(txtCalcada.getValue().toString());
            infor.setCalcada(infor.calcularCalcada(calc));
        }
        if (carro.isSelected()) {
            form.Carro();//faz aparecer no Jframe2 o campo carro
            int car = Integer.parseInt(txtCarro.getValue().toString());
            infor.setCarro(infor.calcularCarro(car));
        }
        if (plantas.isSelected()) {
            form.Plantas();//faz aparecer no Jframe2 o campo plantas
            int plants = Integer.parseInt(txtPlantas.getValue().toString());
            infor.setPlantas(infor.calcularPlantas(plants));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        Selecione = new javax.swing.JLabel();
        chuveiro = new javax.swing.JCheckBox();
        Descarga = new javax.swing.JCheckBox();
        PiaBanheiro = new javax.swing.JCheckBox();
        maquinaRoupa = new javax.swing.JCheckBox();
        tanqueRoupa = new javax.swing.JCheckBox();
        piaCozinha = new javax.swing.JCheckBox();
        maquinaLouca = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        lblPessoas = new javax.swing.JLabel();
        txtDescarga = new javax.swing.JSpinner();
        btnLimpar = new javax.swing.JButton();
        lblQtdPessoa = new javax.swing.JLabel();
        rbnAp = new javax.swing.JRadioButton();
        rbnCasa = new javax.swing.JRadioButton();
        btnProximo = new javax.swing.JButton();
        txtPessoas = new javax.swing.JSpinner();
        txtChuveiroCasa = new javax.swing.JSpinner();
        txtChuveiroApartamento = new javax.swing.JSpinner();
        txtPiaBanheiro = new javax.swing.JSpinner();
        txtMaquinaLavarRoupa = new javax.swing.JSpinner();
        txtTanqueLavar = new javax.swing.JSpinner();
        txtPiaCozinha = new javax.swing.JSpinner();
        txtMaquinaLavarLouca = new javax.swing.JSpinner();
        btnTabelaPreco = new javax.swing.JButton();
        calcada = new javax.swing.JCheckBox();
        plantas = new javax.swing.JCheckBox();
        txtCalcada = new javax.swing.JSpinner();
        txtPlantas = new javax.swing.JSpinner();
        carro = new javax.swing.JCheckBox();
        txtCarro = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coletando Informações");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Vamos verificar quanto você gasta?");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 470, -1));

        Selecione.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        Selecione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selecione.setText("Indique a quantidade utilizada diariamente");
        jPanel1.add(Selecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, -1));

        chuveiro.setBackground(new java.awt.Color(173, 216, 230));
        chuveiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        chuveiro.setText("Chuveiro (Minutos)");
        chuveiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chuveiroItemStateChanged(evt);
            }
        });
        chuveiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuveiroActionPerformed(evt);
            }
        });
        jPanel1.add(chuveiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        Descarga.setBackground(new java.awt.Color(173, 216, 230));
        Descarga.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Descarga.setActionCommand("Descarga (Vezes)");
        Descarga.setLabel("Descarga (Vezes)");
        Descarga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DescargaItemStateChanged(evt);
            }
        });
        jPanel1.add(Descarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        PiaBanheiro.setBackground(new java.awt.Color(173, 216, 230));
        PiaBanheiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        PiaBanheiro.setText("Pia do banheiro (Minutos)");
        PiaBanheiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PiaBanheiroItemStateChanged(evt);
            }
        });
        jPanel1.add(PiaBanheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        maquinaRoupa.setBackground(new java.awt.Color(173, 216, 230));
        maquinaRoupa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        maquinaRoupa.setText("Máquina de lavar roupa (Vezes)");
        maquinaRoupa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maquinaRoupaItemStateChanged(evt);
            }
        });
        jPanel1.add(maquinaRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        tanqueRoupa.setBackground(new java.awt.Color(173, 216, 230));
        tanqueRoupa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        tanqueRoupa.setText("Tanque de lavar roupa (Minutos)");
        tanqueRoupa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tanqueRoupaItemStateChanged(evt);
            }
        });
        jPanel1.add(tanqueRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        piaCozinha.setBackground(new java.awt.Color(173, 216, 230));
        piaCozinha.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        piaCozinha.setText("Pia da cozinha (Minutos)");
        piaCozinha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                piaCozinhaItemStateChanged(evt);
            }
        });
        jPanel1.add(piaCozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        maquinaLouca.setBackground(new java.awt.Color(173, 216, 230));
        maquinaLouca.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        maquinaLouca.setLabel("Máquina de lavar louça (Vezes)");
        maquinaLouca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maquinaLoucaItemStateChanged(evt);
            }
        });
        jPanel1.add(maquinaLouca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, -1, -1));

        lblPessoas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 89, -1));

        txtDescarga.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtDescarga.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtDescarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 80, -1));

        btnLimpar.setBackground(new java.awt.Color(247, 247, 247));
        btnLimpar.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        lblQtdPessoa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblQtdPessoa.setText("Quantidade de pessoas");
        jPanel1.add(lblQtdPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        lblQtdPessoa.setVisible(false);

        rbnAp.setBackground(new java.awt.Color(173, 216, 230));
        rbnAp.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        rbnAp.setText("Apartamento");
        rbnAp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnApItemStateChanged(evt);
            }
        });
        rbnAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnApActionPerformed(evt);
            }
        });
        jPanel1.add(rbnAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        rbnCasa.setBackground(new java.awt.Color(173, 216, 230));
        rbnCasa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        rbnCasa.setText("Casa");
        rbnCasa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnCasaItemStateChanged(evt);
            }
        });
        rbnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnCasaActionPerformed(evt);
            }
        });
        jPanel1.add(rbnCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btnProximo.setBackground(new java.awt.Color(255, 255, 255));
        btnProximo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, -1));

        txtPessoas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtPessoas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, -1));
        txtPessoas.setVisible(false);

        txtChuveiroCasa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtChuveiroCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtChuveiroCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 80, -1));

        txtChuveiroApartamento.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtChuveiroApartamento.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtChuveiroApartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 80, -1));

        txtPiaBanheiro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtPiaBanheiro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtPiaBanheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 80, -1));

        txtMaquinaLavarRoupa.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtMaquinaLavarRoupa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtMaquinaLavarRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 80, -1));

        txtTanqueLavar.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtTanqueLavar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtTanqueLavar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 80, -1));

        txtPiaCozinha.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtPiaCozinha.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtPiaCozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 80, -1));

        txtMaquinaLavarLouca.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtMaquinaLavarLouca.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtMaquinaLavarLouca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 80, -1));

        btnTabelaPreco.setBackground(new java.awt.Color(2, 117, 216));
        btnTabelaPreco.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnTabelaPreco.setText("Tabela de Preço");
        btnTabelaPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTabelaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaPrecoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTabelaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        calcada.setBackground(new java.awt.Color(173, 216, 230));
        calcada.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        calcada.setText("Lavar calçada (Minutos)");
        calcada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                calcadaItemStateChanged(evt);
            }
        });
        jPanel1.add(calcada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        plantas.setBackground(new java.awt.Color(173, 216, 230));
        plantas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        plantas.setText("Regar plantas (Minutos)");
        plantas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                plantasItemStateChanged(evt);
            }
        });
        jPanel1.add(plantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        txtCalcada.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtCalcada.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtCalcada, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 80, -1));

        txtPlantas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtPlantas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 80, -1));

        carro.setBackground(new java.awt.Color(173, 216, 230));
        carro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        carro.setText("Lavar o carro (Minutos)");
        carro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                carroItemStateChanged(evt);
            }
        });
        jPanel1.add(carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        txtCarro.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtCarro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chuveiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuveiroActionPerformed

    }//GEN-LAST:event_chuveiroActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        FrmIniciar f = new FrmIniciar();
        f.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /*
        A partir desta parte são metodos gerados pelo proprio netbeans. Que possiblita a mudança de algo se ocorer alguma modficação na checkBox.
        Isso permitiu que eu pudesse dar mais interação com o usuario fazendo aparecer e desaparecer os campos de digitação.
    
        setVisible é o comando que permite essa aparição do campo de texto.
     */

    private void chuveiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chuveiroItemStateChanged
        if (chuveiro.isSelected()) {
            rbnCasa.setVisible(true);
            rbnAp.setVisible(true);
        } else {
            rbnCasa.setVisible(false);
            rbnAp.setVisible(false);
            txtChuveiroApartamento.setVisible(false);
            txtChuveiroCasa.setVisible(false);
        }
    }//GEN-LAST:event_chuveiroItemStateChanged

    private void DescargaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DescargaItemStateChanged
        if (Descarga.isSelected()) {
            txtDescarga.setVisible(true);
        } else {
            txtDescarga.setVisible(false);
        }
    }//GEN-LAST:event_DescargaItemStateChanged

    private void PiaBanheiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PiaBanheiroItemStateChanged
        if (PiaBanheiro.isSelected()) {
            txtPiaBanheiro.setVisible(true);
        } else {
            txtPiaBanheiro.setVisible(false);
        }
    }//GEN-LAST:event_PiaBanheiroItemStateChanged

    private void maquinaRoupaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maquinaRoupaItemStateChanged
        if (maquinaRoupa.isSelected()) {
            txtMaquinaLavarRoupa.setVisible(true);
        } else {
            txtMaquinaLavarRoupa.setVisible(false);
        }
    }//GEN-LAST:event_maquinaRoupaItemStateChanged

    private void tanqueRoupaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tanqueRoupaItemStateChanged
        if (tanqueRoupa.isSelected()) {
            txtTanqueLavar.setVisible(true);
        } else {
            txtTanqueLavar.setVisible(false);
        }
    }//GEN-LAST:event_tanqueRoupaItemStateChanged

    private void piaCozinhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_piaCozinhaItemStateChanged
        if (piaCozinha.isSelected()) {
            txtPiaCozinha.setVisible(true);
        } else {
            txtPiaCozinha.setVisible(false);
        }
    }//GEN-LAST:event_piaCozinhaItemStateChanged

    private void maquinaLoucaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maquinaLoucaItemStateChanged
        if (maquinaLouca.isSelected()) {
            txtMaquinaLavarLouca.setVisible(true);
        } else {
            txtMaquinaLavarLouca.setVisible(false);
        }
    }//GEN-LAST:event_maquinaLoucaItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void rbnCasaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnCasaItemStateChanged
        if (rbnCasa.isSelected()) {
            txtChuveiroCasa.setVisible(true);
        } else {
            txtChuveiroCasa.setVisible(false);
        }
    }//GEN-LAST:event_rbnCasaItemStateChanged

    private void rbnApItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnApItemStateChanged
        if (rbnAp.isSelected()) {
            txtChuveiroApartamento.setVisible(true);
        } else {
            txtChuveiroApartamento.setVisible(false);
        }
    }//GEN-LAST:event_rbnApItemStateChanged

    private void rbnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnCasaActionPerformed
        rbnAp.setSelected(false);
    }//GEN-LAST:event_rbnCasaActionPerformed

    private void rbnApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnApActionPerformed
        rbnCasa.setSelected(false);
    }//GEN-LAST:event_rbnApActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        //int pessoa = Integer.parseInt(txtPessoas.getValue().toString());
        //verificaNegativo(pessoa);
        verificaInfo();
        try {
            /*if (negat) {
                negat = false;
                throw new Negativo();
            }*/
            //Verifica se o user selecionou casa ou ap ao escolher a opção chuveiro
            if (chuveiro.isSelected() && !flag_chuveiro) {
                //flag_chuveiro = false;
                throw new Negativo();
            } else {
                this.setVisible(false);
                form.mostrarValores();
                form.setVisible(true);
            }
        } catch (Negativo e) {
            //JOptionPane.showMessageDialog(null, "Favor verificar as informações, possuem dados negativos ou zerados!", "Erro de dados!", ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Selecione uma das opções fornecidas (casa ou apartamento)!", "Erro na seleção!", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnTabelaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaPrecoActionPerformed
        //Instanciando a tabela
        TabelaPrecos tabela = new TabelaPrecos(new javax.swing.JFrame(), true);
        tabela.setResizable(false);
        tabela.setVisible(true);
    }//GEN-LAST:event_btnTabelaPrecoActionPerformed

    private void calcadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_calcadaItemStateChanged
        if (calcada.isSelected()) {
            txtCalcada.setVisible(true);
        } else {
            txtCalcada.setVisible(false);
        }
    }//GEN-LAST:event_calcadaItemStateChanged

    private void carroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_carroItemStateChanged
        if (carro.isSelected()) {
            txtCarro.setVisible(true);
        } else {
            txtCarro.setVisible(false);
        }
    }//GEN-LAST:event_carroItemStateChanged

    private void plantasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_plantasItemStateChanged
        if (plantas.isSelected()) {
            txtPlantas.setVisible(true);
        } else {
            txtPlantas.setVisible(false);
        }
    }//GEN-LAST:event_plantasItemStateChanged

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
            for (javax.swing.UIManager.LookAndFeelInfo infor : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(infor.getName())) {
                    javax.swing.UIManager.setLookAndFeel(infor.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmColetarInfo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Descarga;
    private javax.swing.JCheckBox PiaBanheiro;
    private javax.swing.JLabel Selecione;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnTabelaPreco;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox calcada;
    private javax.swing.JCheckBox carro;
    private javax.swing.JCheckBox chuveiro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPessoas;
    private javax.swing.JLabel lblQtdPessoa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JCheckBox maquinaLouca;
    private javax.swing.JCheckBox maquinaRoupa;
    private javax.swing.JCheckBox piaCozinha;
    private javax.swing.JCheckBox plantas;
    private javax.swing.JRadioButton rbnAp;
    private javax.swing.JRadioButton rbnCasa;
    private javax.swing.JCheckBox tanqueRoupa;
    private javax.swing.JSpinner txtCalcada;
    private javax.swing.JSpinner txtCarro;
    private javax.swing.JSpinner txtChuveiroApartamento;
    private javax.swing.JSpinner txtChuveiroCasa;
    private javax.swing.JSpinner txtDescarga;
    private javax.swing.JSpinner txtMaquinaLavarLouca;
    private javax.swing.JSpinner txtMaquinaLavarRoupa;
    private javax.swing.JSpinner txtPessoas;
    private javax.swing.JSpinner txtPiaBanheiro;
    private javax.swing.JSpinner txtPiaCozinha;
    private javax.swing.JSpinner txtPlantas;
    private javax.swing.JSpinner txtTanqueLavar;
    // End of variables declaration//GEN-END:variables
}
