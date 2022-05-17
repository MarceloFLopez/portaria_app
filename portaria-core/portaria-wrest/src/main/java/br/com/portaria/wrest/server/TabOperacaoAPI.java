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

import br.com.portaria.domain.TabOperacao;
import br.com.portaria.wbusiness.TabOperacaoBO;

@Path("taboperacaoapi")
public class TabOperacaoAPI {

	/**
	 * API example, TabOperacao class
	 */
	@Inject
	private TabOperacaoBO operacaoBO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public List<TabOperacao> listAll() throws Exception {
		return operacaoBO.listAll();
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findColumnName/{value}")
	public TabOperacao findColumnModel(@PathParam("value") String value) throws Exception {
		return operacaoBO.findColumnName(value);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findId/{id}")
	public TabOperacao findId(@PathParam("id") String id) throws Exception {
		return operacaoBO.findId(new Long(id));		
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar/{t}")
	public void salvar(TabOperacao t) throws Exception {
		operacaoBO.salvar(t);
		System.out.println("Registro salvo com sucesso!");
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("atualizar/{t}")
	public void atualizar(TabOperacao t) throws Exception {
		operacaoBO.salvar(t);
		System.out.println("Registro atualizado com sucesso!");
	}

	@GET
	@DELETE
	@Path("remover/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String remover(@PathParam("id") String id) throws Exception {
		operacaoBO.remove(operacaoBO.findId(new Long(id)));
		return "Removido com sucesso!";
	}
	
}
