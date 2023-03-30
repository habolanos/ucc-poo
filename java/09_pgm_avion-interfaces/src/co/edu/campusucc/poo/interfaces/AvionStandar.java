package co.edu.campusucc.poo.interfaces;

public interface AvionStandar extends AvionCarga, AvionMilitar, AvionGranja {
    // Abstract Behavior
    void startingEngine();
    void stopingEngine();

    // Definir comportamiento
    void speedUp();
    void currentSpeed();
    void landing();
    void descent();
    void chargeFuel(int litros);

    //Getter & Setter
    void setMarca(String marca);
    void setTipo(String tipo);    
}