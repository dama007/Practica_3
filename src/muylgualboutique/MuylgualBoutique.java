
package muylgualboutique;

import utilidades.Fichero;

/**
 *
 * @author kinky
 */
public class MuylgualBoutique {
    
    public static Fichero miFichero;
    public static ListaPrendas misPrendas;

    
    public static void main(String[] args) {
        
        miFichero = new Fichero("prendas.xml");
        misPrendas = (ListaPrendas) miFichero.leer();
        
        if(misPrendas == null) {
         misPrendas = new ListaPrendas();   
        }
        
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
    
}
