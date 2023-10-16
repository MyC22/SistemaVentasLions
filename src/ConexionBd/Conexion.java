package ConexionBd;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion
{
    public static Connection getConexion()
    {
        Connection conectar = null;
        String usuario = "sa";
        String contraseña = "12345678";
        String bd = "BDLIONS";
        String ip = "localhost";
        String puerto = "1433";
        try
        {
            String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="
                    +bd+";integratedSecurity=false;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTARSE A LA BASE DE DATOS, ERROR: " + e.toString());
        }
        return conectar;
    }
}
