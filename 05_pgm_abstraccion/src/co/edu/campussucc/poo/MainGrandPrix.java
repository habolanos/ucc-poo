package co.edu.campussucc.poo;

import co.edu.campussucc.poo.Vehiculo;

public class MainGrandPrix {
    public static void main(String[] args) {
        final Vehiculo vehiculo = new TipoCombustion();
        
        vehiculo.setMarca("DODGE");
        vehiculo.setCarroseria("sedan");

        vehiculo.startingEngine();
        vehiculo.speedUp();
        vehiculo.speedUp();
        vehiculo.breaking();
        vehiculo.speedUp();
        vehiculo.breaking();
        vehiculo.parking();
        vehiculo.stopingEngine();
    }
}
