
package muylgualboutique;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kinky
 */
public class Prenda implements Serializable {
    
    private String codigo;    
    private String descripcion;    
    private double coste;    
    private String color;    
    private String talla;    
    private double precio_venta;    
    private int stock;

    
    
    
    public Prenda() {
        
        this.codigo = "";
        this.descripcion = "";
        this.color = "";
        this.talla = "";
        
        
    }

          
    
    public Prenda(String codigo, String descripcion, double coste, String color, String talla, double precio_venta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.coste = coste;
        this.color = color;
        this.talla = talla;
        this.precio_venta = precio_venta;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return codigo + " - " + descripcion;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prenda other = (Prenda) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
      

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }


    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}
