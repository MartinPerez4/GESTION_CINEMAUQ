package co.uniquindio.edu.cinemauq.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class VentaController {

    @FXML private ComboBox<?> cbFunciones;
    @FXML private TextField txtClienteId;
    @FXML private TextField txtClienteNombre;
    @FXML private ComboBox<?> cbTipoEntrada;
    @FXML private TextField txtAsientoSeleccionado;
    @FXML private GridPane gridAsientos;

    @FXML
    public void initialize() {
    }

    @FXML
    private void handleVender() {
    }

    @FXML
    private void handleCancelarVenta() {
    }
}
