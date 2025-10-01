package com.unbosque.primera_web_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unbosque.primera_web_springboot.entities.Persona;
@Repository // Estereotipos, esta clase es la encargada de manejar las consutas a la bd

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	

}
