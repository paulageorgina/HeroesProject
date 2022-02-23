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

    // DC
    @FXML
    private Button BtnCerrarA;

    @FXML
    private Button BtnCerrarBatman;

    @FXML
    private Button BtnCerrarBlack;

    @FXML
    private Button BtnCerrarBlue;

    @FXML
    private Button BtnCerrarFlash;

    @FXML
    private Button BtnCerrarGreen;

    @FXML
    private Button BtnCerrarMartian;

    @FXML
    private Button BtnCerrarRobin;
    @FXML
    private Button BtnCerrarSuperman;

    @FXML
    private Button BtnCerrarWonder;

  // MARVEL

  @FXML
  private Button BtnCerrarCaptain;

  @FXML
  private Button BtnCerrarCyclops;

  @FXML
  private Button BtnCerrarDaredevil;

  @FXML
  private Button BtnCerrarHawkeye;

  @FXML
  private Button BtnCerrarHulk;

  @FXML
  private Button BtnCerrarIronman;

  @FXML
  private Button BtnCerrarSilver;

  @FXML
  private Button BtnCerrarSpiderman;

  @FXML
  private Button BtnCerrarThor;

  @FXML
  private Button BtnCerrarWolverine;

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

  // DC
  public void closeWindowsArrow() {
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
        stage.setOnCloseRequest(e -> controlador.cargarArrow());

        Stage myStage = (Stage) this.BtnCerrarA.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsBatman() {
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
        stage.setOnCloseRequest(e -> controlador.cargarBatman());

        Stage myStage = (Stage) this.BtnCerrarBatman.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsBlack() {
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

        stage.setOnCloseRequest(e -> controlador.cargarBlack());

        Stage myStage = (Stage) this.BtnCerrarBlack.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsBlue() {
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

        stage.setOnCloseRequest(e -> controlador.cargarBlue());
        Stage myStage = (Stage) this.BtnCerrarBlue.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsFlash() {
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
        stage.setOnCloseRequest(e -> controlador.cargarFalsh());

        Stage myStage = (Stage) this.BtnCerrarFlash.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsGreen() {
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
        stage.setOnCloseRequest(e -> controlador.cargarGreenLantern());

        Stage myStage = (Stage) this.BtnCerrarGreen.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsMartian() {
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
        stage.setOnCloseRequest(e -> controlador.cargarMartial());

        Stage myStage = (Stage) this.BtnCerrarMartian.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsRobin() {
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

        stage.setOnCloseRequest(e -> controlador.cargarRobin());

        Stage myStage = (Stage) this.BtnCerrarRobin.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsSuperman() {
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
        stage.setOnCloseRequest(e -> controlador.cargarSuperman());

        Stage myStage = (Stage) this.BtnCerrarSuperman.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsWonder() {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Container/Usuario.fxml"));
        Parent root = loader.load(); 

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        Image ICON = new Image("https://herosjs.herokuapp.com/herosjs.git/SpuerHeroes.png");

        stage.getIcons().add(ICON);
        stage.initStyle(StageStyle.UNDECORATED);

        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.BtnCerrarWonder.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

  // MARVEL

  public void closeWindowsCaptain() {
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
        stage.setOnCloseRequest(e -> controlador.cargarCaptain());

        Stage myStage = (Stage) this.BtnCerrarCaptain.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsCyclops() {
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
        stage.setOnCloseRequest(e -> controlador.cargarCYCLOPS());

        Stage myStage = (Stage) this.BtnCerrarCyclops.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsDaredevil() {
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

        stage.setOnCloseRequest(e -> controlador.cargarDaredevil());

        Stage myStage = (Stage) this.BtnCerrarDaredevil.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsHawkeye() {
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

        stage.setOnCloseRequest(e -> controlador.cargarHawkeye());
        Stage myStage = (Stage) this.BtnCerrarHawkeye.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsHulk() {
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
        stage.setOnCloseRequest(e -> controlador.cargarHulk());

        Stage myStage = (Stage) this.BtnCerrarHulk.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsIronman() {
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
        stage.setOnCloseRequest(e -> controlador.cargarIronman());

        Stage myStage = (Stage) this.BtnCerrarIronman.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsSilver() {
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
        stage.setOnCloseRequest(e -> controlador.cargarSilver());

        Stage myStage = (Stage) this.BtnCerrarSilver.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsSpiderman() {
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

        stage.setOnCloseRequest(e -> controlador.cargarSpiderman());

        Stage myStage = (Stage) this.BtnCerrarSpiderman.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsThor() {
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
        stage.setOnCloseRequest(e -> controlador.cargarThor());

        Stage myStage = (Stage) this.BtnCerrarThor.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void closeWindowsWolverine() {
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

        stage.setOnCloseRequest(e -> controlador.cargarWOLVERINE());

        Stage myStage = (Stage) this.BtnCerrarWolverine.getScene().getWindow();
        myStage.close();

    } catch (IOException ex) {
        Logger.getLogger(HeroesJavaFx.class.getName()).log(Level.SEVERE, null, ex);
    }
}

@Override
public void initialize(URL location, ResourceBundle resources) {
    // TODO Auto-generated method stub

}
}
