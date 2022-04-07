package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabOperacao;
import br.com.portaria.persistence.TabOperacaoDAO;

@Named
public class TabOperacaoBO implements Serializable {
		private static final long serialVersionUID = 1821506831300771273L;

		@Inject
		private TabOperacaoDAO tabOperacaoDAO;
		
		/**
		 * BO example, TabEmpresa class
		 * */
		public List<TabOperacao> listAll() throws Exception{
			return tabOperacaoDAO.ListAll();
		}
		public TabOperacao findColumnName(String value) {
			return tabOperacaoDAO.findColumnName(value);
		}
		public TabOperacao findId(Long id) throws Exception{
			return tabOperacaoDAO.crudUtil().buscaPorId(id);
		}
		public void salvar(TabOperacao t) throws Exception{
			// set to Uppercase
			t.setName(t.getName().toUpperCase());
			
			if (t.getId() == null) {
				tabOperacaoDAO.crudUtil().adiciona(t);
			}else {
				tabOperacaoDAO.crudUtil().atualiza(t);
			}
		}
		public void remover(TabOperacao t) throws Exception{
			tabOperacaoDAO.crudUtil().remove(t);
		}	
		
}
