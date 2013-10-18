package Com.CrudUsuarios.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import Com.CrudUsuarios.dto.Usuario;

public class UsuarioDAO {
	private static final Log LOG = LogFactory.getLog(UsuarioDAO.class);
	private static List<Usuario> instance;
	private static List<Usuario> getInstance() {
		if (instance == null) {
			instance = obtenerUsuario();
		}
		return instance;
	}
	public static List<Usuario> buscaUsuarios(Usuario filtros) throws SQLException {
		ArrayList<Usuario> retorno = new ArrayList<Usuario>();
		LOG.info("DAO buscaUsuarios");
		getInstance();
		LOG.info(filtros);
		for(Iterator<Usuario> iter = getInstance().iterator();iter.hasNext();){
			Usuario actual = iter.next();
			if (!((filtros.getId() != null && !actual.getId().equals(filtros.getId())) ||
					(filtros.getnombreUsuario() != null && filtros.getnombreUsuario() != "" && !actual.getnombreUsuario().toLowerCase().contains(filtros.getnombreUsuario().toLowerCase()))  ||
					(filtros.getClave() != null && filtros.getClave() != "" && !actual.getClave().toLowerCase().contains(filtros.getClave().toLowerCase())))) {
				LOG.info("Eliminado: "+actual);
				retorno.add(actual);
			}
		}
		
		return retorno;
	}

	public static boolean eliminaUsuario(Usuario usuario) {
		LOG.info("DAO eliminaUsuarios");
		
		//simula un "delete users where id = ?" 
		for(Iterator<Usuario> iter = getInstance().iterator();iter.hasNext();){
			Usuario actual = iter.next();
			LOG.info(actual.getId() + " " + usuario.getId());
			if (actual.getId().equals(usuario.getId())) {
				iter.remove();
			}
		}
		return true;
	}
	
	private static ArrayList<Usuario> obtenerUsuario(){
		ArrayList<Usuario> retorno = new ArrayList<Usuario>();
		for (Integer i = 0; i < 5; i++) {
			Usuario actual = new Usuario();
			actual.setId(i.longValue());
			actual.setnombreUsuario("Usuarios " + i);
			actual.setClave(String.valueOf(i*27 + 62535));
			retorno.add(actual);
		}
		return retorno;
	}

	public static Usuario creaUsuario(Usuario usuario) {
		LOG.info("DAO creaUsuarios");
		
		//simula un "insert into users values (?,?,?)"
		usuario.setId(getNextId());
		getInstance().add(usuario);
		
		return usuario;
	}

	public static Usuario modificaUsuarios(Usuario usuario) {
		LOG.info("DAO modificaUsuarios");

		//simula un "update users set username=?,password=? where id=?"
		for(Iterator<Usuario> iter = getInstance().iterator();iter.hasNext();){
			Usuario actual = iter.next();
			LOG.info(actual.getId() + " " + usuario.getId());
			if (actual.getId().equals(usuario.getId())) {
				actual.setnombreUsuario(usuario.getnombreUsuario());
				actual.setClave(usuario.getClave());
			}
		}
		return usuario;
	}
	
	/**
	 * Simula una secuencia de BD.
	 * @return id siguiente de la secuencia.
	 */
	private static Long getNextId(){
		Long maxId = 0L;
		for(Iterator<Usuario> iter = getInstance().iterator();iter.hasNext();){
			Usuario actual = iter.next();
			if (actual.getId() > maxId) {
				maxId = actual.getId();
			}
		}
		return ++maxId;
	}
}
