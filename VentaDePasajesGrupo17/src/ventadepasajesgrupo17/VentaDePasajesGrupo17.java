/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadepasajesgrupo17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import ventadepasajesgrupo17.accesoADatos.ColectivoData;
import ventadepasajesgrupo17.accesoADatos.HorarioData;
import ventadepasajesgrupo17.accesoADatos.PasajeData;
import ventadepasajesgrupo17.accesoADatos.PasajeroData;
import ventadepasajesgrupo17.accesoADatos.RutaData;
import ventadepasajesgrupo17.entidades.Colectivo;
import ventadepasajesgrupo17.entidades.Horario;
import ventadepasajesgrupo17.entidades.Pasaje;
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

        Pasajero pasa = new Pasajero(1, "Jose Carlos", "Sosa", "49829384", "joseCarlos@gmail.com", "2554628765", true);
        Pasajero pasa5 = new Pasajero(11, "Lucia ", "Gomez", "41357986", "luchi@gmail.com", "266497436" , true);
        Pasajero pasa3 = new Pasajero(9, "Juan Carlos", "Gomez", "54938023", "juancito@gmail.com", "2664365836" , true);

        PasajeroData p1 = new PasajeroData();
//        p1.guardarPasajero(pasa5);
//       p1.actualizarPasajero(pasa2);
        //p1.eliminarPasajero(8);
//        Pasajero pasajEncontrado = p1.buscarPasajeroPorDNI("44092394");
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
//        for (Pasajero pasajero : p1.buscarPasajeroPorNombre("Juan Carlos")) {
//            System.out.println(pasajero.getNombre());
//            System.out.println(pasajero.getApellido());
//            System.out.println(pasajero.getDni());
//            System.out.println(pasajero.getCorreo());
//            System.out.println(pasajero.getTelefono());
//        }
//            for (Pasajero pasajero : p1.buscarPasajeroPorApellido("Gomez")) {
//            System.out.println(pasajero.getNombre());
//            System.out.println(pasajero.getApellido());
//            System.out.println(pasajero.getDni());
//            System.out.println(pasajero.getCorreo());
//            System.out.println(pasajero.getTelefono());
//        }

        Ruta ruta = new Ruta("Juana Koslay", "Villa Mercedes", LocalTime.of(22, 0), true);
        Ruta ruta2 = new Ruta("Trapiche", "La Punta", LocalTime.of(2, 30), true);
        RutaData ru = new RutaData();

//        ru.guardarRuta(ruta);
//        ru.guardarRuta(ruta2);
            
//        ru.actualizarRuta(ruta2);

//        for (Ruta rut : ru.listarRuta()) {
//            System.out.println("origen: " + rut.getOrigen());
//            System.out.println("destino: " + rut.getDestino());
//        }


//        ru.eliminarRuta(4);
//        for (Ruta rut : ru.buscarOrigen("Trapiche")) {
//            System.out.println(rut);
//        }

//        for (Ruta rut : ru.buscarDestino("La Punta")) {
//            System.out.println("Ruta con origen en " + rut.getOrigen() +  " y destino a " + rut.getDestino());
//        }
        
        
//        System.out.println("La ruta buscada es: " + ru.buscarRuta(6));
        Ruta r1 = ru.buscarRuta(6);

        Horario hora = new Horario(r1, LocalTime.of(22, 15), LocalTime.of(00, 15), true);
        Horario hora2 = new Horario(r1, LocalTime.of(10, 15), LocalTime.of(12, 15), true);
        Horario hora3 = new Horario(r1, LocalTime.of(15, 15), LocalTime.of(17, 15), true);

        HorarioData hr = new HorarioData();

//        hr.guardarHorario(hora2);
//        hr.guardarHorario(hora3);
//
////        
//        for (Horario hrs : hr.buscarHorariosPorRuta(r1.getId_ruta())) {
//            System.out.println("horarios por ruta: " + r1.getId_ruta() + "; " + hrs);
//        }
            //Buscar horarios por hora de salida
