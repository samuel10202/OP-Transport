package com.mycompany.views;

import OP.DAOConductoresimpl;
import com.mycompany.interfaces.DAOConductores;
import java.awt.Color;

public class RegistrarCon extends javax.swing.JPanel {

    boolean isEdition = false;
    com.mycompany.models.Conductores conductorEdition;

    public RegistrarCon() {
        initComponents();
        InitStyles();
    }

    public RegistrarCon(com.mycompany.models.Conductores conductor) {
        initComponents();
        isEdition = true;
        conductorEdition = conductor;
        InitStyles();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        title.setForeground(Color.black);
        ccTxt.putClientProperty("JTextField.placeholderText", "Ingrese la CC del conductor.");
        nameTxt.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del conductor.");
        apelliTxt.putClientProperty("JTextField.placeholderText", "Ingrese el apellido del conductor.");
        fechnacTxt.putClientProperty("JTextField.placeholderText", "Ingrese la fecha de nacimiento del conductor.");
        numtlTxt.putClientProperty("JTextField.placeholderText", "Ingrese el teléfono del conductor.");
        direccionTxt.putClientProperty("JTextField.placeholderText", "Ingrese la direccion del conductor.");
        genTxt.putClientProperty("JTextField.placeholderText", "Ingrese el genero de la persona.");
        numlicTxt.putClientProperty("JTextField.placeholderText", "Ingrese el numero de licencia.");
        fechexTxt.putClientProperty("JTextField.placeholderText", "Ingrese fecha de expedicion de la licencia.");
        fechvenTxt.putClientProperty("JTextField.placeholderText", "Ingrese fecha de vencimiento de la licencia.");

        if (isEdition) {
            title.setText("Editar conductor");
            button.setText("Guardar");

            if (conductorEdition != null) {
                ccTxt.setText(String.valueOf(conductorEdition.getCc()));
                nameTxt.setText(conductorEdition.getNombres());
                apelliTxt.setText(conductorEdition.getApellidos());
                fechnacTxt.setText(conductorEdition.getFecha_nacimiento());
                numtlTxt.setText(String.valueOf(conductorEdition.getTelefono()));
                direccionTxt.setText(conductorEdition.getDireccion());
                genTxt.setText(conductorEdition.getGenero());
                numlicTxt.setText(String.valueOf(conductorEdition.getLicencia()));
                fechexTxt.setText(conductorEdition.getFecha_expeLicen());
                fechvenTxt.setText(conductorEdition.getFecha_vencLicen());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        apelli = new javax.swing.JLabel();
        apelliTxt = new javax.swing.JTextField();
        fechnac = new javax.swing.JLabel();
        fechnacTxt = new javax.swing.JTextField();
        numtl = new javax.swing.JLabel();
        numtlTxt = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        gen = new javax.swing.JLabel();
        genTxt = new javax.swing.JTextField();
        cc = new javax.swing.JLabel();
        ccTxt = new javax.swing.JTextField();
        numlic = new javax.swing.JLabel();
        numlicTxt = new javax.swing.JTextField();
        fechex = new javax.swing.JLabel();
        fechexTxt = new javax.swing.JTextField();
        fechven = new javax.swing.JLabel();
        fechvenTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(576, 410));

        title.setText("Registrar nuevo conductor");

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("Nombres");

        apelli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apelli.setText("Apellidos");

        fechnac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechnac.setText("Fecha de nacimiento");

        numtl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numtl.setText("Numero de telefono");

        direccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        direccion.setText("Direccion");

        gen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gen.setText("Genero");

        genTxt.setToolTipText("");

        cc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cc.setText("CC");

        ccTxt.setToolTipText("");

        numlic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numlic.setText("Numero de licencia");

        numlicTxt.setToolTipText("");

        fechex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechex.setText("Fecha de expedicion");

        fechexTxt.setToolTipText("");

        fechven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechven.setText("Fecha de vencim.");

        fechvenTxt.setToolTipText("");

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
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(apelli, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(fechnac, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(numtl, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(apelliTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(fechnacTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(numtlTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addGap(94, 94, 94)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(genTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(gen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(numlic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addComponent(ccTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(cc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(175, 175, 175))
                            .addComponent(numlicTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(fechex, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(fechven, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(fechexTxt)
                                .addGap(18, 18, 18)
                                .addComponent(fechvenTxt)
                                .addGap(1, 1, 1)))))
                .addGap(38, 38, 38))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(203, 203, 203))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(gen))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apelli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apelliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechnac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechnacTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numlic, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(numlicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numtl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechex)
                    .addComponent(fechven))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numtlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechvenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String tlfString = numtlTxt.getText();
        int telef = 0;
        String ccString = ccTxt.getText();
        int CC = 0;
        String licString = numlicTxt.getText();
        int licen = 0;

        if (!tlfString.isEmpty() && !ccString.isEmpty() && !licString.isEmpty()) {
            try {
                telef = Integer.parseInt(tlfString); // Convertimos el número de plazas de String a int
                CC = Integer.parseInt(ccString); // Convertimos los kilómetros de String a int
                licen = Integer.parseInt(licString); // Convertimos otro campo de String a int
                // Si todos son válidos, continuamos con la validación de los otros campos
            } catch (NumberFormatException e) {
                // Manejar el caso en que algún número no sea un número válido
                javax.swing.JOptionPane.showMessageDialog(this, "Los números deben ser enteros válidos.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                // Determinar qué campo causó el error y asignarle el foco
                if (tlfString.isEmpty()) {
                    numtlTxt.requestFocus();
                } else if (ccString.isEmpty()) {
                    ccTxt.requestFocus();
                } else {
                    numlicTxt.requestFocus();
                }
                return; // Salimos del método si algún número no es válido
            }
        } else {
            // Manejar el caso en que algún campo esté vacío
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar números en todos los campos.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            // Determinar qué campo está vacío y asignarle el foco
            if (tlfString.isEmpty()) {
                numtlTxt.requestFocus();
            } else if (ccString.isEmpty()) {
                ccTxt.requestFocus();
            } else {
                numlicTxt.requestFocus();
            }
            return;
        }

// Continuamos con la validación de los otros campos
        String nombres = nameTxt.getText();
        String apellidos = apelliTxt.getText();
        String fecha_nac = fechnacTxt.getText();
        String tlf = numtlTxt.getText();
        String direcc = direccionTxt.getText();
        String gene = genTxt.getText();
        String lic = numlicTxt.getText();
        String exp_lic = fechexTxt.getText();
        String ven_lic = fechvenTxt.getText();

        // Validación de los otros campos
        if (nombres.isEmpty() || apellidos.isEmpty() || fecha_nac.isEmpty() || tlf.isEmpty() || direcc.isEmpty() || gene.isEmpty() || lic.isEmpty() || exp_lic.isEmpty() || ven_lic.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nameTxt.requestFocus();
            return; // Salimos del método si algún campo está vacío
        }

        // Si llegamos a este punto, significa que todos los campos están llenos y el ID es válido
        // Entonces creamos el objeto conductor y establecemos los valores
        com.mycompany.models.Conductores conductor = isEdition ? conductorEdition : new com.mycompany.models.Conductores();
        conductor.setCc(CC);
        conductor.setNombres(nombres);
        conductor.setApellidos(apellidos);
        conductor.setFecha_nacimiento(fecha_nac);
        conductor.setTelefono(telef);
        conductor.setDireccion(direcc);
        conductor.setGenero(gene);
        conductor.setLicencia(licen);
        conductor.setFecha_expeLicen(exp_lic);
        conductor.setFecha_vencLicen(ven_lic);

        try {
            DAOConductores dao = new DAOConductoresimpl();

            // Si se está editando, modificar el conductor existente
            if (isEdition) {
                dao.modificar(conductor);
                javax.swing.JOptionPane.showMessageDialog(this, "Conductor modificado correctamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Si no se está editando, verificar si ya existe un conductor con el mismo número de CC
                com.mycompany.models.Conductores existingConductor = dao.getConductorByCC(CC);
                if (existingConductor != null) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un conductor con este número de CC.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método si ya existe un conductor con el mismo número de CC
                } else {
                    // Si no existe un conductor con el mismo número de CC, registrar el nuevo conductor
                    dao.registrar(conductor);
                    javax.swing.JOptionPane.showMessageDialog(this, "Conductor registrado correctamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            }

            // Limpiar los campos después del registro exitoso
            if (!isEdition) {
                ccTxt.setText("");
                nameTxt.setText("");
                apelliTxt.setText("");
                fechnacTxt.setText("");
                numtlTxt.setText("");
                direccionTxt.setText("");
                genTxt.setText("");
                numlicTxt.setText("");
                fechexTxt.setText("");
                fechvenTxt.setText("");
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el conductor.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apelli;
    private javax.swing.JTextField apelliTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel cc;
    private javax.swing.JTextField ccTxt;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel fechex;
    private javax.swing.JTextField fechexTxt;
    private javax.swing.JLabel fechnac;
    private javax.swing.JTextField fechnacTxt;
    private javax.swing.JLabel fechven;
    private javax.swing.JTextField fechvenTxt;
    private javax.swing.JLabel gen;
    private javax.swing.JTextField genTxt;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel numlic;
    private javax.swing.JTextField numlicTxt;
    private javax.swing.JLabel numtl;
    private javax.swing.JTextField numtlTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
