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
public class CurrentConditionsDisplay implements Observador, DisplayElement{

    private float temperatura;
    private float humedad;
    private Sujeto weatherData;

    public CurrentConditionsDisplay(Sujeto weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObservador(this);
    }
    
    
    @Override
    public void update(float temp, float humedad, float presion) {
        this.temperatura = temp;
        this.humedad = humedad;
        display();
    }

    @Override
    public void display() {
        System.out.println("Condición actual: "+ temperatura + "C Grados y " + humedad + "% de humedad");
    }
    
}
