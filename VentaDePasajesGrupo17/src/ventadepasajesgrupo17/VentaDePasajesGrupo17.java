/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadepasajesgrupo17;

import ventadepasajesgrupo17.accesoADatos.ColectivoData;
import ventadepasajesgrupo17.entidades.Colectivo;

/**
 *
 * @author Damián
 */
public class VentaDePasajesGrupo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ColectivoData coleData= new ColectivoData();
        //Colectivo cole= new Colectivo("pha-589", "VW", "2018", 30);
        
        //coleData.guardarColectivo(cole);
        //coleData.modificarColectivo(cole);
        //coleData.eliminarColectivo(2);
          /*Colectivo buscarCole= coleData.buscarColectivo(1);
          if (buscarCole != null) {
              System.out.println("ID: " + buscarCole.getId_colectivo());
              System.out.println("Matricula: " + buscarCole.getMatricula());
              System.out.println("Marca: " +buscarCole.getMarca());
              System.out.println("Capacidad: " +buscarCole.getCapacidad());
        }*/
          
          for (Colectivo colec : coleData.listarColes()) {
              System.out.println("Marca: " + colec.getMarca());
              System.out.println("Matrícula: " + colec.getMatricula());
              System.out.println("Capacidad: " + colec.getCapacidad());
        }
        
        
       
    }
    
}
