package forms_controlers;

import java.time.LocalDate;
import java.util.ArrayList;

import application.Avion;
import application.VuelosPlanificados;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class AuxTabViewVuelosPlanificados {

	public static void cargarVuelosPlanificados(FormMainControler parentForm, ArrayList<VuelosPlanificados> datos) {
		
	ObservableList<VuelosPlanificados> data = FXCollections.observableList((ArrayList)datos);
	
	parentForm.fx_tableView_vuelosPlanificados.setItems(data); 
	parentForm.fx_tableView_vuelosPlanificados_llegada.setCellValueFactory(new  PropertyValueFactory<VuelosPlanificados,LocalDate>("llegada"));
	parentForm.fx_tableView_vuelosPlanificados_llegadaLocal.setCellValueFactory(new  PropertyValueFactory<VuelosPlanificados,LocalDate>("llegadaLocal"));		
	parentForm.fx_tableView_vuelosPlanificados_ruta.setCellValueFactory(new PropertyValueFactory<VuelosPlanificados,String>("codRuta"));
	parentForm.fx_tableView_vuelosPlanificados_salida.setCellValueFactory(new PropertyValueFactory<VuelosPlanificados,LocalDate>("salida"));
	
	}
}
