/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

import Clases.Editor;
import Clases.Suscriptor1;

/**
 *
 * @author fernando
 */
public class mainEditor {
    
    public static void main(String[] args) {
        
        Editor editor = new Editor();
        Suscriptor1 suscriptor1 = new Suscriptor1(editor);
        
        editor.setEdicion("Patrones de Diseno", "Libro en el cual se habla de los patrones de diseno y su uso.");
        editor.setEdicion("Programacionde Algoritmos", "Libro con una breve introduccion al manejo de algoritmos.");
        editor.setEdicion("Programacionde Algoritmos", "Libro con una breve introduccion al manejo de algoritmos.");
    }
    
}
