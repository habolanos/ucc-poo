package co.edu.campusucc.poo.interfaces;

public interface AvionStandar {
    // Abstract Behavior
    void startingEngine();
    void stopingEngine();

    // Definir comportamiento
    void speedUp();
    void currentSpeed();
    void landing();
    void descent();
    void chargeFuel(int litros);
}