package application;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class AuxiliarCargaDeDatos {

	
	public static ArrayList<Avion> cargarAviones() {
		ArrayList<Avion> aviones = new ArrayList<Avion>();
		
		aviones.add(new AvionPasajeros("B65J7", 15000, 300, "Avión Boeing 747", 15000, 416));
		aviones.add(new AvionPasajeros("A320JS", 12000, 500, "Avión Airbus A320", 20000, 220));
		aviones.add(new AvionPasajeros("B737WQ", 6500, 800, "Avión Boeing 737", 10000, 210));
		aviones.add(new AvionPasajeros("B787RT", 12800, 1500, "Avión Boeing 787", 30000, 323));
		aviones.add(new AvionPasajeros("B757NH", 9260, 100, "Avión Boeing 757", 12500, 189));
		aviones.add(new AvionPasajeros("A380PO", 14800, 213, "Avión Airbus A380", 30000, 853));
		
		return aviones;
	}
	
	public static ArrayList<Ruta> cargarRutas() {
		ArrayList<Ruta> rutas = new ArrayList<Ruta>();
		
		rutas.add(new Ruta(500, "BCN-IBZ-CO", "BCN", "IBZ"));
		rutas.add(new Ruta(2675, "IBZ-DVB-CO", "IBZ", "DVB"));
		rutas.add(new Ruta(2500, "ORI-LGW-CO", "ORI", "LGW"));
		rutas.add(new Ruta(9622, "LAX-BCN-CO", "BCN", "LAX"));
		rutas.add(new Ruta(10000, "GRZ-LAX-CO", "GRZ", "LAX"));
		rutas.add(new Ruta(9800, "LAX-ORY-CO", "LAX", "ORY"));
		rutas.add(new Ruta(1500, "HAM-IBZ-CO", "HAM", "IBZ"));
		rutas.add(new Ruta(500, "IBZ-BCN-CO", "IBZ", "BCN"));
		
		return rutas;
	}
	
	public static ArrayList<Aeropuerto> cargarAeropuertos() {
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();
		
		aeropuertos.add(new Aeropuerto("Hamburgo Airport", "HAM", "Alemania"));
		aeropuertos.add(new Aeropuerto("Núremberg Airport", "NUE", "Alemania"));
		aeropuertos.add(new Aeropuerto("Graz Airport", "GRZ", "Austria"));
		aeropuertos.add(new Aeropuerto("Dubrovnik Airport", "DVB", "Croacia"));
		aeropuertos.add(new Aeropuerto("Barcelona Airport", "BCN", "España"));
		aeropuertos.add(new Aeropuerto("Ibiza Airport", "IBZ", "España"));
		aeropuertos.add(new Aeropuerto("París Orly Airport", "ORY", "Francia"));
		aeropuertos.add(new Aeropuerto("Londres Gatwick Airport", "LGW", "Reino Unido"));
		aeropuertos.add(new Aeropuerto("Aeropuerto Internacional José Martí", "HAV", "Cuba"));
		aeropuertos.add(new Aeropuerto("Los Angeles", "LAX", "EEUU"));
		
		return aeropuertos;
	}
	
	public static ArrayList<VuelosPlanificados> caragarVuelosPlanificados(){
		ArrayList<VuelosPlanificados> vuelos = new ArrayList<VuelosPlanificados>();
		
		vuelos.add(new VuelosPlanificados(LocalDate.of(2019, Month.APRIL, 4), LocalDate.of(2019, Month.APRIL, 4), LocalDate.of(2019, Month.APRIL, 4), "BCN-IBZ-CO"));
		vuelos.add(new VuelosPlanificados(LocalDate.of(2019, Month.APRIL, 5), LocalDate.of(2019, Month.APRIL, 5), LocalDate.of(2019, Month.APRIL, 5), "IBZ-DVB-CO"));
		return vuelos;
	}
}

