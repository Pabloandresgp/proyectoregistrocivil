package cl.inacap.registrocivilmodel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.registrocivilmodel.dto.Ingresardatos;

@Local
public interface registrosDAOLocal {
	
	void save (Ingresardatos ingresar);
	List<Ingresardatos> getAll();
	
	void delete (Ingresardatos ingresar);
	List<Ingresardatos> finebytipodesolicitud(String tipodesolicitud);
	

}
