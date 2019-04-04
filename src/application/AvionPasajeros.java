package application;

public class AvionPasajeros extends Avion{
	private int numPasajeros;
	
	/**
	 * 
@param codigoAvion Codigo del avión
	 * @param autonomia Distancia que puede recorrer sin repostar en Km
	 * @param horasVuelo Horas que lleva de vuelo desde el último mantenmimiento
	 * @param descripcion Descripción del avión
	 * @param horasMaxVueloHastaMantenimiento Horas máximas de vuelo hasta revisión
	 * @param numPasajeros Capacidad maxima de pasajeros
	 */
	public AvionPasajeros(String codigoAvion, int autonomia, int horasVuelo, String descripcion,
			int horasMaxVueloHastaMantenimiento, int numPasajeros) {
		super(codigoAvion, autonomia, horasVuelo, descripcion, horasMaxVueloHastaMantenimiento);
		
		this.numPasajeros = numPasajeros;
	}

}
