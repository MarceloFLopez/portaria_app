package br.com.portaria.persistence;

import java.util.Scanner;

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
//		TabEmpresa e = new TabEmpresa();		
//		e = utile.buscaPorId((long)1);		
//		utile.adiciona(e);		
//		
//		TabTransporte t = new TabTransporte();
//		t = utilt.buscaPorId((long)1);
//		utilt.adiciona(t);
//		
//		TabOperacao o = new TabOperacao();
//		o = utilo.buscaPorId((long)2);
//		utilo.atualiza(o);
//
//		TabPessoa p = new TabPessoa();
//		p.setCpf("96945489001");
//		p.setName("Teste nome");
//		p.setEmpresa(e);
//		p.setOperacao(o);
//		p.setTransporte(t);
//
//		utilp.adiciona(p);
//		
//		Usuario u = new Usuario();
//		u.setAtivo(false);
//		u.setNome("teste2");
//		u.setSenha("1234");
//		util.adiciona(u);
//		
//		WRegistro wr = new WRegistro();
//		wr.setDate(new Date());
//		wr.setPessoa(p);
//		wr.setUsuario(u);
//		utilr.adiciona(wr);
		

		// BUSCAR
		System.out.println("Insira o ID para buscar: ");
		Scanner sc = new Scanner(System.in);
		Long id = sc.nextLong();
		TabEmpresa p1 = new TabEmpresa();
		p1 = utile.buscaPorId(id);
		System.out.println(p1);
		
		
		Long id1 = sc.nextLong();
		TabPessoa p = new TabPessoa();
		p = utilp.buscaPorId(id1);
		System.out.println(p);
		
		Long id2 = sc.nextLong();
		TabPessoa p2 = new TabPessoa();
		p = utilp.buscaPorId(id2);
		System.out.println(p);
		
		Long id3 = sc.nextLong();
		TabTransporte p3 = new TabTransporte();
		p3 = utilt.buscaPorId(id3);
		System.out.println(p3);
		
		Long id4 = sc.nextLong();
		TabOperacao p4 = new TabOperacao();
		p4 = utilo.buscaPorId(id4);
		System.out.println(p4);
		
		
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
