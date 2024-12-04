/**
 * 2º DAM DI
 * Tema 3: Creación de componentes visuales
 * @author Shihan
 * 4.6.2. Usando componentes personalizados 2
 * Proyecto AppUsoBoton
 */


package es.ieslosmontecillos.appusotextoboton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AppUsoTextoBoton extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AppUsoTextoBoton.class.getResource("app_uso_texto_boton.fxml"));
        VBox root = fxmlLoader.load();
        AppUsoTextoBotonController appUsoTextoBotonController = fxmlLoader.getController();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("AppUsoTextoBoton");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}