package application;

public class Ruta {
	private String codRuta;
	private int distancia;
	private String airportOrigen; // cambiar a un struct
	private String airportDest;
	
	/**
	 * 
	 * @param diatancia Distancia entre el aeropuerto origen y destino
	 * @param airportOrigen Código del aeropuerto origen
	 * @param airportDest Código del aeropuerto destino
	 */
	public Ruta(int distancia, String codRuta, String airportOrigen, String airportDest) {
		super();
		this.distancia = distancia;
		this.airportOrigen = airportOrigen;
		this.airportDest = airportDest;
		this.codRuta = codRuta;
	}

	public String getCodRuta() {
		return codRuta;
	}

	public int getDistancia() {
		return distancia;
	}

	public String getAirportOrigen() {
		return airportOrigen;
	}

	public String getAirportDest() {
		return airportDest;
	}
	
	
}
