package InventarioTelefonos;

import Almacen.AlmacenProductos;
import java.util.Scanner;

/**
 *  Esta clase sirve para la llamada desde la clase principal Tienda, acceder al programa del inventario.
 *
 * @author Juan Jose
 * @version 1.0
 * @since 22/04/2020
 */
public class MenuInventario {
    /**
     * Menu principal donde tendremos las opciones para gestionar el inventario.
     */
    public static void menu() {
        menuPrincipal();
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        while (opcion < 4 && opcion > 0) {

            switch (opcion) {
                case 1:
                    /**
                     * @see Hace referencia al metodo listaInventario de la clase AlmacenProductos.
                     */
                    AlmacenProductos.listaInventario();
                    menuPrincipal();
                    opcion = entrada.nextInt();
                    break;
                case 2:
                    /**
                     * @see Hace referencia al metodo modificarUnidades de la clase AlmacenProductos.
                     */
                    AlmacenProductos.modificarUnidades();
                    menuPrincipal();
                    opcion = entrada.nextInt();
                    break;
                case 3:
                    /**
                     * @see Hace referencia al metodo unidadesTotalesInventario de la clase AlmacenProductos.
                     */
                    AlmacenProductos.unidadesTotalesInventario();
                    
                    opcion = entrada.nextInt();
                    break;
                case 4:
                    System.out.println("Has salido del inventario hasta pronto...");
                    break;

                default:
                    System.out.println("La opcion elegida es incorrecta. (Elige 1-4)");
                    opcion = entrada.nextInt();
                    break;
            }
        }
    }
    /**
     * Metodo del menu principal con las opciones que tiene el inventario.
     */
    public static void menuPrincipal() {
        System.out.println("------------- Gestión de inventario ------------");
        System.out.println("1. Ver lista de productos.");
        System.out.println("2. Modificar inventario de productos.");
        System.out.println("3. Cantidad total de unidades telefónicas.");
        System.out.println("4. Salir.");
        System.out.println("Seleccione una de las siguientes opciones para continuar: ");
    }
}
