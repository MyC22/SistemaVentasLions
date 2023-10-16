
package TablaProductos_Lions;

import ConexionBd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DatosProducto { 
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet resultado = null;
    ResultSetMetaData rsmd = null;
    
    public void cargarTablaProducto(JTable tabla) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);
        int columnas;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i);
        }
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT tb1.CODPROD AS [CODIGO DE PRODUCTO], tb1.NOMBRE, tb2.NOMMAR AS [MARCA], tb3.RAZONSOCIAL AS [PROVEEDOR], tb3.TELEFONO, tb3.CELULAR FROM PRODUCTO tb1 INNER JOIN MARCA tb2 ON (tb1.CODMAR = tb2.CODMAR) INNER JOIN PROVEEDOR tb3 ON (tb1.CODPROV = tb3.CODPROV)");
            resultado = ps.executeQuery();
            rsmd = resultado.getMetaData();
            columnas = rsmd.getColumnCount();
            while (resultado.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = resultado.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
