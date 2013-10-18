package Com.CrudUsuarios.logic;

import java.util.List;

import Com.CrudUsuarios.dao.UsuarioDAO;
import Com.CrudUsuarios.dto.Usuario;

public class UsuarioLogica {

	public static List<Usuario> buscaUsuario(Usuario filtros) throws Exception {
		return UsuarioDAO.buscaUsuarios(filtros);
	}
	public static boolean eliminaUsuario(Usuario usuario) throws Exception {
		return UsuarioDAO.eliminaUsuario(usuario);
	}
	public static Usuario creaUser(Usuario usuario) throws Exception {
		return UsuarioDAO.creaUsuario(usuario);
	}
	public static Usuario modificaUsuario(Usuario usuario) throws Exception {
		return UsuarioDAO.modificaUsuarios(usuario);
	}
}
