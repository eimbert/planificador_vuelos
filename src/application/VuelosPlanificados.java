package application;

import java.time.LocalDate;
import java.util.ArrayList;

public class VuelosPlanificados {
	private LocalDate salida;
	private LocalDate llegada;
	private LocalDate llegadaLocal;
	private String codRuta;
	private String codAvion;
	
	public VuelosPlanificados(LocalDate salida, LocalDate llegada, LocalDate llegadaLocal, String codRuta, String codAvion) {
		super();
		this.salida = salida;
		this.llegada = llegada;
		this.llegadaLocal = llegadaLocal;
		this.codRuta = codRuta;
		this.codAvion = codAvion;
	}
	
	public LocalDate getSalida() {
		return salida;
	}

	public void setSalida(LocalDate salida) {
		this.salida = salida;
	}

	public LocalDate getLlegada() {
		return llegada;
	}

	public void setLlegada(LocalDate llegada) {
		this.llegada = llegada;
	}

	public LocalDate getLlegadaLocal() {
		return llegadaLocal;
	}

	public void setLlegadaLocal(LocalDate llegadaLocal) {
		this.llegadaLocal = llegadaLocal;
	}

	public String getCodRuta() {
		return codRuta;
	}

	public void setCodRuta(String codRuta) {
		this.codRuta = codRuta;
	}

	public String getCodAvion() {
		return codAvion;
	}
	
}
