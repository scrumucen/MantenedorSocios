package Com.CrudUsuarios.struts.form;

import org.apache.struts.action.ActionForm;

public class CreaModificaUsuarioForm extends ActionForm {

	private static final long serialVersionUID = -4220223811564012984L;
	private String id;
	private String nombreUsuario;
	private String clave;
	private String operacion;
	
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
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	@Override
	public String toString() {
		return "CreaModificaUserForm [id=" + id + ", username=" + nombreUsuario
				+ ", password=" + clave + ", operacion=" + operacion + "]";
	}
	
}