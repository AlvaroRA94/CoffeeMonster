/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Sucursales extends javax.swing.JFrame {

    /**
     * Creates new form Sucursales
     */
    public Sucursales() {
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
        SucursalesTitulo = new javax.swing.JTextField();
        MenuSucursales = new javax.swing.JPanel();
        Suc1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Suc1Insta = new javax.swing.JLabel();
        Suc1Face = new javax.swing.JLabel();
        Suc1Whats = new javax.swing.JLabel();
        QRCode1 = new javax.swing.JLabel();
        Suc2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Suc2Insta = new javax.swing.JLabel();
        Suc2Face = new javax.swing.JLabel();
        Suc2Whats = new javax.swing.JLabel();
        QRCode2 = new javax.swing.JLabel();
        Suc3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Suc3Insta = new javax.swing.JLabel();
        Suc3Face = new javax.swing.JLabel();
        Suc3Whats = new javax.swing.JLabel();
        QRCode3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 575));
        setPreferredSize(new java.awt.Dimension(1050, 575));
        setSize(new java.awt.Dimension(1050, 575));
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

        SucursalesTitulo.setBackground(new java.awt.Color(255, 255, 255));
        SucursalesTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        SucursalesTitulo.setForeground(new java.awt.Color(120, 77, 60));
        SucursalesTitulo.setText("SUCURSALES");
        SucursalesTitulo.setBorder(null);
        SucursalesTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SucursalesTituloActionPerformed(evt);
            }
        });
        BarraSuperior.add(SucursalesTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 760, 50));

        MenuSucursales.setBackground(new java.awt.Color(255, 255, 255));
        MenuSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suc1.setBackground(new java.awt.Color(120, 77, 60));
        Suc1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sucursal:");
        Suc1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Dirección:");
        Suc1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Teléfono:");
        Suc1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Horario:");
        Suc1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Código Postal:");
        Suc1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email:");
        Suc1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Teatinos");
        Suc1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Avda. la Concepción");
        Suc1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("951 234 567");
        Suc1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("8:00- 5:00 , 17:30-22:30 ");
        Suc1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("29009");
        Suc1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, 20));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("m.coffee@coffee.com");
        Suc1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        MenuSucursales.add(Suc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 160));

        Suc1Insta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\instagram-(1).jpg")); // NOI18N
        MenuSucursales.add(Suc1Insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Suc1Face.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\Facebook-(1).jpg")); // NOI18N
        MenuSucursales.add(Suc1Face, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        Suc1Whats.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\watsap(1).jpg")); // NOI18N
        MenuSucursales.add(Suc1Whats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        QRCode1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\QRCafeteria.jpg")); // NOI18N
        MenuSucursales.add(QRCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 200));

        Suc2.setBackground(new java.awt.Color(120, 77, 60));
        Suc2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Sucursal:");
        Suc2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Dirección:");
        Suc2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel22.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Teléfono:");
        Suc2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Horario:");
        Suc2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel24.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Código Postal:");
        Suc2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel25.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email:");
        Suc2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("NH Hotel Larios");
        Suc2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Calle Dos Hermanas");
        Suc2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("951 567 234");
        Suc2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("8:00-15:00 , 17:30-22:30 ");
        Suc2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("29109");
        Suc2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 20));

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("m.coffee2@coffee.com");
        Suc2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        MenuSucursales.add(Suc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 210, 160));

        Suc2Insta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\instagram-(1).jpg")); // NOI18N
        MenuSucursales.add(Suc2Insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        Suc2Face.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\Facebook-(1).jpg")); // NOI18N
        MenuSucursales.add(Suc2Face, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        Suc2Whats.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\watsap(1).jpg")); // NOI18N
        MenuSucursales.add(Suc2Whats, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        QRCode2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\QRCafeteria.jpg")); // NOI18N
        MenuSucursales.add(QRCode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 190, 200));

        Suc3.setBackground(new java.awt.Color(120, 77, 60));
        Suc3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Sucursal:");
        Suc3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel27.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Dirección:");
        Suc3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel28.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Teléfono:");
        Suc3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel29.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Horario:");
        Suc3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Código Postal:");
        Suc3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel31.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Email:");
        Suc3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel32.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Paseo Marítimo");
        Suc3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        jLabel33.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("C. Antonio Banderas");
        Suc3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        jLabel34.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("951 987 123");
        Suc3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20));

        jLabel35.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("8:00-15:00 , 17:30-22:30 ");
        Suc3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        jLabel36.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("29359");
        Suc3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 20));

        jLabel37.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("m.coffee3@coffee.com");
        Suc3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        MenuSucursales.add(Suc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 210, 160));

        Suc3Insta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\instagram-(1).jpg")); // NOI18N
        MenuSucursales.add(Suc3Insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        Suc3Face.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\Facebook-(1).jpg")); // NOI18N
        MenuSucursales.add(Suc3Face, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        Suc3Whats.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\watsap(1).jpg")); // NOI18N
        MenuSucursales.add(Suc3Whats, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        QRCode3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\DAM\\2º DAM\\3. Desarrollo de Interfaces\\3. Proyecto Cafetería\\Recursos\\SocialMedia\\QRCafeteria.jpg")); // NOI18N
        MenuSucursales.add(QRCode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 190, 200));

        getContentPane().add(MenuSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaBoxActionPerformed

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarButtonActionPerformed

    private void SucursalesTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SucursalesTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SucursalesTituloActionPerformed

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
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel ContrasaeñaText;
    private javax.swing.JPasswordField ContraseñaBox;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel MenuDesp;
    private javax.swing.JPanel MenuSucursales;
    private javax.swing.JLabel Minimizar1;
    private javax.swing.JLabel QRCode1;
    private javax.swing.JLabel QRCode2;
    private javax.swing.JLabel QRCode3;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JPanel Suc1;
    private javax.swing.JLabel Suc1Face;
    private javax.swing.JLabel Suc1Insta;
    private javax.swing.JLabel Suc1Whats;
    private javax.swing.JPanel Suc2;
    private javax.swing.JLabel Suc2Face;
    private javax.swing.JLabel Suc2Insta;
    private javax.swing.JLabel Suc2Whats;
    private javax.swing.JPanel Suc3;
    private javax.swing.JLabel Suc3Face;
    private javax.swing.JLabel Suc3Insta;
    private javax.swing.JLabel Suc3Whats;
    private javax.swing.JTextField SucursalesTitulo;
    private javax.swing.JLabel UsuarioText;
    private javax.swing.JScrollPane UsuarioTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}