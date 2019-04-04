package forms_controlers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

import application.*;

public class FormMainControler implements Initializable{
    @FXML
    private ToggleGroup tipoVuelo;
    @FXML
    private RadioButton fx_btn_Mercancias;
    @FXML
    private DatePicker fx_date_Salida;
    @FXML
    private TextField fx_textBox_hora;
    @FXML
    private RadioButton fx_btn_Comercial;
    @FXML
    private Button fx_btn_anadirVuelo;
    //**********************************************************  TableView Vuelos planificados
    @FXML
    private TableView<?> fx_tableView_vuelosPlanificados;
    @FXML
    private TableColumn<?, ?> fx_tableView_vuelosPlanificados_ruta;
    @FXML
    private TableColumn<?, ?> fx_tableView_vuelosPlanificados_llegadaLocal;
    @FXML
    private TableColumn<?, ?> fx_tableView_vuelosPlanificados_salida;
    @FXML
    private TableColumn<?, ?> fx_tableView_vuelosPlanificados_llegada;
    //**********************************************************  TableView Aviones
    @FXML
    private TableView<Avion> fx_tableView_Aviones;
    @FXML
    private TableColumn<Avion, String> fx_tableView_Aviones_codigo;
    @FXML
    private TableColumn<Avion, Integer> fx_tableView_Aviones_autonomia;
    @FXML
    private TableColumn<Avion, Integer> fx_tableView_Aviones_capacidad;
    @FXML
    private TableColumn<Avion, String> fx_tableView_Aviones_descripcion;
    //**********************************************************  TableView Rutas
    @FXML
    private TableColumn<Ruta, Integer> fx_tableView_Rutas_distancia;
    @FXML
    private TableColumn<Ruta, String> fx_tableView_Rutas_airportDestino;
    @FXML
    private TableView<Ruta> fx_tableView_Rutas;
    @FXML
    private TableColumn<Ruta, String> fx_tableView_Rutas_airportSalida;
    @FXML
    private TableColumn<Ruta, String> fx_tableView_Rutas_codigo;
	
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	AuxiliarCargaDeDatos.cargarAeropuertos();
    	AuxiliarCargaDeDatos.cargarAviones();
    	AuxiliarCargaDeDatos.cargarRutas();
	}

}