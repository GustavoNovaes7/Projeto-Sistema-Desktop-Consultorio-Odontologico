package telas;

import classes.Criptografia;
import classes.Usuario;
import classes.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * Tela de login de usuario
 */
public class TelaLogin extends javax.swing.JFrame {

    int j = 0; //variável que enviará o tipo de usuário que irá acessar o sistema.

    public TelaLogin() {
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
        txtLogin = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblLogo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SICODON");
        setSize(new java.awt.Dimension(506, 600));

        jPanel1.setBackground(new java.awt.Color(239, 235, 235));

        txtLogin.setBackground(new java.awt.Color(199, 199, 199));
        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnSair.setBackground(new java.awt.Color(30, 48, 112));
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair_.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(30, 48, 112));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(199, 199, 199));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_.png"))); // NOI18N

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblSenha.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLogin)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        realizaLogin();
        if(j >= 1){
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            switch (j) {
                case 2:
                    telaPrincipal.acessoDentista();
                    break;
                case 3:
                    telaPrincipal.acessoAuxiliar();
                    break;
                case 4:
                    telaPrincipal.acessoAtendente();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    /**
     * Realiza login do usuário
     */
    public void realizaLogin() {
        if (txtLogin.getText().isEmpty() || txtSenha.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para realizar o Login.");
        } else {

            Usuario usuario = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();
            boolean status;

            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(Criptografia.getMD5(String.valueOf(txtSenha.getPassword())));

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro de conexão.");
            } else {
                usuario = dao.validaUsuario(usuario);
                if (usuario != null) {
                    if (usuario.getTipo().equalsIgnoreCase("Gerente")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo(a), Gerente " + usuario.getNome() + "!");
                        dao.desconectar();
                        j = 1;
                        dispose();
                    } else if (usuario.getTipo().equalsIgnoreCase("Dentista")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo(a), Cirurgiã(o)-Dentista " + usuario.getNome() + "!");
                        dao.desconectar();
                        j = 2;
                        dispose();
                    } else if (usuario.getTipo().equalsIgnoreCase("Auxiliar")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo(a), Auxiliar " + usuario.getNome() + "!");
                        dao.desconectar();
                        j = 3;
                        dispose();
                    } else if (usuario.getTipo().equalsIgnoreCase("Atendente")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo(a), Atendente " + usuario.getNome() + "!");
                        dao.desconectar();
                        j = 4;
                        dispose();
                    }  
                } else {
                    JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos!\nVerifique se os dados estão corretos.");
                }
            }
        }
    }

    /**
     * Retorna a variável j, ajudando na determinação de qual tipo de usuário
     * realizou o login.
     */
    /*public int retornaTipoUsuario() {
        return j; //j = 1 - Gerente; j = 2 - Dentista; j = 3 - Auxiliar; j = 4 - Atendente
    }*/

    /**
     * Gera atalho de teclas para determinados comandos
     */
    public void geraAcessibilidade() {
        btnEntrar.setMnemonic(KeyEvent.VK_E);
        btnSair.setMnemonic(KeyEvent.VK_S);
    }
}
