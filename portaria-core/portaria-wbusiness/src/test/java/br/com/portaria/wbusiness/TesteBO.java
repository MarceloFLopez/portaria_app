package br.com.portaria.wbusiness;

import br.com.portaria.domain.TabPessoa;

public class TesteBO {

	public static void main(String[] args) throws Exception {

		TabPessoaBO bo = new TabPessoaBO();
		TabPessoa p = new TabPessoa();
		p = bo.findColumnName("Marcelo");
		System.out.println(p);
		
	}

}
