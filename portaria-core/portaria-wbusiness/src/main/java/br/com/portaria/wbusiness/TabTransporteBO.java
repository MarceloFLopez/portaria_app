package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabTransporte;
import br.com.portaria.persistence.TabTransporteDAO;

@Named
public class TabTransporteBO implements Serializable {
		private static final long serialVersionUID = 1821506831300771273L;

		@Inject
		private TabTransporteDAO transporteDAO ;
		
		/**
		 * BO example, TabEmpresa class
		 * */
		public List<TabTransporte> listAll() throws Exception{
			return transporteDAO.ListAll();
		}
		public TabTransporte findColumnName(String value) {
			return transporteDAO.findColumnName(value);
		}
		public TabTransporte findId(Long id) throws Exception{
			return transporteDAO.crudUtil().buscaPorId(id);
		}
		public void salvar(TabTransporte t) throws Exception{
			// set to Uppercase
			t.setModelo(t.getModelo().toUpperCase());
			
			if (t.getId() == null) {
				transporteDAO.crudUtil().adiciona(t);
			}else {
				transporteDAO.crudUtil().atualiza(t);
			}
		}
		public void remover(TabTransporte t) throws Exception{
			transporteDAO.crudUtil().remove(t);
		}	
		
}
