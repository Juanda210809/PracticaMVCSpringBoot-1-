package com.unbosque.primera_web_springboot.service;

import java.util.List;

import com.unbosque.primera_web_springboot.entities.Persona;

public interface PersonaService {

	List<Persona> obtenerTodas();

	Persona obtenerPorId(Long id);

	Persona crearPersona(Persona persona);

	Persona actualizarPersona(Long id, Persona persona);

	void eliminarPersona(Long id);

	Long contarPersonas();
}
