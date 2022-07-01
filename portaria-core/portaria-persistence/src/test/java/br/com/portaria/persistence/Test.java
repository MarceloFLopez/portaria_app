package br.com.portaria.persistence;

import javax.persistence.EntityManager;

import br.com.portaria.domain.WRegistro;
import br.com.portaria.persistence.util.CRUDUtil;
import br.com.portaria.persistence.util.JPAUtil;

public class Test {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		CRUDUtil<WRegistro> rr = new CRUDUtil<WRegistro>(em, WRegistro.class);
		WRegistro wr = rr.buscaPorId(1l);
		System.out.println(wr);
		}
}

