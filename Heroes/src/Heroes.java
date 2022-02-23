//import Data.Conexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Heroes extends Application {

    @Override
    public void start(Stage escenario) throws Exception {
        
        //Conexion.obtenerConexion();
        Parent root  = FXMLLoader.load(getClass().getResource("./Container/Login.fxml"));

        Scene escena = new Scene(root);
        escena.getStylesheets().clear();
        escena.getStylesheets().add(getClass().getResource("./css/styles.css").toExternalForm());
         
        escenario.initStyle(StageStyle.UNDECORATED);
        escenario.setScene(escena); 
        escenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
