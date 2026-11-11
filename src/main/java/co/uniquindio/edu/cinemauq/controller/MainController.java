package co.uniquindio.edu.cinemauq.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import java.io.IOException;

public class MainController {

    @FXML private StackPane contentArea;

    @FXML
    public void initialize() {
        // Carga por defecto la vista de películas al iniciar
        handlePeliculas();
    }

    @FXML
    private void handleVentas() {
        cargarVista("/co/uniquindio/edu/cinemauq/VentaView.fxml");
    }

    @FXML
    private void handlePeliculas() {
        cargarVista("/co/uniquindio/edu/cinemauq/PeliculaView.fxml");
    }

    @FXML
    private void handleSalas() {
        cargarVista("/co/uniquindio/edu/cinemauq/SalaView.fxml");
    }

    @FXML
    private void handleFunciones() {
        cargarVista("/co/uniquindio/edu/cinemauq/FuncionView.fxml");
    }

    @FXML
    private void handleReportes() {
        cargarVista("/co/uniquindio/edu/cinemauq/ReporteView.fxml");
    }

    private void cargarVista(String rutaFxml) {
        try {
            Node vista = FXMLLoader.load(getClass().getResource(rutaFxml));
            contentArea.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se pudo cargar la vista: " + rutaFxml);
        }
    }
}
