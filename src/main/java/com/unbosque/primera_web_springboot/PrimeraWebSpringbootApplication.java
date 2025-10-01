package com.unbosque.primera_web_springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.unbosque.primera_web_springboot.entities.Persona;
import com.unbosque.primera_web_springboot.repository.PersonaRepository;
import com.unbosque.primera_web_springboot.service.PersonaService;

@SpringBootApplication
public class PrimeraWebSpringbootApplication implements CommandLineRunner{

	@Autowired //se encarga de inyectar repository

	private PersonaService personaService;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args
				);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		personaService.crearPersona(new Persona(5L, "jaun david", 19));
//		personaService.crearPersona(new Persona(6L, "jXXXXX", 19));
//		personaService.crearPersona(new Persona(7L, "jTYYYY", 19));
//		personaService.crearPersona(new Persona(8L, "AAAAA", 19));
//		
//		System.out.println("NUMERO DE PERSONAS DE LA TABLA"+ personaService.contarPersonas());
//		List<Persona> personas = personaService.obtenerTodas();
//		System.out.println("LISTA DE PERSONAS");
//		for (Persona persona : personas) {
//			System.out.print(persona.getId());
//			System.out.print(" | "+persona.getNombre());
//			System.out.print(" | "+persona.getEdad()+"\n");
// 		}
	}

}
