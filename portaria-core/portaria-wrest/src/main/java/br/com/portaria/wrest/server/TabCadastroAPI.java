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

import br.com.portaria.domain.TabCadastro;
import br.com.portaria.wbusiness.TabCadastroBO;


@Path("tabcadastroapi")
public class TabCadastroAPI  {

	@Inject
	private TabCadastroBO tabCadastroBO;

	/**
	 * API example, TabModel class
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public List<TabCadastro> listAll() throws Exception {
		return tabCadastroBO.listAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findId/{id}")
	public TabCadastro findId(@PathParam("id") String id) throws Exception {
		return tabCadastroBO.findId(new Long(id));
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar/{t}")
	public void salvar(TabCadastro t) throws Exception {
		tabCadastroBO.salvar(t);
	}

	@GET
	@DELETE
	@Path("remove/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String remove(@PathParam("id") String id) throws Exception {
		tabCadastroBO.remove(tabCadastroBO.findId(new Long(id)));
		return "Removido com sucesso!";
	}

}
