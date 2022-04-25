package InventarioTelefonos;

/**
 * Esta clase se generan los atributos y los metodos para luego utilizar en las otras clases 
 * a traves de los metodos accesores Getter y Setter.
 * 
 * @author Juan Jose
 * @version 1.0
 * @since 22/04/2020
 */
public class Productos implements Proveedores {

    /**
     *
     * @param marca Lo utilizamos para generar la marca de nuestro telefono
     * @param modelo Lo utilizamos para indicar el modelo de nuestro telefono.
     * @param cantidad Se usa para saber la cantidad de telefonos de un modelo.
     * @param precio Indicamos con el, lo que cuesta cada unidad de telefono.
     */
    private String marca;
    private String modelo;
    private int cantidad;
    private double precio;

    /**
     * Este metodo  se utiliza como constructor de la clase Productos
     *
     */
    public Productos(String marca, String modelo, int cantidad, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Metodo getMarca
     *
     * @return devuelve la marca de telefono.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Medodo getModelo
     *
     * @return devuelve el modelo de telefono
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Medodo getCantidad
     *
     * @return devuelve la cantidad de unidades de un modelo de telefono.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Medodo getPrecio
     *
     * @return devuelve el precio de una unidad de telefono.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo setMarca se utiliza para introducir la marca de telefono como parametro
     *
     * @param marca del telefono
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo setModelo se utiliza para introducir el modelo de telfono como parametro
     *
     * @param modelo del telefono
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo setCantidad se utiliza para introducir la cantidad de unidades de un modelo de telefono como parametro
     *
     * @param cantidad de unidades del telefono
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo setPrecio se utiliza para introducir el precio de una unidad de telefono como parametro
     *
     * @param precio de una unidad de telefono
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo Proveedores es un metodo que se implementa de la interfaz Proveedores. Servira para saber los productos que nos suministra cada proveedor.
     */
    @Override
    public void proveedores() {
        System.out.println("Metodo implementado desde la interfaz proveedores");
    }

    /**
     * Metodo toString que al llamarlo nos devuelve las propiedades o atributos de la clase productos.
     *
     * @return nos retorna la marca, el modelo, la cantidad de unidades y el precio por unidad.
     */
    @Override
    public String toString() {
        return "Almacen{" + "marca=" + marca
                + ", modelo=" + modelo
                + ", cantidad=" + cantidad
                + ", precio=" + precio + '}';
    }
}
