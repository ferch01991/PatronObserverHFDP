package Clases;

import Interfaces.ObsSuscriptor;
import java.util.ArrayList;
import Interfaces.SujetoEditor;

/**
 *
 * @author fernando
 */
public class Editor implements SujetoEditor{
    
    private ArrayList arrSuscriptor;
    private String strTitulo;
    private String strDescripcion;

    public Editor() {
        arrSuscriptor = new ArrayList();
    }

    @Override
    public void registerObservador(ObsSuscriptor suscriptor) {
        arrSuscriptor.add(suscriptor);
    }

    @Override
    public void removeObservador(ObsSuscriptor suscriptor) {
        int i = arrSuscriptor.indexOf(suscriptor);
        
        if (i>=0) {
            arrSuscriptor.remove(i);
        }
    }

    @Override
    public void notificarObservadores() {
        for (int i = 0; i < arrSuscriptor.size(); i++) {
            ObsSuscriptor observador1 = (ObsSuscriptor)arrSuscriptor.get(i);
            observador1.update(strTitulo, strDescripcion);
        }
    }
    
    public void cambioEdicion(){
        notificarObservadores();
    }
    
    public void setEdicion(String Titulo, String Descripcion){
           this.strTitulo = Titulo;
           this.strDescripcion = Descripcion;
           cambioEdicion();
    }
    
    
    
}
