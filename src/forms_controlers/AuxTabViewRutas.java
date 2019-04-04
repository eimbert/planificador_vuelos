package forms_controlers;

import java.util.ArrayList;

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
	
}
