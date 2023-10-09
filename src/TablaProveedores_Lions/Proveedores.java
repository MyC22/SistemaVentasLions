package TablaProveedores_Lions;
import CapaDatos.ClaseDatos;
import CapaEntidad.ClaseEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Proveedores {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet resultado = null;
    ResultSetMetaData rsmd = null;
    
    public void cargarTablaProveedores(JTable tabla) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);
        int columnas;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i);
        }
        try {
            con = ClaseDatos.getConexion();
            ps = con.prepareStatement("EXEC SP_SELECT_PROVEEDORES");
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
    
     public void InsertarProveedores(ClaseEntidad ce) {
        try (Connection con = ClaseDatos.getConexion(); 
             PreparedStatement ps = con.prepareStatement("INSERT INTO PROVEEDOR (CODPROV, RAZONSOCIAL, RUC, DIRECCION, CORREO, TELEFONO, CELULAR) VALUES (?,?,?,?,?,?,?)"))
        {
            ps.setString(1, ce.getCodprov());
            ps.setString(2, ce.getRazonSocial());
            ps.setString(3, ce.getRuc());
            ps.setString(4, ce.getDireccion());
            ps.setString(5, ce.getCorreo());
            ps.setInt(6, ce.getTelefono());
            ps.setInt(7, ce.getCelular());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "INSERCIÓN HECHA CORRECTAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE REALIZÓ LA INSERCIÓN CORRECTAMENTE");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
