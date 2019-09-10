/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class Domicilio extends EntityBean implements Serializable {

    private String nombreCalle;
    private int numero;
    
    //Relacion con clase Proveedor
    @OneToOne(mappedBy="domicilio",cascade={CascadeType.REFRESH,CascadeType.MERGE})
    private Proveedor proveedor;
    
//Constructores y metodos
    public Domicilio() {
    }

   
    public Domicilio(String nombreCalle, int numero, Proveedor proveedor, Long id) {
        super(id);
        this.nombreCalle = nombreCalle;
        this.numero = numero;
        this.proveedor = proveedor;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
