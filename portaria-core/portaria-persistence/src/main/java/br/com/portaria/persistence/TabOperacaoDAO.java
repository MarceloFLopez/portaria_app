package br.com.portaria.persistence;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.TabOperacao;
import br.com.portaria.persistence.util.CRUDUtil;

public class TabOperacaoDAO  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager em;

	private CRUDUtil<TabOperacao> crudUtil = new CRUDUtil<TabOperacao>(em, null);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<TabOperacao>(this.em, TabOperacao.class);
	}
	
	public CRUDUtil<TabOperacao> crudUtil(){
		return crudUtil;
	}
	
	/**
	 *customization 
	 */
	@SuppressWarnings("unchecked")
	public List<TabOperacao> ListAll() {
		try {
			return 
			(List<TabOperacao>) em.createNamedQuery("TabOperacao.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	public TabOperacao findColumnName(String value) {
		try {
			return 
			(TabOperacao) em.createNamedQuery("TabOperacao.findColumName").getSingleResult();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	
}
