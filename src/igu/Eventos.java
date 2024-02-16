package igu;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Eventos
     */
    public Eventos() {
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

        login = new javax.swing.JPanel();
        menuDesp = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        usuarioText = new javax.swing.JLabel();
        usuarioTextBox = new javax.swing.JScrollPane();
        usuarioTextPanel = new javax.swing.JTextPane();
        separador1 = new javax.swing.JSeparator();
        contrasenaText = new javax.swing.JLabel();
        contrasenaBox = new javax.swing.JPasswordField();
        separador2 = new javax.swing.JSeparator();
        enviarButton = new javax.swing.JButton();
        barraSuperior = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        minimizar1 = new javax.swing.JLabel();
        atrasIcon = new javax.swing.JLabel();
        atrasText = new javax.swing.JLabel();
        eventosTitulo = new javax.swing.JTextField();
        menuHorario = new javax.swing.JPanel();
        halloweenText = new javax.swing.JLabel();
        halloweenIcon1 = new javax.swing.JLabel();
        halloweenIcon2 = new javax.swing.JLabel();
        hallowenLine1 = new javax.swing.JLabel();
        halloweenLine2 = new javax.swing.JLabel();
        sanValentinText = new javax.swing.JLabel();
        sanValentinIcon1 = new javax.swing.JLabel();
        sanValentinIcon2 = new javax.swing.JLabel();
        sanvalentinLine1 = new javax.swing.JLabel();
        sanValentinLine2 = new javax.swing.JLabel();
        navidadText = new javax.swing.JLabel();
        navidadIcon1 = new javax.swing.JLabel();
        navidadIcon2 = new javax.swing.JLabel();
        navidadLine1 = new javax.swing.JLabel();
        navidadLine2 = new javax.swing.JLabel();
        constitucionText = new javax.swing.JLabel();
        contitucionLine1 = new javax.swing.JLabel();
        constitucionLine2 = new javax.swing.JLabel();
        andaluciaText = new javax.swing.JLabel();
        andaluciaIcon1 = new javax.swing.JLabel();
        andaluciaIcon2 = new javax.swing.JLabel();
        andaluciaLine1 = new javax.swing.JLabel();
        andaluciaLine2 = new javax.swing.JLabel();
        diasCoffeeMonsterLine1 = new javax.swing.JLabel();
        diasCoffeeMonsterLine2 = new javax.swing.JLabel();
        diasCoffeeMonsterLine3 = new javax.swing.JLabel();
        diasCoffeeMonsterLine4 = new javax.swing.JLabel();
        newOfferIcon = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuDesp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/menuhamburguesa.png"))); // NOI18N
        login.add(menuDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/96x96/logo.jpg"))); // NOI18N
        login.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 60, -1, -1));

        usuarioText.setBackground(new java.awt.Color(102, 51, 0));
        usuarioText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(120, 77, 60));
        usuarioText.setText("Usuario:");
        usuarioText.setAlignmentX(20.0F);
        login.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        usuarioTextBox.setBorder(null);

        usuarioTextPanel.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTextPanel.setBorder(null);
        usuarioTextPanel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usuarioTextPanel.setText("Ingrese su usuario o email");
        usuarioTextPanel.setAlignmentX(20.0F);
        usuarioTextBox.setViewportView(usuarioTextPanel);

        login.add(usuarioTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 20));

        separador1.setForeground(new java.awt.Color(204, 204, 204));
        login.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 10));

        contrasenaText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        contrasenaText.setForeground(new java.awt.Color(120, 77, 60));
        contrasenaText.setText("Contraseña:");
        contrasenaText.setAlignmentX(20.0F);
        login.add(contrasenaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        contrasenaBox.setBackground(new java.awt.Color(255, 255, 255));
        contrasenaBox.setText("jPasswordField1");
        contrasenaBox.setAlignmentX(20.0F);
        contrasenaBox.setBorder(null);
        contrasenaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaBoxActionPerformed(evt);
            }
        });
        login.add(contrasenaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 230, 20));

        separador2.setBackground(new java.awt.Color(204, 204, 204));
        separador2.setForeground(new java.awt.Color(204, 204, 204));
        login.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 230, 10));

        enviarButton.setBackground(new java.awt.Color(120, 77, 60));
        enviarButton.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        enviarButton.setForeground(new java.awt.Color(255, 255, 255));
        enviarButton.setText("Enviar");
        enviarButton.setAlignmentX(20.0F);
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });
        login.add(enviarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 118, 41));

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 580));

        barraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        barraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        barraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/cerrar.png"))); // NOI18N
        barraSuperior.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        minimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeteria/minimizar.png"))); // NOI18N
        barraSuperior.add(minimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        atrasIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\retroceder.png")); // NOI18N
        atrasIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasIconMouseClicked(evt);
            }
        });
        barraSuperior.add(atrasIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        atrasText.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        atrasText.setForeground(new java.awt.Color(102, 102, 102));
        atrasText.setText("ATRÁS");
        atrasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasTextMouseClicked(evt);
            }
        });
        barraSuperior.add(atrasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 50));

        eventosTitulo.setBackground(new java.awt.Color(255, 255, 255));
        eventosTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        eventosTitulo.setForeground(new java.awt.Color(120, 77, 60));
        eventosTitulo.setText("EVENTOS");
        eventosTitulo.setBorder(null);
        eventosTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosTituloActionPerformed(evt);
            }
        });
        barraSuperior.add(eventosTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        getContentPane().add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 760, 50));

        menuHorario.setBackground(new java.awt.Color(255, 255, 255));
        menuHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        halloweenText.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        halloweenText.setText("Halloween");
        menuHorario.add(halloweenText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 140, 40));

        halloweenIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\calabaza.png")); // NOI18N
        menuHorario.add(halloweenIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        halloweenIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\calabaza.png")); // NOI18N
        menuHorario.add(halloweenIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        hallowenLine1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        hallowenLine1.setText("¡Ven disfrazado para recibir");
        menuHorario.add(hallowenLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, 20));

        halloweenLine2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        halloweenLine2.setText("ofertas especiales!");
        menuHorario.add(halloweenLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, 20));

        sanValentinText.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        sanValentinText.setText("San Valentín");
        menuHorario.add(sanValentinText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 40));

        sanValentinIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\me-gusta (1).png")); // NOI18N
        menuHorario.add(sanValentinIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        sanValentinIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\me-gusta (1).png")); // NOI18N
        menuHorario.add(sanValentinIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        sanvalentinLine1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        sanvalentinLine1.setText("¡Si vienes con tu pareja,");
        menuHorario.add(sanvalentinLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, 20));

        sanValentinLine2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        sanValentinLine2.setText("encontrarás ofertas 2x1!");
        menuHorario.add(sanValentinLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 180, 20));

        navidadText.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        navidadText.setText("Semana Navideña");
        menuHorario.add(navidadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 40));

        navidadIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\papa-noel.png")); // NOI18N
        menuHorario.add(navidadIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        navidadIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\papa-noel.png")); // NOI18N
        menuHorario.add(navidadIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        navidadLine1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        navidadLine1.setText("¡Ofertas en una amplia selección");
        menuHorario.add(navidadLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 240, 20));

        navidadLine2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        navidadLine2.setText("de menús familiares!");
        menuHorario.add(navidadLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 20));

        constitucionText.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        constitucionText.setText("Día de la Constitución");
        menuHorario.add(constitucionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 280, 40));

        contitucionLine1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        contitucionLine1.setText("¡Todos los cafés tamaño grande");
        menuHorario.add(contitucionLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 230, 20));

        constitucionLine2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        constitucionLine2.setText("traen un donut de regalo!");
        menuHorario.add(constitucionLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 190, 20));

        andaluciaText.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        andaluciaText.setText("Día de Andalucía");
        menuHorario.add(andaluciaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 220, 40));

        andaluciaIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\andalucia.png")); // NOI18N
        menuHorario.add(andaluciaIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        andaluciaIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\andalucia.png")); // NOI18N
        menuHorario.add(andaluciaIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        andaluciaLine1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        andaluciaLine1.setText("¡Pan con aceite de regalo");
        menuHorario.add(andaluciaLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 180, 20));

        andaluciaLine2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        andaluciaLine2.setText("al pedir tu café grande!");
        menuHorario.add(andaluciaLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 180, 20));

        diasCoffeeMonsterLine1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diasCoffeeMonsterLine1.setText("¡Todos los Lunes, un 25% de desc. a socios");
        menuHorario.add(diasCoffeeMonsterLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 310, 20));

        diasCoffeeMonsterLine2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diasCoffeeMonsterLine2.setText("para comenzar la semana con buen pie!");
        menuHorario.add(diasCoffeeMonsterLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 350, 20));

        diasCoffeeMonsterLine3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diasCoffeeMonsterLine3.setText("¡Y los viernes ofertas especiales para ");
        menuHorario.add(diasCoffeeMonsterLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 310, 20));

        diasCoffeeMonsterLine4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diasCoffeeMonsterLine4.setText("universitarios! ¡Aprovechad!");
        menuHorario.add(diasCoffeeMonsterLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 350, 20));

        newOfferIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\OFERTA.png")); // NOI18N
        menuHorario.add(newOfferIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Eventos\\FondoDefinitivo2.jpg")); // NOI18N
        menuHorario.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(menuHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaBoxActionPerformed

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void eventosTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventosTituloActionPerformed

    private void atrasIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasIconMouseClicked
        Login abrir = new Login();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_atrasIconMouseClicked

    private void atrasTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasTextMouseClicked
        Login abrir = new Login();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_atrasTextMouseClicked

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
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel andaluciaIcon1;
    private javax.swing.JLabel andaluciaIcon2;
    private javax.swing.JLabel andaluciaLine1;
    private javax.swing.JLabel andaluciaLine2;
    private javax.swing.JLabel andaluciaText;
    private javax.swing.JLabel atrasIcon;
    private javax.swing.JLabel atrasText;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel constitucionLine2;
    private javax.swing.JLabel constitucionText;
    private javax.swing.JLabel contitucionLine1;
    private javax.swing.JPasswordField contrasenaBox;
    private javax.swing.JLabel contrasenaText;
    private javax.swing.JLabel diasCoffeeMonsterLine1;
    private javax.swing.JLabel diasCoffeeMonsterLine2;
    private javax.swing.JLabel diasCoffeeMonsterLine3;
    private javax.swing.JLabel diasCoffeeMonsterLine4;
    private javax.swing.JButton enviarButton;
    private javax.swing.JTextField eventosTitulo;
    private javax.swing.JLabel halloweenIcon1;
    private javax.swing.JLabel halloweenIcon2;
    private javax.swing.JLabel halloweenLine2;
    private javax.swing.JLabel halloweenText;
    private javax.swing.JLabel hallowenLine1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menuDesp;
    private javax.swing.JPanel menuHorario;
    private javax.swing.JLabel minimizar1;
    private javax.swing.JLabel navidadIcon1;
    private javax.swing.JLabel navidadIcon2;
    private javax.swing.JLabel navidadLine1;
    private javax.swing.JLabel navidadLine2;
    private javax.swing.JLabel navidadText;
    private javax.swing.JLabel newOfferIcon;
    private javax.swing.JLabel sanValentinIcon1;
    private javax.swing.JLabel sanValentinIcon2;
    private javax.swing.JLabel sanValentinLine2;
    private javax.swing.JLabel sanValentinText;
    private javax.swing.JLabel sanvalentinLine1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel usuarioText;
    private javax.swing.JScrollPane usuarioTextBox;
    private javax.swing.JTextPane usuarioTextPanel;
    // End of variables declaration//GEN-END:variables
}