package com.mycompany.views;

import java.awt.Color;
import OP.DAOAutobusesimpl;
import OP.DAOConductoresimpl;
import OP.DAOReporteimpl;
import com.mycompany.interfaces.DAOAutobuses;
import com.mycompany.interfaces.DAOConductores;
import com.mycompany.interfaces.DAOReporte;
import Utils.Utils;
import java.util.Date;

public class RegistrarE extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarE
     */
    public RegistrarE() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        regE.setForeground(Color.white);
        regE.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        idaut.putClientProperty("FlatLaf.styleClass", "large");
        idaut.setForeground(Color.black);
        idcond.putClientProperty("FlatLaf.styleClass", "large");
        idcond.setForeground(Color.black);
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
        idcond = new javax.swing.JLabel();
        idautTxt = new javax.swing.JTextField();
        idaut = new javax.swing.JLabel();
        regE = new javax.swing.JButton();
        idcondTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        dine = new javax.swing.JLabel();
        dinTxt = new javax.swing.JTextField();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(576, 410));

        idcond.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idcond.setText("ID Conductor");

        idautTxt.setBackground(new java.awt.Color(255, 255, 255));
        idautTxt.setText("jTextField1");

        idaut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idaut.setText("ID Autobus");

        regE.setBackground(new java.awt.Color(0, 102, 153));
        regE.setText("Registrar Entrada");
        regE.setBorderPainted(false);
        regE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEActionPerformed(evt);
            }
        });

        idcondTxt.setBackground(new java.awt.Color(255, 255, 255));
        idcondTxt.setText("jTextField1");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        dine.setText("Dinero recaudado");

        dinTxt.setBackground(new java.awt.Color(255, 255, 255));
        dinTxt.setText("jTextField1");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idcondTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idaut)
                    .addComponent(idautTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idcond))
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dine)
                    .addComponent(dinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(regE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(idcond)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idcondTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(idaut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idautTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(dine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(regE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEActionPerformed
        /*String id_cond = idcondTxt.getText();
        String id_aut = idautTxt.getText();
        String dineroIngresado = dinTxt.getText(); // Campo para el dinero ingresado por el conductor

// Validaciones para los campos
        if (id_cond.isEmpty() || id_aut.isEmpty() || dineroIngresado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            idcondTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(id_cond) || !Utils.isNumeric(id_aut) || !Utils.isNumeric(dineroIngresado)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            idcondTxt.requestFocus();
            return;
        } else if (Integer.parseInt(id_cond) <= 0 || Integer.parseInt(id_aut) <= 0 || Integer.parseInt(dineroIngresado) <0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            idcondTxt.requestFocus();
            return;
        }

        try {
            DAOConductores daoConductores = new DAOConductoresimpl();

            // Validamos existencia del usuario
            com.mycompany.models.Conductores currentConductor = daoConductores.getConductorById(Integer.parseInt(id_cond));
            if (currentConductor == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idcondTxt.requestFocus();
                return;
            }

            DAOAutobuses daoAutobuses = new DAOAutobusesimpl();

            // Validamos existencia del libro
            com.mycompany.models.Autobuses currentAutobus = daoAutobuses.getAutobusById(Integer.parseInt(id_aut));
            if (currentAutobus == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idautTxt.requestFocus();
                return;
            }

            DAOReporte daoReporte = new DAOReporteimpl();

            // Validamos que el usuario tenga ese libro prestado.
            com.mycompany.models.Reporte currentReporte = daoReporte.getReporte(currentConductor, currentAutobus, dineroIngresado);
            if (currentReporte == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idautTxt.requestFocus();
                return;
            }

            // Todo OK: Devolvemos libro.
            currentReporte.setDate_return(Utils.getFechaActual());
            daoReporte.modificar(currentReporte);

            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentAutobus.getID() + " devuelto exitosamente por " + currentConductor.getNombres()+ ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            idcondTxt.setText("");
            idautTxt.setText("");
            dinTxt.setText("");

            // Verificamos sanciones
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }*/

        String id_cond = idcondTxt.getText();
        String id_aut = idautTxt.getText();
        String dineroRecogido = dinTxt.getText(); // Agregar la lectura del campo de texto del dinero recogido

// Validaciones para los campos
        if (id_cond.isEmpty() || id_aut.isEmpty() || dineroRecogido.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            if (id_cond.isEmpty()) {
                idcondTxt.requestFocus();
            } else if (id_aut.isEmpty()) {
                idautTxt.requestFocus();
            } else {
                dinTxt.requestFocus();
            }
            return;
        } else if (!Utils.isNumeric(id_cond) || !Utils.isNumeric(id_aut) || !Utils.isNumeric(dineroRecogido)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos ID conductor, ID del autobus y dinero recogido deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            idcondTxt.requestFocus();
            return;
        } else if (Integer.parseInt(id_cond) <= 0 || Integer.parseInt(id_aut) <= 0 || Integer.parseInt(dineroRecogido) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos ID conductor, ID del autobus y dinero recogido deben ser mayores que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            idcondTxt.requestFocus();
            return;
        }

        try {
            DAOConductores daoConductores = new DAOConductoresimpl();

            // Validamos existencia del conductor
            com.mycompany.models.Conductores currentConductor = daoConductores.getConductorById(Integer.parseInt(id_cond));
            if (currentConductor == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún conductor con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idcondTxt.requestFocus();
                return;
            }

            DAOAutobuses daoAutobuses = new DAOAutobusesimpl();

            // Validamos existencia del autobús
            com.mycompany.models.Autobuses currentAutobus = daoAutobuses.getAutobusById(Integer.parseInt(id_aut));
            if (currentAutobus == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún autobús con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idautTxt.requestFocus();
                return;
            }

            DAOReporte daoReporte = new DAOReporteimpl();

            // Validamos que el conductor no tenga ya un autobús asignado.
            com.mycompany.models.Reporte currentAssignment = daoReporte.getReporte(currentConductor, currentAutobus, dineroRecogido);
            if (currentAssignment != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Este conductor ya tiene asignado este autobús. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idautTxt.requestFocus();
                return;
            }
            if (currentConductor != null && currentAutobus != null) {
                // Todo OK: Registrar salida del autobús con el conductor.
                String fechaActual = Utils.getFechaActual();
                com.mycompany.models.Reporte reporte = new com.mycompany.models.Reporte();
                reporte.setCond_id(currentConductor.getId());
                reporte.setAut_id(currentAutobus.getID());
                reporte.setDate_out(fechaActual);
                reporte.setDinero_recogido(Integer.parseInt(dineroRecogido)); // Agregar el dinero recogido al objeto Reporte
                daoReporte.registrar(reporte);

                javax.swing.JOptionPane.showMessageDialog(this, "Autobús ID: " + currentAutobus.getID() + " conducido por " + currentConductor.getNombres() + " registrado exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                idcondTxt.setText("");
                idautTxt.setText("");
                dinTxt.setText(""); // Limpiar el campo de texto del dinero recogido después del registro
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: No se puede registrar la salida. Conductor o autobús no encontrado.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar la entrada del autobús. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Imprimir la excepción en la consola
        }
    }//GEN-LAST:event_regEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField dinTxt;
    private javax.swing.JLabel dine;
    private javax.swing.JLabel idaut;
    private javax.swing.JTextField idautTxt;
    private javax.swing.JLabel idcond;
    private javax.swing.JTextField idcondTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton regE;
    // End of variables declaration//GEN-END:variables
}
