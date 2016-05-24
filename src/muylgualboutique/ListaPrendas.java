
package muylgualboutique;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kinky
 */
public class ListaPrendas implements Serializable {
    
    private ArrayList<Prenda> lista;

    
    
    public ListaPrendas() {    
        lista = new ArrayList<>();
    }
    
     public ArrayList<Prenda> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prenda> lista) {
        this.lista = lista;
    }
    
    
    public boolean existe(Prenda p) {
       return lista.contains(p);
    }
    
    
    public void altaPrenda(Prenda p) {        
        lista.add(p);
    }
    
    public int totalDePrendas() {
        int total = 0;
        for (Prenda actual : lista) {
            total += actual.getStock();
        }
        return total;
    }
    
    
    public double valorInventario() {
        double valorTotal = 0;
        for (Prenda actual : lista) {
          valorTotal += actual.getCoste() * actual.getStock();
        }
        return valorTotal;
    }
    
    public void borrarRegistro(Prenda p) {
        lista.remove(p);
    }
    
    
    
    public ArrayList<String> colores() {
        ArrayList<String> colores = new ArrayList<>();
        for (Prenda p : lista) {
            if (!colores.contains(p.getColor())) {
                colores.add(p.getColor());
            }
        }
        return colores;
    }
    
    
    public ListaPrendas prendasPorColor(String color) {
        ListaPrendas ropas = new ListaPrendas();
        for(Prenda actual : lista) {
            if (color.equalsIgnoreCase(actual.getColor())) {
                ropas.altaPrenda(actual);
            }
        }
        return ropas;
    }
    
    
    
    
    
    
    

   

    
}
