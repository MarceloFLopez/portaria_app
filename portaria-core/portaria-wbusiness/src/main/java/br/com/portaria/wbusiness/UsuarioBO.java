package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.Usuario;
import br.com.portaria.persistence.UsuarioDAO;

@Named
public class UsuarioBO implements Serializable {
		private static final long serialVersionUID = 1821506831300771273L;

		@Inject
		private UsuarioDAO usuarioDAO ;
		
		/**
		 * BO example, TabEmpresa class
		 * */
		public List<Usuario> listAll() throws Exception{
			return usuarioDAO.ListAll();
		}
		public Usuario findColumnName(String value) {
			return usuarioDAO.findColumnName(value);
		}
		public Usuario findId(Long id) throws Exception{
			return usuarioDAO.crudUtil().buscaPorId(id);
		}
		public void salvar(Usuario t) throws Exception{
			// set to Uppercase
			t.setNome(t.getNome().toUpperCase());
			
			if (t.getId() == null) {
				usuarioDAO.crudUtil().adiciona(t);
			}else {
				usuarioDAO.crudUtil().atualiza(t);
			}
		}
		public void remove(Usuario t) throws Exception{
			usuarioDAO.crudUtil().remove(t);
		}	
		
}
