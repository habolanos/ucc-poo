package co.edu.campussucc.poo;

import co.edu.campusucc.poo.Vehiculo;

public class VehiculoCombustion extends Vehiculo {

    public VehiculoCombustion() {
        super();
        setTipo("Combustion");
    }

    @Override
    public void startingEngine() {
        System.out.println("✅ Check Fuel...⛽");
        for (int i = 0; i < 3 ; i++) {
            System.out.println("¡¡💥 Spark...💥!!");
            Thread.sleep(1000-(i*200));
        }
        System.out.println("Started...🌟");
    }

    @Override
    public void stopingEngine() {
        System.out.println("✅ Check Engine 🚗");
        for (int i = 0; i < 2 ; i++) {
            System.out.println("¡¡🛑 Stoping Engine...🛑!!");
            Thread.sleep(1000-(i*400));
        }
        System.out.println("Stoped...🛑");        
    }

    
}