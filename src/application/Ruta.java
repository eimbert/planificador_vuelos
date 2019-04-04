package application;

public class Ruta {
	private String codRuta;
	private int diatancia;
	private String AirportOrigen; // cambiar a un struct
	private String AirportDest;
	
	/**
	 * 
	 * @param diatancia Distancia entre el aeropuerto origen y destino
	 * @param airportOrigen C�digo del aeropuerto origen
	 * @param airportDest C�digo del aeropuerto destino
	 */
	public Ruta(int diatancia, String codRuta, String airportOrigen, String airportDest) {
		super();
		this.diatancia = diatancia;
		AirportOrigen = airportOrigen;
		AirportDest = airportDest;
		this.codRuta = codRuta;
	}
	
	
}
