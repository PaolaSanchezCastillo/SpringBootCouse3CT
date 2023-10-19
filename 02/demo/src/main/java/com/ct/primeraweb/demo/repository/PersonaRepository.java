package com.ct.primeraweb.demo.repository;

import com.ct.primeraweb.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {



}
