package co.edu.campusucc.poo;

public abstract class Vehiculo {

    public Vehiculo() {}

    //Properties
    private String marca;
    private String tipo;
    private String carroseria;

    public String toString() {
        return "Abstract Class --> Vehiculo";
    }

    //Abstract Behavior 
    public abstract void startingEngine();
    public abstract void stopingEngine();

    //Defined Behavior
    public void parking(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("¡¡🚥 Parking in Progress 🚥!!");
            Thread.sleep(1000-(i*50));
        }
    }

    public void breaking(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("¡¡🚥 Braking in Progress 🚥!!");
            Thread.sleep(1000-(i*100));
        }
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarroseria() {
        return carroseria;
    }

    public void setCarroseria(String carroseria) {
        this.carroseria = carroseria;
    }
}