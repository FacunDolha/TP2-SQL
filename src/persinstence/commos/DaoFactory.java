package persinstence.commos;

public class DaoFactory {
	public static UsuarioDao getUsuarioDao() {
		return new UsuarioDao();
	}

	public static AtraccionesDao getAtraccionesDao() {
		return new AtraccionesDao();
	}

	public static PromocionesDao getPromocionesDao() {
		return new PromocionesDao();
	}

	public static ItinerarioDao getItinerariosDao() {
        return new ItinerarioDao();
    }
}


