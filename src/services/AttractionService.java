package services;

import java.util.List;

import model.Atraccion;
import main.java.dao.AtraccionesDao;
import persistence.commons.DaoFactory;

public class AttractionService {

	public List<Atraccion> list() {
		return DaoFactory.getAtraccionesDao().findAll();
	}

	public Atraccion create(String name, Integer cost, Double duration, Integer capacity) {

		Atraccion attraction = new Atraccion(-1, name, cost, duration, capacity);

		if (attraction.isValid()) {
			AtraccionesDao attractionDAO = DaoFactory.getAtraccionesDao();
			attractionDAO.insert(attraction);
			// XXX: si no devuelve "1", es que hubo más errores
		}

		return attraction;
	}

	public Atraccion update(Integer id, String name, Integer cost, Double duration, Integer capacity) {

		AtraccionesDao attractionDAO = DaoFactory.getAtraccionesDao();
		Atraccion attraction = attractionDAO.find(id);

		attraction.setNombre(name);
		attraction.setPrecio(cost);
		attraction.setDuracion(duration);
		attraction.setCupoPersonas(capacity);

		if (attraction.isValid()) {
			attractionDAO.update(attraction);
			// XXX: si no devuelve "1", es que hubo más errores
		}

		return attraction;
	}

	public void delete(Integer id) {
		Atraccion attraction = new Attraction(id, null, null, null, null);

		AtraccionesDao attractionDAO = DaoFactory.getAtraccionesDao();
		attractionDAO.delete(attraction);
	}

	public Atraccion find(Integer id) {
		AtraccionesDao attractionDAO = DaoFactory.getAtraccionesDao();
		return attractionDAO.find(id);
	}

}
