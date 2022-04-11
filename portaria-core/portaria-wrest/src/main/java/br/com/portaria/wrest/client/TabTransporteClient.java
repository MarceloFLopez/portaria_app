package br.com.portaria.wrest.client;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.portaria.domain.TabTransporte;
import br.com.portaria.domain.util.DateDeserializer;
import br.com.portaria.domain.util.DateSerializer;

public class TabTransporteClient implements Serializable {

	private static final long serialVersionUID = 1L;

	// URL http://localhost:8080/portaria-wrest/rest/tabtransporteapi/findId/5
	private final String HOSTNAME = "http://localhost:8080/"; // teste
	private final String API = "portaria-wrest/rest/";//
	private final String PATH = "tabtransporteapi/";
	
	public List<TabTransporte> listAll() {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "listAll/");
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		List<TabTransporte> t = gson.fromJson(json, new TypeToken<List<TabTransporte>>() {
		}.getType());
		return t;
	}

	public TabTransporte findColumnModel(String value) {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "findColumnName/" + value);
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		TabTransporte t = gson.fromJson(json, new TypeToken<TabTransporte>() {
		}.getType());
		return t;
	}

	public TabTransporte findId(String id) {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "findId/" + id);
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		TabTransporte t = gson.fromJson(json, new TypeToken<TabTransporte>() {
		}.getType());
		return t;
	}

	public void salvar(TabTransporte objeto) {
		Gson gson = new Gson();
		Client c = Client.create();
		WebResource wr = c.resource(HOSTNAME + API + PATH + "salvar/").path("objeto");
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateSerializer()).create();
		wr.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class,
				gson.toJson(objeto));
	}
	
	public void atualizar(TabTransporte objeto) {
		Gson gson = new Gson();
		Client c = Client.create();
		WebResource wr = c.resource(HOSTNAME + API + PATH + "atualizar/").path("objeto");
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateSerializer()).create();
		wr.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class,
				gson.toJson(objeto));
	}

	public String remover(String id) throws Exception {
		Client c = Client.create();
		WebResource wr = c.resource(HOSTNAME + API + PATH + "remover/" + id);
		String s = wr.accept(MediaType.APPLICATION_XML).delete(String.class);
		return s;
	}

}
