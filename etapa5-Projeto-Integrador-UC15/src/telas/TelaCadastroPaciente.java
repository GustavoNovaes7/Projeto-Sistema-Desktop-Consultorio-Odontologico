package telas;

import classes.Convenio;
import classes.ConvenioDAO;
import classes.Paciente;
import classes.PacienteDAO;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Tela aonde será digitado os valores para a criação e cadstro de um novo
 * Paciente.
 */
public class TelaCadastroPaciente extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;

    public void MostraTela(TelaPrincipal obj) {
        this.telaPrincipal = obj;
        setVisible(true);
    }

    public TelaCadastroPaciente() {
        initComponents();
        txtNomeIndicacao.setEnabled(false);
        preencheComboBoxConvenios();
        geraAcessibilidade();
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
        lblCadastroPaciente = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblConvenio = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblIndicacao = new javax.swing.JLabel();
        cbIndicacao = new javax.swing.JComboBox<>();
        lblNomeIndicacao = new javax.swing.JLabel();
        txtNomeIndicacao = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        cbConvenio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SICODON");

        jPanel1.setBackground(new java.awt.Color(239, 235, 235));

        lblCadastroPaciente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastroPaciente.setText("Cadastro de Paciente");

        btnCadastrar.setBackground(new java.awt.Color(30, 48, 112));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(30, 48, 112));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xis_.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome:");

        lblNascimento.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblNascimento.setLabelFor(txtNascimento);
        lblNascimento.setText("Nascimento:");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblCpf.setLabelFor(txtCpf);
        lblCpf.setText("CPF:");

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblEndereco.setLabelFor(txtEndereco);
        lblEndereco.setText("Endereço:");

        txtEndereco.setBackground(new java.awt.Color(199, 199, 199));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtEndereco.setNextFocusableComponent(txtTelefone);

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblTelefone.setLabelFor(txtTelefone);
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblEmail.setLabelFor(txtEmail);
        lblEmail.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(199, 199, 199));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtEmail.setNextFocusableComponent(txtRg);

        lblRg.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblRg.setLabelFor(txtRg);
        lblRg.setText("RG:");

        txtRg.setBackground(new java.awt.Color(199, 199, 199));
        txtRg.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtRg.setNextFocusableComponent(cbConvenio);

        txtNascimento.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNascimento.setNextFocusableComponent(txtCpf);

        txtCpf.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtCpf.setNextFocusableComponent(txtEndereco);

        txtTelefone.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTelefone.setNextFocusableComponent(txtEmail);

        lblConvenio.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblConvenio.setLabelFor(cbConvenio);
        lblConvenio.setText("Convênio:");

        txtNome.setBackground(new java.awt.Color(199, 199, 199));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNome.setNextFocusableComponent(txtNascimento);

        lblIndicacao.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblIndicacao.setLabelFor(cbIndicacao);
        lblIndicacao.setText("Indicação:");

        cbIndicacao.setBackground(new java.awt.Color(199, 199, 199));
        cbIndicacao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbIndicacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Conhecido(a)", "Panfleto", "Internet" }));
        cbIndicacao.setNextFocusableComponent(txtNomeIndicacao);
        cbIndicacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIndicacaoItemStateChanged(evt);
            }
        });

        lblNomeIndicacao.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblNomeIndicacao.setLabelFor(txtNomeIndicacao);
        lblNomeIndicacao.setText("Nome Indicação:");

        txtNomeIndicacao.setBackground(new java.awt.Color(199, 199, 199));
        txtNomeIndicacao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNomeIndicacao.setNextFocusableComponent(txtObservacoes);
        txtNomeIndicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeIndicacaoActionPerformed(evt);
            }
        });

        lblObservacoes.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblObservacoes.setLabelFor(txtObservacoes);
        lblObservacoes.setText("Observações:");

        txtObservacoes.setBackground(new java.awt.Color(199, 199, 199));
        txtObservacoes.setColumns(20);
        txtObservacoes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtObservacoes.setRows(5);
        txtObservacoes.setNextFocusableComponent(btnCadastrar);
        jScrollPane1.setViewportView(txtObservacoes);

        cbConvenio.setBackground(new java.awt.Color(199, 199, 199));
        cbConvenio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A" }));
        cbConvenio.setNextFocusableComponent(cbIndicacao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNascimento)
                                .addGap(35, 35, 35)
                                .addComponent(txtNascimento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCadastroPaciente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCpf)
                                            .addComponent(lblEndereco)
                                            .addComponent(lblNome)
                                            .addComponent(lblTelefone)
                                            .addComponent(lblEmail)
                                            .addComponent(lblRg))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEndereco)
                                                .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblConvenio)
                            .addComponent(lblIndicacao)
                            .addComponent(lblNomeIndicacao)
                            .addComponent(lblObservacoes))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbIndicacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeIndicacao)
                            .addComponent(jScrollPane1)
                            .addComponent(cbConvenio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCadastroPaciente)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNascimento)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConvenio)
                            .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIndicacao)
                            .addComponent(cbIndicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeIndicacao)
                            .addComponent(txtNomeIndicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservacoes))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRg)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastraPaciente();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNomeIndicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeIndicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeIndicacaoActionPerformed

    private void cbIndicacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIndicacaoItemStateChanged
        txtNomeIndicacao.setText("");
        if (cbIndicacao.getSelectedItem() == "Conhecido(a)") {
            txtNomeIndicacao.setEnabled(true);
        } else {
            txtNomeIndicacao.setEnabled(false);
        }
    }//GEN-LAST:event_cbIndicacaoItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbConvenio;
    private javax.swing.JComboBox<String> cbIndicacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastroPaciente;
    private javax.swing.JLabel lblConvenio;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIndicacao;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeIndicacao;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeIndicacao;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /**
     * Realiza o cadastro de paciente, integrando o método 'conectar' da classe
     * DentistaDAO
     */
    public void cadastraPaciente() {
        if (txtNome.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtCpf.getText().isEmpty() || txtNascimento.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtEmail.getText().isEmpty() || txtRg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Os campos, Nome, Nascimento, CPF, Endereço, Telefone, Email e RG precisam ser preenchidos.");
        } else {
            try {
                Paciente paciente = new Paciente();
                PacienteDAO pacDao = new PacienteDAO();
                ConvenioDAO conDao = new ConvenioDAO();
                boolean status;
                int resposta;
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                String dataRecebida = txtNascimento.getText();

                paciente.setNome(txtNome.getText());
                try {
                    try {
                        Date dataConvertida = formatador.parse(dataRecebida);
                        java.sql.Date sqlDate = new java.sql.Date(dataConvertida.getTime());
                        paciente.setNascimento(sqlDate);
                    } catch (DateTimeParseException exc) {
                        JOptionPane.showMessageDialog(null, "Erro: Dia e/ou Mês inválido(s).\nDigite uma data válida.");
                    }
                } catch (ParseException exc) {
                    JOptionPane.showMessageDialog(null, "Erro na conversão de data.");
                }
                paciente.setCpf(txtCpf.getText());
                paciente.setRg(txtRg.getText());
                paciente.setEndereco(txtEndereco.getText());
                paciente.setTelefone(txtTelefone.getText());
                paciente.setEmail(txtEmail.getText());
                paciente.setIndicacao(String.valueOf(cbIndicacao.getSelectedItem()));
                paciente.setNomeIndicacao(txtNomeIndicacao.getText());
                paciente.setObservacoes(txtObservacoes.getText());
                if (cbConvenio.getSelectedItem() == "N/A") {
                    paciente.setConvenio(null);
                } else {
                    paciente.setConvenio(conDao.retornaConvenio(String.valueOf(cbConvenio.getSelectedItem())));
                }

                status = pacDao.conectar();
                if (status == false) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão.");
                } else {
                    resposta = pacDao.salvar(paciente);
                    switch (resposta) {
                        case 1:
                            telaPrincipal.atualizaTabelaPaciente();
                            JOptionPane.showMessageDialog(null, "Cadastro de paciente efetuado com sucesso.");
                            break;
                        case 1062:
                            JOptionPane.showMessageDialog(null, "Paciente já foi cadastrado.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar dado.");
                            break;
                    }
                    conDao.desconectar();
                    pacDao.desconectar();
                    dispose();
                }
            } catch (DateTimeParseException exc) {
                JOptionPane.showMessageDialog(null, "Erro: Dia e/ou Mês inválido(s).\nDigite uma data válida.");
            }
        }
    }

    /**
     * Preenche a ComboBox com o nome dos convênios contidos no Banco de Dados
     */
    public void preencheComboBoxConvenios() {
        ConvenioDAO dao = new ConvenioDAO();
        String nomeConvenio;
        List<Convenio> listaConvenios = dao.listar();
        for (Convenio c : listaConvenios) {
            nomeConvenio = c.getNome();
            cbConvenio.addItem(nomeConvenio);
        }
        dao.desconectar();
    }

    /**
     * Gera atalho de teclas para determinados comandos
     */
    public void geraAcessibilidade() {
        btnCadastrar.setMnemonic(KeyEvent.VK_D);
        btnCancelar.setMnemonic(KeyEvent.VK_C);
    }
}