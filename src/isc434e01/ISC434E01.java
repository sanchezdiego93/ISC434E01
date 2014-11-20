/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc434e01;

/**
 *
 * @author Diego
 */
public class ISC434E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Layer principal = new LayerImplementacion();
        principal.agregarImagen(new Imagen());
        principal.agregarLayers(new LayerImplementacion());
        principal.agregarLayers(new LayerImplementacion());
        principal.ajustarTransparencia(90);
    }
    
}
