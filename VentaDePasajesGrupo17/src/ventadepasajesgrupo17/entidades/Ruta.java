/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.entidades;

import java.time.LocalTime;

/**
 *
 * @author Damián
 */
public class Ruta {

    private int id_ruta;
    private String origen;
    private String destino;
    private LocalTime duracion_estimada;
    private boolean estado;

    public Ruta() {
    }

    public Ruta(int id_ruta, String origen, String destino, LocalTime duracion_estimada, boolean estado) {
        this.id_ruta = id_ruta;
        this.origen = origen;
        this.destino = destino;
        this.duracion_estimada = duracion_estimada;
        this.estado = estado;
    }

    public Ruta(String origen, String destino, LocalTime duracion_estimada, boolean estado) {
        this.origen = origen;
        this.destino = destino;
        this.duracion_estimada = duracion_estimada;
        this.estado = estado;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getDuracion_estimada() {
        return duracion_estimada;
    }

    public void setDuracion_estimada(LocalTime duracion_estimada) {
        this.duracion_estimada = duracion_estimada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ruta{" + "" + id_ruta + ", " + origen + ", " + destino + ", Duración estimada: " + duracion_estimada + " Hs, min" + '}';
    }

}
