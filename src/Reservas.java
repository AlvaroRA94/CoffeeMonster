/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Reservas extends javax.swing.JFrame {

    /**
     * Creates new form Reservas
     */
    public Reservas() {
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
        MenuCarta1 = new javax.swing.JTextField();
        MENU = new javax.swing.JPanel();
        ReservaActiva = new javax.swing.JPanel();
        ReservaActiva1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UsuarioTextBox6 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        UsuarioNameText2 = new javax.swing.JLabel();
        Separador6 = new javax.swing.JSeparator();
        UsuarioNameText3 = new javax.swing.JLabel();
        Separador7 = new javax.swing.JSeparator();
        UsuarioTextBox7 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        EnviarButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        EnviarButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        HacerReserva = new javax.swing.JPanel();
        HacerReserva1 = new javax.swing.JPanel();
        UsuarioNameText = new javax.swing.JLabel();
        Separador3 = new javax.swing.JSeparator();
        UsuarioTextBox1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        UsuarioApellText = new javax.swing.JLabel();
        UsuarioTextBox2 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        Separador4 = new javax.swing.JSeparator();
        UsuarioTelfText = new javax.swing.JLabel();
        UsuarioTextBox3 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        SeparadorBusqCliente3 = new javax.swing.JSeparator();
        UsuarioNameText1 = new javax.swing.JLabel();
        UsuarioTextBox4 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        Separador5 = new javax.swing.JSeparator();
        UsuarioTelfText1 = new javax.swing.JLabel();
        UsuarioTextBox5 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        SeparadorBusqCliente4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        EnviarButton2 = new javax.swing.JButton();

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

        MenuCarta1.setBackground(new java.awt.Color(255, 255, 255));
        MenuCarta1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        MenuCarta1.setForeground(new java.awt.Color(120, 77, 60));
        MenuCarta1.setText("RESERVAS");
        MenuCarta1.setBorder(null);
        MenuCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCarta1ActionPerformed(evt);
            }
        });
        BarraSuperior.add(MenuCarta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 760, 50));

        MENU.setBackground(new java.awt.Color(255, 255, 255));
        MENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservaActiva.setBackground(new java.awt.Color(120, 77, 60));
        ReservaActiva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReservaActiva.setForeground(new java.awt.Color(120, 77, 60));
        ReservaActiva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservaActiva1.setBackground(new java.awt.Color(255, 255, 255));
        ReservaActiva1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Reservas\\buscador.png")); // NOI18N
        ReservaActiva1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        UsuarioTextBox6.setBorder(null);

        jTextPane7.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane7.setBorder(null);
        jTextPane7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane7.setText("Ingrese nombre del cliente");
        jTextPane7.setAlignmentX(20.0F);
        UsuarioTextBox6.setViewportView(jTextPane7);

        ReservaActiva1.add(UsuarioTextBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, 20));

        UsuarioNameText2.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioNameText2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioNameText2.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioNameText2.setText("Nombre:");
        UsuarioNameText2.setAlignmentX(20.0F);
        ReservaActiva1.add(UsuarioNameText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Separador6.setForeground(new java.awt.Color(204, 204, 204));
        ReservaActiva1.add(Separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 10));

        UsuarioNameText3.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioNameText3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioNameText3.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioNameText3.setText("ID Cliente:");
        UsuarioNameText3.setAlignmentX(20.0F);
        ReservaActiva1.add(UsuarioNameText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Separador7.setForeground(new java.awt.Color(204, 204, 204));
        ReservaActiva1.add(Separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, 10));

        UsuarioTextBox7.setBorder(null);

        jTextPane8.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane8.setBorder(null);
        jTextPane8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane8.setText("Ingrese identificador del cliente");
        jTextPane8.setAlignmentX(20.0F);
        UsuarioTextBox7.setViewportView(jTextPane8);

        ReservaActiva1.add(UsuarioTextBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 20));

        EnviarButton4.setBackground(new java.awt.Color(120, 77, 60));
        EnviarButton4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        EnviarButton4.setForeground(new java.awt.Color(255, 255, 255));
        EnviarButton4.setText("Consultar Reserva");
        EnviarButton4.setAlignmentX(20.0F);
        EnviarButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButton4ActionPerformed(evt);
            }
        });
        ReservaActiva1.add(EnviarButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 40));

        ReservaActiva.add(ReservaActiva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnviarButton3.setBackground(new java.awt.Color(120, 77, 60));
        EnviarButton3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        EnviarButton3.setForeground(new java.awt.Color(255, 255, 255));
        EnviarButton3.setText("Modificar Reserva");
        EnviarButton3.setAlignmentX(20.0F);
        EnviarButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(EnviarButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 170, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Reservas\\configuraciones.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        ReservaActiva.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 330, 170));

        MENU.add(ReservaActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 350, 500));

        HacerReserva.setBackground(new java.awt.Color(120, 77, 60));
        HacerReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HacerReserva.setForeground(new java.awt.Color(120, 77, 60));
        HacerReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HacerReserva1.setBackground(new java.awt.Color(255, 255, 255));
        HacerReserva1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioNameText.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioNameText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioNameText.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioNameText.setText("Nombre:");
        UsuarioNameText.setAlignmentX(20.0F);
        HacerReserva1.add(UsuarioNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Separador3.setForeground(new java.awt.Color(204, 204, 204));
        HacerReserva1.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, 10));

        UsuarioTextBox1.setBorder(null);

        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane2.setText("Ingrese nombre del cliente");
        jTextPane2.setAlignmentX(20.0F);
        UsuarioTextBox1.setViewportView(jTextPane2);

        HacerReserva1.add(UsuarioTextBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 20));

        UsuarioApellText.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioApellText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioApellText.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioApellText.setText("Asistencias:");
        UsuarioApellText.setAlignmentX(20.0F);
        HacerReserva1.add(UsuarioApellText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        UsuarioTextBox2.setBorder(null);

        jTextPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane3.setText("Ingrese número de personas");
        jTextPane3.setAlignmentX(20.0F);
        UsuarioTextBox2.setViewportView(jTextPane3);

        HacerReserva1.add(UsuarioTextBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 20));

        Separador4.setForeground(new java.awt.Color(204, 204, 204));
        HacerReserva1.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 270, 10));

        UsuarioTelfText.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioTelfText.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioTelfText.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioTelfText.setText("Teléfono:");
        UsuarioTelfText.setAlignmentX(20.0F);
        HacerReserva1.add(UsuarioTelfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        UsuarioTextBox3.setBorder(null);

        jTextPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane4.setBorder(null);
        jTextPane4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane4.setText("Ingrese  contacto telefónico");
        jTextPane4.setAlignmentX(20.0F);
        UsuarioTextBox3.setViewportView(jTextPane4);

        HacerReserva1.add(UsuarioTextBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 20));

        SeparadorBusqCliente3.setForeground(new java.awt.Color(204, 204, 204));
        HacerReserva1.add(SeparadorBusqCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 270, 10));

        UsuarioNameText1.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioNameText1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioNameText1.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioNameText1.setText("ID Cliente:");
        UsuarioNameText1.setAlignmentX(20.0F);
        HacerReserva1.add(UsuarioNameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        UsuarioTextBox4.setBorder(null);

        jTextPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane5.setBorder(null);
        jTextPane5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane5.setText("Ingrese identificador del cliente");
        jTextPane5.setAlignmentX(20.0F);
        UsuarioTextBox4.setViewportView(jTextPane5);

        HacerReserva1.add(UsuarioTextBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, 20));

        Separador5.setForeground(new java.awt.Color(204, 204, 204));
        HacerReserva1.add(Separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 10));

        UsuarioTelfText1.setBackground(new java.awt.Color(102, 51, 0));
        UsuarioTelfText1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        UsuarioTelfText1.setForeground(new java.awt.Color(120, 77, 60));
        UsuarioTelfText1.setText("Hora de Reserva:");
        UsuarioTelfText1.setAlignmentX(20.0F);
        HacerReserva1.add(UsuarioTelfText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        UsuarioTextBox5.setBorder(null);

        jTextPane6.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane6.setBorder(null);
        jTextPane6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextPane6.setText("Ingrese hora de asistencia");
        jTextPane6.setAlignmentX(20.0F);
        UsuarioTextBox5.setViewportView(jTextPane6);

        HacerReserva1.add(UsuarioTextBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 20));

        SeparadorBusqCliente4.setForeground(new java.awt.Color(204, 204, 204));
        HacerReserva1.add(SeparadorBusqCliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 270, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\Reservas\\calendario3.png")); // NOI18N
        HacerReserva1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        EnviarButton2.setBackground(new java.awt.Color(120, 77, 60));
        EnviarButton2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        EnviarButton2.setForeground(new java.awt.Color(255, 255, 255));
        EnviarButton2.setText("Generar Reserva");
        EnviarButton2.setAlignmentX(20.0F);
        EnviarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButton2ActionPerformed(evt);
            }
        });
        HacerReserva1.add(EnviarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 170, 40));

        HacerReserva.add(HacerReserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 480));

        MENU.add(HacerReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 500));

        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaBoxActionPerformed

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButtonActionPerformed

    private void MenuCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCarta1ActionPerformed

    private void EnviarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButton2ActionPerformed

    private void EnviarButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButton3ActionPerformed

    private void EnviarButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel ContrasaeñaText;
    private javax.swing.JPasswordField ContraseñaBox;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JButton EnviarButton2;
    private javax.swing.JButton EnviarButton3;
    private javax.swing.JButton EnviarButton4;
    private javax.swing.JPanel HacerReserva;
    private javax.swing.JPanel HacerReserva1;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MENU;
    private javax.swing.JTextField MenuCarta1;
    private javax.swing.JLabel MenuDesp;
    private javax.swing.JLabel Minimizar1;
    private javax.swing.JPanel ReservaActiva;
    private javax.swing.JPanel ReservaActiva1;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    private javax.swing.JSeparator Separador5;
    private javax.swing.JSeparator Separador6;
    private javax.swing.JSeparator Separador7;
    private javax.swing.JSeparator SeparadorBusqCliente3;
    private javax.swing.JSeparator SeparadorBusqCliente4;
    private javax.swing.JLabel UsuarioApellText;
    private javax.swing.JLabel UsuarioNameText;
    private javax.swing.JLabel UsuarioNameText1;
    private javax.swing.JLabel UsuarioNameText2;
    private javax.swing.JLabel UsuarioNameText3;
    private javax.swing.JLabel UsuarioTelfText;
    private javax.swing.JLabel UsuarioTelfText1;
    private javax.swing.JLabel UsuarioText;
    private javax.swing.JScrollPane UsuarioTextBox;
    private javax.swing.JScrollPane UsuarioTextBox1;
    private javax.swing.JScrollPane UsuarioTextBox2;
    private javax.swing.JScrollPane UsuarioTextBox3;
    private javax.swing.JScrollPane UsuarioTextBox4;
    private javax.swing.JScrollPane UsuarioTextBox5;
    private javax.swing.JScrollPane UsuarioTextBox6;
    private javax.swing.JScrollPane UsuarioTextBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    // End of variables declaration//GEN-END:variables
}
