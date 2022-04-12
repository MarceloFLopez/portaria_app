package br.com.portaria.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.portaria.domain.Usuario;
import br.com.portaria.persistence.util.CRUDUtil;
import br.com.portaria.persistence.util.JPAUtil;

public class WTestaConexao {

	public static void main(String[] args) throws Exception {
		EntityManager em = JPAUtil.getEntityManager();

//		CRUDUtil<TabEmpresa> utile = new CRUDUtil<TabEmpresa>(em, TabEmpresa.class);
//		CRUDUtil<TabPessoa> utilp = new CRUDUtil<TabPessoa>(em, TabPessoa.class);
//		CRUDUtil<TabTransporte> utilt = new CRUDUtil<TabTransporte>(em, TabTransporte.class);
//		CRUDUtil<TabOperacao> utilo = new CRUDUtil<TabOperacao>(em, TabOperacao.class);
		CRUDUtil<Usuario>util = new CRUDUtil<Usuario>(em, Usuario.class);

		/// recupero uma lista do banco de dados
//		List<Usuario> list = util.listaTodos();
//		list.forEach(System.out::println);
		
		Usuario u = new Usuario();
		u.setAtivo(true);
		u.setNome("MarceloLopez");
		u.setSenha("1234");
		util.adiciona(u);
		
//		list.forEach(System.out::println);

//		TabEmpresa e = new TabEmpresa();
//		e = utile.buscaPorId((long) 3);
//		System.out.println(e);

		// Adicionar/Salvar
//		TabEmpresa e = new TabEmpresa();		
//		e.setCnpj("45.950.626/0001-01");
//		e.setName("Teste Empresa3");		
//		utile.adiciona(e);		
//		
//		TabTransporte t = new TabTransporte();
//		t.setModelo("Caminhão");
//		t.setPlaca("xxxx-1235");
//		utilt.adiciona(t);
//		
//		TabOperacao o = new TabOperacao();
//		o.setName("Coleta");
//		o.setData(new Date());
//		utilo.adiciona(o);
//
//		TabPessoa p = new TabPessoa();
//		p.setCpf("969.454.890-01");
//		p.setName("Teste nome");
//		p.setTabEmpresa(e);
//		p.setTabOperacao(o);
//		p.setTransporte(t);
//		utilp.adiciona(p);

		// BUSCAR
//		System.out.println("Insira o ID para buscar: ");
//		Long id = sc.nextLong();
//		TabEmpresa p = new TabEmpresa();
//		p = utile.buscaPorId(id);
//		System.out.println(p);
		
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
