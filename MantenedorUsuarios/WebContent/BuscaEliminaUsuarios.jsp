<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

	function fncBuscarUsuarios() {
		document.BuscaEliminaUsuariosForm.action = "/MantenedorUsuarios/BuscaEliminaUsuarios.do";
		document.BuscaEliminaUsuariosForm.submit();
	}
	function fncEliminarUsuarios() {
		if (confirm('Est� seguro que desea eliminar?')) {
			document.BuscaEliminaUsuariosForm.action = "/MantenedorUsuarios/BuscaEliminaUsuarios.do?do=eliminar";
			document.BuscaEliminaUsuariosrForm.submit();
		}
	}

	function fncSelectUsuarios(id) {
		document.getElementById('selectedUser').value = id;
	}

	function fncCreaUsuarios() {
		document.BuscaEliminaUsuariosForm.action = "/MantenedorUsuarios/CreaModificaUsuarios.do?operacion=CREAR";
		document.BuscaEliminaUsuariosForm.submit();
	}

	function fncModificaUsuarios() {
		document.BuscaEliminaUsuariosForm.action = "/MantenedorUsuarios/CreaModificaUsuarios.do?operacion=MODIFICAR&id=" + 
												document.getElementById('selectedUser').value;
		document.BuscaEliminaUsuariosForm.submit();
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busca-Elimina Usuarios</title>
</head>
<body>
	<html:form action="/BuscaEliminaUsuarios">
		<div>
			<fieldset>
				<legend>Buscar</legend>
				Id:
				<html:text name="BuscaEliminaUsuariosForm" property="id"></html:text>
				Nombre Usuario:
				<html:text name="BuscaEliminaUsuariosForm" property="nombreUsuario"></html:text>
				Clave:
				<html:text name="BuscaEliminaUsuariosForm" property="clave"></html:text>
				<html:submit onclick="javascript: fncBuscarUsuarios(); return false;"
					styleId="btnBuscar" property="botonFormulario" tabindex="23" value="Buscar"/>
				<html:submit onclick="javascript: fncCreaUsuarios(); return false;"
					styleId="btnCrear" property="botonFormulario" tabindex="23" value="Crear nuevo"/>
			</fieldset>
		</div>
		<div>
			<logic:notEmpty name="BuscaEliminaUsuariosForm" property="userList">
				<fieldset>
					<legend>Resultados</legend>
					<table border="1" id="tablaInformacion">
						<thead>
							<tr>
								<td>Id</td>
								<td>Nombre Usuario</td>
								<td>Clave</td>
							</tr>
						</thead>
						<logic:iterate id="registro" name="BuscaEliminaUsuariosForm"
							property="userList" type="Com.CrudUsuarios.dto.Usuario">
							<tr>
								<td><html:radio styleId="selectUser"
										name="BuscaEliminaUsuariosrForm" property="selectedUser"
										onchange="javascript: fncSelectUser(this.value);"
										value="<%=registro.getId().toString()%>" /> <bean:write
										name="registro" property="id" /></td>
								<td><bean:write name="registro" property="nombreUsuario" /></td>
								<td><bean:write name="registro" property="clave" /></td>
							</tr>
						</logic:iterate>
					</table>
					<html:submit onclick="javascript: fncEliminarUsuarios(); return false;"
						styleId="btnEliminar" property="botonFormulario" tabindex="23" value="Eliminar"/>
					<html:submit onclick="javascript: fncModificaUsuarios(); return false;"
						styleId="btnModificar" property="botonFormulario" tabindex="23" value="Modificar"/>
				</fieldset>
			</logic:notEmpty>
		</div>
		<html:hidden styleId="selectedUser" name="BuscaEliminaUsuariosForm"
			property="selectedUser" />
	</html:form>
</body>
</html>