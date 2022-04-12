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

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.wbusiness.TabEmpresaBO;

@Path("tabempresaapi")
public class TabEmpresaAPI  {

	@Inject
	private TabEmpresaBO tabEmpresaBO;

	/**
	 * API example, TabModel class
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public List<TabEmpresa> listAll() throws Exception {
		return tabEmpresaBO.listAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findColumnName/{value}")
	public TabEmpresa findColumnName(@PathParam("value") String value ) throws Exception {
		return tabEmpresaBO.findColumnName(value);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findId/{id}")
	public TabEmpresa findId(@PathParam("id") String id) throws Exception {
		return tabEmpresaBO.findId(new Long(id));
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar/{t}")
	public void salvar(TabEmpresa t) throws Exception {
		tabEmpresaBO.salvar(t);
	}

	@DELETE
	@Path("remover/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String remover(@PathParam("id") String id) throws Exception {
		tabEmpresaBO.remover(tabEmpresaBO.findId(new Long(id)));
		return "Removido com sucesso!";
	}

}
