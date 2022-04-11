package br.com.portaria.wrest.client;

import br.com.portaria.domain.TabTransporte;

public class TabTesteTransporte {

	// Listar
	public static void main(String[] args) {
		TabTransporteClient client = new TabTransporteClient();
		client.listAll().forEach(a ->{
			System.out.println(a.toString());
		});
	}

	// remover
//	public static void main(String[] args) {
//		TabTransporteClient client = new TabTransporteClient();
//	try {
//		System.out.println(client.remover("8"));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}

//salvar
//	public static void main(String[] args) {
//		TabTransporteClient client = new TabTransporteClient();
//		
//		try {
//			TabTransporte t = new TabTransporte();
//			t.setModelo("TEste");
//			t.setPlaca("yyyy-0000");
//				client.salvar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//atualizar
//	public static void main(String[] args) {
//		TabTransporteClient client = new TabTransporteClient();
//		try {
//			// find id
//			TabTransporte t = client.findId("1");
//			// atualizar
//			t.setModelo("MODELO TESTE");
//			t.setPlaca("TESTE-0000");
//			client.atualizar(t);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
