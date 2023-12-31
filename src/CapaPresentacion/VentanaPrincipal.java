package CapaPresentacion;
import Facturacion.Factura;
import TablaProductos_Lions.Form_Producto;
import TablaEmpleado_Lions.Form_Empleado;
import TablaCliente_Lions.Form_Cliente;
import TablaProveedores_Lions.Form_Proveedores;

import TablaProveedores_Lions.DatosProveedores;

import TablaCliente_Lions.DatosCliente;

import TablaEmpleado_Lions.DatosEmpleado;

import TablaProductos_Lions.DatosProducto;

import Marca_Lions.Marca;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    DatosProveedores pv = new DatosProveedores();
    
    DatosCliente cl = new DatosCliente();
    
    DatosEmpleado em = new DatosEmpleado();
    
    DatosProducto pr = new DatosProducto();
    
    public VentanaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        BarMenu = new javax.swing.JMenu();
        opProveedor = new javax.swing.JMenuItem();
        opProductos = new javax.swing.JMenuItem();
        opEmpleado = new javax.swing.JMenuItem();
        opCliente = new javax.swing.JMenuItem();
        BarFactura = new javax.swing.JMenu();
        opFactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        BarMenu.setText("Menus");
        BarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarMenuActionPerformed(evt);
            }
        });

        opProveedor.setText("Proveedores");
        opProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opProveedorActionPerformed(evt);
            }
        });
        BarMenu.add(opProveedor);

        opProductos.setText("Productos");
        opProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opProductosActionPerformed(evt);
            }
        });
        BarMenu.add(opProductos);

        opEmpleado.setText("Empleados");
        opEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEmpleadoActionPerformed(evt);
            }
        });
        BarMenu.add(opEmpleado);

        opCliente.setText("Clientes");
        opCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opClienteActionPerformed(evt);
            }
        });
        BarMenu.add(opCliente);

        jMenuBar1.add(BarMenu);

        BarFactura.setText("Factura");

        opFactura.setText("Factura");
        opFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFacturaActionPerformed(evt);
            }
        });
        BarFactura.add(opFactura);

        jMenuBar1.add(BarFactura);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarMenuActionPerformed

    }//GEN-LAST:event_BarMenuActionPerformed

    private void opProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opProveedorActionPerformed
       Form_Proveedores verProveedor = new Form_Proveedores();
       escritorio.add(verProveedor);
       verProveedor.show();
    }//GEN-LAST:event_opProveedorActionPerformed

    private void opProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opProductosActionPerformed
       Form_Producto verProductos = new Form_Producto();
       escritorio.add(verProductos);
       verProductos.show();
    }//GEN-LAST:event_opProductosActionPerformed

    private void opEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEmpleadoActionPerformed
       Form_Empleado verEmpleados = new Form_Empleado();
       escritorio.add(verEmpleados);
       verEmpleados.show();
    }//GEN-LAST:event_opEmpleadoActionPerformed

    private void opClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opClienteActionPerformed
       Form_Cliente verCliente = new Form_Cliente();
       escritorio.add(verCliente);
       verCliente.show();
    }//GEN-LAST:event_opClienteActionPerformed

    private void opFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFacturaActionPerformed
       Factura verFactura = new Factura();
       escritorio.add(verFactura);
       verFactura.show();
    }//GEN-LAST:event_opFacturaActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BarFactura;
    private javax.swing.JMenu BarMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opCliente;
    private javax.swing.JMenuItem opEmpleado;
    private javax.swing.JMenuItem opFactura;
    private javax.swing.JMenuItem opProductos;
    private javax.swing.JMenuItem opProveedor;
    // End of variables declaration//GEN-END:variables
}
