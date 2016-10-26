package com.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import com.Objetos.Cheff;


public class JsonClientService {
	private Cheff chef=new Cheff("Carlos","123");
	private Cheff chef1=new Cheff("Nacho","3123");
	private Cheff chef2=new Cheff("aros","199923");
//	List<Cheff>b=new ArrayList<Cheff>();
	
	
	public List<Cheff> getAllcheffs(){
		
		List<Cheff> a=new ArrayList<Cheff>();
		
		a.add(chef);
		a.add(chef1);
		a.add(chef2);
		//JSONObject ob=new JSONObject();
		System.out.println("paso por aqui");
//		for (int i=0;i<a.size();i++){
//			a.get(i);
//			
//			
//		}
		return a;
		
	}
		
	
}
