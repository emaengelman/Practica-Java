/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.joined;

import Entidades.Alumno;
import Entidades.Persona;
import Entidades.Profesor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateo Valentino
 */
public class JPAJoined {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA-JoinedPU");
        EntityManager em= emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            
            Persona persona=new Persona() {};
            Alumno alumno=new Alumno();
            alumno.setNombre("Emanuel");
            alumno.setEdad(23);
            alumno.setDivision(2);
            alumno.setCurso("B");
            
            Profesor profesor=new Profesor();
            profesor.setNombre("Alberto");
            profesor.setEdad(54);
            profesor.setMateria("Programacion");
            profesor.setMatricula(0021);
            
            em.persist(persona);
            em.persist(alumno);
            em.persist(profesor);
            
            em.flush();
            em.getTransaction().commit();
            
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            
        }
        em.close();
        emf.close();
        
    }
    
}
