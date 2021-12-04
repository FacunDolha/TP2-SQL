package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Integer idUsuario;
	private String username, password;
	private Boolean admin;
	private Integer presupuesto;
	private Double tiempoDisponible;

	public Usuario(Integer id, String username, String password, Integer coins, Double time, Boolean admin) {
		super();
		this.idUsuario = id;
		this.username = username;
		this.password = password;
		this.presupuesto = coins;
		this.tiempoDisponible = time;
		this.admin = admin;
	}
/*public class Usuario {
	private int idUsuario;
	private String nombre;
	public double presupuesto;
	public double tiempoDisponible;
	private TipoAtraccion tipoPreferido;
	private List<Atraccion> todasLasAtracciones;
	private List<Atraccion> atraccionesAdquiridas;
	private List<Promocion> promocionesAdquiridas;

	public Usuario(int idUsuario, String nombre, double presupuesto, double tiempoDisponible,
			TipoAtraccion tipoPreferido) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.tipoPreferido = tipoPreferido;
		this.todasLasAtracciones = new ArrayList<Atraccion>();
		this.atraccionesAdquiridas = new ArrayList<Atraccion>();
		this.promocionesAdquiridas = new ArrayList<Promocion>();
	}



	public int getIdUsuario() {
		return idUsuario;
	}

	public boolean esBuenPrecio(double precio) {
		return presupuesto >= precio;
	}

	public boolean esTiempoSuficiente(double duracion) {
		return tiempoDisponible >= duracion;
	}

	public boolean esAtraccionPreferida(List<TipoAtraccion> tipoAtraccion) {
		return tipoAtraccion.contains(tipoPreferido);
	}

	public String getNombre() {
		return nombre;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public TipoAtraccion getTipoPreferido() {
		return tipoPreferido;
	}

	public List<Atraccion> getTodasLasAtracciones() {
		return todasLasAtracciones;
	}

	public List<Promocion> getPromocionesAdquiridas() {
		return promocionesAdquiridas;
	}

	public List<Atraccion> getAtraccionesAdquiridas() {
		return atraccionesAdquiridas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto -= presupuesto;
	}

	public void setTiempoDisponible(double tiempoDisponible) {
		this.tiempoDisponible -= tiempoDisponible;
	}

	public void setTipoPreferido(TipoAtraccion tipoPreferido) {
		this.tipoPreferido = tipoPreferido;
	}

	public void setTodasLasAtracciones(List<Atraccion> todasLasAtracciones) {
		this.todasLasAtracciones = todasLasAtracciones;
	}

	@Override
	public String toString() {
		return nombre + ", presupuesto:" + presupuesto + ", tiempoDisponible:" + tiempoDisponible + ", Preferencia:"
				+ tipoPreferido;
	}

	public boolean acceso(List<Promocion> lista) {
		boolean acceso = false;
		for (Promocion i : lista) {
			if (this.getPresupuesto() > i.getPrecio() && this.getTiempoDisponible() > i.getTiempoPromocion())
				acceso = true;
		}
		return acceso;
	} */

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAdmin() {
		return admin;
	}
	
	public boolean isNull() {
		return false;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Integer getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public void setTiempoDisponible(Double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}
	
	
	
	
	
}