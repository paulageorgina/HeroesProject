package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.logging.Level;
import java.util.logging.Logger; 
import javafx.collections.ObservableList; 
import Data.Conexion;
import Model.Admin_Comics; 

public class Admin_ComicsDAOImpl implements Admin_ComicsDAO {

    @Override
    public ObservableList<Admin_Comics> readAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(Admin_Comics admin_comics) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(int ID_ADMIN_COMICS) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Admin_Comics read(int ID_ADMIN_COMICS) {
        Statement st = null;
        ResultSet rs = null;
        Admin_Comics estudiante = null;

        try {
            Connection con = Conexion.obtenerConexion();
            st = con.createStatement();
            String sql = "SELECT * FROM ADMIN_COMICS WHERE ID_ADMIN_COMICS = ? " + ID_ADMIN_COMICS ;
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
        return estudiante;
    }

}
