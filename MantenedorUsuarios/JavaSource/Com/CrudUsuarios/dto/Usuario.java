package Com.CrudUsuarios.dto;

public class Usuario {
	private Long id;
	private String nombreUsuario;
	private String clave;
	private String rut;
	private String nombre2Usuario;
	private String apellido1Usuario;
	private String apellido2Usuario;
	private String correos;
	private String domicilio;
	private String fechanac;
	private String telefonos;
	private String casaAsociada;
	private String banco;
	private String ctabanco;
	private String profOficio;
	private String vigencia;
	private String relacionados;
	private String vehiculos;
	
	
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
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getrut() {
		return rut;
	}
	public void setrut(String rut) {
		this.rut = rut;
	}

	public String getnombre2Usuario() {
		return nombre2Usuario;
	}
	public void setnombre2Usuario(String nombre2Usuario) {
		this.nombre2Usuario = nombre2Usuario;
	}

	public String getapellido1Usuario() {
		return apellido1Usuario;
	}
	public void setapellido1Usuario(String apellido1Usuario) {
		this.apellido1Usuario = apellido1Usuario;
	}

	public String getapellido2Usuario() {
		return apellido2Usuario;
	}
	public void setapellido2Usuario(String apellido2Usuario) {
		this.apellido2Usuario = apellido2Usuario;
	}

	public String getcorreos() {
		return correos;
	}
	public void setcorreos(String correos) {
		this.correos = correos;
	}

	public String getdomicilio() {
		return domicilio;
	}
	public void setdomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getfechanac() {
		return fechanac;
	}
	public void setfechanac(String  fechanac) {
		this.fechanac =  fechanac;
	}
	
	public String gettelefonos() {
		return telefonos;
	}
	public void settelefonos(String telefonos) {
		this.telefonos = telefonos;
	}

	public String getcasaAsociada() {
		return  casaAsociada;
	}
	public void setcasaAsociada(String  casaAsociada) {
		this.casaAsociada =  casaAsociada;
	}

	public String getbanco() {
		return  banco;
	}
	public void setbanco(String  banco) {
		this.banco =  banco;
	}

	public String getctabanco() {
		return  ctabanco;
	}
	public void setctabanco(String  ctabanco) {
		this.ctabanco =  ctabanco;
	}

	public String getprofOficio() {
		return  profOficio;
	}
	public void setprofOficio(String  profOficio) {
		this.profOficio =  profOficio;
	}

	public String getvigencia() {
		return  vigencia;
	}
	public void setvigencia(String  vigencia) {
		this.vigencia =  vigencia;
	}

	public String getrelacionados() {
		return  relacionados;
	}
	public void setrelacionados(String  relacionados) {
		this.relacionados =  relacionados;
	}

	public String getvehiculos() {
		return  vehiculos;
	}
	public void setvehiculos(String  vehiculos) {
		this.vehiculos =  vehiculos;
	}
	
	
	@Override
	public String toString() {
	  //return "User [id=" + id + ", Nombre Usuario=" + nombreUsuario + ", Clave="+ clave + "]";
		return "User [id=" + id + ", Nombre Usuario=" + nombreUsuario + ", Clave="+ clave + ", Rut="+ rut + ", Nombre2 Usuario=" + nombre2Usuario + ", Apellido1 Usuario=" + apellido1Usuario + ", Apellido2 Usuario=" + apellido2Usuario + ", Correos=" + correos + ", Domicilio=" + domicilio + ", Fecha Nacimiento=" + fechanac + ", Telefonos=" + telefonos + ", Casa Asociada=" + casaAsociada + ", Nombre Banco=" + banco + ", Cta Banco=" + ctabanco + ", Profesion u Oficio=" + profOficio + ", Vigencia=" + vigencia + ", Relacionados=" + relacionados + ", Vehiculos=" + vehiculos + "]";
	}
}
