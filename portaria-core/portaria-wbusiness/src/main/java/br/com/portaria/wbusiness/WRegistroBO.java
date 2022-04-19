package br.com.portaria.wbusiness;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.WRegistro;
import br.com.portaria.persistence.WRegistroDAO;

@Named
public class WRegistroBO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private WRegistroDAO wRegistroDAO;

	public List<WRegistro> listAll() throws Exception{
		return wRegistroDAO.ListAll();
	}

	public WRegistro findId(Long id) throws Exception{
		return wRegistroDAO.crudUtil().buscaPorId(id);
	}
	public void salvar(WRegistro t) throws Exception{
		
		if (t.getId() == null) {
			wRegistroDAO.crudUtil().adiciona(t);
		}else {
			wRegistroDAO.crudUtil().atualiza(t);
		}
	}
	public void remove(WRegistro t) throws Exception{
		wRegistroDAO.crudUtil().remove(t);
	}	
	
}
