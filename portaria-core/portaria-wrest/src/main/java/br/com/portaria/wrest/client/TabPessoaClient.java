package br.com.portaria.wrest.client;

import java.io.Serializable;
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

import br.com.portaria.domain.TabPessoa;
import br.com.portaria.domain.util.DateDeserializer;
import br.com.portaria.domain.util.DateSerializer;

@Named
public class TabPessoaClient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// URL http://localhost:8080/portaria-wrest/rest/tabpessoaapi/findColumnName/
	private final String HOSTNAME = "http://localhost:8080/"; // teste
	private final String API = "portaria-wrest/rest/";//
	private final String PATH = "tabpessoaapi/";

	public List<TabPessoa> listAll() {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "listAll/");
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		List<TabPessoa> t = gson.fromJson(json, new TypeToken<List<TabPessoa>>() {
		}.getType());
		return t;
	}

	public TabPessoa findColumnModel(String value) {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "findColumnName/" + value);
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		TabPessoa t = gson.fromJson(json, new TypeToken<TabPessoa>() {
		}.getType());
		return t;
	}
	
	public TabPessoa findColumnCpf(String value) {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "findColumnCpf/" + value);
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		TabPessoa t = gson.fromJson(json, new TypeToken<TabPessoa>() {
		}.getType());
		return t;
	}

	public TabPessoa findId(String id) {
		Gson gson = new Gson();
		Client c = Client.create();
		// GET example
		WebResource wr = c.resource(HOSTNAME + API + PATH + "findId/" + id);
		String json = wr.get(String.class);
		gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
		TabPessoa t = gson.fromJson(json, new TypeToken<TabPessoa>() {
		}.getType());
		return t;
	}

	public void salvar(TabPessoa objeto) {
		Gson gson = new Gson();
		Client c = Client.create();
		WebResource wr = c.resource(HOSTNAME + API + PATH + "salvar/").path("objeto");
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
