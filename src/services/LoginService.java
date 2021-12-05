package services;

import model.Usuario;
import model.nullobjects.NullUsuario;
import main.java.dao.UsuarioDao;
import persistence.commons.DaoFactory;

public class LoginService {

	public Usuario login(String username, String password) {
		UsuarioDao userDao = DaoFactory.getUsuarioDao();
    	Usuario user = userDao.findByUsername(username);
    	
    	if (user.isNull() || !user.checkPassword(password)) {
    		user = NullUsuario.build();
    	}
    	return user;
	}
	
}
