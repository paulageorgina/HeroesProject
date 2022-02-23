package widgetsController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import widgets.HeroesJavaFx;

public class InsertarServicioController implements Initializable{

    // SigUp
    @FXML
    public TextField txtUserName;

    @FXML
    private PasswordField txtPasswordd;

    @FXML
    private Button BtnLogin;

    @FXML
    private Button BtnSingUp;
    @FXML
    private Button BtnSignUp;

  
    


    // Iniciar
    public void closeWindows11(){
        System.exit(0);
    }

    public void ingresoSingUp(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Container/SingUp.fxml"));
            Parent root = loader.load();
            HeroesJavaFx controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);

            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.cargarSingUp());

            Stage myStage = (Stage) this.BtnSignUp.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresoUser() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Container/Usuario.fxml"));
            Parent root = loader.load();
            HeroesJavaFx controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);

            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closewindowsnow());

            Stage myStage = (Stage) this.BtnLogin.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }
    
}
