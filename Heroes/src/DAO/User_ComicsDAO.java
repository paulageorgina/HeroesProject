package DAO;
 
import Model.User_Comics;
import javafx.collections.ObservableList;

public interface User_ComicsDAO {
    public ObservableList<User_Comics> readAll();
    public int update (User_Comics User_Comics);
    public int delete (int ID_User_Comics );
    public User_Comics read (int ID_User_Comics );
}
