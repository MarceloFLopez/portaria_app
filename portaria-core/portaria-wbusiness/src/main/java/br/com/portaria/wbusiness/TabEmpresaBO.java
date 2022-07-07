package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.persistence.TabEmpresaDAO;

@Named
public class TabEmpresaBO implements Serializable {
		private static final long serialVersionUID = 1821506831300771273L;

		@Inject
		private TabEmpresaDAO tabEmpresaDAO;
		
		public List<TabEmpresa> listAll() throws Exception{
			return tabEmpresaDAO.ListAll();
		}
		public TabEmpresa findColumnName(String value) {
			return tabEmpresaDAO.findColumnName(value);
		}
		public TabEmpresa findColumnCnpj(String value) {
			return tabEmpresaDAO.findColumnCnpj(value);
		}
		public TabEmpresa findId(Long id) throws Exception{
			return tabEmpresaDAO.crudUtil().buscaPorId(id);
		}
		public void salvar(TabEmpresa t) throws Exception{
			// set to Uppercase
			t.setName(t.getName().toUpperCase());
			
			if (t.getId() == null) {
				tabEmpresaDAO.crudUtil().adiciona(t);
			}else {
				tabEmpresaDAO.crudUtil().atualiza(t);
			}
		}
		public void remove(TabEmpresa t) throws Exception{
			tabEmpresaDAO.crudUtil().remove(t);
		}	
		
}
