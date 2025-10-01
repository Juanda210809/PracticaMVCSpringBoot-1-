package com.unbosque.primera_web_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unbosque.primera_web_springboot.entities.Persona;
import com.unbosque.primera_web_springboot.service.PersonaService;

@org.springframework.stereotype.Controller
@RequestMapping("/personas")
public class Controller {

	@Autowired
	private PersonaService personaservice;

	// la clase model se usa para transferir objetos de controller a la vista
	@GetMapping()
	public String listarPersonas(Model model) {
		List<Persona> personas = personaservice.obtenerTodas();
		System.out.println("Personas obtenidas: " + personas.size());
		model.addAttribute("listaPersonas", personas);
		return "listar";
	}

	@GetMapping("/nueva")
	public String mostrarFormularioNuevaPersona(Model model) {
		model.addAttribute("persona", new Persona());
		model.addAttribute("accion", "/personas/nueva");
		return "formulario";
	}

	@PostMapping("/nueva")
	public String guardarNuevaPersona(@ModelAttribute Persona persona) {
		personaservice.crearPersona(persona);
		return "redirect:/personas";

	}

	@GetMapping("/editar/{id}")
	public String mostrarFormularioEditarPersona(@PathVariable Long id, @ModelAttribute Persona persona, Model model) {
		model.addAttribute("persona", persona);
		model.addAttribute("accion","/personas/editar/"+id);
		return "formulario";
	}
	
	@PostMapping("/editar/{id}")
	public String actualizarPersona(@ModelAttribute Persona persona,@PathVariable Long id) {
		personaservice.actualizarPersona(id, persona);
		return "redirect:/personas";
		
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarPersona(@PathVariable Long id) {
		personaservice.eliminarPersona(id);
		return "redirect:/personas";
	}
	

}
