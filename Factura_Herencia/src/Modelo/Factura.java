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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class Factura extends EntityBean implements Serializable {

   private String fecha;
   private int numero;
   private int total;
   
   //Relacion con clase Proveedor
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="factura_fk_proveedor")
   private Proveedor proveedor;
   //Relacion con clase DetalleFactura;
   @OneToMany(mappedBy="factura",cascade=CascadeType.ALL)
   private List<DetalleFactura> detallefactura=new ArrayList();
   
   
   
//Metodos y constructores
    public Factura() {
    }

  
    public Factura(String fecha, int numero, int total, Proveedor proveedor, Long id) {
        super(id);
        this.fecha = fecha;
        this.numero = numero;
        this.total = total;
        this.proveedor = proveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<DetalleFactura> getDetallefactura() {
        return detallefactura;
    }

    public void setDetallefactura(List<DetalleFactura> detallefactura) {
        this.detallefactura = detallefactura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
   
   
    
   
    
}
