package br.com.portaria.persistence;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.persistence.util.CRUDUtil;


public class TabEmpresaDAO  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager em;

	private CRUDUtil<TabEmpresa> crudUtil = new CRUDUtil<TabEmpresa>(em, null);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<TabEmpresa>(this.em, TabEmpresa.class);
	}
	
	public CRUDUtil<TabEmpresa> crudUtil(){
		return crudUtil;
	}
	
	/**
	 *customization 
	 */
	@SuppressWarnings("unchecked")
	public List<TabEmpresa> ListAll() {
		try {
			return 
			(List<TabEmpresa>) em.createNamedQuery("TabEmpresa.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	public TabEmpresa findColumnName(String value) {
		try {
			return 
			(TabEmpresa) em.createNamedQuery("TabEmpresa.findColumnName").getSingleResult();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	
}
