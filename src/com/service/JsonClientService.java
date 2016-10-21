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
	
	
	public JSONObject getAllcheffs(){
		//JSONArray a=new JSONArray();
		JSONObject a=new JSONObject();
		try {
			a.put("Chef", chef);
//			a.put("Chef",chef1);
//			a.put("Chef",chef2);
//			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("paso por aqui");
//		JSONObject aa =new JSONObject();
//		for (int i =0;i<a.length();i++){
//			
//			try {
//				aa.append("Chefs",a.get(i));
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		return a;
		
	}
		
	
}
