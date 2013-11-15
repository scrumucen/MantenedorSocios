<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function fncVolver() {
		document.CreaModificaUsuariosForm.action = "/MantenedorUsuarios/";
		document.CreaModificaUsuariosForm.submit();
	}

	function fncCreaUsuarios() {
		document.CreaModificaUsuariosForm.action = "/MantenedorUsuarios/CreaModificaUsuariosr.do?do=crear";
		document.CreaModificaUsuariosForm.submit();
	}

	function fncModificaUsuarios() {
		document.getElementById("id").disabled = false;
		document.CreaModificaUsuariosForm.action = "/MantenedorUsuarios/CreaModificaUsuarios.do?do=modificar";
		document.CreaModificaUsuariosForm.submit();
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busca-Elimina User</title>
</head>
<body>
	<html:form action="/CreaModificaUsuarios">
<!-- 		Si la operacion es crear muestra formulario de creación -->
		<logic:equal value="CREAR" name="CreaModificaUsuariosForm" property="operacion">
		<div>
			<fieldset>
				<legend>Crear nuevo</legend>
				Id:
				<html:text name="CreaModificaUsuariosForm" property="id" disabled="true"></html:text>
				Username:
				<html:text name="CreaModificaUsuariosForm" property="nombreUsuario"></html:text>
				Password:
				<html:text name="CreaModificaUsuariosForm" property="clave"></html:text>
				<html:submit onclick="javascript: fncCreaUsuarios(); return false;"
					styleId="btnCrear" property="botonFormulario" tabindex="23" value="Crear"/>
				<html:submit onclick="javascript: fncVolver(); return false;"
					styleId="btnVolver" property="botonFormulario" tabindex="23" value="Volver"/>
			</fieldset>
		</div>
		</logic:equal>
		
<!-- 		Si la operacion es modificar muestra formulario de modificación -->
		<logic:equal value="MODIFICAR" name="CreaModificaUsuariosForm" property="operacion">
		<div>
			<fieldset>
				<legend>Modificar existente</legend>
				Id:
				<html:text styleId="id" name="CreaModificaUsuariosForm" property="id" disabled="true"></html:text>
				Username:
				<html:text name="CreaModificaUsuariosForm" property="nombreUsuario"></html:text>
				Password:
				<html:text name="CreaModificaUsuariosForm" property="clave"></html:text>
				<html:submit onclick="javascript: fncModificaUsuarios(); return false;"
					styleId="btnCrear" property="botonFormulario" tabindex="23" value="Modificar"/>
				<html:submit onclick="javascript: fncVolver(); return false;"
					styleId="btnVolver" property="botonFormulario" tabindex="23" value="Volver"/>
			</fieldset>
		</div>
		</logic:equal>
	</html:form>
</body>
</html>