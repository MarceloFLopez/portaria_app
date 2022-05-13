package br.com.portaria.wrest.client;

public class TabEmpresaTest {
	// Listar
	public static void main(String[] args) {
		TabEmpresaClient client = new TabEmpresaClient();
		client.listAll().forEach(a ->{
			System.out.println(a.toString());
		});
	}
}
