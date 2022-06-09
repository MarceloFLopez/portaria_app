package br.com.portaria.wrest.client;

import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.portaria.domain.TabCadastro;
import br.com.portaria.domain.util.DateDeserializer;
import br.com.portaria.domain.util.DateSerializer;

@Named
public class TabCadastroClient {

	// URL http://localhost:8080/portaria-wrest/rest/tabcadastroapi/listAll
	private final String HOSTNAME = "http://localhost:8080/";
	private final String API = "portaria-wrest/rest/";
	private final String PATH = "tabcadastroapi/";

	public List<TabCadastro> listAll() {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "listAll/");
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		List<TabCadastro> t = gson.fromJson(json, new TypeToken<List<TabCadastro>>() {
		}.getType());
		return t;
	}

	public TabCadastro findId(String id) {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "findId/" + id);
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		TabCadastro t = gson.fromJson(json, new TypeToken<TabCadastro>() {
		}.getType());
		return t;
	}

	public void salvar(TabCadastro objeto) {
		Gson gson = new Gson();
		Client c = Client.create();
		WebResource wr = c.resource(HOSTNAME + API + PATH + "salvar/").path("objeto");
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateSerializer()).create();
		wr.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class,
				gson.toJson(objeto));
	}

	public String remove(String id) throws Exception {
		Client c = Client.create();
		WebResource wr = c.resource(HOSTNAME + API + PATH + "remove/" + id);
		String s = wr.accept(MediaType.APPLICATION_XML).delete(String.class);
		return s;
	}

}
