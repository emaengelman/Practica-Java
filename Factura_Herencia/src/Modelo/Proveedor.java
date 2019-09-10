/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class Proveedor extends EntityBean implements Serializable {

    private int cuit;
    private String razonSocial;
    //Relacion con clase Factura
    @OneToMany(mappedBy="proveedor",cascade=CascadeType.REFRESH)
    private List<Factura> factura=new ArrayList();
    
    //Relacion con clase Domicilio
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="proveedor_fk_domicilio")
    private Domicilio domicilio;
//Constructores y Metodos
    public Proveedor() {
    }

    public Proveedor(int cuit, String razonSocial, Domicilio domicilio, Long id) {
        super(id);
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
