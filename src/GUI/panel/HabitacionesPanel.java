/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.panel;

import GUI.Componentes;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Habitacion;
import sistemareserva.Main;

/**
 *
 * @author RaikerXV
 */
public class HabitacionesPanel extends JPanel {

    private static final int MAX_PER_PAGE_HOME_HABITACION = 3;
    private int habitacionespaginaActual = 0;
    private int habitacionesPaginasTotales;
    
    private final JFrame parentFrame;
    
    public HabitacionesPanel(JFrame parentFrame) {
        super();
        this.parentFrame = parentFrame;
        habitacionesPaginasTotales = Main.habitaciones().size() / MAX_PER_PAGE_HOME_HABITACION;
        if (Main.habitaciones().size() % MAX_PER_PAGE_HOME_HABITACION != 0) {
            habitacionesPaginasTotales++;
        }
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }

    public void cargarHabitaciones() {
        removeAll();
        revalidate();
        repaint();  
        
        List<Habitacion> filtrados;

        if (Main.habitaciones().size() <= MAX_PER_PAGE_HOME_HABITACION) {
            filtrados = Main.habitaciones();
        } else {
            int inicio = habitacionespaginaActual * MAX_PER_PAGE_HOME_HABITACION;
            int fin = inicio + MAX_PER_PAGE_HOME_HABITACION;
            if (fin > Main.habitaciones().size()) {
                fin = Main.habitaciones().size();
            }
            filtrados = Main.habitaciones().subList(inicio, fin);
        }
        
        javax.swing.JLabel titlehome3body = new javax.swing.JLabel();
        titlehome3body.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        titlehome3body.setForeground(new java.awt.Color(255, 255, 255));
        titlehome3body.setText("Habitaciones:");
        add(titlehome3body, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 260, 70));
        
        Componentes.buildHabitacioncard(filtrados.get(0), 50, 140, true, this, parentFrame); // primer card
        if (filtrados.size() > 1) {
            Componentes.buildHabitacioncard(filtrados.get(1), 380, 140, true, this, parentFrame); //segunda card
        }
        if (filtrados.size() > 2) {
            Componentes.buildHabitacioncard(filtrados.get(2), 715, 140, true, this, parentFrame); //tercer card
        }
        buildButtonhabitacion("<", 270);
        buildButtonhabitacion(">", 720);
        
        javax.swing.JLabel body3background = new javax.swing.JLabel();
        body3background.setIcon(new javax.swing.ImageIcon(parentFrame.getClass().getResource("/imagenes/homepage3body.jpg"))); // NOI18N
        add(body3background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));
        
    }
    
    private void buildButtonhabitacion(String contentButton, int x) {
        javax.swing.JButton buttonHabitacion = new javax.swing.JButton();
        buttonHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        buttonHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        buttonHabitacion.setText(contentButton);
        buttonHabitacion.addActionListener(this::changeHabitacionesPage);
        add(buttonHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, 550, 70, 30 ));
    }
    
    private void changeHabitacionesPage(java.awt.event.ActionEvent evt) {
        if (evt.getActionCommand().equals(">")) {
            if (habitacionespaginaActual < habitacionesPaginasTotales - 1) {
                habitacionespaginaActual++;
                cargarHabitaciones();
            }
        } else {
            if (habitacionespaginaActual > 0) {
                habitacionespaginaActual--;
                cargarHabitaciones();
            }
        }

    }
    
}
