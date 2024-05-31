/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Marianela
 */
public class Pasaje {

    private int id_pasaje;
    private Pasajero pasajero;
    private Colectivo colectivo;
    private Ruta ruta;
    private LocalDate fecha_viaje;
    private LocalTime hora_viaje;
    private int asiento;
    private Double precio;

    public Pasaje() {
    }

    public Pasaje(int id_pasaje, Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fecha_viaje, LocalTime hora_viaje, int asiento, Double precio) {
        this.id_pasaje = id_pasaje;
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fecha_viaje = fecha_viaje;
        this.hora_viaje = hora_viaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasaje(Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fecha_viaje, LocalTime hora_viaje, int asiento, Double precio) {
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fecha_viaje = fecha_viaje;
        this.hora_viaje = hora_viaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getId_pasaje() {
        return id_pasaje;
    }

    public void setId_pasaje(int id_pasaje) {
        this.id_pasaje = id_pasaje;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalDate getFecha_viaje() {
        return fecha_viaje;
    }

    public void setFecha_viaje(LocalDate fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }

    public LocalTime getHora_viaje() {
        return hora_viaje;
    }

    public void setHora_viaje(LocalTime hora_viaje) {
        this.hora_viaje = hora_viaje;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "id_pasaje=" + id_pasaje + ", pasajero=" + pasajero + ", colectivo=" + colectivo + ", ruta=" + ruta + ", fecha_viaje=" + fecha_viaje + ", hora_viaje=" + hora_viaje + ", asiento=" + asiento + ", precio=" + precio + '}';
    }

}
