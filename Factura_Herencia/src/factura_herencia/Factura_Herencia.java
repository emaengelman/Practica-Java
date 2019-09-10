/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura_herencia;

import Modelo.Articulo;
import Modelo.DetalleFactura;
import Modelo.Domicilio;
import Modelo.EntityBean;
import Modelo.Factura;
import Modelo.Proveedor;
import Modelo.TipoArticulo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateo Valentino
 */
public class Factura_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Factura_HerenciaPU");
        EntityManager em = emf.createEntityManager();
        
        try{
         em.getTransaction().begin();//tx.begin()
            
            
            Factura factura = new Factura();
            factura.setNumero(55);
            
            
            Articulo articulo=new Articulo();
            articulo.setCantidad(5);
            articulo.setDenominacion("Pure");
             
            
            Domicilio domicilio=new Domicilio();
            domicilio.setNombreCalle("Portugal");
            
            Proveedor proveedor=new Proveedor();
            proveedor.setCuit(395311);
            
            TipoArticulo tipoarticulo=new TipoArticulo();
            tipoarticulo.setDenominacion("RIQUELME");
            
            em.persist(factura);
            em.flush();
            
            em.getTransaction().commit();//tx.commit()
            
            
        }catch(Exception e){
            em.getTransaction().rollback();//tx.rollback()
        }
        em.close();
        emf.close();   
    }
}