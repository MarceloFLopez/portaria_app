package br.com.portaria.persistence;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.portaria.domain.Usuario;
import br.com.portaria.persistence.util.CRUDUtil;

public class UsuarioDAO {
	@Inject
	EntityManager em;

	private CRUDUtil<Usuario> crudUtil = new CRUDUtil<Usuario>(em, null);

	@PostConstruct
	void init() {
		this.crudUtil = new CRUDUtil<Usuario>(this.em, Usuario.class);
	}
	
	public CRUDUtil<Usuario> crudUtil(){
		return crudUtil;
	}
	

	@SuppressWarnings("unchecked")
	public List<Usuario> ListAll() {
		try {
			return 
			(List<Usuario>) em.createNamedQuery("Usuario.listAll").getResultList();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
	public Usuario findColumnName(String value) {
		try {
			return 
			(Usuario) em.createNamedQuery("Usuario.findColumName").getSingleResult();
		} catch (NoResultException e) {
			e.getStackTrace();
			return null;
		}
	}
}
