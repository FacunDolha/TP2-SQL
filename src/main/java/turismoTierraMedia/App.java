package turismoTierraMedia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.AtraccionesDao;
import dao.DaoFactory;
import dao.ItinerarioDao;
import dao.PromocionesDao;
import dao.UsuarioDao;
public class App {
    public static void main(String[] args) {
        AtraccionesDao atraccionesConnect = DaoFactory.getAtraccionesDao();
        ItinerarioDao itinerarioConnect = DaoFactory.getItinerariosDao();
        UsuarioDao usuarioConnect = DaoFactory.getUsuarioDao();
        PromocionesDao promocionesDao = DaoFactory.getPromocionesDao();
       
        int i= 0;
        
        while (i ==0) {
            
        
        Consola.metodoSaludar();
                
        while( Consola.inicioApp().equals("SI")  && !usuarioConnect.isEmpty())  {
            System.out.println(usuarioConnect.findAll());
            System.out.println();
            System.out.println("Elegir usuario");
            
            Scanner ingresarUsuario = new Scanner(System.in);
            ingresarUsuario = new Scanner(System.in);
            String nombre = ingresarUsuario.next();
            Usuario usuario = usuarioConnect.findByName(nombre);
            
            if (usuario == null)
                throw new Error("Usuario incorrecto. Intente de nuevo");
            System.out.println();
            System.out.println(usuario.getNombre() + " Estas son las promociones para usted");
            
            try {
				List<Atraccion> atracciones = atraccionesConnect.findAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            List<Promocion> promociones = null;
			try {
				promociones = promocionesDao.findAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            List<Promocion> listaPromocion = new ArrayList<Promocion>();
            
            listaPromocion.addAll(promociones);
          //  listaPromocion.addAll(atracciones);
            
        }
        }
    }
}
        
        
            
            /*
             public static void crearItinerario(Promocion PromocionPreferida , Atraccion preferida) {
        
    }   public static void main(String[] args) {
                
                int i= 0;
                
                while (i ==0) {
                
                Consola.metodoSaludar();
                List<Atraccion>listaAtracciones = GestionarAtracciones.readAtraccionesFileAndCreateList();
                List<Promocion>listaPromociones = GestionarPromociones.readPromocionFileAndCreateList();
                List<Usuario> listaUsuarios=GestionarUsuarios.readUsuariosFileAndCreateList();
                
                        
                while( Consola.inicioApp().equals("SI")  && !listaUsuarios.isEmpty())  {
                List<Promocion>listaPromocionesModificables =listaPromociones;
                List<Atraccion>listaAtraccionesModificables =listaAtracciones;
                GestionarUsuarios.MostrarUsuarios(listaUsuarios);
                Usuario usuarioelegido = GestionarUsuarios.eleccionUsuario( listaUsuarios);
                
                
                List<Promocion> promocionesElegidas = GestionarPromociones.eleccionesPromociones(listaPromocionesModificables,usuarioelegido);
                listaUsuarios.remove(usuarioelegido);
                
                List<Atraccion> atraccionElegida= GestionarAtracciones.guardadoAtraccionesElegidas(listaAtraccionesModificables, usuarioelegido, promocionesElegidas);
                ImpresionItinerario.generarArchivo(usuarioelegido,promocionesElegidas, atraccionElegida);
                    
                    
                    
                Consola.metodoSaludar();    
                }
                System.out.println("Se reinicio la aplicacion");
                System.out.println("");
                
                    
                    
                
                 }
            }*/