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
public class Horario {

    private int id_horario;
    private Ruta ruta;
    private LocalTime hora_salida;
    private LocalTime hora_llegada;
    private boolean estado;

    public Horario() {
    }

    public Horario(int id_horario, Ruta ruta, LocalTime hora_salida, LocalTime hora_llegada, boolean estado) {
        this.id_horario = id_horario;
        this.ruta = ruta;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.estado = estado;
    }

    public Horario(Ruta ruta, LocalTime hora_salida, LocalTime hora_llegada, boolean estado) {
        this.ruta = ruta;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.estado = estado;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalTime getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(LocalTime hora_salida) {
        this.hora_salida = hora_salida;
    }

    public LocalTime getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(LocalTime hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return id_horario +", hora_salida=" + hora_salida + ", hora_llegada=" + hora_llegada;
    }

}
