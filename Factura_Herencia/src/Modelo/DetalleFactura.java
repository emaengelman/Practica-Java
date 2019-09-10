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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class DetalleFactura extends EntityBean implements Serializable {

    private int cantidad;
    private int subtotal;
    
    //Relacion con clase Factura
    @ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE})
    @JoinColumn(name="detalle_fk_idFactura")
    private Factura factura;
    //Relacion con clase Articulo
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="detalle_fk_articulo")
    private Articulo articulo;
    
    //Metodos y Constructores
    public DetalleFactura() {
    }

  
    public DetalleFactura(int cantidad, int subtotal, Factura factura, Articulo articulo, Long id) {
        super(id);
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.factura = factura;
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
   
    
}
