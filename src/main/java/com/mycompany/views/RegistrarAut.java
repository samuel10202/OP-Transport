/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import OP.DAOAutobusesimpl;
import com.mycompany.interfaces.DAOAutobuses;
import java.awt.Color;

/**
 *
 * @author pes20
 */
public class RegistrarAut extends javax.swing.JPanel {
    
    boolean isEdition = false;
    com.mycompany.models.Autobuses autobusEdition;
    
    public RegistrarAut() {
        initComponents();
        InitStyles();
    }
    
    public RegistrarAut(com.mycompany.models.Autobuses autobus){
        initComponents();
        isEdition = true;
        autobusEdition = autobus;
        InitStyles();
    }
    
    private void InitStyles(){
        title.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        title.setForeground(Color.black);
        marcaTxt.putClientProperty("JTextField.placeholderText", "Ingrese la marca del autobus.");
        modeloTxt.putClientProperty("JTextField.placeholderText", "Ingrese el modelo del autobus.");
        añofabTxt.putClientProperty("JTextField.placeholderText", "Ingrese el año de fabricacion del autobus.");
        plazas_dispTxt.putClientProperty("JTextField.placeholderText", "Ingrese las plazas disponibles.");
        placaTxt.putClientProperty("JTextField.placeholderText", "Ingrese la placa del autobus.");
        kilomeTxt.putClientProperty("JTextField.placeholderText", "Ingrese el kilometraje del autobus.");
        
        if(isEdition){
            title.setText("Editar autobus");
            button.setText("Guardar");
            
            if(autobusEdition != null){
                marcaTxt.setText(autobusEdition.getMarca());
                modeloTxt.setText(autobusEdition.getModelo());
                añofabTxt.setText(autobusEdition.getAño_fabricacion());
                plazas_dispTxt.setText(String.valueOf(autobusEdition.getPlazas_disponibles()));
                placaTxt.setText(autobusEdition.getPlaca());
                kilomeTxt.setText(String.valueOf(autobusEdition.getKilometraje()));
                
            }
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

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        marcaTxt = new javax.swing.JTextField();
        modelo = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();
        año_fab = new javax.swing.JLabel();
        añofabTxt = new javax.swing.JTextField();
        plazas_disp = new javax.swing.JLabel();
        plazas_dispTxt = new javax.swing.JTextField();
        placa = new javax.swing.JLabel();
        placaTxt = new javax.swing.JTextField();
        kilome = new javax.swing.JLabel();
        kilomeTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(576, 410));

        title.setText("Registrar nuevo autobus");

        marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        marca.setText("Marca");

        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });

        modelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modelo.setText("Modelo");

        año_fab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        año_fab.setText("Año de fabricacion");

        plazas_disp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plazas_disp.setText("Plazas disponible");

        placa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        placa.setText("Placa");

        kilome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kilome.setText("Kilometraje");

        kilomeTxt.setToolTipText("");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(kilome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(marcaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(kilomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(modeloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(año_fab, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(plazas_disp, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(añofabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(plazas_dispTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title)
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marca)
                    .addComponent(kilome))
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modeloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(año_fab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plazas_disp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añofabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plazas_dispTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String kilomeString = kilomeTxt.getText();
        int klm = 0;
        String plazaString = plazas_dispTxt.getText();
        int plazas = 0;

        if (!plazaString.isEmpty() || kilomeString.isEmpty()) {
            try {
                plazas = Integer.parseInt(plazaString);
                klm = Integer.parseInt(kilomeString);// Convertimos el ID de String a int
                // Si el ID es válido, continuamos con la validación de los otros campos
            } catch (NumberFormatException e) {
                // Manejar el caso en que el ID no sea un número válido
                javax.swing.JOptionPane.showMessageDialog(this, "Los numeros deben ser enteros validos.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                if (plazaString.isEmpty()) {
                    plazas_dispTxt.requestFocus();
                } else {
                    kilomeTxt.requestFocus();
                }
                return; // Salimos del método si el ID no es válido
            }
        } else {
            // Manejar el caso en que el ID esté vacío
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un numero de plazas disponibles y un kilometraje.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if (plazaString.isEmpty()) {
                plazas_dispTxt.requestFocus();
            } else {
                kilomeTxt.requestFocus();
            }
            return; // Salimos del método si el ID está vacío
        }

        String marc = marcaTxt.getText();
        String model = modeloTxt.getText();
        String añofab = añofabTxt.getText();
        String plazasdisp = plazas_dispTxt.getText();
        String plac = placaTxt.getText();
        String kilom = kilomeTxt.getText();

        if (marc.isEmpty() || model.isEmpty() || añofab.isEmpty() || plazasdisp.isEmpty() || plac.isEmpty() || kilom.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            marcaTxt.requestFocus();
            return; // Salimos del método si algún campo está vacío
        }

        com.mycompany.models.Autobuses autobus = isEdition ? autobusEdition : new com.mycompany.models.Autobuses();
        autobus.setMarca(marc);
        autobus.setModelo(model);
        autobus.setAño_fabricacion(añofab);
        autobus.setPlazas_disponibles(plazas);
        autobus.setPlaca(plac);
        autobus.setKilometraje(klm);

        try {
            DAOAutobuses dao = new DAOAutobusesimpl();
            if (!isEdition) {
                dao.registrar(autobus);
            } else {
                dao.modificar(autobus);
            }
            String succesMsg = isEdition ? "modificado" : "registrado";
            javax.swing.JOptionPane.showMessageDialog(this, "Autobus " + succesMsg + " correctamente \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if(!isEdition){
                marcaTxt.setText("");
                modeloTxt.setText("");
                añofabTxt.setText("");
                plazas_dispTxt.setText("");
                placaTxt.setText("");
                kilomeTxt.setText("");
            }    
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showConfirmDialog(this, "Ocurrio un error " + errorMsg + " al autobus. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel año_fab;
    private javax.swing.JTextField añofabTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel kilome;
    private javax.swing.JTextField kilomeTxt;
    private javax.swing.JLabel marca;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JLabel modelo;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JLabel placa;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JLabel plazas_disp;
    private javax.swing.JTextField plazas_dispTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
