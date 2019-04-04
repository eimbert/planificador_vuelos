package application;

public class AvionPasajeros extends Avion{
	private int numPasajeros;
	
	/**
	 * 
@param codigoAvion Codigo del avi�n
	 * @param autonomia Distancia que puede recorrer sin repostar en Km
	 * @param horasVuelo Horas que lleva de vuelo desde el �ltimo mantenmimiento
	 * @param descripcion Descripci�n del avi�n
	 * @param horasMaxVueloHastaMantenimiento Horas m�ximas de vuelo hasta revisi�n
	 * @param numPasajeros Capacidad maxima de pasajeros
	 */
	public AvionPasajeros(String codigoAvion, int autonomia, int horasVuelo, String descripcion,
			int horasMaxVueloHastaMantenimiento, int numPasajeros) {
		super(codigoAvion, autonomia, horasVuelo, descripcion, horasMaxVueloHastaMantenimiento);
		
		this.numPasajeros = numPasajeros;
	}

}
