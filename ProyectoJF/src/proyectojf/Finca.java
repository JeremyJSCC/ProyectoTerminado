/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jerjo
 */
class Finca {
    private String nombre;
    private String ubicacion;
    private String nombreEncargado;
    private int cedulaEncargado;
    private int telefonoEncargado;
    private int cantidadPotreros;
    private int tamañoFinca;
    private int cantidadAnimales;
    private Potrero[] potreros;

    public Finca(String nombre, String ubicacion, String nombreEncargado, int cedulaEncargado, int telefonoEncargado,
                 int cantidadPotreros, int tamañoFinca, int cantidadAnimales, Potrero[] potreros) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nombreEncargado = nombreEncargado;
        this.cedulaEncargado = cedulaEncargado;
        this.telefonoEncargado = telefonoEncargado;
        this.cantidadPotreros = cantidadPotreros;
        this.tamañoFinca = tamañoFinca;
        this.cantidadAnimales = cantidadAnimales;
        this.potreros = potreros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public int getCedulaEncargado() {
        return cedulaEncargado;
    }

    public int getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public int getCantidadPotreros() {
        return cantidadPotreros;
    }

    public int getTamañoFinca() {
        return tamañoFinca;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public Potrero[] getPotreros() {
        return potreros;
    }

    @Override
    public String toString() {
        StringBuilder potrerosString = new StringBuilder();
        for (Potrero potrero : potreros) {
            potrerosString.append(potrero.toString()).append("\n");
        }
        return "Nombre de la Finca: " + nombre + "\n" +
                "Ubicación: " + ubicacion + "\n" +
                "Nombre del Encargado: " + nombreEncargado + "\n" +
                "Cédula del Encargado: " + cedulaEncargado + "\n" +
                "Teléfono del Encargado: " + telefonoEncargado + "\n" +
                "Cantidad de Potreros: " + cantidadPotreros + "\n" +
                "Tamaño de la Finca: " + tamañoFinca + "\n" +
                "Cantidad de Animales: " + cantidadAnimales + "\n" +
                "Potreros:\n" + potrerosString;
    }
}
   
