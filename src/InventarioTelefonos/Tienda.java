package InventarioTelefonos;

import Almacen.AlmacenProductos;
/**
 *  Esta clase es la clase principal Tienda donde accedemos al programa del inventario.
 *
 * @author Juan Jose
 * @version 1.0
 * @since 22/04/2020
 */
public class Tienda {
    
    /**
     * Metodo principal desde el que se inicalizan los productos para poder luego acceder a ellos 
     * desde las opciones del menú.
     * 
     * Tambien se llama al metodo menu de la clase MenuInventario.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // Se inicializa los arrays con los productos de los teléfonos que tenemos disponibles.
        AlmacenProductos.inicializarProductos();
        // Se inicializa el menú en el cual se procederá hacer las gestiones que necesite el usuario en el momento.
        MenuInventario.menu();
    }

}
