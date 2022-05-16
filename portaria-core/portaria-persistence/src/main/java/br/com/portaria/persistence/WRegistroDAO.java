package br.com.portaria.persistence;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.WRegistro;
import br.com.portaria.persistence.util.CRUDUtil;

public class WRegistroDAO {
	@Inject
	EntityManager em;

	private CRUDUtil<WRegistro> crudUtil = new CRUDUtil<WRegistro>(em, null);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<WRegistro>(this.em, WRegistro.class);
	}
	
	public CRUDUtil<WRegistro> crudUtil(){
		return crudUtil;
	}
	

	@SuppressWarnings("unchecked")
	public List<WRegistro> ListAll() {
		try {
			return 
			(List<WRegistro>) em.createNamedQuery("WRegistro.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}

}
