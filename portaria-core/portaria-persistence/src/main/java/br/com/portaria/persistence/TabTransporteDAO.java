package br.com.portaria.persistence;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.TabTransporte;
import br.com.portaria.persistence.util.CRUDUtil;

public class TabTransporteDAO  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager em;

	private CRUDUtil<TabTransporte> crudUtil = new CRUDUtil<TabTransporte>(em, null);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<TabTransporte>(this.em, TabTransporte.class);
	}
	
	public CRUDUtil<TabTransporte> crudUtil(){
		return crudUtil;
	}
	
	/**
	 *customization 
	 */
	@SuppressWarnings("unchecked")
	public List<TabTransporte> ListAll() {
		try {
			return 
			(List<TabTransporte>) em.createNamedQuery("TabTransporte.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	public TabTransporte findColumnName(String value) {
		try {
			return 
			(TabTransporte) em.createNamedQuery("TabTransporte.findColumName").getSingleResult();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	
}
