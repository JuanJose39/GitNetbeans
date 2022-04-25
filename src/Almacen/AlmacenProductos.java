package Almacen;

import InventarioTelefonos.Productos;
import java.util.Scanner;
/**
 * En esta clase se crearan los productos del inventario y se generaran 
 * los metodos que luego se llamaran desde el menu del inventario.
 * 
 * @author Juan Jose
 * @version 1.0
 * @since 22/04/2020
 */
public class AlmacenProductos {

    private static final Productos[] telefonos = new Productos[23];

    /**
     * Metodo para inicializar los productos del inventario.
     */
    public static void inicializarProductos() {
        telefonos[0] = new Productos("Apple", "iPhone 11 negro 64GB", 25, 589.60);
        telefonos[1] = new Productos("Apple", "iPhone 12 rojo 128GB", 13, 859.20);
        telefonos[2] = new Productos("Apple", "iPhone 13 negro 64GB", 10, 589.60);
        telefonos[3] = new Productos("Apple", "iPhone 13 Pro azul 128GB", 15, 909.60);
        telefonos[4] = new Productos("Apple", "iPhone 13 Pro max grafito 256", 30, 1279.60);

        telefonos[5] = new Productos("Samsung", "Galaxy Note 20 5G", 18, 753.10);
        telefonos[6] = new Productos("Samsung", "Galaxy Z", 8, 1256.40);
        telefonos[7] = new Productos("Samsung", "Galaxy A", 81, 326.60);
        telefonos[8] = new Productos("Samsung", "Galaxy S", 42, 589.60);

        telefonos[9] = new Productos("Huawei", "P50", 54, 1250);
        telefonos[10] = new Productos("Huawei", "Mate 40 Pro", 20, 954);
        telefonos[11] = new Productos("Huawei", "nova 9", 94, 429.50);
        telefonos[12] = new Productos("Huawei", "nova 8i", 67, 350.25);

        telefonos[13] = new Productos("OPPO", "Find X5 5G", 42, 999.60);
        telefonos[14] = new Productos("OPPO", "Reno 6 Pro 5G", 18, 749.21);
        telefonos[15] = new Productos("OPPO", "A74", 58, 229.30);
        telefonos[16] = new Productos("OPPO", "A54", 25, 219);

        telefonos[17] = new Productos("Xiaomi", "12 Pro 5G", 36, 999.99);
        telefonos[18] = new Productos("Xiaomi", "Redmi Note 11 128Gb", 40, 269.90);
        telefonos[19] = new Productos("Xiaomi", "Redmi 10C", 62, 159.90);
        telefonos[20] = new Productos("Xiaomi", "Poco F3", 38, 249.99);

        telefonos[21] = new Productos("LG", "G7 ThinQ", 12, 268.35);
        telefonos[22] = new Productos("LG", "G8 ThinQ 128GB", 15, 485.05);

    }

    
    /**
     * Procedimiento para modificar cuantas unidades hay en el inventario
     */
    public static void modificarUnidades() {
        System.out.println("Modificacion de productos del inventario");
        Scanner datos = new Scanner(System.in);
        System.out.println("Que deseas modificar:");
        System.out.println("Marca.");
        System.out.println("Modelo.");
        String tipo = datos.nextLine();

        if (tipo.equals("Marca")) {
            System.out.println("Indica la marca: ");
            String modificar = datos.nextLine();
            int contador = 0;
            int i = 0;
            try {
                while (i <= telefonos.length && contador == 0) {
                    if (telefonos[i].getMarca().equals(modificar)) {
                        System.out.println("Marca:");
                        String Marca = datos.nextLine();
                        telefonos[i].setMarca(Marca);
                        System.out.println("Modelo de telefono:");
                        String Modelo = datos.nextLine();
                        telefonos[i].setModelo(Modelo);
                        System.out.println("Cantidad de unidades:");
                        int Cantidad = datos.nextInt();
                        telefonos[i].setCantidad(Cantidad);
                        System.out.println("Precio de las unidades:");
                        float Precio = datos.nextFloat();
                        telefonos[i].setPrecio(Precio);
                        System.out.println("Telefono Modificado");
                        System.out.println("------------------------");
                        System.out.println("Marca: " + telefonos[i].getMarca());
                        System.out.println("Modelo: " + telefonos[i].getModelo());
                        System.out.println("Cantidad: " + telefonos[i].getCantidad());
                        System.out.println("Precio: " + telefonos[i].getPrecio());
                        System.out.println(" ");
                        contador++;
                    }
                    i++;
                }
            /**
                * @exception Sirve para indicar si se produjera una entrada de valores erronea, 
                * indicara al usuario que el valor introducido no es valido.
            */
            } catch (Exception e) {
                System.out.println("La marca introducida no es valida");
            }
        } else if (tipo.equals(
                "Modelo")) {
            System.out.println("Indica El modelo: ");
            String modificar = datos.nextLine();
            int contador = 0;
            int i = 0;
            try {
                while (i <= telefonos.length && contador == 0) {
                    if (telefonos[i].getModelo().equals(modificar)) {
                        System.out.println("Modelo:");
                        String Modelo = datos.nextLine();
                        telefonos[i].setModelo(Modelo);
                        System.out.println("Marca:");
                        String Marca = datos.nextLine();
                        telefonos[i].setMarca(Marca);
                        System.out.println("Cantidad de unidades:");
                        int Cantidad = datos.nextInt();
                        telefonos[i].setCantidad(Cantidad);
                        System.out.println("Precio de las unidades:");
                        float Precio = datos.nextFloat();
                        telefonos[i].setPrecio(Precio);
                        System.out.println("Telefono Modificado");
                        System.out.println("------------------------");
                        System.out.println("Marca: " + telefonos[i].getMarca());
                        System.out.println("Modelo: " + telefonos[i].getModelo());
                        System.out.println("Cantidad: " + telefonos[i].getCantidad());
                        System.out.println("Precio: " + telefonos[i].getPrecio());
                        System.out.println(" ");
                        contador++;
                    }
                    i++;
                }
            } catch (Exception e) {
                System.out.println("El modelo introducido no es valido");
            }

        } else if (!tipo.equals("Marca")) {
            System.out.println("El parametro introducido no es valido.");
        } else if (!tipo.equals("Modelo")) {
            System.out.println("El parametro introducido no es valido.");
        }
    }


