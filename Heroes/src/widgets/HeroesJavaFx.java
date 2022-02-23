package widgets;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import widgetsController.InsertarServicioController;
import javafx.scene.image.Image;

public class HeroesJavaFx implements Initializable{

    @FXML
    private Button Btnclosewindowsnow;

    // SingUp
    @FXML
    public TextField txtUserName;

    @FXML
    private PasswordField txtPasswordd;

    @FXML
    private Button BtnLogin;

    @FXML
    private Button BtnSingUp;
    
    //Login

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

    @FXML
    public void closewindowsnow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Container/Login.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);

            stage.setScene(scene);
            stage.show();
         

            Stage myStage = (Stage) this.Btnclosewindowsnow.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarSingUp() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Container/Login.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);

            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.ingresoSingUp());

            Stage myStage = (Stage) this.BtnLogin.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarinfo() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Container/informacion.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Information");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    public void cargariLogout() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Container/Logout.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Cerrar Sesión");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
