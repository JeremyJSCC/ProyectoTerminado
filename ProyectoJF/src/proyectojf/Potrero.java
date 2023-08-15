/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Potrero {
    private String nombre;
    private String estado;
    private String fechaEntrada;
    private String fechaSalida;
    private int cantidadAnimales;
    private boolean poseeAgua;
    private String tipoTerreno;
    private Ganado[] ganado;

    public Potrero(String nombre, String estado, String fechaEntrada, String fechaSalida, int cantidadAnimales,
                   boolean poseeAgua, String tipoTerreno, Ganado[] ganado) {
        this.nombre = nombre;
        this.estado = estado;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadAnimales = cantidadAnimales;
        this.poseeAgua = poseeAgua;
        this.tipoTerreno = tipoTerreno;
        this.ganado = ganado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public boolean isPoseeAgua() {
        return poseeAgua;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public Ganado[] getGanado() {
        return ganado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }

    public void setPoseeAgua(boolean poseeAgua) {
        this.poseeAgua = poseeAgua;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public void setGanado(Ganado[] ganado) {
        this.ganado = ganado;
    }
    
    @Override
    public String toString() {
        String estadoPotrero = estado.isEmpty() ? "Libre" : estado;
        StringBuilder ganadoString = new StringBuilder();
        if (ganado != null) {
            for (Ganado animal : ganado) {
                ganadoString.append(animal.toString()).append("\n");
            }
        }
        return "Potrero: " + nombre + "\n" +
                "Estado: " + estadoPotrero + "\n" +
                "Fecha de Entrada: " + fechaEntrada + "\n" +
                "Fecha de Salida: " + fechaSalida + "\n" +
                "Cantidad de Animales: " + cantidadAnimales + "\n" +
                "Posee Agua: " + (poseeAgua ? "Sí" : "No") + "\n" +
                "Tipo de Terreno: " + tipoTerreno + "\n" +
                "Ganado:\n" + ganadoString;
    }
}
