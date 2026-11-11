package co.uniquindio.edu.cinemauq;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 1. Cargar el archivo FXML principal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/uniquindio/edu/cinemauq/Main.fxml"));
        Parent root = loader.load();

        // 2. Crear la escena con el tamaño deseado
        Scene scene = new Scene(root, 1100, 700);

        // 3. LLAMAR / CONECTAR EL ARCHIVO CSS AQUÍ:
        // Asegúrate de que la ruta coincida con el lugar donde guardes tu archivo style.css en resources
        String cssPath = getClass().getResource("/co/uniquindio/edu/cinemauq/styles.css").toExternalForm();
        scene.getStylesheets().add(cssPath);

        // 4. Configurar y mostrar la ventana
        primaryStage.setTitle("CINEMAUQ - Sistema de Gestión de Cine Universitario");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(950);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
