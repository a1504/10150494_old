package com.holapp.services.user;

import java.util.Date;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.holapp.gcs.PostGCS;
import com.holapp.services.vo.ServicesResp;
import com.holapp.utils.ValidadorDeCadenas;

@Path("test")
public class Test {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ServicesResp get() {
		ServicesResp servicesResp = new ServicesResp();
		servicesResp.setMsg((new Date()).toString());
		return servicesResp;
	}
	
}
