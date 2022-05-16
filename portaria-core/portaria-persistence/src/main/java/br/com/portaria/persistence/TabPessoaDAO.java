package br.com.portaria.persistence;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.TabPessoa;
import br.com.portaria.persistence.util.CRUDUtil;

public class TabPessoaDAO  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager em;

	private CRUDUtil<TabPessoa> crudUtil = new CRUDUtil<TabPessoa>(em, null);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<TabPessoa>(this.em, TabPessoa.class);
	}
	
	public CRUDUtil<TabPessoa> crudUtil(){
		return crudUtil;
	}
	
	/**
	 *customization 
	 */
	@SuppressWarnings("unchecked")
	public List<TabPessoa> ListAll() {
		try {
			return 
			(List<TabPessoa>) em.createNamedQuery("TabPessoa.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	public TabPessoa findColumnName(String value) {
		try {
			return 
			(TabPessoa) em.createNamedQuery("TabPessoa.findColumName").getSingleResult();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	
	public TabPessoa findColumnCpf(String value) {
		try {
			return 
			(TabPessoa) em.createNamedQuery("TabPessoa.findColumnCpf").getSingleResult();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	
}
