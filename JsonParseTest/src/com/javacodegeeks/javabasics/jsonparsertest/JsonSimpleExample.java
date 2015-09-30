package com.javacodegeeks.javabasics.jsonparsertest;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class JsonSimpleExample {
     public static void main(String[] args) {
 
	JSONObject obj = new JSONObject();
	obj.put("name", "Eric");
	obj.put("age", new Integer(25));
	
	JSONObject job = new JSONObject();
	job.put("Title: ","Poopsmith");
    job.put("Wage: $", new Integer(18));
 
	JSONArray list = new JSONArray();
	list.add("msg 1");
	list.add("msg 2");
	list.add("msg 3");
	
	obj.put("messages", list);
	

	
	
 
	try {
 
		FileWriter file = new FileWriter("c:\\test.json");
		file.write(obj.toJSONString());
		file.write(job.toJSONString());
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.print(obj);
	System.out.print(job);
 
     }
 
}