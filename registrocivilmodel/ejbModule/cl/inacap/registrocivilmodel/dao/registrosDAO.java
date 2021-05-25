package cl.inacap.registrocivilmodel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.registrocivilmodel.dto.Ingresardatos;

/**
 * Session Bean implementation class registrosDAO
 */
@Stateless
@LocalBean
public class registrosDAO implements registrosDAOLocal {

	private List<Ingresardatos> datos=new ArrayList<>();
   

	@Override
	public void save(Ingresardatos ingresar) {
		datos.add(ingresar);
		
	}

	@Override
	public List<Ingresardatos> getAll() {
		// TODO Auto-generated method stub
		return datos;
	}

	@Override
	public void delete(Ingresardatos ingresar) {
		// TODO Auto-generated method stub
		datos.remove(ingresar);
	}

	@Override
	public List<Ingresardatos> finebytipodesolicitud(String tipodesolicitud) {
		// TODO Auto-generated method stub
		return datos;
	}

}
