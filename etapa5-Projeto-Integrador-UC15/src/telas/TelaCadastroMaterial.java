package telas;

import classes.GastoLucro;
import classes.GastoLucroDAO;
import classes.Material;
import classes.MaterialDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * Tela aonde será digitado os valores para a criação e cadstro de um novo
 * Material.
 */
public class TelaCadastroMaterial extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;

    public void MostraTela(TelaPrincipal obj) {
        this.telaPrincipal = obj;
        setVisible(true);
    }

    public TelaCadastroMaterial() {
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
        lblCadastroMaterial = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblQntdComprada = new javax.swing.JLabel();
        lblQntdGasta = new javax.swing.JLabel();
        txtQntdGasta = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtQntdComprada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SICODON");

        jPanel1.setBackground(new java.awt.Color(239, 235, 235));

        lblCadastroMaterial.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastroMaterial.setText("Cadastro de Material");

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

        txtMarca.setBackground(new java.awt.Color(199, 199, 199));
        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblMarca.setLabelFor(txtMarca);
        lblMarca.setText("Marca:");

        lblQntdComprada.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblQntdComprada.setLabelFor(txtQntdComprada);
        lblQntdComprada.setText("Qntd. Comprada:");

        lblQntdGasta.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblQntdGasta.setLabelFor(txtQntdGasta);
        lblQntdGasta.setText("Qntd. Gasta:");

        txtQntdGasta.setBackground(new java.awt.Color(199, 199, 199));
        txtQntdGasta.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        lblValorUnitario.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblValorUnitario.setLabelFor(txtValorUnitario);
        lblValorUnitario.setText("Valor Unitário:");

        txtValorUnitario.setBackground(new java.awt.Color(199, 199, 199));
        txtValorUnitario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtNome.setBackground(new java.awt.Color(199, 199, 199));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtQntdComprada.setBackground(new java.awt.Color(199, 199, 199));
        txtQntdComprada.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCadastroMaterial)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblMarca)
                                                .addComponent(lblQntdComprada)
                                                .addComponent(lblQntdGasta))
                                            .addGap(29, 29, 29))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblValorUnitario)
                                            .addGap(62, 62, 62)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtQntdGasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(txtQntdComprada, javax.swing.GroupLayout.Alignment.LEADING)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCadastroMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQntdComprada)
                    .addComponent(txtQntdComprada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQntdGasta)
                    .addComponent(txtQntdGasta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUnitario)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
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
        cadastraMaterial();
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
            java.util.logging.Logger.getLogger(TelaCadastroMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastroMaterial;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQntdComprada;
    private javax.swing.JLabel lblQntdGasta;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQntdComprada;
    private javax.swing.JTextField txtQntdGasta;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables

    /**
     * Realiza o cadastro de material, integrando o método 'conectar' da classe
     * MaterialDAO. Também adiciona automaticamente um item, classificado como
     * Gasto (G) na tabela de Gastos_Lucros do Banco de Dados.
     */
    public void cadastraMaterial() {
        try {
            if (txtNome.getText().isEmpty() || txtMarca.getText().isEmpty() || txtQntdComprada.getText().isEmpty() || txtQntdGasta.getText().isEmpty() || txtValorUnitario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos.");
            } else if (Integer.parseInt(txtQntdComprada.getText()) < 0 || Integer.parseInt(txtQntdGasta.getText()) < 0 || Double.parseDouble(txtValorUnitario.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "As quantidades e os valores não podem ser negativos.");
            } else if (Integer.parseInt(txtQntdComprada.getText()) < Integer.parseInt(txtQntdGasta.getText())) {
                JOptionPane.showMessageDialog(null, "A Quantidade Comprada não pode ser menor do que a Quantidade Gasta.");
            } else {
                Material material = new Material();
                GastoLucro gastoLucro = new GastoLucro();
                MaterialDAO matDao = new MaterialDAO();
                GastoLucroDAO glDao = new GastoLucroDAO();
                boolean status;
                int resposta;

                material.setNome(txtNome.getText());
                material.setMarca(txtMarca.getText());
                material.setQntdComprada(Integer.parseInt(txtQntdComprada.getText()));
                material.setQntdGasta(Integer.parseInt(txtQntdGasta.getText()));
                material.setValorUnitario(Double.parseDouble(txtValorUnitario.getText()));

                gastoLucro.setNome(txtNome.getText());
                gastoLucro.setTipo('G');
                gastoLucro.setValor(Double.parseDouble(txtValorUnitario.getText()));
                gastoLucro.setQuantidade(Integer.parseInt(txtQntdGasta.getText()));

                status = matDao.conectar();
                if (status == false) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão.");
                } else {
                    resposta = matDao.salvar(material);
                    switch (resposta) {
                        case 1:
                            telaPrincipal.atualizaTabelaMaterial();
                            JOptionPane.showMessageDialog(null, "Cadastro de material efetuado com sucesso.");
                            break;
                        case 1062:
                            JOptionPane.showMessageDialog(null, "Material já foi cadastrado.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar dado.");
                            break;
                    }

                    status = glDao.conectar();
                    if (status == false) {
                        JOptionPane.showMessageDialog(null, "Erro de conexão.");
                    } else {
                        resposta = glDao.salvar(gastoLucro);
                        switch (resposta) {
                            case 1:
                                telaPrincipal.atualizaTabelaFinanceiro();
                                JOptionPane.showMessageDialog(null, "Material automaticamente salvo na tabela Financeiro com sucesso.");
                                break;
                            case 1062:
                                JOptionPane.showMessageDialog(null, "Gasto/Lucro já foi cadastrado.");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar dado.");
                                break;
                        }
                    }
                }
                matDao.desconectar();
                glDao.desconectar();
                dispose();
            }
        } catch (IllegalArgumentException exc) {
            JOptionPane.showMessageDialog(null, "Erro: Utilize apenas números para preencher os campos de Quantidade e Valores.\nUtilize ponto (.) para números decimais, ao invés de vírgula (,)");
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
