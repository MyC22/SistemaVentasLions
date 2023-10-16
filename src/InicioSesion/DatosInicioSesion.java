package InicioSesion;
import CapaDatos.ClaseDatos;
import InicioSesion.Presentacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatosInicioSesion {
    
    
    public boolean VerificarUsuario(Presentacion ce) throws SQLException
    {
        boolean usuarioEncontrado = false;
        try (Connection con = ClaseDatos.getConexion(); 
             PreparedStatement ps = con.prepareStatement("SELECT * FROM USUARIO WHERE LOGINX = ? AND PASS = ?"))
        {

            ps.setString(1, ce.getUsuario());
            ps.setString(2, ce.getContraseña());
            try (ResultSet resultado = ps.executeQuery()) {
                if (resultado.next()) {
                    usuarioEncontrado = true;
                }
            }
        } catch (SQLException e) {
            throw e; // Relanza la excepción en caso de error
        }
        return usuarioEncontrado;
    }
}
