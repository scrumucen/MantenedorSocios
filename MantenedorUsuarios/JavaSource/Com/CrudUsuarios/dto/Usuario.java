package Com.CrudUsuarios.dto;

public class Usuario {
	private Long id;
	private String nombreUsuario;
	private String clave;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getnombreUsuario() {
		return nombreUsuario;
	}
	public void setnombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return clave;
	}
	public void setPassword(String password) {
		this.clave = clave;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", Nombre Usuario=" + nombreUsuario + ", Clave="
				+ clave + "]";
	}
}