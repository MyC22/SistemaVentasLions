package TablaEmpleado_Lions;

import CapaDatos.ClaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Empleado {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet resultado = null;
    ResultSetMetaData rsmd = null;
    
    public void cargarTablaEmpleado(JTable tabla) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);
        int columnas;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i);
        }
        try {
            con = ClaseDatos.getConexion();
            ps = con.prepareStatement("SELECT * FROM EMPLEADO");
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
