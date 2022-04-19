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

import br.com.portaria.domain.TabTransporte;
import br.com.portaria.wbusiness.TabTransporteBO;

@Path("tabtransporteapi")
public class TabTransporteAPI {

	/**
	 * API example, TabTransporte class
	 */
	@Inject
	private TabTransporteBO transporteBO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public List<TabTransporte> listAll() throws Exception {
		return transporteBO.listAll();
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findColumnName/{value}")
	public TabTransporte findColumnModel(@PathParam("value") String value) throws Exception {
		return transporteBO.findColumnName(value);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findId/{id}")
	public TabTransporte findId(@PathParam("id") String id) throws Exception {
		return transporteBO.findId(new Long(id));		
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar/{t}")
	public void salvar(TabTransporte t) throws Exception {
		transporteBO.salvar(t);
		System.out.println("Registro salvo com sucesso!");
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("atualizar/{t}")
	public void atualizar(TabTransporte t) throws Exception {
		transporteBO.salvar(t);
		System.out.println("Registro atualizado com sucesso!");
	}

	@GET
	@DELETE
	@Path("remover/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String remover(@PathParam("id") String id) throws Exception {
		transporteBO.remover(transporteBO.findId(new Long(id)));
		return "Removido com sucesso!";
	}
	
}
