package com.projetojava.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SiteControle {
	
	
	
	
	//--------------
	//menu
	
	@GetMapping("/menu")
	public String Menu(Model model) {
		
		return "menu";
	}
	@GetMapping("/stylemenu")
	public String StyleMem() {
		return "menu";
	}
	//consulta
	@GetMapping("/consulta")
	public String ConsultIndex(Model model) {
		
		return "consulta";
	}
	@GetMapping("/styleconsulta")
	public String StyleConsulta() {
		return "consulta";
	}
	//cadastro

}