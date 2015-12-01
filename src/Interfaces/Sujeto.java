/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author fernando
 */
public interface Sujeto {
    
    public void registerObservador(Observador o);
    public void removeObservador(Observador o);
    public void notificarObservadores();
    
}
