package turismoTierraMedia;

import java.util.ArrayList;
import java.util.List;

public class Itinerario {
	private int id_itinerario;
	private int id_promocion;
	private int id_atraccion;
	private int id_usuario;

	public Itinerario(int id_itinerario, int id_usuario, int id_atraccion, int id_promocion) {
		this.id_itinerario = id_itinerario;
		this.id_usuario = id_usuario;
		this.id_atraccion = id_atraccion;
		this.id_promocion = id_promocion;
	}

	public Itinerario(int id_usuario, int id_atraccion, int id_promocion) {
		this.id_usuario = id_usuario;
		this.id_atraccion = id_atraccion;
		this.id_promocion = id_promocion;
	}

	public static List<Adquiribles> armadoItinerario(List<Promocion> elegida, List<Atraccion> elegido) {
		List<Adquiribles> itinerario = new ArrayList<Adquiribles>();
		itinerario.addAll(elegida);
		itinerario.addAll(elegido);
		return itinerario;
	}

	public int getId_itinerario() {
		return id_itinerario;
	}

	public int getId_promocion() {
		return id_promocion;
	}

	public int getId_atraccion() {
		return id_atraccion;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	@Override
	public String toString() {
		return "Itinerario [id_promocion=" + id_promocion + ", id_atraccion=" + id_atraccion + ", id_usuario="
				+ id_usuario + "]";
	}
}