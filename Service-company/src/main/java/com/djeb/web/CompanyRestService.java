package com.djeb.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Value;

@RestController
public class CompanyRestService {
	//Injecter la valeur de la variable d'environnement
	@Value("${xParam}")
	private int xParam;
	@Value("${yParam}")
	private int yParam;
	@Value("${me}")
	private String me;
	
	@GetMapping("/myConfig")
	public Map<String, Object> myConfig(){
		Map<String, Object> params=new HashMap<>();
		params.put("xParam",xParam);
		params.put("yParam",yParam);
		params.put("me",me);
		params.put("threadName", Thread.currentThread().getName());
		
	}
}
