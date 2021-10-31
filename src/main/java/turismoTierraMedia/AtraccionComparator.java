package turismoTierraMedia;

import java.util.Comparator;

public class AtraccionComparator implements Comparator<Atraccion> {
	public int compare(Atraccion o1, Atraccion o2) {
		int resultado = 0;
		if (o1.getPrecioObj() > o2.getPrecioObj()
				|| o1.getPrecioObj() == o2.getPrecioObj() && o1.getDuracionOj() > o2.getDuracionOj())
			resultado = 1;
		else if (o1.getPrecioObj() < o2.getPrecioObj())
			resultado = -1;

		return -1 * resultado;
	}
}