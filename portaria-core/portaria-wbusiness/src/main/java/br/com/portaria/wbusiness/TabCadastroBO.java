package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabCadastro;
import br.com.portaria.persistence.TabCadastroDAO;

@Named
public class TabCadastroBO implements Serializable {
		private static final long serialVersionUID = 1821506831300771273L;

		@Inject
		private TabCadastroDAO tabCadastroDAO;
		
		/**
		 * BO example, TabCadastro class
		 * */
		public List<TabCadastro> listAll() throws Exception{
			return tabCadastroDAO.ListAll();
		}

		public TabCadastro findId(Long id) throws Exception{
			return tabCadastroDAO.crudUtil().buscaPorId(id);
		}
		public void salvar(TabCadastro t) throws Exception{
			// set to Uppercase
			if (t.getId() == null) {
				tabCadastroDAO.crudUtil().adiciona(t);
			}else {
				tabCadastroDAO.crudUtil().atualiza(t);
			}
		}
		public void remove(TabCadastro t) throws Exception{
			tabCadastroDAO.crudUtil().remove(t);
		}	
		
}
