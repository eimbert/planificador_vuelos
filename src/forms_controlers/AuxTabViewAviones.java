package forms_controlers;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import application.*;


public class AuxTabViewAviones {

	public static void cargarAviones(FormMainControler parentForm, ArrayList<Avion> datos) {
		
	ObservableList<Avion> data = FXCollections.observableList((ArrayList)datos);
	parentForm.fx_tableView_Aviones.setItems(data); 
	parentForm.fx_tableView_Aviones_codigo.setCellValueFactory(new  PropertyValueFactory<Avion,String>("codigoAvion"));
	parentForm.fx_tableView_Aviones_capacidad.setCellValueFactory(new  PropertyValueFactory<Avion,Integer>("numPasajeros"));		
	parentForm.fx_tableView_Aviones_autonomia.setCellValueFactory(new PropertyValueFactory<Avion,Integer>("autonomia"));
	parentForm.fx_tableView_Aviones_descripcion.setCellValueFactory(new PropertyValueFactory<Avion,String>("descripcion"));
	
	}

}
