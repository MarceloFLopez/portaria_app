package br.com.portaria.wrest.client;

public class TabModelTeste {
//listAll
	//Empresa
	public static void main(String[] args) {
		TabPessoaClient client = new TabPessoaClient();
		client.listAll().forEach(a ->{
			System.out.println(a.toString());
		});
	}
//	
	//Pessoa
//	public static void main(String[] args) {
//		TabPessoaClient client = new TabPessoaClient();
//		client.listAll().forEach(a ->{
//			System.out.println(a.toString());
//		});
//	}
	
	

//remover
//	public static void main(String[] args) {
//	TabModelClient client = new TabModelClient();
//	try {
//		System.out.println(client.remover("1"));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
	
	//Pessoa
//	public static void main(String[] args) {
//		TabModelClient client = new TabModelClient();
//		try {
//			System.out.println(client.remover("1"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//salvar
//	public static void main(String[] args) {
//		TabPessoaClient client = new TabPessoaClient();
//		try {
//			TabPessoa t = new TabPessoa();
//			t.setName("Marcelo");
//			client.salvar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//atualizar
//	public static void main(String[] args) {
//		TabModelClient client = new TabModelClient();
//		try {
//			//find id
//			TabModel t = client.findId("3");
//			
//			//atualizar
//			t.setColumnmodel("TESTE 3");
//			client.salvar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}



}
