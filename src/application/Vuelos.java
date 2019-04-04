package application;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vuelos {
	LocalDate fechaSalida;
	LocalDate fechaLlegada;
	LocalDate fechaLlegadaHoraLocal;
	ArrayList<Ruta> rutas;
	
	public Vuelos(LocalDate fechaSalida, LocalDate fechaLlegada, LocalDate fechaLlegadaHoraLocal,
			ArrayList<Ruta> rutas) {
		super();
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.fechaLlegadaHoraLocal = fechaLlegadaHoraLocal;
		this.rutas = rutas;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public LocalDate getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(LocalDate fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public LocalDate getFechaLlegadaHoraLocal() {
		return fechaLlegadaHoraLocal;
	}

	public void setFechaLlegadaHoraLocal(LocalDate fechaLlegadaHoraLocal) {
		this.fechaLlegadaHoraLocal = fechaLlegadaHoraLocal;
	}

	public ArrayList<Ruta> getRuta() {
		return rutas;
	}

	public void setRuta(ArrayList<Ruta> rutas) {
		this.rutas = rutas;
	}	
}
