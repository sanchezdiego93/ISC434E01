/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc434e01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class LayerImplementacion extends Layer{
    private Imagen imagen;
    public List<Layer> layer = new ArrayList<>();

    @Override
    public void cambiarPosicion(double _posX, double _posY) {
        posX = _posX;
        posY = _posY;
        System.out.println("Posiciones cambiadas...");
    }

    @Override
    public void ajustarTransparencia(double _transparencia) {
        transparencia = _transparencia;
        System.out.println("Transparencia ajustada...");
    }

    @Override
    public void agregarLayers(Layer nuevoLayer) {
        layer.add(nuevoLayer);
        System.out.println("Nuevo layer agregado...");
    }

    @Override
    public void agregarImagen(Imagen _imagen) {
        this.imagen = _imagen;
    }
    
}
