package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.Objetos.Cheff;
import com.Objetos.Cliente;
import com.service.JsonClientService;
@Path("/hello")
public class RestAplication {
	JsonClientService clientService=new JsonClientService();
	
	@GET
	//@Path("/getC/")
	@Produces (MediaType.APPLICATION_JSON)
	public JSONArray getCheffs(){
		System.out.println("Paso por rest ");
		return clientService.getAllcheffs();
	}
	
	//private Cheff cheff=new Cheff();
}
