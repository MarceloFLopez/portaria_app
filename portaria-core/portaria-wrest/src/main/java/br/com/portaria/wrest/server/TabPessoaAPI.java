package br.com.portaria.wrest.server;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.portaria.domain.TabPessoa;
import br.com.portaria.wbusiness.TabPessoaBO;

@Path("tabpessoaapi")
public class TabPessoaAPI  {

	@Inject
	private TabPessoaBO tabPessoaBO;

	/**
	 * API example, TabModel class
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public List<TabPessoa> listAll() throws Exception {
		return tabPessoaBO.listAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findColumnName/{value}")
	public TabPessoa findColumnModel(@PathParam("value") String value) throws Exception {
		return tabPessoaBO.findColumnName(value);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findId/{id}")
	public TabPessoa findId(@PathParam("id") String id) throws Exception {
		return tabPessoaBO.findId(new Long(id));		
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar/{t}")
	public void salvar(TabPessoa t) throws Exception {
		tabPessoaBO.salvar(t);
		System.out.println("Registro salvo com sucesso!");
	}

	@DELETE
	@Path("remover/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String remover(@PathParam("id") String id) throws Exception {
		tabPessoaBO.remover(tabPessoaBO.findId(new Long(id)));
		return "Removido com sucesso!";
	}

}