 /**
 * Procedimiento para listar los telefonos del inventario.
 */
    public static void listaInventario() {
        System.out.println("Lista de inventario telefónico");
        System.out.println(" ");

        mostrarProductos();
    }
    
    /**
     * Procedimiento para mostar los productos.
     */
    public static void mostrarProductos() {
        for (Productos producto : telefonos) {
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("Modelo: " + producto.getModelo());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println(" ");
        }
    }

    /**
     * Procedimiento para listar la cantidad de unidades del inventario.
     */
    public static void unidadesTotalesInventario() {

        int cantidadTotal = 0;
        System.out.println("Cantidad de unidades telefonicas");
        System.out.println("________________________________");
        System.out.println("");

        for (int i = 0; i < telefonos.length; i++) {

            cantidadTotal += telefonos[i].getCantidad();
            System.out.println(telefonos[i].getMarca() + " " + telefonos[i].getModelo());
            System.out.println(telefonos[i].getCantidad() + " unidades disponibles");
            System.out.println("");
        }

        System.out.println("Estas son las unidades que se han encontrado.");
        System.out.println("Cantidad total de unidades: " + cantidadTotal);
        System.out.println(" ");

    }

    /**
     * Funcion para contar las unidades telefonicas disponibles.
     * 
     * @param cantidadInicial
     * @return cantidadFinal de unidades en el inventario.
     */
    public static int unidadesTotales(int cantidadInicial) {
        
        int cantidadFinal=0;
        System.out.println("Cantidad total telefonos");
        System.out.println("____________________");
        System.out.println("");

        for (int i = 0; i < telefonos.length; i++) {
            cantidadFinal += telefonos[i].getCantidad();
        }
        return cantidadFinal;
    }
}
