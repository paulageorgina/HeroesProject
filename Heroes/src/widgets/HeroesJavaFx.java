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
import javafx.scene.control.Alert; 
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import widgetsController.InsertarServicioController;
import javafx.scene.image.Image;

public class HeroesJavaFx implements Initializable {

    @FXML
    private Button BtnArrowView;
    @FXML
    private Button BtnBatmanView;
    @FXML
    private Button BtnBlackView;

    @FXML
    private Button BtnBlueView;
    @FXML
    private Button BtnFlashView;

    @FXML
    private Button BtnGreenView;

    @FXML
    private Button BtnMartianView;

    @FXML
    private Button BtnRobinView;
    @FXML
    private Button BtnSupermanView;

    @FXML
    private Button BtnWonderView;

    @FXML
    private Button BtnCaptainView;
    @FXML
    private Button BtnCyclopsView;
    @FXML
    private Button BtnDaredevilView;

    @FXML
    private Button BtnHawkeyeView;
    @FXML
    private Button BtnHulkView;

    @FXML
    private Button BtnIron_manView;

    @FXML
    private Button BtnSilverView;

    @FXML
    private Button BtnSpider_manView;
    @FXML
    private Button BtnThorView;

    @FXML
    private Button BtnWolverineView;

    @FXML
    private Button Btnclosewindowsnow;

    // SigUp
    @FXML
    public TextField txtUserName;

    @FXML
    private PasswordField txtPasswordd;

    @FXML
    private Button BtnLogin;

    @FXML
    private Button BtnSingUp;

    // Login

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

    public void getData(ActionEvent actionEvent) {

        System.out.println(txtUserName.getText());
        System.out.println(txtPasswordd.getText());
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setContentText("Se agrego nuevo usuario a la base de datos");
        alerta.setHeaderText("Usuario agregado");
        JavaPostgreSql.LoginUser_ComicsDatabase(txtUserName.getText(), txtPasswordd.getText());
        alerta.show();
        ClearText();
    }

    private void ClearText() {
        txtPasswordd.setText(" ");
        txtUserName.setText(" ");
    }
 
    @FXML
    public void closewindowsnow() {
     
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Container/admin.fxml"));
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
    public void closewindowsnowadmin() {
     
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Container/admin.fxml"));
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

    // DC

    @FXML
    public void cargarArrow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/arrow.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();

            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Arrow | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsArrow());

            Stage mystage = (Stage) this.BtnArrowView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarBatman() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Batman.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();

            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Batman | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsBatman());

            Stage mystage = (Stage) this.BtnBatmanView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarBlack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Black.fxml"));
            Parent root = loader.load();

            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Black | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsBlack());

            Stage mystage = (Stage) this.BtnBlackView.getScene().getWindow();
            mystage.close();
        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarBlue() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Blue.fxml"));
            Parent root = loader.load();

            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Blue | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsBlue());

            Stage mystage = (Stage) this.BtnBlueView.getScene().getWindow();
            mystage.close();
        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    public void cargarFalsh() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Flash.fxml"));
            Parent root = loader.load();

            InsertarServicioController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setTitle("Flash| DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsFlash());
            Stage mystage = (Stage) this.BtnFlashView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }

    }

    @FXML
    public void cargarGreenLantern() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Green.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Green | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsGreen());

            Stage mystage = (Stage) this.BtnGreenView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @FXML
    public void cargarMartial() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Martial.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Martian | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsMartian());

            Stage mystage = (Stage) this.BtnMartianView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @FXML
    public void cargarRobin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Robin.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Robin | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsRobin());

            Stage mystage = (Stage) this.BtnRobinView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarSuperman() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Superman.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Superman | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsSuperman());

            Stage mystage = (Stage) this.BtnSupermanView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void cargarWonder() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/DC/Wonder.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Wonder Woman | DC");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> controlador.closeWindowsWonder());

            Stage mystage = (Stage) this.BtnWonderView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    // MARVEL

    @FXML
    public void cargarCaptain() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Captain.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Captain | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsCaptain());

            Stage mystage = (Stage) this.BtnCaptainView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarCYCLOPS() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Cyclops.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("CYCLOPS | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsCyclops());

            Stage mystage = (Stage) this.BtnCyclopsView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarDaredevil() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Daredevil.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Daredevil | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsDaredevil());

            Stage mystage = (Stage) this.BtnDaredevilView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarHawkeye() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Hawkeye.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Hawkeye | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsHawkeye());

            Stage mystage = (Stage) this.BtnHawkeyeView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarHulk() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Hulk.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Hulk | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsHulk());

            Stage mystage = (Stage) this.BtnHulkView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarIronman() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Ironman.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Iron man | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsIronman());

            Stage mystage = (Stage) this.BtnIron_manView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarSilver() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Silver.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Silver | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsSilver());

            Stage mystage = (Stage) this.BtnSilverView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarSpiderman() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Spiderman.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Spiderman | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsSpiderman());

            Stage mystage = (Stage) this.BtnSpider_manView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarThor() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/Thor.fxml"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Thor | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsThor());

            Stage mystage = (Stage) this.BtnThorView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

    @FXML
    public void cargarWOLVERINE() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../widgets/MARVEL/WOLVERINE.FXML"));
            Parent root = loader.load();
            InsertarServicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            // AQUI VA EL CSS
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("../css/styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("WOLVERINE | MARVEL");

            Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

            stage.getIcons().add(ICON);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindowsWolverine());

            Stage mystage = (Stage) this.BtnWolverineView.getScene().getWindow();
            mystage.close();

        } catch (IOException ex) {
            Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
            // TODO: handle exception
        }
    }

}
