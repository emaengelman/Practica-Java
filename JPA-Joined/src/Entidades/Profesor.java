/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class Profesor extends Persona implements Serializable {
  
    private int matricula;
    private String materia;

    public Profesor() {
    }

    public Profesor(int matricula, String materia) {
        this.matricula = matricula;
        this.materia = materia;
    }

    public Profesor(int matricula, String materia, Long id, String nombre, int edad) {
        super(id, nombre, edad);
        this.matricula = matricula;
        this.materia = materia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    
 
}
