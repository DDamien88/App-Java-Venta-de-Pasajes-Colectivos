/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadepasajesgrupo17;

import java.time.LocalTime;
import ventadepasajesgrupo17.accesoADatos.HorarioData;
import ventadepasajesgrupo17.accesoADatos.PasajeroData;
import ventadepasajesgrupo17.accesoADatos.RutaData;
import ventadepasajesgrupo17.entidades.Horario;
import ventadepasajesgrupo17.entidades.Pasajero;
import ventadepasajesgrupo17.entidades.Ruta;

/**
 *
 * @author Damián
 */
public class VentaDePasajesGrupo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Pasajero pasa = new Pasajero(1, "Jose Carlos", "Sosa", "49829384", "joseCarlos@gmail.com", "2554628765");
        Pasajero pasa2 = new Pasajero("Mario", "Gomez", "42357986", "marito@gmail.com", "2664975836");
        PasajeroData p1 = new PasajeroData();*/
//       p1.guardarPasajero(pasa2);
//       p1.actualizarPasajero(pasa);
//       p1.eliminarPasajero(3);
//        Pasajero pasajEncontrado = p1.buscarPasajeroPorDNI("49829384");
//        if(pasajEncontrado != null){
//            System.out.println("dni: " + pasajEncontrado.getDni());
//            System.out.println("Nombre: " + pasajEncontrado.getNombre());
//        }
//        for(Pasajero pasajero : p1.listarPasajeros()){
//            System.out.println(pasajero.getNombre());
//            System.out.println(pasajero.getApellido());
//            System.out.println(pasajero.getDni());
//            System.out.println(pasajero.getCorreo());
//            System.out.println(pasajero.getTelefono());
//        }
//        for (Pasajero pasajero : p1.buscarPasajeroPorNombre("Jose")) {
//            System.out.println(pasajero.getNombre());
//            System.out.println(pasajero.getApellido());
//            System.out.println(pasajero.getDni());
//            System.out.println(pasajero.getCorreo());
//            System.out.println(pasajero.getTelefono());
//        }
        Ruta ruta = new Ruta("Tilisarao", "Villa Mercedes", LocalTime.of(22, 0));
        Ruta ruta2 = new Ruta(3,"Naschel","Concaran",LocalTime.of(15, 0));
        RutaData ru = new RutaData();
            
//        ru.guardarRuta(ruta2);
        /*for (Ruta rut : ru.listarRuta()) {
            System.out.println(rut.getDestino());
        }*/
//        ru.actualizarRuta(ruta);
//        ru.actualizarRuta(ruta2);
        ru.eliminarRuta(2);
      

//        for (Ruta rut : ru.buscarOrigen("La Quiaca")) {
//            System.out.println(rut);
//        }
        /*for (Ruta rut : ru.buscarDestino("Villa Mercedes")) {
            System.out.println(rut);
        }*/

//        Ruta rut = ru.buscarRuta(1);
//        //Horario hora = new Horario(ruta, LocalTime.of(22, 15), LocalTime.of(00, 15));
//        HorarioData hr = new HorarioData();
//        //hr.guardarHorario(hora, rut);*/
//        
//        for (Horario hrs : hr.buscarHorariosPorRuta(rut)) {
//            System.out.println("horarios por ruta: " + rut.getId_ruta() + "; " + hrs);
//        }
    }

}
