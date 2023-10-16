package TablaProveedores_Lions;
import ConexionBd.Conexion;
import TablaProveedores_Lions.Proveedores;
import ConexionBd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DatosProveedores {
    static Connection con = Conexion.getConexion();

    public void cargarTablaProveedores(JTable tabla) {
    PreparedStatement ps = null;
    ResultSet resultado = null;
    ResultSetMetaData rsmd = null;  
    
    DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
    modeloTabla.setRowCount(0);
    int columnas;
    for (int i = 0; i < tabla.getColumnCount(); i++) {
        tabla.getColumnModel().getColumn(i);
    }
    try {
        con = Conexion.getConexion();
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

    
     public static void InsertarProveedores(Proveedores proveedor, JTable table) {
        try (
             PreparedStatement ps = con.prepareStatement("INSERT INTO PROVEEDOR (CODPROV, RAZONSOCIAL, RUC, DIRECCION, CORREO, TELEFONO, CELULAR) VALUES (?,?,?,?,?,?,?)"))
        {
            ps.setString(1, proveedor.getCodprov());
            ps.setString(2, proveedor.getRazonSocial());
            ps.setString(3, proveedor.getRuc());
            ps.setString(4, proveedor.getDireccion());
            ps.setString(5, proveedor.getCorreo());
            ps.setInt(6, proveedor.getTelefono());
            ps.setInt(7, proveedor.getCelular());
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
