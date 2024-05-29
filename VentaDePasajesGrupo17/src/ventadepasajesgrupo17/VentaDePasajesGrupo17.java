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
        Colectivo cole= new Colectivo(2,"pha-589", "VW", "2018", 30);
        
        //coleData.guardarColectivo(cole);
        coleData.modificarColectivo(cole);
        
        
       
    }
    
}
