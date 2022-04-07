package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabPessoa;
import br.com.portaria.persistence.TabPessoaDAO;

@Named
public class TabPessoaBO implements Serializable {
		private static final long serialVersionUID = 1821506831300771273L;

		@Inject
		private TabPessoaDAO tabPessoaDAO;
		
		/**
		 * BO example, TabEmpresa class
		 * */
		public List<TabPessoa> listAll() throws Exception{
			return tabPessoaDAO.ListAll();
		}
		public TabPessoa findColumnName(String value) {
			return tabPessoaDAO.findColumnName(value);
		}
		public TabPessoa findId(Long id) throws Exception{
			return tabPessoaDAO.crudUtil().buscaPorId(id);
		}
		public void salvar(TabPessoa t) throws Exception{
			// set to Uppercase
			t.setName(t.getName().toUpperCase());
			
			if (t.getId() == null) {
				tabPessoaDAO.crudUtil().adiciona(t);
			}else {
				tabPessoaDAO.crudUtil().atualiza(t);
			}
		}
		public void remover(TabPessoa t) throws Exception{
			tabPessoaDAO.crudUtil().remove(t);
		}	
		
}
