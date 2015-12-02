/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interfaces.*;
/**
 *
 * @author fernando
 */
public class Suscriptor1 implements ObsSuscriptor, DisplayElement{

    private SujetoEditor sEditor;
    private String strTitulo;
    private String strDescripcion;

    public Suscriptor1(SujetoEditor sEditor) {
        this.sEditor = sEditor;
        sEditor.registerObservador(this);
    }
    
    
    @Override
    public void update(String titulo, String descripcion) {
        this.strTitulo = titulo;
        this.strDescripcion = descripcion;
        display();
    }

    @Override
    public void display() {
        System.out.println("El nombre del libro es "+ strTitulo + " con la siguiente descripcion: "+ strDescripcion);
    }

    
    
}
