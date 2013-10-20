package Com.CrudUsuarios.struts.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;

import Com.CrudUsuarios.dto.Usuario;
import Com.CrudUsuarios.logic.UsuarioLogica;
import Com.CrudUsuarios.struts.form.BuscaEliminaUsuarioForm;

public class BuscaEliminaUsuarioAction extends DispatchAction {
	private static final Log LOG = LogFactory.getLog(BuscaEliminaUsuarioAction.class);
	public ActionForward unspecified(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LOG.info("ACTION unspecified");
		BuscaEliminaUsuarioForm form = (BuscaEliminaUsuarioForm) aform;
		ActionMessages keyMensajes = new ActionMessages();
		cargaForm(form);
		return mapping.findForward("success");
	}
	
	public ActionForward buscar(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LOG.info("ACTION buscar");
		BuscaEliminaUsuarioForm form = (BuscaEliminaUsuarioForm) aform;
		ActionMessages keyMensajes = new ActionMessages();
		cargaForm(form);
		
		return mapping.findForward("success");
	}
	
	public ActionForward eliminar(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LOG.info("ACTION eliminar");
		BuscaEliminaUsuarioForm form = (BuscaEliminaUsuarioForm) aform;
		ActionMessages keyMensajes = new ActionMessages();
		Usuario Usuario = new Usuario();
		Usuario.setId(Long.valueOf(form.getSelectedUsuario()));
		if (!UsuarioLogica.eliminaUsuario(Usuario)){
			keyMensajes.add("msj", new ActionMessage(
					"CrudUsuarios.noSePudoEliminar"));
		}
		cargaForm(form);
		return mapping.findForward("success");
	}
	
	private void cargaForm(BuscaEliminaUsuarioForm form) throws Exception{
		Usuario user = new Usuario();
		try {
			user.setId(Long.valueOf(form.getId()));
		} catch (NumberFormatException e) {
		}
		user.setnombreUsuario(form.getnombreUsuario());
		user.setClave(form.getClave());
		form.setUsuarioList(UsuarioLogica.buscaUsuario(Usuario));
	}
}
