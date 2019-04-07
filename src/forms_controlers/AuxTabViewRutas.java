package forms_controlers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import application.Ruta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class AuxTabViewRutas {

	public static void cargarRutas(FormMainControler parentForm, ArrayList<Ruta> rutas) {
		
	ObservableList<Ruta> data = FXCollections.observableList((ArrayList)rutas);
	
	parentForm.fx_tableView_Rutas.setItems(data); 
	parentForm.fx_tableView_Rutas_codigo.setCellValueFactory(new  PropertyValueFactory<Ruta,String>("codRuta"));
	parentForm.fx_tableView_Rutas_airportSalida.setCellValueFactory(new  PropertyValueFactory<Ruta,String>("airportOrigen"));
	parentForm.fx_tableView_Rutas_airportDestino.setCellValueFactory(new PropertyValueFactory<Ruta,String>("airportDest"));
	parentForm.fx_tableView_Rutas_distancia.setCellValueFactory(new PropertyValueFactory<Ruta,Integer>("distancia"));

	}
	
	public static String obtenerAeropuertoDestino(FormMainControler parentForm) {
		Ruta rutaSeleccionada= parentForm.fx_tableView_Rutas.getSelectionModel().getSelectedItem();
		if(rutaSeleccionada == null) {
			ControlMensajes.mostrarAlerta("Hay que seleccionar la ruta deseada para comprobar diponibilidades en la fecha.");
			return null;
		}else
			return rutaSeleccionada.getAirportDest();
	}
	
	public static String obtenerAeropuertoOrigen(FormMainControler parentForm) {
		Ruta rutaSeleccionada= parentForm.fx_tableView_Rutas.getSelectionModel().getSelectedItem();
		if(rutaSeleccionada == null) {
			ControlMensajes.mostrarAlerta("Hay que seleccionar la ruta deseada para comprobar diponibilidades en la fecha.");
			return null;
		}else
			return rutaSeleccionada.getAirportOrigen();
	}
	
	public static String obtenerRuta(FormMainControler parentForm) {
		Ruta rutaSeleccionada= parentForm.fx_tableView_Rutas.getSelectionModel().getSelectedItem();
		if(rutaSeleccionada == null) {
			ControlMensajes.mostrarAlerta("Hay que seleccionar la ruta deseada para poder planificar los vuelos.");
			return null;
		}else
			return rutaSeleccionada.getCodRuta();
	}
	
			
	
}
