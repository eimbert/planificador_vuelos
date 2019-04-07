package forms_controlers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

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
	parentForm.fx_tableView_vuelosPlanificados_codAvion.setCellValueFactory(new PropertyValueFactory<VuelosPlanificados,String>("codAvion"));
	
	}
	
	public static ArrayList<Avion> obtenerAvionesDisponiblesEnFechayLugar(FormMainControler parentForm, LocalDate fecha, ArrayList<VuelosPlanificados> vuelosPlanificados, ArrayList<Avion> aviones, String codAeropuerto){
		ArrayList<Avion> avionesDisponbles = new ArrayList<Avion>();
		for(VuelosPlanificados vp: vuelosPlanificados) {
			if(fecha.equals(vp.getLlegadaLocal()) && parentForm.obtenerDestinoDeCodRuta(vp.getCodRuta()).equals(codAeropuerto)) {
				avionesDisponbles.addAll(aviones.stream().filter(a -> a.getCodigoAvion().equals(vp.getCodAvion())).collect(Collectors.toList()));
			}
		}
		if (avionesDisponbles.isEmpty())
			ControlMensajes.mostrarAlerta("No hay aviones disponibles en el aeropuerto en fecha escogida.");
		return avionesDisponbles;
	}
	
	
	
}
