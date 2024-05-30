/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import enums.RolUsuario;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Reservacion;
import sistemareserva.Main;

/**
 *
 * @author Usuario
 */
public class EmpleadoUI extends javax.swing.JFrame {

    private Empleado empleadoLogged;
    private int empUpdateIndex = -1;
    private Empleado empSelectedSupervisor;
    private RolUsuario empSelectedRol;
    private int[] empSelectedHabitaciones;

    private int cliUpdateIndex = -1;

    /**
     * Creates new form Inicial
     */
    public EmpleadoUI() {
        initComponents();
    }

    public EmpleadoUI(Empleado empleadoLogged) {
        this.empleadoLogged = empleadoLogged;
        initComponents();
        String userAndRol = this.empleadoLogged.getNombre() + " (" + this.empleadoLogged.getRol().name() + ")";
        loggedUserNameLabel.setText("Bienvenidx, " + userAndRol);

        switch (this.empleadoLogged.getRol()) {
            case RolUsuario.ADMIN -> {
                content.setSelectedIndex(0);
                loadEmpleados();
                loadClientes();
            }
            case RolUsuario.RECEPCION ->
                content.setSelectedIndex(1);
            case RolUsuario.LIMPIEZA ->
                content.setSelectedIndex(2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar = new javax.swing.JPanel();
        logoImg = new javax.swing.JLabel();
        loggedUserNameLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        content = new javax.swing.JTabbedPane();
        adminTabbedPane = new javax.swing.JTabbedPane();
        empleadosPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empleadosTable = new javax.swing.JTable();
        empleadosForm = new javax.swing.JPanel();
        empDocumentoLabel = new javax.swing.JLabel();
        empDocumentoText = new javax.swing.JTextField();
        empNombreLabel = new javax.swing.JLabel();
        empNombreText = new javax.swing.JTextField();
        empEmailLabel = new javax.swing.JLabel();
        empEmailText = new javax.swing.JTextField();
        empPassLabel = new javax.swing.JLabel();
        empPassText = new javax.swing.JTextField();
        empRolLabel = new javax.swing.JLabel();
        empRolList = new javax.swing.JComboBox<>();
        empSupervisorLabel = new javax.swing.JLabel();
        empSupervisorList = new javax.swing.JComboBox<>();
        empSaveBtn = new javax.swing.JButton();
        empCleanBtn = new javax.swing.JButton();
        empEditButton = new javax.swing.JButton();
        empDeleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        empHabitacionesList = new javax.swing.JList<>();
        empHabitacionesLabel = new javax.swing.JLabel();
        clientesPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        empleadosForm1 = new javax.swing.JPanel();
        cliDocumentoLabel = new javax.swing.JLabel();
        cliDocumentoText = new javax.swing.JTextField();
        cliNombreLabel = new javax.swing.JLabel();
        cliNombreText = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        cliEmailText = new javax.swing.JTextField();
        cliPassLabel = new javax.swing.JLabel();
        cliPassText = new javax.swing.JTextField();
        cliSaveBtn = new javax.swing.JButton();
        cliCleanBtn = new javax.swing.JButton();
        cliEditButton = new javax.swing.JButton();
        cliDeleteBtn = new javax.swing.JButton();
        recepcionTabbedPane = new javax.swing.JTabbedPane();
        reservasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toolbar.setBackground(new java.awt.Color(0, 0, 0));
        toolbar.setMaximumSize(new java.awt.Dimension(910, 80));
        toolbar.setMinimumSize(new java.awt.Dimension(910, 80));

        logoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logonombre.png"))); // NOI18N

        loggedUserNameLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loggedUserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        loggedUserNameLabel.setText("Bienvenidx");

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_logout.png"))); // NOI18N
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(loggedUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logoImg)
                .addGap(16, 16, 16)
                .addComponent(logoutBtn)
                .addGap(16, 16, 16))
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoImg))
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(loggedUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(20, 20, 20))
        );

        getContentPane().add(toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        content.setEnabled(false);
        content.setMaximumSize(new java.awt.Dimension(900, 680));
        content.setMinimumSize(new java.awt.Dimension(900, 680));
        content.setPreferredSize(new java.awt.Dimension(900, 680));

        adminTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        empleadosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empleadosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombre", "Email", "Rol", "Supervisor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empleadosTable);

        empleadosPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1068, 268));

        empleadosForm.setLayout(new java.awt.GridLayout(7, 3, 20, 10));

        empDocumentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empDocumentoLabel.setText("Documento");
        empleadosForm.add(empDocumentoLabel);
        empleadosForm.add(empDocumentoText);

        empNombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empNombreLabel.setText("Nombre");
        empleadosForm.add(empNombreLabel);
        empleadosForm.add(empNombreText);

        empEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empEmailLabel.setText("Email");
        empleadosForm.add(empEmailLabel);
        empleadosForm.add(empEmailText);

        empPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empPassLabel.setText("Contraseña");
        empleadosForm.add(empPassLabel);
        empleadosForm.add(empPassText);

        empRolLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empRolLabel.setText("Rol");
        empleadosForm.add(empRolLabel);

        empleadosForm.add(empRolList);

        empSupervisorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empSupervisorLabel.setText("Supervisor");
        empleadosForm.add(empSupervisorLabel);

        empleadosForm.add(empSupervisorList);

        empSaveBtn.setText("Crear");
        empSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSaveBtnActionPerformed(evt);
            }
        });
        empleadosForm.add(empSaveBtn);

        empCleanBtn.setText("Limpiar");
        empCleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empCleanBtnActionPerformed(evt);
            }
        });
        empleadosForm.add(empCleanBtn);

        empleadosPanel.add(empleadosForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 18, 470, 246));

        empEditButton.setText("Editar");
        empEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEditButtonActionPerformed(evt);
            }
        });
        empleadosPanel.add(empEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        empDeleteBtn.setText("Eliminar");
        empDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDeleteBtnActionPerformed(evt);
            }
        });
        empleadosPanel.add(empDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        jScrollPane2.setViewportView(null);

        jScrollPane2.setViewportView(empHabitacionesList);

        empleadosPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 160, 180));

        empHabitacionesLabel.setText("Habitaciones a cargo");
        empleadosPanel.add(empHabitacionesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        adminTabbedPane.addTab("Empleados", empleadosPanel);

        clientesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Documento", "Nombre", "Email", "Reservas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(clientesTable);

        clientesPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1068, 268));

        empleadosForm1.setLayout(new java.awt.GridLayout(7, 3, 20, 10));

        cliDocumentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliDocumentoLabel.setText("Documento");
        empleadosForm1.add(cliDocumentoLabel);
        empleadosForm1.add(cliDocumentoText);

        cliNombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliNombreLabel.setText("Nombre");
        empleadosForm1.add(cliNombreLabel);
        empleadosForm1.add(cliNombreText);

        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EmailLabel.setText("Email");
        empleadosForm1.add(EmailLabel);
        empleadosForm1.add(cliEmailText);

        cliPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliPassLabel.setText("Contraseña");
        empleadosForm1.add(cliPassLabel);
        empleadosForm1.add(cliPassText);

        cliSaveBtn.setText("Crear");
        cliSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliSaveBtnActionPerformed(evt);
            }
        });
        empleadosForm1.add(cliSaveBtn);

        cliCleanBtn.setText("Limpiar");
        cliCleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCleanBtnActionPerformed(evt);
            }
        });
        empleadosForm1.add(cliCleanBtn);

        clientesPanel.add(empleadosForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 18, 530, 246));

        cliEditButton.setText("Editar");
        cliEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliEditButtonActionPerformed(evt);
            }
        });
        clientesPanel.add(cliEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        cliDeleteBtn.setText("Eliminar");
        cliDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliDeleteBtnActionPerformed(evt);
            }
        });
        clientesPanel.add(cliDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        adminTabbedPane.addTab("Clientes", clientesPanel);

        content.addTab("tab2", adminTabbedPane);

        recepcionTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout reservasPanelLayout = new javax.swing.GroupLayout(reservasPanel);
        reservasPanel.setLayout(reservasPanelLayout);
        reservasPanelLayout.setHorizontalGroup(
            reservasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );
        reservasPanelLayout.setVerticalGroup(
            reservasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        recepcionTabbedPane.addTab("tab1", reservasPanel);

        content.addTab("tab2", recepcionTabbedPane);

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSaveBtnActionPerformed
        String documento = empDocumentoText.getText();
        String email = empEmailText.getText();
        String nombre = empNombreText.getText();
        String pass = empPassText.getText();

        if (!documento.isEmpty() && !email.isEmpty() && !nombre.isEmpty() && !pass.isEmpty()) {
            boolean existe = false;

            for (Empleado empleado : Main.empleados()) {
                if (empleado.getDocumento().equals(documento) || empleado.getEmail().equals(email)) {
                    existe = true;
                }
            }

            Empleado newEmpleado = new Empleado(documento, nombre, email, pass, empSelectedRol);
            newEmpleado.setSupervisor(empSelectedSupervisor);

            for (int i : empSelectedHabitaciones) {
                newEmpleado.getHabitacionesAsiganadas().add(Main.habitaciones().get(i));
            }

            if (empSaveBtn.getText().equals("Crear")) {
                if (!existe) {
                    Main.hotel.getEmpleados().crear(newEmpleado);
                    loadEmpleados();
                } else {
                    JOptionPane.showMessageDialog(this, "El documento o email ya estan registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (empSelectedSupervisor != null && !empSelectedSupervisor.getDocumento().equals(documento)) {
                    Main.hotel.getEmpleados().actualizar(empUpdateIndex, newEmpleado);
                    loadEmpleados();
                } else {
                    JOptionPane.showMessageDialog(this, "El supervisor no puede ser el mismo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_empSaveBtnActionPerformed

    private void empEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEditButtonActionPerformed
        empUpdateIndex = empleadosTable.getSelectedRow();
        if (empUpdateIndex != -1) {
            Empleado empleado = Main.empleados().get(empUpdateIndex);
            empDocumentoText.setEnabled(false);
            empDocumentoText.setText(empleado.getDocumento());
            empNombreText.setText(empleado.getNombre());
            empEmailText.setEnabled(false);
            empEmailText.setText(empleado.getEmail());
            empPassText.setText(empleado.getPassword());

            empRolList.setSelectedItem(empleado.getRol().name());
            if (empleado.getSupervisor() != null) {
                empSupervisorList.setSelectedItem(empleado.getSupervisor().getNombre());
            } else {
                empSupervisorList.setSelectedItem(null);
            }

            List<String> habitaciones = Main.habitaciones()
                    .stream().map(it -> "" + it.getNumero() + " (" + it.getTipo().name() + ")")
                    .sorted().collect(Collectors.toList());

            String[] asignadas = empleado.getHabitacionesAsiganadas()
                    .stream().map(it -> "" + it.getNumero() + " (" + it.getTipo().name() + ")")
                    .sorted().toArray(String[]::new);

            int[] indices = new int[asignadas.length];
            for (int i = 0; i < asignadas.length; i++) {
                int index = habitaciones.indexOf(asignadas[i]);
                indices[i] = index;
            }
            empHabitacionesList.setSelectedIndices(indices);

            empSaveBtn.setText("Guardar");
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_empEditButtonActionPerformed

    private void empCleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empCleanBtnActionPerformed
        empDocumentoText.setEnabled(true);
        empDocumentoText.setText("");
        empNombreText.setText("");
        empEmailText.setEnabled(true);
        empEmailText.setText("");
        empPassText.setText("");

        empSaveBtn.setText("Crear");
        empUpdateIndex = -1;
        loadEmpleados();

    }//GEN-LAST:event_empCleanBtnActionPerformed

    private void empDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDeleteBtnActionPerformed
        int index = empleadosTable.getSelectedRow();
        if (index != -1) {
            Empleado empleado = Main.empleados().get(index);

            int result = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el empleado " + empleado.getNombre() + "?",
                    "Eliminar",
                    JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                Main.hotel.getEmpleados().eliminar(empleado);
                loadEmpleados();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_empDeleteBtnActionPerformed

    private void cliSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliSaveBtnActionPerformed
        String documento = cliDocumentoText.getText();
        String email = cliEmailText.getText();
        String nombre = cliNombreText.getText();
        String pass = cliPassText.getText();

        if (!documento.isEmpty() && !email.isEmpty() && !nombre.isEmpty() && !pass.isEmpty()) {
            boolean existe = false;

            for (Cliente cliente : Main.clientes()) {
                if (cliente.getDocumento().equals(documento) || cliente.getEmail().equals(email)) {
                    existe = true;
                }
            }

            Cliente newCliente = new Cliente(documento, nombre, email, pass);

            if (cliSaveBtn.getText().equals("Crear")) {
                if (!existe) {
                    Main.hotel.getClientes().crear(newCliente);
                    loadEmpleados();
                } else {
                    JOptionPane.showMessageDialog(this, "El documento o email ya estan registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Main.hotel.getClientes().actualizar(cliUpdateIndex, newCliente);
                loadEmpleados();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cliSaveBtnActionPerformed

    private void cliCleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCleanBtnActionPerformed
        cliDocumentoText.setEnabled(true);
        cliDocumentoText.setText("");
        cliNombreText.setText("");
        cliEmailText.setEnabled(true);
        cliEmailText.setText("");
        cliPassText.setText("");

        cliSaveBtn.setText("Crear");
        cliUpdateIndex = -1;
        loadClientes();
    }//GEN-LAST:event_cliCleanBtnActionPerformed

    private void cliEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliEditButtonActionPerformed
        cliUpdateIndex = clientesTable.getSelectedRow();
        if (cliUpdateIndex != -1) {
            Cliente cliente = Main.clientes().get(cliUpdateIndex);
            cliDocumentoText.setEnabled(false);
            cliDocumentoText.setText(cliente.getDocumento());
            cliNombreText.setText(cliente.getNombre());
            cliEmailText.setEnabled(false);
            cliEmailText.setText(cliente.getEmail());
            cliPassText.setText(cliente.getPassword());

            empSaveBtn.setText("Guardar");
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cliEditButtonActionPerformed

    private void cliDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliDeleteBtnActionPerformed
        int index = clientesTable.getSelectedRow();
        if (index != -1) {
            Cliente cliente = Main.clientes().get(index);

            int result = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el cliente " + cliente.getNombre() + "?",
                    "Eliminar",
                    JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                Main.hotel.getClientes().eliminar(cliente);
                loadClientes();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cliDeleteBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        int result = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea cerrar la sesión?",
                "Cerrar sesión",
                JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            InicialUI inicialUI = new InicialUI();
            inicialUI.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void loadEmpleados() {
        int totalEmpleados = Main.empleados().size();
        String[] columnNames = {"Documento", "Nombre", "Email", "Rol", "Supervisor"};
        empleadosTable.setModel(new DefaultTableModel(columnNames, totalEmpleados));

        String[] habitaciones = Main.habitaciones()
                .stream().map(it -> "" + it.getNumero() + " (" + it.getTipo().name() + ")")
                .sorted().toArray(String[]::new);
        empHabitacionesList.setListData(habitaciones);
        empHabitacionesList.addListSelectionListener((e) -> {
            empSelectedHabitaciones = empHabitacionesList.getSelectedIndices();
        });

        empSupervisorList.removeAllItems();
        for (int i = 0; i < totalEmpleados; i++) {
            Empleado empleado = Main.empleados().get(i);
            Empleado supervisor = empleado.getSupervisor();

            empSupervisorList.addItem(empleado.getNombre());

            empleadosTable.getModel().setValueAt(empleado.getDocumento(), i, 0);
            empleadosTable.getModel().setValueAt(empleado.getNombre(), i, 1);
            empleadosTable.getModel().setValueAt(empleado.getEmail(), i, 2);
            empleadosTable.getModel().setValueAt(empleado.getRol().name(), i, 3);
            if (supervisor != null) {
                empleadosTable.getModel().setValueAt(supervisor.getNombre(), i, 4);
            } else {
                empleadosTable.getModel().setValueAt(" --- ", i, 4);
            }
        }

        empSupervisorList.addItemListener((e) -> {
            int index = empSupervisorList.getSelectedIndex();
            if (index != -1) {
                empSelectedSupervisor = Main.empleados().get(index);
            } else {
                empSelectedSupervisor = null;
            }
        });

        if (empSupervisorList.getItemCount() > 0) {
            empSelectedSupervisor = Main.empleados().get(0);
        }

        if (empRolList.getItemCount() == 0) {
            for (RolUsuario rol : RolUsuario.values()) {
                empRolList.addItem(rol.name());
            }

            empRolList.addItemListener((e) -> {
                empSelectedRol = RolUsuario.valueOf(empRolList.getSelectedItem().toString());
            });
        }

        empSelectedRol = RolUsuario.ADMIN;

    }

    private void loadClientes() {

        int totalClientes = Main.clientes().size();
        String[] columnNames = {"Documento", "Nombre", "Email", "Reservas"};
        clientesTable.setModel(new DefaultTableModel(columnNames, totalClientes));

        for (int i = 0; i < totalClientes; i++) {
            Cliente cliente = Main.clientes().get(i);
            cliente.setReservas(Main.reservaciones(cliente.getDocumento()));

            clientesTable.getModel().setValueAt(cliente.getDocumento(), i, 0);
            clientesTable.getModel().setValueAt(cliente.getNombre(), i, 1);
            clientesTable.getModel().setValueAt(cliente.getEmail(), i, 2);
            clientesTable.getModel().setValueAt(cliente.getReservas().size(), i, 3);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTabbedPane adminTabbedPane;
    private javax.swing.JButton cliCleanBtn;
    private javax.swing.JButton cliDeleteBtn;
    private javax.swing.JLabel cliDocumentoLabel;
    private javax.swing.JTextField cliDocumentoText;
    private javax.swing.JButton cliEditButton;
    private javax.swing.JTextField cliEmailText;
    private javax.swing.JLabel cliNombreLabel;
    private javax.swing.JTextField cliNombreText;
    private javax.swing.JLabel cliPassLabel;
    private javax.swing.JTextField cliPassText;
    private javax.swing.JButton cliSaveBtn;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JTable clientesTable;
    private javax.swing.JTabbedPane content;
    private javax.swing.JButton empCleanBtn;
    private javax.swing.JButton empDeleteBtn;
    private javax.swing.JLabel empDocumentoLabel;
    private javax.swing.JTextField empDocumentoText;
    private javax.swing.JButton empEditButton;
    private javax.swing.JLabel empEmailLabel;
    private javax.swing.JTextField empEmailText;
    private javax.swing.JLabel empHabitacionesLabel;
    private javax.swing.JList<String> empHabitacionesList;
    private javax.swing.JLabel empNombreLabel;
    private javax.swing.JTextField empNombreText;
    private javax.swing.JLabel empPassLabel;
    private javax.swing.JTextField empPassText;
    private javax.swing.JLabel empRolLabel;
    private javax.swing.JComboBox<String> empRolList;
    private javax.swing.JButton empSaveBtn;
    private javax.swing.JLabel empSupervisorLabel;
    private javax.swing.JComboBox<String> empSupervisorList;
    private javax.swing.JPanel empleadosForm;
    private javax.swing.JPanel empleadosForm1;
    private javax.swing.JPanel empleadosPanel;
    private javax.swing.JTable empleadosTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loggedUserNameLabel;
    private javax.swing.JLabel logoImg;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JTabbedPane recepcionTabbedPane;
    private javax.swing.JPanel reservasPanel;
    private javax.swing.JPanel toolbar;
    // End of variables declaration//GEN-END:variables
}
