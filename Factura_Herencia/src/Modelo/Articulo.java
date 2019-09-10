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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class Articulo extends EntityBean implements Serializable {

   private int cantidad;
   private String denominacion;

   //Relacion con clase DetalleFactura(ManyToOne)
   @OneToMany(mappedBy="articulo",cascade= {CascadeType.REFRESH, CascadeType.MERGE})
   private List<DetalleFactura> detalle;
   //Relacion con clase TipoArticulo
   @ManyToMany(cascade=CascadeType.ALL)
   @JoinTable(name ="articulo_tipoarticulo", joinColumns= @JoinColumn(name="articuloTipo_id"),inverseJoinColumns=
           @JoinColumn(name="articulo_id"))
   private List<TipoArticulo> tipoarticulo=new ArrayList();
   
   
   
   
   //Metodos Y Constructores
    public Articulo() {
    }

  
    public Articulo(int cantidad, String denominacion, List<DetalleFactura> detalle, Long id) {
        super(id);
        this.cantidad = cantidad;
        this.denominacion = denominacion;
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DetalleFactura> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleFactura> detalle) {
        this.detalle = detalle;
    }

    public List<TipoArticulo> getTipoarticulo() {
        return tipoarticulo;
    }

    public void setTipoarticulo(List<TipoArticulo> tipoarticulo) {
        this.tipoarticulo = tipoarticulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
   
   
    
}
