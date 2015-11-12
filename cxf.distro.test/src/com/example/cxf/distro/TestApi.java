package com.example.cxf.distro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class TestApi {
	
	@Produces({MediaType.APPLICATION_JSON})
	@GET
	@Path("/")
	public Response getEntities() {
		return Response.ok("{\"test\":\"ok\"}").build();
	}

	
}
