package co.edu.campusucc.poo;

public class MainGrandPrix {
    public static void main(String[] args) {
        Vehiculo vehiculo = new TipoCombustion();
        vehiculo.setMarca("DODGE");
        vehiculo.setCarroseria("sedan");
        System.out.println(vehiculo);

        vehiculo.startingEngine();
        
        vehiculo.speedUp();
        vehiculo.breaking();
        vehiculo.currentSpeed();
        vehiculo.parking();
        vehiculo.stopingEngine();

        vehiculo = new TipoElectrico();
        vehiculo.setMarca("NISSAN");
        vehiculo.setCarroseria("Truck Pick Up");
        System.out.println(vehiculo);

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
