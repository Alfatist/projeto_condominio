package com.projetojava.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojava.app.entidades.Morador;
import com.projetojava.app.repositories.MoradorRepository;

@Service	
public class MoradorService {
	
	@Autowired
	private MoradorRepository mr;
	
	public List<Morador> findAll(){
		return mr.findAll();
	}
	
	public Morador findById(Long id){
			Optional<Morador> obj = mr.findById(id);
			return obj.get();
	}
	
	public Morador insert(Morador obj) {
		return mr.save(obj);
	}
}
