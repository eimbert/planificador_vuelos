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
import java.time.LocalDate;
import java.util.ArrayList;
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
    protected TableView<VuelosPlanificados> fx_tableView_vuelosPlanificados;
    @FXML
    protected TableColumn<VuelosPlanificados, String> fx_tableView_vuelosPlanificados_ruta;
    @FXML
    protected TableColumn<VuelosPlanificados, LocalDate> fx_tableView_vuelosPlanificados_llegadaLocal;
    @FXML
    protected TableColumn<VuelosPlanificados, LocalDate> fx_tableView_vuelosPlanificados_salida;
    @FXML
    protected TableColumn<VuelosPlanificados, LocalDate> fx_tableView_vuelosPlanificados_llegada;
    //**********************************************************  TableView Aviones
    @FXML
    protected TableView<Avion> fx_tableView_Aviones;
    @FXML
    protected TableColumn<Avion, String> fx_tableView_Aviones_codigo;
    @FXML
    protected TableColumn<Avion, Integer> fx_tableView_Aviones_autonomia;
    @FXML
    protected TableColumn<Avion, Integer> fx_tableView_Aviones_capacidad;
    @FXML
    protected TableColumn<Avion, String> fx_tableView_Aviones_descripcion;
    //**********************************************************  TableView Rutas
    @FXML
    protected TableColumn<Ruta, Integer> fx_tableView_Rutas_distancia;
    @FXML
    protected TableColumn<Ruta, String> fx_tableView_Rutas_airportDestino;
    @FXML
    protected TableView<Ruta> fx_tableView_Rutas;
    @FXML
    protected TableColumn<Ruta, String> fx_tableView_Rutas_airportSalida;
    @FXML
    protected TableColumn<Ruta, String> fx_tableView_Rutas_codigo;
	
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	//ArrayList<Aeropuerto> aeropuertos = AuxiliarCargaDeDatos.cargarAeropuertos();
    	ArrayList<Avion> aviones = AuxiliarCargaDeDatos.cargarAviones();
    	ArrayList<Ruta> rutas = AuxiliarCargaDeDatos.cargarRutas();
    	ArrayList<VuelosPlanificados> vuelos = AuxiliarCargaDeDatos.caragarVuelosPlanificados();
    	
    	AuxTabViewAviones.cargarAviones(this, aviones);
    	AuxTabViewRutas.cargarRutas(this, rutas);
    	AuxTabViewVuelosPlanificados.cargarVuelosPlanificados(this, vuelos);
	}

}