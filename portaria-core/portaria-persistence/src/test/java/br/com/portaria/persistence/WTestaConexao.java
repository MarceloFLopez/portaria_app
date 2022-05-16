package br.com.portaria.persistence;

import java.util.Date;

import javax.persistence.EntityManager;

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.domain.TabOperacao;
import br.com.portaria.domain.TabPessoa;
import br.com.portaria.domain.TabTransporte;
import br.com.portaria.domain.Usuario;
import br.com.portaria.domain.WRegistro;
import br.com.portaria.persistence.util.CRUDUtil;
import br.com.portaria.persistence.util.JPAUtil;

public class WTestaConexao {

	public static void main(String[] args) throws Exception {
		EntityManager em = JPAUtil.getEntityManager();

		CRUDUtil<TabEmpresa> utile = new CRUDUtil<TabEmpresa>(em, TabEmpresa.class);
		CRUDUtil<TabPessoa> utilp = new CRUDUtil<TabPessoa>(em, TabPessoa.class);
		CRUDUtil<TabTransporte> utilt = new CRUDUtil<TabTransporte>(em, TabTransporte.class);
		CRUDUtil<TabOperacao> utilo = new CRUDUtil<TabOperacao>(em, TabOperacao.class);
		CRUDUtil<Usuario>util = new CRUDUtil<Usuario>(em, Usuario.class);
		CRUDUtil<WRegistro>utilr = new CRUDUtil<WRegistro>(em, WRegistro.class);

		/// recupero uma lista do banco de dados
//		List<WRegistro> list = utilr.listaTodos();
//		list.forEach(System.out::println);
		

		
//		list.forEach(System.out::println);

//		TabEmpresa e = new TabEmpresa();
//		e = utile.buscaPorId((long) 2);
//		System.out.println(e);

		// Adicionar/Salvar
	
		TabEmpresa te = new TabEmpresa();
		te = utile.buscaPorId(1l);		
//		utile.adiciona(te);
		
		TabOperacao to = new TabOperacao();
		to = utilo.buscaPorId(2l);
//		utilo.adiciona(to);
		
		TabTransporte tt = new TabTransporte();
		tt = utilt.buscaPorId(2l);
//		utilt.adiciona(tt);
		
		TabPessoa tp = new TabPessoa();
//		utilp.adiciona(tp);
		tp = utilp.buscaPorId(1l);
		
		Usuario u = new Usuario();
		u.setAtivo(true);
		u.setNome("User 3");
		u.setSenha("dddd");
		util.adiciona(u);
		
		WRegistro r = new WRegistro(null, new Date(), u, tp);
		utilr.adiciona(r);
		
		System.out.println(r);

		// BUSCAR
//		System.out.println("Insira o ID para buscar: ");
//		Scanner sc = new Scanner(System.in);
//		Long id = sc.nextLong();
//		TabEmpresa p1 = new TabEmpresa();
//		p1 = utile.buscaPorId(id);
//		System.out.println(p1);
//	
//		Long id2 = sc.nextLong();
//		TabPessoa p2 = new TabPessoa();
//		p2 = utilp.buscaPorId(id2);
//		System.out.println(p2);
//		
//		Long id3 = sc.nextLong();
//		TabTransporte p3 = new TabTransporte();
//		p3 = utilt.buscaPorId(id3);
//		System.out.println(p3);
//		
//		Long id4 = sc.nextLong();
//		TabOperacao p4 = new TabOperacao();
//		p4 = utilo.buscaPorId(id4);
//		System.out.println(p4);
		
		// Remove
		
//		list.forEach(System.out::println);
		
//		System.out.println("Insira o ID para remover: ");
//		Long id1 = sc.nextLong();
//		TabPessoa e = new TabPessoa();
//		e = utilp.buscaPorId(id1);//		
//		utilp.remove(e);

		// Atualizar
//		System.out.println("Insira o ID para atualizar: ");
//		Long id1 = sc.nextLong();
//		TabPessoa p = new TabPessoa();		
//		p = utilp.buscaPorId(id1);
//		p.setCpf("330.249.558-70");
//		p.setName("Marcelo");
//		utilp.atualiza(p);
//		System.out.println(p);
		
	}

}
