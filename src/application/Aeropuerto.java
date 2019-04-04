package application;

public class Aeropuerto {
	private String nombreAeropuerto;
	private String codigoAeropuerto;
	private String pais;
	public Aeropuerto(String nombreAeropuerto, String codigoAeropuerto, String pais) {
		super();
		this.nombreAeropuerto = nombreAeropuerto;
		this.codigoAeropuerto = codigoAeropuerto;
		this.pais = pais;
	}
	
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}
	public String getCodigoAeropuerto() {
		return codigoAeropuerto;
	}
	public String getPais() {
		return pais;
	}
}
