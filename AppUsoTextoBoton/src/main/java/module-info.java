module es.ieslosmontecillos.appusotextoboton {
    requires es.ieslosmontecillos.componentes_weishihan;
    requires javafx.fxml;
    requires javafx.controls;


    opens es.ieslosmontecillos.appusotextoboton to javafx.fxml;
    exports es.ieslosmontecillos.appusotextoboton;
}