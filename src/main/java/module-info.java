module co.uniquindio.edu.cinemauq {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.edu.cinemauq to javafx.fxml;
    exports co.uniquindio.edu.cinemauq;
    exports co.uniquindio.edu.cinemauq.controller;
    opens co.uniquindio.edu.cinemauq.controller to javafx.fxml;
}