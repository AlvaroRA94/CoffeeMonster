/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Horarios extends javax.swing.JFrame {

    /**
     * Creates new form Horarios
     */
    public Horarios() {
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
        Cerrar = new javax.swing.JLabel();
        Minimizar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        TelefonosTitulo = new javax.swing.JTextField();
        MenuHorario = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Camareros = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cocina = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Coordinación = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Horario = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/cerrar.png"))); // NOI18N
        BarraSuperior.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        Minimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/minimizar.png"))); // NOI18N
        BarraSuperior.add(Minimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\retroceder.png")); // NOI18N
        BarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel38.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("ATRÁS");
        BarraSuperior.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 50));

        TelefonosTitulo.setBackground(new java.awt.Color(255, 255, 255));
        TelefonosTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        TelefonosTitulo.setForeground(new java.awt.Color(120, 77, 60));
        TelefonosTitulo.setText("HORARIOS");
        TelefonosTitulo.setBorder(null);
        TelefonosTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonosTituloActionPerformed(evt);
            }
        });
        BarraSuperior.add(TelefonosTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 760, 50));

        MenuHorario.setBackground(new java.awt.Color(255, 255, 255));
        MenuHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(120, 77, 60));
        jComboBox1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jornada Laboral Semana 5/6 - 12/6 de 2023 Turno de Mañana", "Jornada Laboral Semana 5/6 - 12/6 de 2023 Turno de Tarde", "Jornada Laboral Semana 12/6 - 19/6 de 2023 Turno de Mañana", "Jornada Laboral Semana 12/6 - 19/6 de 2023 Turno de Tarde", "Jornada Laboral Semana 19/6 - 26/6 de 2023 Turno de Mañana", "Jornada Laboral Semana 19/6 - 26/6 de 2023 Turno de Tarde", "Jornada Laboral Semana 26/6 - 2/7 de 2023 Turno de Mañana", "Jornada Laboral Semana 26/6 - 2/7 de 2023 Turno de Tarde" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        MenuHorario.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 570, 40));

        Camareros.setBackground(new java.awt.Color(120, 77, 60));
        Camareros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Pedro Campos");
        Camareros.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Laura Carvajal");
        Camareros.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Iñigo Dominguez");
        Camareros.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Raúl Montosa");
        Camareros.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel20.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CAMAREROS");
        Camareros.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Susana Pérez");
        Camareros.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\camarero.png")); // NOI18N
        Camareros.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        MenuHorario.add(Camareros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 250));

        Cocina.setBackground(new java.awt.Color(120, 77, 60));
        Cocina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Elena Gutiérrez");
        Cocina.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Óscar Delgado");
        Cocina.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel29.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Emilio Castellano");
        Cocina.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("COCINA");
        Cocina.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\cocinero.png")); // NOI18N
        Cocina.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        MenuHorario.add(Cocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 230, 250));

        Coordinación.setBackground(new java.awt.Color(120, 77, 60));
        Coordinación.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Jefe de Sala:");
        Coordinación.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel36.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Sofía Herrero");
        Coordinación.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel37.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Luís Carvajal");
        Coordinación.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("COORDINACIÓN");
        Coordinación.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\jefe.png")); // NOI18N
        Coordinación.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 60, -1));

        jLabel39.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Jefe de Cocina:");
        Coordinación.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        MenuHorario.add(Coordinación, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 230, 250));

        Horario.setBackground(new java.awt.Color(120, 77, 60));
        Horario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("HORARIOS");
        Horario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel40.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Turno de Tarde");
        Horario.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel41.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Turno de Mañana");
        Horario.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("L-V de 14:00 a 22:00 ");
        Horario.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel31.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("L-V de 06:00 a 14:00");
        Horario.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\reloj.png")); // NOI18N
        Horario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        MenuHorario.add(Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 500, 140));

        getContentPane().add(MenuHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaBoxActionPerformed

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButtonActionPerformed

    private void TelefonosTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonosTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonosTituloActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Horarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JPanel Camareros;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Cocina;
    private javax.swing.JLabel ContrasaeñaText;
    private javax.swing.JPasswordField ContraseñaBox;
    private javax.swing.JPanel Coordinación;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JPanel Horario;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel MenuDesp;
    private javax.swing.JPanel MenuHorario;
    private javax.swing.JLabel Minimizar1;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JTextField TelefonosTitulo;
    private javax.swing.JLabel UsuarioText;
    private javax.swing.JScrollPane UsuarioTextBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
