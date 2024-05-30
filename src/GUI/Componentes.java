/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;
import modelo.Habitacion;

/**
 *
 * @author Usuario
 */
public class Componentes {

    public static void buildHabitacioncard(Habitacion habitacion, int x, int y, boolean showButton, javax.swing.JPanel contenedor, JFrame frame) {
        javax.swing.JPanel habitacionPanel = new javax.swing.JPanel();
        javax.swing.JPanel preciocontent = new javax.swing.JPanel();
        javax.swing.JLabel precioHabitacion = new javax.swing.JLabel();
        javax.swing.JLabel precioetiqueta = new javax.swing.JLabel();
        javax.swing.JLabel iconHabitacion = new javax.swing.JLabel();
        javax.swing.JButton Reservarbutton = new javax.swing.JButton();
        javax.swing.JLabel tipoHabitacion = new javax.swing.JLabel();
        javax.swing.JPanel detallesHabitacion = new javax.swing.JPanel();
        javax.swing.JLabel detalle1 = new javax.swing.JLabel();
        javax.swing.JLabel detalle2 = new javax.swing.JLabel();
        javax.swing.JLabel detalle3 = new javax.swing.JLabel();
        javax.swing.JLabel detalle4 = new javax.swing.JLabel();

        habitacionPanel.setBackground(new java.awt.Color(255, 255, 255));
        habitacionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        preciocontent.setBackground(new java.awt.Color(0, 0, 0));

        precioHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        precioHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        precioHabitacion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        precioHabitacion.setText("" + habitacion.getPrecioPorNoche());

        precioetiqueta.setIcon(new javax.swing.ImageIcon(frame.getClass().getResource("/imagenes/receipt-dollar_1.png"))); // NOI18N
        precioetiqueta.setText("");
        precioetiqueta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout preciocontentLayout = new javax.swing.GroupLayout(preciocontent);
        preciocontent.setLayout(preciocontentLayout);
        preciocontentLayout.setHorizontalGroup(
                preciocontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preciocontentLayout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addComponent(precioetiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );
        preciocontentLayout.setVerticalGroup(
                preciocontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(precioHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precioetiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        habitacionPanel.add(preciocontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, 40));

        iconHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        iconHabitacion.setIcon(new javax.swing.ImageIcon(frame.getClass().getResource(habitacion.getIcono())));
        habitacionPanel.add(iconHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 230));

        if (showButton) {
            Reservarbutton.setBackground(new java.awt.Color(0, 0, 0));
            Reservarbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            Reservarbutton.setForeground(new java.awt.Color(255, 255, 255));
            Reservarbutton.setText("Reservar");

            Reservarbutton.addActionListener((e) -> {
                ReservaUI reservaUI = new ReservaUI(habitacion);
                reservaUI.setVisible(true);
            });
            habitacionPanel.add(Reservarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        }

        tipoHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 18));// NOI18N
        tipoHabitacion.setText(habitacion.getTipo().name() + " (" + habitacion.getNumero() + ")");
        habitacionPanel.add(tipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 20));

        detallesHabitacion.setLayout(new java.awt.GridLayout(1, 4));

        detalle1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle1.setText(habitacion.getDetalles().isTv() ? "TV" : "");
        detallesHabitacion.add(detalle1);

        detalle2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle2.setText(habitacion.getDetalles().isCamaDoble() ? "<html><p>Cama<br>doble</p></html>" : "");
        detallesHabitacion.add(detalle2);

        detalle3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle3.setText(habitacion.getDetalles().isMinibar() ? "<html><p>Mini<br>bar</p></html>" : "");
        detallesHabitacion.add(detalle3);

        detalle4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle4.setText(habitacion.getDetalles().isJacuzzi() ? "Jacuzzi" : "");
        detallesHabitacion.add(detalle4);

        habitacionPanel.add(detallesHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, 50));
        contenedor.add(habitacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 290, 390));

    }

}
