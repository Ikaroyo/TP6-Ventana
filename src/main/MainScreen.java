
package main;

import clases.Cliente;
import clases.Directorio;
import java.awt.Color;
import javax.swing.JFrame;

public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    

    private int mouseX, mouseY;
    private Directorio directory = new Directorio();
    private Cliente clienteAuxiliar;
    
    
    public MainScreen() {
        initComponents();
        setSize(875, 550);
        setLocationRelativeTo(null);
        btnClientSearch.setVisible(false);
        setCajasTxtVisibility(false,false);
        setLabelVisibility(false,false);
        setButtonsVisibility(false);
        ventanaActiva.setText("Bienvenido");
        
        
        //*************************************************
        //             Programa TP 6
        
        

       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        addCLabel = new javax.swing.JLabel();
        findCLabel = new javax.swing.JLabel();
        findPLabel = new javax.swing.JLabel();
        listPLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        WorkPanel = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        labelTelefono = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelDomicilio = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        ventanaActiva = new javax.swing.JLabel();
        btncleanAddForm = new javax.swing.JLabel();
        btnaddAddForm = new javax.swing.JLabel();
        btnClientSearch = new javax.swing.JLabel();
        btnPhoneSearch = new javax.swing.JLabel();
        labelState = new javax.swing.JLabel();
        labelListaTelefonos = new javax.swing.JLabel();
        txtListaTelefonosE = new javax.swing.JTextArea();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(875, 560));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(875, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(44, 44, 44));
        background.setMinimumSize(new java.awt.Dimension(875, 550));
        background.setPreferredSize(new java.awt.Dimension(875, 550));
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(51, 54, 61));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addCLabel.setBackground(new java.awt.Color(102, 102, 102));
        addCLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        addCLabel.setForeground(new java.awt.Color(255, 255, 255));
        addCLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCLabel.setText("Agregar clientes");
        addCLabel.setOpaque(true);
        addCLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCLabelMouseExited(evt);
            }
        });
        PanelPrincipal.add(addCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 180, 220, 40));

        findCLabel.setBackground(new java.awt.Color(102, 102, 102));
        findCLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        findCLabel.setForeground(new java.awt.Color(255, 255, 255));
        findCLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        findCLabel.setText("Buscar cliente");
        findCLabel.setOpaque(true);
        findCLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findCLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findCLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findCLabelMouseExited(evt);
            }
        });
        PanelPrincipal.add(findCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 220, 40));

        findPLabel.setBackground(new java.awt.Color(102, 102, 102));
        findPLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        findPLabel.setForeground(new java.awt.Color(255, 255, 255));
        findPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        findPLabel.setText("Buscar Telefonos");
        findPLabel.setOpaque(true);
        findPLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findPLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findPLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findPLabelMouseExited(evt);
            }
        });
        PanelPrincipal.add(findPLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, 220, 40));

        listPLabel.setBackground(new java.awt.Color(102, 102, 102));
        listPLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        listPLabel.setForeground(new java.awt.Color(255, 255, 255));
        listPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listPLabel.setText("Listar clientes de una ciudad");
        listPLabel.setOpaque(true);
        listPLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listPLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listPLabelMouseExited(evt);
            }
        });
        PanelPrincipal.add(listPLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, 220, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contact.png"))); // NOI18N
        PanelPrincipal.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 50, 100, 100));

        background.add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 35, 250, 500));

        WorkPanel.setLayout(null);

        panelDatos.setBackground(new java.awt.Color(51, 54, 61));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTelefono.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefono.setText("Telefono");
        panelDatos.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        labelDNI.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(255, 255, 255));
        labelDNI.setText("DNI");
        panelDatos.add(labelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        labelNombre.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre");
        panelDatos.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        labelApellido.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelApellido.setForeground(new java.awt.Color(255, 255, 255));
        labelApellido.setText("Apellido");
        panelDatos.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        labelCiudad.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelCiudad.setForeground(new java.awt.Color(255, 255, 255));
        labelCiudad.setText("Ciudad");
        panelDatos.add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        labelDomicilio.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        labelDomicilio.setText("Domicilio");
        panelDatos.add(labelDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        txtDNI.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDNI.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        panelDatos.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 135, 200, 30));

        txtNombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelDatos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 185, 250, 30));

        txtApellido.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelDatos.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 235, 250, 30));

        txtCiudad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtCiudad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelDatos.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 285, 250, 30));

        txtDomicilio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDomicilio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelDatos.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 335, 250, 30));

        txtTelefono.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelDatos.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 85, 250, 30));

        ventanaActiva.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ventanaActiva.setForeground(new java.awt.Color(255, 255, 255));
        ventanaActiva.setText("Agregar nuevo cliente");
        panelDatos.add(ventanaActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 30, -1, -1));

        btncleanAddForm.setBackground(new java.awt.Color(0, 134, 195));
        btncleanAddForm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btncleanAddForm.setForeground(new java.awt.Color(255, 255, 255));
        btncleanAddForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncleanAddForm.setText("Limpiar");
        btncleanAddForm.setOpaque(true);
        btncleanAddForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncleanAddFormMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncleanAddFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncleanAddFormMouseExited(evt);
            }
        });
        panelDatos.add(btncleanAddForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 125, 30));

        btnaddAddForm.setBackground(new java.awt.Color(255, 0, 0));
        btnaddAddForm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnaddAddForm.setForeground(new java.awt.Color(255, 255, 255));
        btnaddAddForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnaddAddForm.setText("Agregar");
        btnaddAddForm.setOpaque(true);
        btnaddAddForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddAddFormMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaddAddFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaddAddFormMouseExited(evt);
            }
        });
        panelDatos.add(btnaddAddForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 400, 125, 30));

        btnClientSearch.setBackground(new java.awt.Color(255, 0, 0));
        btnClientSearch.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnClientSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnClientSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClientSearch.setText("Buscar cliente");
        btnClientSearch.setOpaque(true);
        btnClientSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientSearchMouseExited(evt);
            }
        });
        panelDatos.add(btnClientSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 400, 125, 30));

        btnPhoneSearch.setBackground(new java.awt.Color(255, 0, 0));
        btnPhoneSearch.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnPhoneSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnPhoneSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPhoneSearch.setText("Buscar telefonos");
        btnPhoneSearch.setOpaque(true);
        btnPhoneSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPhoneSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPhoneSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPhoneSearchMouseExited(evt);
            }
        });
        panelDatos.add(btnPhoneSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 400, 125, 30));

        labelState.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelState.setForeground(new java.awt.Color(255, 255, 255));
        labelState.setText("Estado: Conectado al sistema");
        labelState.setToolTipText("");
        panelDatos.add(labelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        labelListaTelefonos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelListaTelefonos.setForeground(new java.awt.Color(255, 255, 255));
        labelListaTelefonos.setText("Telefonos");
        panelDatos.add(labelListaTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        txtListaTelefonosE.setColumns(20);
        txtListaTelefonosE.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtListaTelefonosE.setForeground(new java.awt.Color(255, 255, 255));
        txtListaTelefonosE.setRows(5);
        panelDatos.add(txtListaTelefonosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 250, -1));

        WorkPanel.add(panelDatos);
        panelDatos.setBounds(0, 0, 550, 500);

        background.add(WorkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 550, 500));

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minPink.png"))); // NOI18N
        minimizar.setAlignmentY(0.0F);
        minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        background.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 26, 26));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        background.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 26, 26));

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("ADMINISTRADOR DE CLIENTES");
        background.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 5, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 875, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCLabelMouseClicked
        ventanaActiva.setText("Agregar nuevo cliente");
        labelState.setText("Estado: agregar nuevo cliente...");
        setCajasTxtVisibility(true,false);
        setLabelVisibility(true,false);
        setButtonsVisibility(false);
        btnaddAddForm.setVisible(true);
        btncleanAddForm.setVisible(true);
        limpiarCajasTxt();
        

        addCLabel.setBackground(Color.red);
    }//GEN-LAST:event_addCLabelMouseClicked

    private void findCLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findCLabelMouseClicked
        ventanaActiva.setText("Buscar cliente por No Telefonico");
        labelState.setText("Estado: Buscar cliente por telefono...");
        setButtonsVisibility(false);
        btnClientSearch.setVisible(true);
        btncleanAddForm.setVisible(true);
        setCajasTxtVisibility(true,false);
        setLabelVisibility(true,false);

        limpiarCajasTxt();

        
        txtTelefono.setEnabled(true);
        directory.buscarCliente(Long.parseLong(txtTelefono.getText(),10));
        
    }//GEN-LAST:event_findCLabelMouseClicked


    private void rellenarCajasConCliente(Cliente p_cliente){
        
    }
    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked


    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        setLocation(this.getLocation().x+evt.getX()-mouseX,this.getLocation().y+evt.getY()-mouseY);
    }//GEN-LAST:event_backgroundMouseDragged

    private void addCLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCLabelMouseEntered
        addCLabel.setBackground(Color.red);
    }//GEN-LAST:event_addCLabelMouseEntered

    private void addCLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCLabelMouseExited
        addCLabel.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_addCLabelMouseExited

    private void findCLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findCLabelMouseEntered
        findCLabel.setBackground(Color.red);
    }//GEN-LAST:event_findCLabelMouseEntered

    private void findCLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findCLabelMouseExited
        findCLabel.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_findCLabelMouseExited

    private void findPLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findPLabelMouseEntered
        findPLabel.setBackground(Color.red);
    }//GEN-LAST:event_findPLabelMouseEntered

    private void findPLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findPLabelMouseExited
        findPLabel.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_findPLabelMouseExited

    private void listPLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPLabelMouseEntered
        listPLabel.setBackground(Color.red);
    }//GEN-LAST:event_listPLabelMouseEntered

    private void listPLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPLabelMouseExited
        listPLabel.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_listPLabelMouseExited

    private void findPLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findPLabelMouseClicked
        ventanaActiva.setText("Buscar telefonos por apellido");
        labelState.setText("Estado: Buscar telefonos por apellido");
        setButtonsVisibility(false);
        btnPhoneSearch.setVisible(true);
        btncleanAddForm.setVisible(true);
        setCajasTxtVisibility(false,true);
        txtApellido.setVisible(true);
        setLabelVisibility(false,true);
        
        txtTelefono.setEnabled(true);
        


    }//GEN-LAST:event_findPLabelMouseClicked
    
    
    
    private void listPLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPLabelMouseClicked
        ventanaActiva.setText("Listar clientes de una ciudad");
        labelState.setText("Estado: Listar clientes por ciudad...");
    }//GEN-LAST:event_listPLabelMouseClicked

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnaddAddFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddAddFormMouseClicked
        
        directory.agregarCliente(Long.parseLong(txtTelefono.getText(),10) , new Cliente(Long.parseLong(txtDNI.getText(),10), txtNombre.getText(), txtApellido.getText(), txtCiudad.getText(),txtDomicilio.getText()));
        labelState.setText("Estado: cliente "+ txtTelefono.getText()+ " agregado correctamente.");
    }//GEN-LAST:event_btnaddAddFormMouseClicked

    private void btncleanAddFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncleanAddFormMouseEntered
        btncleanAddForm.setBackground(new Color(115,232,255));
    }//GEN-LAST:event_btncleanAddFormMouseEntered

    private void btncleanAddFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncleanAddFormMouseExited
        btncleanAddForm.setBackground(new Color(0,134,195));
    }//GEN-LAST:event_btncleanAddFormMouseExited

    private void btnaddAddFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddAddFormMouseEntered
        btnaddAddForm.setBackground(new Color(194,0,0));
    }//GEN-LAST:event_btnaddAddFormMouseEntered

    private void btnaddAddFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddAddFormMouseExited
        btnaddAddForm.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_btnaddAddFormMouseExited

    private void btncleanAddFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncleanAddFormMouseClicked
        limpiarCajasTxt();
    }//GEN-LAST:event_btncleanAddFormMouseClicked

    private void btnClientSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientSearchMouseClicked
        parseClienteAForm(directory.buscarCliente(Long.parseLong(txtTelefono.getText(),10)));        
    }//GEN-LAST:event_btnClientSearchMouseClicked

    private void parseClienteAForm(Cliente p_cliente){ 
        txtDNI.setText(String.valueOf(p_cliente.getDni()));
        txtNombre.setText(p_cliente.getNombre());
        txtApellido.setText(p_cliente.getApellido());
        txtCiudad.setText(p_cliente.getCiudad());
        txtDomicilio.setText(p_cliente.getDireccion());
    }
    private void btnClientSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientSearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientSearchMouseEntered

    private void btnClientSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientSearchMouseExited

    private void btnPhoneSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhoneSearchMouseClicked
        txtListaTelefonosE.setText("");
        
        for (Long item : directory.buscarTelefono(txtApellido.getText())) {

            txtListaTelefonosE.setText(txtListaTelefonosE.getText()+item.toString()+"\n");            

        }
    }//GEN-LAST:event_btnPhoneSearchMouseClicked

    private void btnPhoneSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhoneSearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPhoneSearchMouseEntered

    private void btnPhoneSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhoneSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPhoneSearchMouseExited
    
    private void limpiarCajasTxt (){
        txtDNI.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCiudad.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");
        txtListaTelefonosE.setText("");
    }
    
    private void setCajasTxTEnabled(boolean p){
        txtDNI.setEnabled(p);
        txtNombre.setEnabled(p);
        txtApellido.setEnabled(p);
        txtCiudad.setEnabled(p);
        txtDomicilio.setEnabled(p);
        txtTelefono.setEnabled(p);
    }
    
    
    private void setCajasTxtVisibility(boolean p, boolean q){
        txtDNI.setVisible(p);
        txtNombre.setVisible(p);
        txtApellido.setVisible(p);
        txtCiudad.setVisible(p);
        txtDomicilio.setVisible(p);
        txtTelefono.setVisible(p);
        txtListaTelefonosE.setVisible(q);
       
    }
    

        
        private void setLabelVisibility(boolean p,boolean q){
            labelTelefono.setVisible(p);
            labelDNI.setVisible(p);
            labelNombre.setVisible(p);
            labelApellido.setVisible(p || q);
            labelCiudad.setVisible(p);
            labelDomicilio.setVisible(p);
            labelListaTelefonos.setVisible(q);
        }
        
        private void setButtonsVisibility(boolean p){
            btncleanAddForm.setVisible(p);
            btnaddAddForm.setVisible(p);
            btnClientSearch.setVisible(p);
            btnPhoneSearch.setVisible(p);
        }

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel WorkPanel;
    private javax.swing.JLabel addCLabel;
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnClientSearch;
    private javax.swing.JLabel btnPhoneSearch;
    private javax.swing.JLabel btnaddAddForm;
    private javax.swing.JLabel btncleanAddForm;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel findCLabel;
    private javax.swing.JLabel findPLabel;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDomicilio;
    private javax.swing.JLabel labelListaTelefonos;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel listPLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimizar;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextArea txtListaTelefonosE;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel ventanaActiva;
    // End of variables declaration//GEN-END:variables
}
