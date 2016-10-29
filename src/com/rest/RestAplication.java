package com.rest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.Objetos.Cheff;
import com.Objetos.Cliente;
import com.service.JsonClientService;
import manejoXml.*;
@Path("/hello")
public class RestAplication {
	JsonClientService clientService=new JsonClientService();
	ManagerXml manager=new ManagerXml();
	@GET
	@Path("/getC/")
	@Produces (MediaType.APPLICATION_JSON)
//	public Map<String, String> getMap() {
//	      Map<String, String> map = new HashMap<String, String>();
//	      map.put("some key", "some value");
//	      return map;
//	  }
	public List<Cheff> getCheffs(){
		System.out.println("Paso por rest ");
		//return clientService.getAllcheffs();
		return clientService.getAllcheffs();
	}
	@Path("xml")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String guardarxml(){
		
		try {
			manager.guardar("esto", "aquello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return "si sirve"+manager.muestraContenido("esto.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return null;
	}
	
	//private Cheff cheff=new Cheff();
}
