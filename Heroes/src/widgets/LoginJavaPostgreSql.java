package widgets;

import java.io.File;
import java.io.FileInputStream; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

import javax.swing.ImageIcon;
 
public class LoginJavaPostgreSql {

 
    public void setImagen(String DESCRIPTION_IMAGES) throws SQLException {

        final String URL = "jdbc:postgresql://localhost:5432/Comics";
        final String USUARIO = "postgres";
        final String CLAVE = "123456789";

        try {
            File f = new File(DESCRIPTION_IMAGES);
            FileInputStream s = new FileInputStream(f);
            String query = ("INSERT INTO IMAGES_USER(DESCRIPTION_IMAGES, FOTO_USER) values(?, ?)");
            
            try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                    PreparedStatement p = con.prepareStatement(query)) {

                p.setString(1, f.getName());
                p.setBinaryStream(2, s, (int) f.length());
                p.executeUpdate();
                s.close();
            } catch (Exception e) {
                throw new SQLException("No se pudo guardar la imagen.\n" +
                        e);
            }
        } catch (Exception e) {

        }

    }

    public ImageIcon getImagen(String FOTO_USER,
            int ID_IMAGES_USER) throws SQLException {

        final String URL = "jdbc:postgresql://localhost:5432/Comics";
        final String USUARIO = "postgres";
        final String CLAVE = "123456789";
        Connection c  = DriverManager.getConnection(URL, USUARIO, CLAVE);
        if (c == null) {
            throw new SQLException("Para recuperar una imagen la coneccion no puede ser nula");
        }
        PreparedStatement p = c.prepareStatement(
                "select FOTO_USER"
                +
                "  from IMAGES_USER"
                +
                " where ID_IMAGES_USER = ?");
        
        p.setInt(2, ID_IMAGES_USER);
        p.setString(1, FOTO_USER);
        ResultSet r = p.executeQuery();
        ImageIcon m = new ImageIcon();
        while (r.next()) {
            byte[] i = null;
            i = r.getBytes("FOTO_USER");
            m = new ImageIcon(i);
        }
        r.close();
        p.close();
        return m;
    }
}
