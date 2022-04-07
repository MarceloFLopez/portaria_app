package br.com.portaria.persistence;

import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.domain.TabPessoa;
import br.com.portaria.persistence.util.CRUDUtil;
import br.com.portaria.persistence.util.JPAUtil;

public class WTestaConexao {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		EntityManager em = JPAUtil.getEntityManager();

		CRUDUtil<TabPessoa> utilp = new CRUDUtil<TabPessoa>(em, TabPessoa.class);
		CRUDUtil<TabEmpresa> utile = new CRUDUtil<TabEmpresa>(em, TabEmpresa.class);
//		CRUDUtil<Transporte> utilt = new CRUDUtil<Transporte>(em, Transporte.class);
//		CRUDUtil<Operacao> utilo = new CRUDUtil<Operacao>(em, Operacao.class);
		

		/// recupero uma lista do banco de dados
//		List<TabPessoa> list = utilp.listaTodos();
//		TabPessoa p = new TabPessoa();
//		for (TabPessoa pessoa : list) {
//			System.out.println(pessoa);
//		}
		
		//BUSCAR
//		System.out.println("Insira o ID para buscar: ");
//		Long id = sc.nextLong();
//		 p = em.find(TabPessoa.class, id);
//		if (list.contains(p)) {
//			System.out.println(p);
//		} else {
//			System.out.println("Id Inexistente");
//		}

		//Remove
//		System.out.println("Insira o ID para remover: ");
//		Long id1 = sc.nextLong();
//		p = em.find(Pessoa.class, id1);
//		utilp.remove(p);
//		if (list.contains(p)) {
//			System.out.println(p.getId() + " " + p.getNome());
//		} else {
//			System.out.println("Id não encontrado!");
//		}
//		sc.close();
		
		//Atualizar		
//		System.out.println("Insira o ID para atualizar: ");
//		Long id1 = sc.nextLong();
//		p = utilp.findId(id1);
//		p.setCpf("987654321");
//		p.setNome("Teste UpDate");
//		p.setTelefone("11987183157");
//		utilp.atualiza(p);
//		System.out.println(p);
		
//		utilp.listaTodos();

		

//		o.setTransporte(t);		
//		utilo.adiciona(o);
		sc.close();
	}
}
