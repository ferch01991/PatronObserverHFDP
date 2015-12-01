package Clases;

import Interfaces.*;
import java.util.ArrayList;
/**
 *
 * @author fernando
 */

//Nuestra clase WeatherData(datos del tiempo) es el sujeto concreto

public class WeatherData implements Sujeto{

    private ArrayList observadores;
    private float temperatura; 
    private float humedad; 
    private float presion;

    public WeatherData() {
        observadores = new ArrayList();
    }
    
    public void registerObservador(Observador obs) {
        observadores.add(obs);
    }

    
    public void removeObservador(Observador obs) {
        int i = observadores.indexOf(obs);
        
        if (i>=0) {
            observadores.remove(i);
        }
    }

    
    @Override
    public void notificarObservadores() {
        for (int i = 0; i < observadores.size(); i++) {
            Observador observador = (Observador)observadores.get(i);
            observador.update(humedad, humedad, presion);
        }
    }

    public void measurementsChange(){
        notificarObservadores();
    }
    
    public void setMeasurements(float temp, float humedad, float presion){
        this.temperatura = temp;
        this.humedad = humedad;
        this.presion = presion;
        measurementsChange();
    }
    
}
