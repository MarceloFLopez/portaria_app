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

import br.com.portaria.domain.Usuario;
import br.com.portaria.domain.WRegistro;
import br.com.portaria.wbusiness.UsuarioBO;
import br.com.portaria.wbusiness.WRegistroBO;

@Path("usuarioapi")
public class WRegistroAPI {
	
	@Inject
	private WRegistroBO wRegistroBO;

	/**
	 * API example, Usuario class
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public List<WRegistro> listAll() throws Exception {
		return wRegistroBO.listAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findId/{id}")
	public WRegistro findId(@PathParam("id") String id) throws Exception {
		return wRegistroBO.findId(new Long(id) );
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar/{t}")
	public void salvar(WRegistro t) throws Exception {
		wRegistroBO.salvar(t);
	}

	@GET
	@DELETE
	@Path("remove/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String remove(@PathParam("id") Long id) throws Exception {
		wRegistroBO.remove(wRegistroBO.findId(new Long(id)));
		return "Removido com sucesso!";
	}
	
}

