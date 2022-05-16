package br.com.portaria.wrest.util;

import br.com.portaria.wrest.client.TabTransporteClient;

public class TesteTabTransporte {

	public static void main(String[] args) {
		TabTransporteClient  client = new TabTransporteClient();
		client.listAll().forEach(a ->{
			System.out.println(a.toString());
		});
	}
	
	//remover
//	public static void main(String[] args) {
//		TabTransporteClient client = new TabTransporteClient();
//	try {
//		System.out.println(client.remover("8"));
//	
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
	
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
//		TabTransporteClient client = new TabTransporteClient();
//		try {
//			//find id
//			TabTransporte t = client.findId("6");			
//			//atualizar
//			t.setModelo("TESTE 3");
//			t.setPlaca("abct-1234");
//			
//			client.salvar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
