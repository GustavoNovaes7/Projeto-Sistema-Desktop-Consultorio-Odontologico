package telas;

import classes.Auxiliar;
import classes.AuxiliarDAO;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;

/**Tela aonde será digitado os valores para a criação e cadstro de um novo Auxiliar.*/
public class TelaCadastroAuxiliar extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;

    public void MostraTela(TelaPrincipal obj) {
        this.telaPrincipal = obj;
        setVisible(true);
    }

    /**
     * Construtor que inicia os comandos da tela e preenche a tabela com
     * informações do Banco de Dados.
     */
    public TelaCadastroAuxiliar() {
        initComponents();
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
        lblCadastroAuxiliar = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUfCro = new javax.swing.JLabel();
        lblCro = new javax.swing.JLabel();
        txtCro = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtUfCro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SICODON");

        jPanel1.setBackground(new java.awt.Color(239, 235, 235));

        lblCadastroAuxiliar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastroAuxiliar.setText("Cadastro de Auxiliar");

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

        txtNome.setBackground(new java.awt.Color(199, 199, 199));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

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

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblTelefone.setLabelFor(lblTelefone);
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblEmail.setLabelFor(txtEmail);
        lblEmail.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(199, 199, 199));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        lblUfCro.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblUfCro.setLabelFor(lblUfCro);
        lblUfCro.setText("UF (CRO):");

        lblCro.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblCro.setLabelFor(txtCro);
        lblCro.setText("CRO:");

        txtCro.setBackground(new java.awt.Color(199, 199, 199));
        txtCro.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtNascimento.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtCpf.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtTelefone.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtUfCro.setBackground(new java.awt.Color(199, 199, 199));
        try {
            txtUfCro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUfCro.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNascimento)
                            .addComponent(lblCpf)
                            .addComponent(lblEndereco)
                            .addComponent(lblNome)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail)
                            .addComponent(lblUfCro)
                            .addComponent(lblCro))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEndereco)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNascimento)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUfCro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCadastroAuxiliar))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCadastroAuxiliar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascimento)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUfCro)
                    .addComponent(txtUfCro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCro)
                    .addComponent(txtCro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastraAuxiliar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAuxiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastroAuxiliar;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCro;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUfCro;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtCro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtUfCro;
    // End of variables declaration//GEN-END:variables

    /**
     * Realiza o cadastro de dentista, integrando o método 'conectar' da classe
     * DentistaDAO
     */
    public void cadastraAuxiliar() {
        if (txtNome.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtCpf.getText().isEmpty() || txtNascimento.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtEmail.getText().isEmpty() || txtUfCro.getText().isEmpty() || txtCro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos.");
        } else {
            try {
                Auxiliar auxiliar = new Auxiliar();
                AuxiliarDAO dao = new AuxiliarDAO();
                boolean status;
                int resposta;
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                String dataRecebida = txtNascimento.getText();

                auxiliar.setNome(txtNome.getText());
                try {
                    try {
                        Date dataConvertida = formatador.parse(dataRecebida);
                        java.sql.Date sqlDate = new java.sql.Date(dataConvertida.getTime());
                        auxiliar.setNascimento(sqlDate);
                    } catch (DateTimeParseException exc) {
                        JOptionPane.showMessageDialog(null, "Erro: Dia e/ou Mês inválido(s).\nDigite uma data válida.");
                    }
                } catch (ParseException exc) {
                    JOptionPane.showMessageDialog(null, "Erro na conversão de data.");
                }
                auxiliar.setCpf(txtCpf.getText());
                auxiliar.setUfCro(txtUfCro.getText());
                auxiliar.setCro(txtCro.getText());
                auxiliar.setEndereco(txtEndereco.getText());
                auxiliar.setTelefone(txtTelefone.getText());
                auxiliar.setEmail(txtEmail.getText());

                status = dao.conectar();
                if (status == false) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão.");
                } else {
                    resposta = dao.salvar(auxiliar);
                    switch (resposta) {
                        case 1:
                            telaPrincipal.atualizaTabelaAuxiliar();
                            JOptionPane.showMessageDialog(null, "Cadastro de auxiliar efetuado com sucesso.");
                            break;
                        case 1062:
                            JOptionPane.showMessageDialog(null, "Auxiliar já foi cadastrado.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar dado.");
                            break;
                    }
                    dao.desconectar();
                    dispose();
                }
            } catch (DateTimeParseException exc) {
                JOptionPane.showMessageDialog(null, "Erro: Dia e/ou Mês inválido(s).\nDigite uma data válida.");
            }
        }
    }

    /**
     * Gera atalhao de teclas para determinados comandos
     */
    public void geraAcessibilidade() {
        btnCadastrar.setMnemonic(KeyEvent.VK_D);
        btnCancelar.setMnemonic(KeyEvent.VK_C);
    }
}
