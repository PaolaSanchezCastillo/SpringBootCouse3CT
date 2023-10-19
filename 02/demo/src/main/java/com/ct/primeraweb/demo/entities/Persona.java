package com.ct.primeraweb.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Personas")
public class Persona {

   @Id
    private Long id;
    private String nombre;
    private int edad;





}
