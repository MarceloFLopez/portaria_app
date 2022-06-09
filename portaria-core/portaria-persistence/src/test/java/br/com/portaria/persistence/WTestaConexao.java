package br.com.portaria.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.portaria.domain.TabCadastro;
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

		CRUDUtil<TabEmpresa> er = new CRUDUtil<TabEmpresa>(em, TabEmpresa.class);
		CRUDUtil<TabPessoa> pr = new CRUDUtil<TabPessoa>(em, TabPessoa.class);
		CRUDUtil<TabTransporte> tr = new CRUDUtil<TabTransporte>(em, TabTransporte.class);
		CRUDUtil<TabOperacao> or = new CRUDUtil<TabOperacao>(em, TabOperacao.class);
    	CRUDUtil<Usuario> ur = new CRUDUtil<Usuario>(em, Usuario.class);
		CRUDUtil<WRegistro> rr = new CRUDUtil<WRegistro>(em, WRegistro.class);
		CRUDUtil<TabCadastro> cr = new CRUDUtil<TabCadastro>(em, TabCadastro.class);
		
		
		List<WRegistro>list = rr.listaTodos();
		list.forEach(System.out::println);
		
//		TabEmpresa emp= new TabEmpresa("12345678911", "EmpresaTest1");
//		TabEmpresa emp1 = new TabEmpresa("12345678912", "EmpresaTest2");
//		TabEmpresa emp2 = new TabEmpresa("12345678913", "EmpresaTest3");
//		er.adiciona(emp);
//		er.adiciona(emp1);
//		er.adiciona(emp2);
//		
//		TabOperacao op = new TabOperacao(null,"Colegta", new Date());
//		TabOperacao op1 = new TabOperacao("Entrega", new Date());
//		TabOperacao op2 = new TabOperacao("Devolução", new Date());
//		or.adiciona(op);
//		or.adiciona(op1);
//		or.adiciona(op2);
//		
//		TabTransporte tt = new TabTransporte(null, "Modelo Teste1", "aaaa1-1111");
//		TabTransporte tt1 = new TabTransporte(null, "Modelo Teste2", "bbb2-2222");
//		TabTransporte tt2 = new TabTransporte(null, "Modelo Teste3", "ccc3-3333");
//		TabTransporte tt3 = new TabTransporte(null, "Modelo Teste4", "ddd4-1111");
//		TabTransporte tt4 = new TabTransporte(null, "Modelo Teste5", "eee5-2222");
//		TabTransporte tt5 = new TabTransporte(null, "Modelo Teste6", "fff6-3333");
//		TabTransporte tt6= new TabTransporte(null, "Modelo Teste7", "ggg7-1111");
//		TabTransporte tt7 = new TabTransporte(null, "Modelo Teste8", "hhh8-2222");
//		TabTransporte tt8 = new TabTransporte(null, "Modelo Teste9", "iii9-3333");
//		TabTransporte tt9= new TabTransporte(null, "Modelo Teste10", "jj10-1111");
//		TabTransporte tt10 = new TabTransporte(null, "Modelo Teste11", "kk11-2222");
//		TabTransporte tt11 = new TabTransporte(null, "Modelo Teste12", "ll12-3333");
//		TabTransporte tt12 = new TabTransporte(null, "Modelo Teste13", "mm13-1111");
//		TabTransporte tt13 = new TabTransporte(null, "Modelo Teste14", "nn14-2222");	
//		TabTransporte tt14 = new TabTransporte(null, "Modelo Teste15", "oo15-2222");
//		tr.adiciona(tt);
//		tr.adiciona(tt1);
//		tr.adiciona(tt2);
//		tr.adiciona(tt3);
//		tr.adiciona(tt4);
//		tr.adiciona(tt5);
//		tr.adiciona(tt6);
//		tr.adiciona(tt7);
//		tr.adiciona(tt8);
//		tr.adiciona(tt9);
//		tr.adiciona(tt10);
//		tr.adiciona(tt11);
//		tr.adiciona(tt12);
//		tr.adiciona(tt13);
//		tr.adiciona(tt14);
//
//		TabPessoa tp   = new TabPessoa(null, "A", "33024955870");
//		TabPessoa tp1  = new TabPessoa(null, "B", "33024955871");
//		TabPessoa tp2  = new TabPessoa(null, "C", "33024955872");
//		TabPessoa tp3  = new TabPessoa(null, "D", "33024955873");
//		TabPessoa tp4  = new TabPessoa(null, "E", "33024955874");
//		TabPessoa tp5  = new TabPessoa(null, "F", "33024955875");
//		TabPessoa tp6  = new TabPessoa(null, "g", "33024955876");
//		TabPessoa tp7  = new TabPessoa(null, "H", "33024955877");
//		TabPessoa tp8  = new TabPessoa(null, "I", "33024955878");
//		TabPessoa tp9  = new TabPessoa(null, "J", "33024955879");
//		TabPessoa tp10 = new TabPessoa(null, "K", "33024955880");
//		TabPessoa tp11 = new TabPessoa(null, "L", "33024955881");
//		TabPessoa tp12 = new TabPessoa(null, "M", "33024955882");
//		TabPessoa tp13 = new TabPessoa(null, "N", "33024955883");
//		TabPessoa tp14 = new TabPessoa(null, "P", "33024955884");	
//		pr.adiciona(tp);
//		pr.adiciona(tp1);
//		pr.adiciona(tp2);
//		pr.adiciona(tp3);
//		pr.adiciona(tp4);
//		pr.adiciona(tp5);
//		pr.adiciona(tp6);
//		pr.adiciona(tp7);
//		pr.adiciona(tp8);
//		pr.adiciona(tp9);
//		pr.adiciona(tp10);
//		pr.adiciona(tp11);
//		pr.adiciona(tp12);
//		pr.adiciona(tp13);
//		pr.adiciona(tp14);
//		
//		TabCadastro cad = new TabCadastro(null, emp, op1, tt1, tp1);
//		TabCadastro cad1 = new TabCadastro(null, emp1, op2, tt2, tp);
//		TabCadastro cad2 = new TabCadastro(null, emp2, op, tt3, tp3);
//		TabCadastro cad3 = new TabCadastro(null, emp, op1, tt4, tp4);
//		TabCadastro cad4 = new TabCadastro(null, emp1, op1, tt5, tp5);
//		TabCadastro cad5= new TabCadastro(null, emp2, op2, tt6, tp6);
//		TabCadastro cad6 = new TabCadastro(null, emp, op1, tt7, tp7);
//		TabCadastro cad7 = new TabCadastro(null, emp1, op2, tt8, tp8);
//		TabCadastro cad8 = new TabCadastro(null, emp2, op1, tt9, tp9);
//		TabCadastro cad9 = new TabCadastro(null, emp, op1, tt10, tp10);
//		TabCadastro cad10 = new TabCadastro(null, emp1, op1, tt11, tp11);
//		TabCadastro cad11 = new TabCadastro(null, emp2, op1, tt12, tp12);
//		TabCadastro cad12 = new TabCadastro(null, emp, op2, tt13, tp13);
//		TabCadastro cad13 = new TabCadastro(null, emp1, op2, tt14, tp14);
//		cr.adiciona(cad);
//		cr.adiciona(cad1);
//		cr.adiciona(cad2);
//		cr.adiciona(cad3);
//		cr.adiciona(cad4);
//		cr.adiciona(cad5);
//		cr.adiciona(cad6);
//		cr.adiciona(cad7);
//		cr.adiciona(cad8);
//		cr.adiciona(cad9);
//		cr.adiciona(cad10);
//		cr.adiciona(cad11);
//		cr.adiciona(cad12);
//		cr.adiciona(cad13);
//
//		Usuario us = new Usuario(null, "Admin", "1234", true);
//		Usuario us1 = new Usuario(null,"Porteiro 1", "1478", true);
//		Usuario us2 = new Usuario(null,"Porteiro 2", "7896", true);
//		Usuario us3 = new Usuario(null,"Porteiro 3", "7415", true);
//		Usuario us4 = new Usuario(null,"Porteiro 4", "7415", true);
//		ur.adiciona(us);
//		ur.adiciona(us1);
//		ur.adiciona(us2);
//		ur.adiciona(us3);
//		ur.adiciona(us4);
//		
//		WRegistro re = new WRegistro(null, new Date(), us, cad);
//		WRegistro re1 = new WRegistro(null, new Date(), us1,cad1);
//		WRegistro re2 = new WRegistro(null, new Date(), us2,cad2);
//		WRegistro re3 = new WRegistro(null, new Date(), us3,cad3);
//		WRegistro re4 = new WRegistro(null, new Date(), us1,cad4);
//		WRegistro re5 = new WRegistro(null, new Date(), us2,cad5);
//		WRegistro re6 = new WRegistro(null, new Date(), us,cad6);
//		WRegistro re7 = new WRegistro(null, new Date(), us1,cad7);
//		WRegistro re8 = new WRegistro(null, new Date(), us2,cad8);
//		WRegistro re9 = new WRegistro(null, new Date(), us3,cad9);
//		WRegistro re10 = new WRegistro(null, new Date(), us1,cad10);
//		WRegistro re11 = new WRegistro(null, new Date(), us2,cad11);
//		WRegistro re12 = new WRegistro(null, new Date(), us1,cad12);
//		WRegistro re13 = new WRegistro(null, new Date(), us1,cad13);
//		rr.adiciona(re);
//		rr.adiciona(re1);
//		rr.adiciona(re2);
//		rr.adiciona(re3);
//		rr.adiciona(re4);
//		rr.adiciona(re5);
//		rr.adiciona(re6);
//		rr.adiciona(re7);
//		rr.adiciona(re8);
//		rr.adiciona(re9);
//		rr.adiciona(re10);
//		rr.adiciona(re11);
//		rr.adiciona(re12);
//		rr.adiciona(re13);
//		
		
	}

}
