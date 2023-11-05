package com.projetojava.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projetojava.app.entidades.Morador;
import com.projetojava.app.repositories.MoradorRepository;

@Controller
public class MoradorControle {
	@Autowired
	private MoradorRepository mr;
	
	@RequestMapping(method=RequestMethod.GET, value="/cadastro")
	public String inicio() {
		return "/cadastro";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cadmorador")
	public String salvar(Morador morador) {
		mr.save(morador);
		return "/cadastro";
	}
	
}
