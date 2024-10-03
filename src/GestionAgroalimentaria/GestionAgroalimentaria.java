
package GestionAgroalimentaria;


import Ventanas.Interfaz;

public class GestionAgroalimentaria {
    
    public static void main(String[] args) {
        // Llamando a la interfaz solo desde la clase GestionAgroalimentaria
        Interfaz inter = new Interfaz ();
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
        
    }
    
}