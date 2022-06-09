package br.com.portaria.persistence;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.TabCadastro;
import br.com.portaria.persistence.util.CRUDUtil;


public class TabCadastroDAO  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager em;

	private CRUDUtil<TabCadastro> crudUtil = new CRUDUtil<TabCadastro>(em, TabCadastro.class);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<TabCadastro>(this.em, TabCadastro.class);
	}
	
	public CRUDUtil<TabCadastro> crudUtil(){
		return crudUtil;
	}
	
	/**
	 *customization 
	 */
	@SuppressWarnings("unchecked")
	public List<TabCadastro> ListAll() {
		try {
			return 
			(List<TabCadastro>) em.createNamedQuery("TabCadastro.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}

	
	
	
}
