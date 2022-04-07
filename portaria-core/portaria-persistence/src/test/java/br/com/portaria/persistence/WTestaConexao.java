package br.com.portaria.persistence;

import java.util.List;
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

		// Adicionar/Salvar
		TabPessoa p = new TabPessoa();
//		p.setCpf("33024955879");
//		p.setName("Marcelo");
//		p.setTabEmpresa(new TabEmpresa());
//		utilp.adiciona(p);

		/// recupero uma lista do banco de dados
		List<TabPessoa> list = utilp.listaTodos();
		list.forEach(System.out::println);

		// BUSCAR
//		System.out.println("Insira o ID para buscar: ");
//		Long id = sc.nextLong();
//		 p = utilp.buscaPorId(id);
//		if (list.contains(p)) {
//			System.out.println(p);
//		} else {
//			System.out.println("Id Inexistente");
//		}

		// Remove
//		System.out.println("Insira o ID para remover: ");
//		Long id1 = sc.nextLong();
//		p = utilp.buscaPorId(id1);
//		if(list.contains(p)) {
//		utilp.remove(p);
//		System.out.println("Removido com sucesso!");
//		}else {
//			System.out.println("Registro não existe ou já foi removido!");
//		}

		// Atualizar
//		System.out.println("Insira o ID para atualizar: ");
//		Long id1 = sc.nextLong();
//		p = utilp.buscaPorId(id1);
//		System.out.println(p);
//		TabPessoa p2 = new TabPessoa();
//		p2.setName("Marcelo Ferreira Lopez");
//		p2.setCpf("00000000000");
//		p2.setTabEmpresa(new TabEmpresa("xxxxxxxxxxx","Empresa Teste"));
//		
//		if (list.contains(p)) {	
//			p.setName(p2.getName());
//			p.setCpf(p2.getCpf());
//			p.setTabEmpresa(p2.getTabEmpresa());
//			utilp.atualiza(p);
//			System.out.println("Atualizado com sucesso");
//		} else {
//			utilp.adiciona(p2);
//			System.out.println("Adicionado com sucesso");
//		}

//		utilp.listaTodos();

//		o.setTransporte(t);		
//		utilo.adiciona(o);
		sc.close();
	}
}
