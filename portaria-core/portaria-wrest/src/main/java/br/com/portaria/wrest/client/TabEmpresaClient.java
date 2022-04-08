package br.com.portaria.wrest.client;

import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.domain.util.DateDeserializer;

public class TabEmpresaClient {

	// URL http://localhost:8080/portaria-wrest/rest/tabemresaapi/findId/5
	private final String HOSTNAME = "http://localhost:8080/"; 
	private final String API = "portaria-wrest/rest/";
	private final String PATH = "tabemresaapi/";
	
	public List<TabEmpresa> listAll() {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "listAll/");
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		List<TabEmpresa> t = gson.fromJson(json, new TypeToken<List<TabEmpresa>>() {
		}.getType());
		return t;
	}
}
