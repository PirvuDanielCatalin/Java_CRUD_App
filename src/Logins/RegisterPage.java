package Logins;

import DBSocketConnection.Client;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegisterPage extends javax.swing.JFrame {

    public RegisterPage() {

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

        jFrame1 = new javax.swing.JFrame();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        ClientCheck = new javax.swing.JRadioButton();
        ManagerCheck = new javax.swing.JRadioButton();
        RegisterBtn = new javax.swing.JButton();
        ConfPasswordTxt = new javax.swing.JPasswordField();
        PasswordTxt = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getPreferredSize());

        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("RegisterPage");
        Title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setText("User");
        User.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Password");
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirm Password");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        UserTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxtActionPerformed(evt);
            }
        });

        ClientCheck.setSelected(true);
        ClientCheck.setText("Client");
        ClientCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientCheckActionPerformed(evt);
            }
        });

        ManagerCheck.setText("Manager");
        ManagerCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerCheckActionPerformed(evt);
            }
        });

        RegisterBtn.setText("Register");
        RegisterBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        ConfPasswordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfPasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfPasswordTxtActionPerformed(evt);
            }
        });

        PasswordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ClientCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ManagerCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfPasswordTxt)
                            .addComponent(UserTxt)
                            .addComponent(PasswordTxt))))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(RegisterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ConfPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientCheck)
                    .addComponent(ManagerCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ConfPasswordTxt, Password, PasswordTxt, User, UserTxt, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxtActionPerformed

    }//GEN-LAST:event_UserTxtActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed

        /*Se preiau parola din passwordfield-ul PasswordTxt, 
                    confirmarea parolei din passwordfield-ul ConfPasswordTxt, 
                    si statutul dat de radiobutton-ul ManagerCheck.
         */
        int aux = (ManagerCheck.isSelected()) ? 1 : 0;
        String passw = new String(PasswordTxt.getPassword());
        String cpassw = new String(ConfPasswordTxt.getPassword());

        if (passw.length() > 0 && UserTxt.getText().length() > 0 && passw.equals(cpassw)) {
            ResultSet rs = null;
            /*Se cauta in BD datele introduse.*/

            try {
                String SQL = "select user,password "
                        + "from users "
                        + "where user='" + UserTxt.getText() + "' and password='" + passw + "'";
                Client sclav = new Client();
                sclav.connectToServer();

                sclav.Query(SQL);
                rs = sclav.rs;
            } catch (IOException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                if (!rs.next()) //Se verifica daca datele introduse exista deja in BD
                {
                    //Daca nu, se insereaza in BD noul cont
                    try {
                        Client sclav = new Client();
                        String SQL = "INSERT INTO users (user,password,isManager) values "
                                  + "('" + UserTxt.getText() + "','" + passw + "'," + aux + ")";
                        sclav.connectToServer();

                        sclav.Query(SQL);
                        int confExec = sclav.confExec;
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
                    }


                    /*Dupa introducerea noului cont in BD se redeschide o noua forma de tip Start 
                        in care putem introduce noile date si folosi aplicatia in continuare.*/
                    Start JF = new Start();
                    JF.setVisible(true);
                    JF.setResizable(false);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Account already created", "Register Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Invalid register details", "Register Error", JOptionPane.ERROR_MESSAGE);
            PasswordTxt.setText("");
            ConfPasswordTxt.setText("");
        }


    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void ClientCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientCheckActionPerformed

        ManagerCheck.setSelected(false);
    }//GEN-LAST:event_ClientCheckActionPerformed

    private void ManagerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerCheckActionPerformed

        ClientCheck.setSelected(false);
    }//GEN-LAST:event_ManagerCheckActionPerformed

    private void ConfPasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfPasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfPasswordTxtActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*
        java.awt.EventQueue.invokeLater(() -> {
            RegisterPage JRF = new RegisterPage();
            JRF.setVisible(true);
            JRF.setResizable(false);
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ClientCheck;
    private javax.swing.JPasswordField ConfPasswordTxt;
    private javax.swing.JRadioButton ManagerCheck;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel User;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
