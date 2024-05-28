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
public class Pasajes {
    private int id_pasaje;
    private Pasajero id_pasajero;
    private Colectivo id_colectivo;
    private Ruta id_ruta;
    private LocalDate fecha_viaje;
    private LocalTime hora_viaje;
    private int asiento;
    private Double precio;

    public Pasajes() {
    }

    public Pasajes(int id_pasaje, Pasajero id_pasajero, Colectivo id_colectivo, Ruta id_ruta, LocalDate fecha_viaje, LocalTime hora_viaje, int asiento, Double precio) {
        this.id_pasaje = id_pasaje;
        this.id_pasajero = id_pasajero;
        this.id_colectivo = id_colectivo;
        this.id_ruta = id_ruta;
        this.fecha_viaje = fecha_viaje;
        this.hora_viaje = hora_viaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasajes(Pasajero id_pasajero, Colectivo id_colectivo, Ruta id_ruta, LocalDate fecha_viaje, LocalTime hora_viaje, int asiento, Double precio) {
        this.id_pasajero = id_pasajero;
        this.id_colectivo = id_colectivo;
        this.id_ruta = id_ruta;
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

    public Pasajero getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(Pasajero id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public Colectivo getId_colectivo() {
        return id_colectivo;
    }

    public void setId_colectivo(Colectivo id_colectivo) {
        this.id_colectivo = id_colectivo;
    }

    public Ruta getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(Ruta id_ruta) {
        this.id_ruta = id_ruta;
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
        return "Pasajes{" + "id_pasaje=" + id_pasaje + ", id_pasajero=" + id_pasajero + ", id_colectivo=" + id_colectivo + ", id_ruta=" + id_ruta + ", fecha_viaje=" + fecha_viaje + ", hora_viaje=" + hora_viaje + ", asiento=" + asiento + ", precio=" + precio + '}';
    }
    
    
}
