/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_integral;

/**
 *
 * @author dam1
 */
public class Cliente {
    //Atributos
    private String dni;
    private String nombre;
    private String direccion;
    private String localidad;
    private String codigoPostal;

    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param direccion
     * @param localidad
     * @param codigoPostal
     */
    public Cliente(String dni, String nombre, String direccion, String localidad, String codigoPostal) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }
    
    
}
