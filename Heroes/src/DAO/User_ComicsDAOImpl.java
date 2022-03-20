package DAO;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Data.Conexion;
import Model.User_Comics;
import javafx.collections.ObservableList;

public class User_ComicsDAOImpl implements User_ComicsDAO {

    @Override
    public ObservableList<User_Comics> readAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(User_Comics User_Comics) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(int ID_User_Comics) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public User_Comics read(int ID_User_Comics) {
        Statement st = null;
        ResultSet rs = null;
        User_Comics user_Comics = null;

        try {
            Connection con = Conexion.obtenerConexion();
            st = con.createStatement();
            String sql = "SELECT * FROM USER_COMICS WHERE ID_USER_COMICS = ? " + ID_User_Comics;
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_ComicsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Admin_ComicsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user_Comics;
    }

}
