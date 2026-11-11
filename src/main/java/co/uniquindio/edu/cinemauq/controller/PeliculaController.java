package co.uniquindio.edu.cinemauq.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PeliculaController {

    @FXML private TextField txtCodigo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtGenero;
    @FXML private TextField txtDuracion;
    @FXML private ComboBox<String> cbClasificacion;
    @FXML private TableView<?> tablePeliculas;

    @FXML
    public void initialize() {
        // Inicializa elementos visuales o combos si lo deseas
    }

    @FXML
    private void handleRegistrar() {
        // Aquí programarás tu lógica de registro
    }

    @FXML
    private void handleLimpiar() {
        // Limpiar campos
    }
}
