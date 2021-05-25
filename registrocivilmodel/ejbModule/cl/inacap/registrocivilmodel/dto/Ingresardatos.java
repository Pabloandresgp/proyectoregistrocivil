package cl.inacap.registrocivilmodel.dto;


public class Ingresardatos {
	
	private String rut;
	private String nombre;
	private String tipodesolicitud;
	private int numero;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipodesolicitud() {
		return tipodesolicitud;
	}
	public void setTipodesolicitud(String tipodesolicitud) {
		this.tipodesolicitud = tipodesolicitud;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
