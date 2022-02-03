package automataRecivoLuz.controllers;

import automataRecivoLuz.models.modelHome;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class controllerHome {
    modelHome model = new modelHome();


    @FXML
    TextField seccion1;
    @FXML
    TextField seccion2;
    @FXML
    TextField seccion3;
    @FXML
    TextField seccion4;
    @FXML
    TextField seccion5;



    public void btnAceptar(){

        String cadena = seccion1.getText()+seccion2.getText()+seccion3.getText()+seccion4.getText()+seccion5.getText();

        model.particion(cadena);
    }
}
