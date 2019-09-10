/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateo Valentino
 */
public class JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em= emf.createEntityManager();
                
        try{
           
       em.getTransaction().begin();
        
        Empleado empleado=new Empleado() {};
        
        
        em.persist(empleado);
        
        em.flush();
        
        em.getTransaction().commit();
        
    }catch(Exception e)
    {
        em.getTransaction().rollback();
    }    
       em.close();
    }
    
}
