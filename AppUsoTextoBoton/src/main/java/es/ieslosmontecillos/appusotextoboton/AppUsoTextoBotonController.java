/**
 * 2º DAM DI
 * Tema 3: Creación de componentes visuales
 * @author Shihan
 * 4.6.2. Usando componentes personalizados 2
 * Proyecto AppUsoBoton
 */

package es.ieslosmontecillos.appusotextoboton;

import es.ieslosmontecillos.componentes_weishihan.CampoTextoBoton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppUsoTextoBotonController {

    @FXML
    private CampoTextoBoton campo1;
    @FXML
    private CampoTextoBoton campo2;
    @FXML
    private Label lbInfo;

    @FXML
    public void onClickButton(ActionEvent event) {

        if(event.getSource().equals(campo1)) {
            if(campo1.getText().equals("Nombre") || campo1.getText().isBlank())
            {
                campo1.setText("Nombre");
                lbInfo.setText("Pulsa botón.. y muestra texto en esta etiqueta.");
            }
            else
            {
                lbInfo.setText("Se ha grabado: " + campo1.getText());
            }
        }
        else if(event.getSource().equals(campo2)) {

            if(campo2.getText().isBlank() || campo2.getText().equals("Apellido"))
            {
                lbInfo.setText("Pulsa botón.. y muestra texto en esta etiqueta.");
                campo2.setText("Apellido");
            }
            else
            {
                lbInfo.setText("Se ha grabado: " + campo2.getText());
            }
        }
    }
}