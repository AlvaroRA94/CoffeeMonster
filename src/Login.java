/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
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

        Login = new javax.swing.JPanel();
        MenuDesp = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        UsuarioText = new javax.swing.JLabel();
        UsuarioTextBox = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Separador1 = new javax.swing.JSeparator();
        ContrasaeñaText = new javax.swing.JLabel();
        ContraseñaBox = new javax.swing.JPasswordField();
        Separador2 = new javax.swing.JSeparator();
        EnviarButton = new javax.swing.JButton();
        BarraSuperior = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        IconoCafe = new javax.swing.JLabel();
        IconoTelf = new javax.swing.JLabel();
        IconoOpen = new javax.swing.JLabel();
        IconoCalendar = new javax.swing.JLabel();
        IconoMenu = new javax.swing.JLabel();
        IconoReserv = new javax.swing.JLabel();
        SucursalesTexto = new javax.swing.JLabel();
        TeléfonoTexto = new javax.swing.JLabel();
        HorariosTexto = new javax.swing.JLabel();
        EventosTexto = new javax.swing.JLabel();
        CartaTexto = new javax.swing.JLabel();
        ReservasTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 575));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuDesp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/menuhamburguesa.png"))); // NOI18N
        Login.add(MenuDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/96x96/logo.jpg"))); // NOI18N
        Login.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 60, -1, -1));

        UsuarioText.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioText.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioText.setText("Usuario:");
        UsuarioText.setAlignmentX(20.0F);
        Login.add(UsuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        UsuarioTextBox.setBorder(null);

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane1.setText("Ingrese su usuario o email");
        jTextPane1.setAlignmentX(20.0F);
        UsuarioTextBox.setViewportView(jTextPane1);

        Login.add(UsuarioTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 20));

        Separador1.setForeground(new java.awt.Color(204, 204, 204));
        Login.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 10));

        ContrasaeñaText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        ContrasaeñaText.setForeground(new java.awt.Color(120, 77, 60));
        ContrasaeñaText.setText("Contraseña:");
        ContrasaeñaText.setAlignmentX(20.0F);
        Login.add(ContrasaeñaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        ContraseñaBox.setBackground(new java.awt.Color(255, 255, 255));
        ContraseñaBox.setText("jPasswordField1");
        ContraseñaBox.setAlignmentX(20.0F);
        ContraseñaBox.setBorder(null);
        ContraseñaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaBoxActionPerformed(evt);
            }
        });
        Login.add(ContraseñaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 230, 20));

        Separador2.setBackground(new java.awt.Color(204, 204, 204));
        Separador2.setForeground(new java.awt.Color(204, 204, 204));
        Login.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 230, 10));

        EnviarButton.setBackground(new java.awt.Color(120, 77, 60));
        EnviarButton.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        EnviarButton.setForeground(new java.awt.Color(255, 255, 255));
        EnviarButton.setText("Enviar");
        EnviarButton.setAlignmentX(20.0F);
        EnviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButtonActionPerformed(evt);
            }
        });
        Login.add(EnviarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 118, 41));

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 580));

        BarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        BarraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/minimizar.png"))); // NOI18N
        BarraSuperior.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/cerrar.png"))); // NOI18N
        BarraSuperior.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 760, 50));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/Sucursales.png"))); // NOI18N
        Menu.add(IconoCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        IconoTelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/llamada-telefonica.png"))); // NOI18N
        Menu.add(IconoTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        IconoOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/abierto.png"))); // NOI18N
        Menu.add(IconoOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        IconoCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/evento.png"))); // NOI18N
        Menu.add(IconoCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        IconoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/menu.png"))); // NOI18N
        Menu.add(IconoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        IconoReserv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/reservado.png"))); // NOI18N
        Menu.add(IconoReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        SucursalesTexto.setBackground(new java.awt.Color(102, 102, 102));
        SucursalesTexto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        SucursalesTexto.setForeground(new java.awt.Color(102, 102, 102));
        SucursalesTexto.setText("SUCURSALES");
        Menu.add(SucursalesTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 225, -1, -1));

        TeléfonoTexto.setBackground(new java.awt.Color(102, 102, 102));
        TeléfonoTexto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        TeléfonoTexto.setForeground(new java.awt.Color(102, 102, 102));
        TeléfonoTexto.setText("TELÉFONOS");
        Menu.add(TeléfonoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 225, -1, -1));

        HorariosTexto.setBackground(new java.awt.Color(102, 102, 102));
        HorariosTexto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        HorariosTexto.setForeground(new java.awt.Color(102, 102, 102));
        HorariosTexto.setText("HORARIOS");
        Menu.add(HorariosTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 225, -1, -1));

        EventosTexto.setBackground(new java.awt.Color(102, 102, 102));
        EventosTexto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        EventosTexto.setForeground(new java.awt.Color(102, 102, 102));
        EventosTexto.setText("EVENTOS");
        Menu.add(EventosTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        CartaTexto.setBackground(new java.awt.Color(102, 102, 102));
        CartaTexto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        CartaTexto.setForeground(new java.awt.Color(102, 102, 102));
        CartaTexto.setText("CARTA");
        Menu.add(CartaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 440, -1, -1));

        ReservasTexto.setBackground(new java.awt.Color(102, 102, 102));
        ReservasTexto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        ReservasTexto.setForeground(new java.awt.Color(102, 102, 102));
        ReservasTexto.setText("RESERVAS");
        Menu.add(ReservasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 440, -1, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButtonActionPerformed

    private void ContraseñaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel CartaTexto;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel ContrasaeñaText;
    private javax.swing.JPasswordField ContraseñaBox;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JLabel EventosTexto;
    private javax.swing.JLabel HorariosTexto;
    private javax.swing.JLabel IconoCafe;
    private javax.swing.JLabel IconoCalendar;
    private javax.swing.JLabel IconoMenu;
    private javax.swing.JLabel IconoOpen;
    private javax.swing.JLabel IconoReserv;
    private javax.swing.JLabel IconoTelf;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel MenuDesp;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel ReservasTexto;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel SucursalesTexto;
    private javax.swing.JLabel TeléfonoTexto;
    private javax.swing.JLabel UsuarioText;
    private javax.swing.JScrollPane UsuarioTextBox;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
