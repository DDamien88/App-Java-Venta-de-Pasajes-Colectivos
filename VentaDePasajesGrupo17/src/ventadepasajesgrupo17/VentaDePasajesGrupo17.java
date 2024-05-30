/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadepasajesgrupo17;

import ventadepasajesgrupo17.accesoADatos.PasajeroData;
import ventadepasajesgrupo17.entidades.Pasajero;

/**
 *
 * @author Damián
 */
public class VentaDePasajesGrupo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pasajero pasa = new Pasajero(1, "Jose Carlos", "Sosa", "49829384", "joseCarlos@gmail.com", "2554628765");
        Pasajero pasa2 = new Pasajero("Mario", "Gomez", "42357986", "marito@gmail.com", "2664975836");
        PasajeroData p1 = new PasajeroData();

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
        for (Pasajero pasajero : p1.buscarPasajeroPorNombre("Jose")) {
            System.out.println(pasajero.getNombre());
            System.out.println(pasajero.getApellido());
            System.out.println(pasajero.getDni());
            System.out.println(pasajero.getCorreo());
            System.out.println(pasajero.getTelefono());
        }

    }

}
