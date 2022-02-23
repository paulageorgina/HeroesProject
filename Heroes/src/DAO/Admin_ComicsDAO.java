package DAO;

import Model.Admin_Comics;
import javafx.collections.ObservableList;

public interface Admin_ComicsDAO {
 
    public ObservableList<Admin_Comics> readAll();
    public int update (Admin_Comics admin_comics);
    public int delete (int ID_ADMIN_COMICS );
    public Admin_Comics read (int ID_ADMIN_COMICS );
}
