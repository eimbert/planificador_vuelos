package application;

public class AvionCarga extends Avion {
	private int capacidadDeCarga;
	
	public AvionCarga(String codigoAvion, int autonomia, int horasVuelo, String descripcion,
			int horasMaxVueloHastaMantenimiento, int capacidadDeCarga) {
		super(codigoAvion, autonomia, horasVuelo, descripcion, horasMaxVueloHastaMantenimiento);
		
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public int getCapacidadDeCarga() {
		return capacidadDeCarga;
	}
	
	
}
