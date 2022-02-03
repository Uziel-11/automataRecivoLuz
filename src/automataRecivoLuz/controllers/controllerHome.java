package automataRecivoLuz.controllers;

import automataRecivoLuz.models.modelHome;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class controllerHome implements Initializable {
    modelHome model = new modelHome();
    String[] resultados = new String[3];


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
    @FXML
    Label numeroServicio;
    @FXML
    Label limitePago;
    @FXML
    Label cantidadPagar;
    @FXML
    Label error;
    @FXML
    ImageView barra;



    public void btnAceptar(){
        numeroServicio.setText("");
        limitePago.setText("");
        cantidadPagar.setText("");
        error.setText("");

        String cadena = seccion1.getText()+seccion2.getText()+seccion3.getText()+seccion4.getText()+seccion5.getText();

        resultados = model.particion(cadena);

        if (resultados[0].equals("error")){
            error.setText("Codigo no Valido xd");
        }else{
            numeroServicio.setText(resultados[0]);
            limitePago.setText(resultados[1]);
            cantidadPagar.setText(resultados[2]);
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        barra.setImage(new Image("recursos/img.png"));
    }
}
