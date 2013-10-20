package Com.CrudUsuarios.struts.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import Com.CrudUsuarios.dto.Usuario;

public class BuscaEliminaUsuarioForm extends ActionForm {

		private static final long serialVersionUID = 1L;
		//resultados
		private List<Usuario> usuarioList;
		
		//seleccionado para eliminar (o editar)
		private String selectedUsuario;
		
		//busqueda
		private String id;
		private String nombreUsuario;
		private String clave;
		
		public List<Usuario> getUserList() {
			return usuarioList;
		}

		public void setUserList(List<Usuario> userList) {
			this.usuarioList = usuarioList;
		}

		public String getSelectedUsuario() {
			return selectedUsuario;
		}

		public void setSelectedUsuario(String selectedUsuario) {
			this.selectedUsuario = selectedUsuario;
		}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getnombreUsuario() {
			return nombreUsuario;
		}

		public void setnombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		
		public String getClave() {
			return clave;
		}

		public void setClave(String clave) {
			this.clave = clave;
		}

		@Override
		public String toString() {
			return "BuscaEliminaUsuarioForm [userList=" + usuarioList
					+ ", selectedUsuario=" + selectedUsuario + "]";
		}
		
}