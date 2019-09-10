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
import javax.persistence.ManyToMany;

/**
 *
 * @author Mateo Valentino
 */
@Entity
public class TipoArticulo extends EntityBean implements Serializable {

   private String denominacion;
   
   //Relacion con clase Artculo
   @ManyToMany(mappedBy="tipoarticulo",cascade=CascadeType.ALL)
   private List<Articulo> articulo =new ArrayList();
   
   
//Constructores y Metodos
    public TipoArticulo() {
    }

   
    public TipoArticulo(String denominacion, Long id) {
        super(id);
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<Articulo> articulo) {
        this.articulo = articulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    
}
