package co.edu.campusucc.poo;

public class MainGrandPrix {
    public static void main(String[] args) {
        final Vehiculo vehiculo = new TipoCombustion();
        
        vehiculo.setMarca("DODGE");
        vehiculo.setCarroseria("sedan");

        vehiculo.startingEngine();
        vehiculo.speedUp();
        vehiculo.speedUp();
        vehiculo.currentSpeed();
        vehiculo.breaking();
        vehiculo.speedUp();
        vehiculo.breaking();
        vehiculo.currentSpeed();
        vehiculo.parking();
        vehiculo.stopingEngine();
    }
}
