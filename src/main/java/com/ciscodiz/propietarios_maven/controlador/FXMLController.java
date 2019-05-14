package com.ciscodiz.propietarios_maven.controlador;

import com.ciscodiz.propietarios_maven.modelo.DNI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.management.InvalidAttributeValueException;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblModificar;
    @FXML
    private TextField txtIDPropietario;
    @FXML
    private TextField txtNombreProp;
    @FXML
    private TextField txtApellidoProp;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnPropAtras;
    @FXML
    private Button btnPropAlante;
    @FXML
    private Button btnPropAgregar;
    @FXML
    private Button btnPropEliminar;
    @FXML
    private Button btnPropCasasAtras;
    @FXML
    private Button btnPropCasasAlante;
    @FXML
    private Button btnPropCasasAgregar;
    @FXML
    private Button btnPropCasasEliminar;
    @FXML
    private TextField txtIdPropCasas;
    @FXML
    private TextField txtMetrosCasasProp;
    @FXML
    private Button btnPropCasasOK;
    @FXML
    private Button btnPropCasasCanelar;
    @FXML
    private Button btnPropOk;
    @FXML
    private Button btnPropCancelar;
    @FXML
    private Button btnCasasAtras;
    @FXML
    private Button btnCasasAdelante;
    @FXML
    private Button btnCasasAgregar;
    @FXML
    private Button btnCasasEliminar;
    @FXML
    private TextField txtCasasId;
    @FXML
    private TextField txtCasasMetros;
    @FXML
    private Button btnCasasOk;
    @FXML
    private Button btnCasasCanclar;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
