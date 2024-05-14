package OP;

import static com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme.setup;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.views.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author pes20
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
        setResizable(false);
    }

    private void InitStyles() {
        titulo.putClientProperty("FlatLaf.style", "font: 20 $semibold.font");
        titulo.setForeground(Color.white);
        regEntrada.setForeground(Color.white);
        regEntrada.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        regSalida.setForeground(Color.white);
        regSalida.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        home.setForeground(Color.white);
        home.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        dateText.putClientProperty("FlatLaf.style", "font: 20 $semibold.font");
        dateText.setForeground(Color.white);
        asd.setForeground(Color.white);
        asd.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        reporte.setForeground(Color.white);
        reporte.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        regConductor.setForeground(Color.white);
        regConductor.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        regAutobus.setForeground(Color.white);
        regAutobus.putClientProperty("FlatLaf.style", "font:14 $semibold.font");
        
        

    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void InitContent(){
        ShowJPanel(new Principal());
    }
    
    public static void ShowJPanel(JPanel p){
        p.setSize(620,450);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
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
        menu = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        linea = new javax.swing.JSeparator();
        home = new javax.swing.JButton();
        regSalida = new javax.swing.JButton();
        regEntrada = new javax.swing.JButton();
        regConductor = new javax.swing.JButton();
        regAutobus = new javax.swing.JButton();
        reporte = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 565));
        setPreferredSize(new java.awt.Dimension(840, 620));
        setSize(new java.awt.Dimension(840, 620));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(810, 650));

        menu.setBackground(new java.awt.Color(0, 51, 153));

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("OP-Transport");

        linea.setForeground(new java.awt.Color(255, 255, 255));

        home.setBackground(new java.awt.Color(0, 102, 153));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-outline.png"))); // NOI18N
        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        home.setBorderPainted(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setIconTextGap(10);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        regSalida.setBackground(new java.awt.Color(0, 102, 153));
        regSalida.setForeground(new java.awt.Color(255, 255, 255));
        regSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-salir-redondeado-24.png"))); // NOI18N
        regSalida.setText("Registrar Salida");
        regSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        regSalida.setBorderPainted(false);
        regSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regSalida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regSalida.setIconTextGap(10);
        regSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSalidaActionPerformed(evt);
            }
        });

        regEntrada.setBackground(new java.awt.Color(0, 102, 153));
        regEntrada.setForeground(new java.awt.Color(255, 255, 255));
        regEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-entrar-redondeado-24.png"))); // NOI18N
        regEntrada.setText("Registrar Entrada");
        regEntrada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        regEntrada.setBorderPainted(false);
        regEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regEntrada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regEntrada.setIconTextGap(10);
        regEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEntradaActionPerformed(evt);
            }
        });

        regConductor.setBackground(new java.awt.Color(0, 102, 153));
        regConductor.setForeground(new java.awt.Color(255, 255, 255));
        regConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-conductor-24 (1).png"))); // NOI18N
        regConductor.setText("Conductores");
        regConductor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        regConductor.setBorderPainted(false);
        regConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regConductor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regConductor.setIconTextGap(10);
        regConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regConductorActionPerformed(evt);
            }
        });

        regAutobus.setBackground(new java.awt.Color(0, 102, 153));
        regAutobus.setForeground(new java.awt.Color(255, 255, 255));
        regAutobus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-autobús-24.png"))); // NOI18N
        regAutobus.setText("Autobuses");
        regAutobus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        regAutobus.setBorderPainted(false);
        regAutobus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regAutobus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regAutobus.setIconTextGap(10);
        regAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAutobusActionPerformed(evt);
            }
        });

        reporte.setBackground(new java.awt.Color(0, 102, 153));
        reporte.setForeground(new java.awt.Color(255, 255, 255));
        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-resultados-de-la-prueba-24.png"))); // NOI18N
        reporte.setText("Reportes");
        reporte.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        reporte.setBorderPainted(false);
        reporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reporte.setIconTextGap(10);
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(regSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(regEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(regConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(regAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(regSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(regEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(regConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(regAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(0, 102, 153));

        dateText.setText("jLabel1");

        asd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        asd.setText("Administracion/Control de Autobuses");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(asd))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateText)))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asd)
                .addGap(18, 18, 18)
                .addComponent(dateText)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEntradaActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new RegistrarE());
    }//GEN-LAST:event_regEntradaActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Principal());
    }//GEN-LAST:event_homeActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Reporte());
    }//GEN-LAST:event_reporteActionPerformed

    private void regConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regConductorActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Conductores());
    }//GEN-LAST:event_regConductorActionPerformed

    private void regAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAutobusActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Buses());
    }//GEN-LAST:event_regAutobusActionPerformed

    private void regSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSalidaActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new RegistrarS());
    }//GEN-LAST:event_regSalidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asd;
    private javax.swing.JPanel background;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JButton home;
    private javax.swing.JSeparator linea;
    private javax.swing.JPanel menu;
    private javax.swing.JButton regAutobus;
    private javax.swing.JButton regConductor;
    private javax.swing.JButton regEntrada;
    private javax.swing.JButton regSalida;
    private javax.swing.JButton reporte;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
