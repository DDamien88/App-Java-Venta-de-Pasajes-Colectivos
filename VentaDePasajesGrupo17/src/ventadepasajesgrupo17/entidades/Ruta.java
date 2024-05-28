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
    private LocalTime duracion_estimado;

    public Ruta() {
    }

    public Ruta(int id_ruta, String origen, String destino, LocalTime duracion_estimado) {
        this.id_ruta = id_ruta;
        this.origen = origen;
        this.destino = destino;
        this.duracion_estimado = duracion_estimado;
    }

    public Ruta(String origen, String destino, LocalTime duracion_estimado) {
        this.origen = origen;
        this.destino = destino;
        this.duracion_estimado = duracion_estimado;
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

    public LocalTime getDuracion_estimado() {
        return duracion_estimado;
    }

    public void setDuracion_estimado(LocalTime duracion_estimado) {
        this.duracion_estimado = duracion_estimado;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id_ruta=" + id_ruta + ", origen=" + origen + ", destino=" + destino + ", duracion_estimado=" + duracion_estimado + '}';
    }
    
    
    
    
    
}