//        List<Horario> horariosalida = hr.buscarHorariosPorHoraDeSalida(LocalTime.of(10, 15));
//        if (horariosalida != null) {
//            for (Horario hor : horariosalida) {
//                System.out.println("ID Horario: " + hor.getId_horario());
//                System.out.println("Hora salida: " + hor.getHora_salida());
//                System.out.println("Hora llegada: " + hor.getHora_llegada());
//            }
//        }
        
           //ver horarios disponibles
//           for (Horario h : hr.verHorariosDisponible(5)) {
//                System.out.println("Horario disponible:");
//                System.out.println("Hora de salida: " + h.getHora_salida());
//                System.out.println("Hora de llegada: " + h.getHora_llegada());
//            }
            //actualizar horario
           //Horario hactualizada = new Horario(6, r1, LocalTime.of(3, 10), LocalTime.of(5, 50), true);
//           hr.actualizarHorario(hactualizada);

            //eliminar horario
//           hr.eliminarHorario(7);


        ColectivoData coleData = new ColectivoData();
        Colectivo cole = new Colectivo("JSA-789", "Mercedes", "2011", 40,true);
        Colectivo cole1 = new Colectivo("JSA-943", "Mercedes", "2006", 40,true);
        Colectivo cole2 = new Colectivo("JSA-174", "Metalpar", "2020", 32,true);

        //coleData.guardarColectivo(cole);
//        coleData.guardarColectivo(cole1);
//        coleData.guardarColectivo(cole2);


//        coleData.eliminarColectivo(2);
        //coleData.eliminarColectivo(4);
        
//        Colectivo cole3 = new Colectivo(3, "ABC-116", "Metalpar", "2020", 42,true);
//        coleData.modificarColectivo(cole3);
        
        //buscar colectivo: 
//        Colectivo buscarCole= coleData.buscarColectivo(3);
//          if (buscarCole != null) {
//              System.out.println("ID: " + buscarCole.getId_colectivo());
//              System.out.println("Matricula: " + buscarCole.getMatricula());
//              System.out.println("Marca: " +buscarCole.getMarca());
//              System.out.println("Capacidad: " +buscarCole.getCapacidad());
//          }
          
//        for (Colectivo colec : coleData.listarColes()) {
//
//            System.out.println(colec);
////            System.out.println("Matrícula: " + colec.getMatricula());
////            System.out.println("Capacidad: " + colec.getCapacidad());
//        }

        Pasaje pasaje = new Pasaje(p1.buscarPasajero(4), coleData.buscarColectivo(1), ru.buscarRuta(5), LocalDate.of(2024, Month.JULY, 30), LocalTime.of(15, 30), 10, 800.00);
        Pasaje pasaje1 = new Pasaje(p1.buscarPasajero(6), coleData.buscarColectivo(3), ru.buscarRuta(6), LocalDate.of(2024, Month.JUNE, 24), LocalTime.of(15, 30), 11, 1200.00);
        Pasaje pasaje2 = new Pasaje(p1.buscarPasajero(11), coleData.buscarColectivo(1), ru.buscarRuta(5), LocalDate.of(2024, Month.MAY, 10), LocalTime.of(15, 30), 12, 800.00);

        
        PasajeData pasData = new PasajeData();
//        pasData.registrarVenta(pasaje1);
//        pasData.registrarVenta(pasaje2);


//        for (Pasaje pass : pasData.listarPasajes(4)) {
//             System.out.println( pass);
//        }

//          for (Pasaje pass : pasData.listarPasajesPorRuta(5)) {
//          System.out.println( pass);
//         }
//            

        pasData.anularVenta(pasaje.getPasajero().getId_pasajero(), pasaje.getColectivo().getId_colectivo(),  pasaje.getRuta().getId_ruta());
    }
}
