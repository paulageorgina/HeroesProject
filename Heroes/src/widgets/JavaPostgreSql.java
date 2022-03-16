package widgets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSql {

    public static void writeToDatabase(String COMICS_USER_NAME, String COMICS_PASSWORD_USER) {

        final String URL = "jdbc:postgresql://localhost:5432/Comics";
        final String USUARIO = "postgres";
        final String CLAVE = "18102001";

        String name = COMICS_USER_NAME;
        String pass = COMICS_PASSWORD_USER;

        // query
        String query = "INSERT INTO USER_COMICS(COMICS_USER_NAME, COMICS_PASSWORD_USER) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, name);
            pst.setString(2, pass);
            pst.executeUpdate();
            System.out.println("Sucessfully created.");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }
}