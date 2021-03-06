/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo Andrade <source.compu at gmail.com>
 */
public class Dialog extends javax.swing.JFrame
{
    private Double _iva;
    private Double _desc;

    /**
     * Creates new form Dialog
     */
    public Dialog() {
        this._iva = 0.0;
        this._desc = 0.0;
        
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

        dialogoConfiguracion = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();

        dialogoConfiguracion.setTitle("Configuración de I.V.A. y descuento");
        dialogoConfiguracion.setAlwaysOnTop(true);
        dialogoConfiguracion.setModal(true);
        dialogoConfiguracion.setResizable(false);

        jLabel2.setText("IVA %:");

        jLabel5.setText("DESCUENTO %:");

        txtIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoConfiguracionLayout = new javax.swing.GroupLayout(dialogoConfiguracion.getContentPane());
        dialogoConfiguracion.getContentPane().setLayout(dialogoConfiguracionLayout);
        dialogoConfiguracionLayout.setHorizontalGroup(
            dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(btnAceptar))
                .addGap(59, 59, 59)
                .addGroup(dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIva)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        dialogoConfiguracionLayout.setVerticalGroup(
            dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoConfiguracionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(dialogoConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuadros de dialogo");
        setMinimumSize(new java.awt.Dimension(399, 297));

        jLabel1.setText("Unidades:");

        jLabel3.setText("Precio:");

        txtUnidades.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("TOTAL:");

        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnConfiguracion.setText("Configuración...");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btnCalcular))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfiguracion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(txtPrecio)
                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnConfiguracion))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Programamos boton calcular
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // variables a utilizar
        Double unidades, precio;
        Double total; // total
        Double cantiva; // IVA
        Double cantdesc; // Descuento
        Double totalsiniva; // Total sin IVA
        
        // Verificamos que los campos no esten vacios
        if(txtUnidades.getText().length() > 0 && txtPrecio.getText().length() > 0){
            // Obtenemos los datos
            unidades = Double.parseDouble(txtUnidades.getText());
            precio = Double.parseDouble(txtPrecio.getText());

            // Calculos
            totalsiniva = precio * unidades;
            cantiva = totalsiniva * this._iva / 100;
            cantdesc = totalsiniva * this._desc / 100;

            // Calculamos el total
            total = totalsiniva + cantiva - cantdesc;

            // Mostramos el total
            lblResult.setText("$"+total);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    // Configuramos boton de configuracion
    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // Asignamos un tamaño a la ventana
        dialogoConfiguracion.setSize(305, 209);
        
        // Indicamos la posición donde aparecera la ventana
        // dialogoConfiguracion.setLocation(100, 100); // Respecto a pantalla
        dialogoConfiguracion.setLocationRelativeTo(this.rootPane); // Respecto a frame padre
        
        // Hacemos visible la ventana de configuración
        dialogoConfiguracion.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    // Boton cerrar - cuadro de dialogo configuracion
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cerramos la ventana
        dialogoConfiguracion.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Boton cerrar - cuadro de dialogo configuracion
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Verificamos que los cuadros no esten vacios
        if(txtIva.getText().length() > 0 && txtDescuento.getText().length() > 0){
            // Obtenemos los valores
            this._iva = Double.parseDouble(txtIva.getText());
            this._desc = Double.parseDouble(txtDescuento.getText());
            
            // Cerramos la ventana
            dialogoConfiguracion.dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JDialog dialogoConfiguracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
