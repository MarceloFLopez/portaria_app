package br.com.portaria.wrest.client;

public class TabModelTeste {

	// listAll
	// Empresa
	public static void main(String[] args) {
		TabPessoaClient client = new TabPessoaClient();
		client.listAll().forEach(a ->{
			System.out.println(a.toString());
		});
	}

	// Pessoa
//	public static void main(String[] args) {
//		TabPessoaClient client = new TabPessoaClient();
//		client.listAll().forEach(a ->{
//			System.out.println(a.toString());
//		});
//	}
	
	// Transporte


	//remover
//	public static void main(String[] args) {
//		TabPessoaClient client = new TabPessoaClient();
//	try {
//		System.out.println(client.remover("9"));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}

//	public static void main(String[] args) {
//		TabEmpresaClient client = new TabEmpresaClient();
//		try {
//			System.out.println(client.remover("7"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	// Pessoa
//	public static void main(String[] args) {
//		TabModelClient client = new TabModelClient();
//		try {
//			System.out.println(client.remover("1"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public static void main(String[] args) {
//	TabModelClient client = new TabModelClient();
//	try {
//		System.out.println(client.remover("1"));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}

	//Find and print itens
//	public static void main(String[] args) {
//		TabEmpresaClient client = new TabEmpresaClient();
//		TabEmpresa t = client.findColumnModel("Teste Empresa1");
//		
//		System.out.println(t);
//		try {
//			
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
//	}

//salvar
//	public static void main(String[] args) {
//		TabEmpresaClient client = new TabEmpresaClient();
//		
//		try {
//			TabEmpresa t = new TabEmpresa();
//			t.setName("TEste");
//			t.setCnpj("33024955874");
//				client.salvar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//atualizar
//	public static void main(String[] args) {
//		TabEmpresaClient client = new TabEmpresaClient();
//		try {
//			//find id
//			TabEmpresa t = client.findId("9");			
//			//atualizar
//			t.setName("TESTE 3");
//			t.setCnpj("xxxxxxxxxxxxxxxxxx");
//			
//			client.salvar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
