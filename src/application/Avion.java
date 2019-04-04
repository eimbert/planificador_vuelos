package application;

public abstract class Avion {
	private String codigoAvion;
	private int autonomia; //autonomia de vuelo
	private int horasVuelo; //horas de vuelo desde el ultimo mantenimiento
	private String descripcion;
	private int horasMaxVueloHastaMantenimiento;
	

	public Avion(String codigoAvion, int autonomia, int horasVuelo, String descripcion,
			int horasMaxVueloHastaMantenimiento) {
		super();
		this.codigoAvion = codigoAvion;
		this.autonomia = autonomia;
		this.horasVuelo = horasVuelo;
		this.descripcion = descripcion;
		this.horasMaxVueloHastaMantenimiento = horasMaxVueloHastaMantenimiento;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getHorasVuelo() {
		return horasVuelo;
	}

	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHorasMaxVueloHastaMantenimiento() {
		return horasMaxVueloHastaMantenimiento;
	}

	public void setHorasMaxVueloHastaMantenimiento(int horasMaxVueloHastaMantenimiento) {
		this.horasMaxVueloHastaMantenimiento = horasMaxVueloHastaMantenimiento;
	}

	public String getCodigoAvion() {
		return codigoAvion;
	}	
}
