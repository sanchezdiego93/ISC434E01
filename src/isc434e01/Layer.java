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
public abstract class Layer{
    
    double posX, posY;
    public double transparencia;
    
    abstract public void agregarImagen(Imagen imagen);
    
    abstract public void agregarLayers(Layer nuevoLayer);
    
    abstract public void cambiarPosicion(double _posX, double _posY);
    
    abstract public void ajustarTransparencia(double _transparencia);
    
}