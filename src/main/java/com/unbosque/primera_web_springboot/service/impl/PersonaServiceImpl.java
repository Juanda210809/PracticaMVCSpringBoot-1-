package com.unbosque.primera_web_springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unbosque.primera_web_springboot.entities.Persona;
import com.unbosque.primera_web_springboot.repository.PersonaRepository;
import com.unbosque.primera_web_springboot.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<Persona> obtenerTodas() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Persona obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id).orElse(null);
	}

	@Override
	public Persona crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public Persona actualizarPersona(Long id, Persona persona) {
		Persona personaBD = personaRepository.findById(id).orElse(null);

		if (personaBD != null) {
			personaBD.setNombre(persona.getNombre());
			personaBD.setEdad(persona.getEdad());
			return personaRepository.save(personaBD);
		}
		return null;
	}

	@Override
	public void eliminarPersona(Long id) {
		personaRepository.deleteById(id);;

	}

	@Override
	public Long contarPersonas() {
		return personaRepository.count();
		
	}

}
