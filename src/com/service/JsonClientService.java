package com.service;

import java.awt.List;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.Objetos.Cheff;


public class JsonClientService {
	private Cheff chef=new Cheff("Carlos","123");
	private Cheff chef1=new Cheff("Nacho","3123");
	private Cheff chef2=new Cheff("aros","199923");
//	List<Cheff>b=new ArrayList<Cheff>();
	
	
	public JSONArray getAllcheffs(){
		JSONArray a=new JSONArray();
		a.put(chef);
		a.put(chef1);
		a.put(chef2);
		
		return a;
	
	}
		
	
}
