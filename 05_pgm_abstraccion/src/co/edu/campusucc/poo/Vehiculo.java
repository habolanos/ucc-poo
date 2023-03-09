package co.edu.campusucc.poo;

public abstract class Vehiculo {

    public Vehiculo() {}

    //Properties
    private String marca;
    private String tipo;
    private String carroseria;
    private int velocidad;

    public String toString() {
        return "Abstract Class --> Vehiculo";
    }

    //Abstract Behavior 
    public abstract void startingEngine();
    public abstract void stopingEngine();

    //Defined Behavior
    public void speedUp(){
        String speedUpString = "speed up in Progress: ";
        for (int i = 0; i < velocidad; i++) {
            speedUpString+="⏩";
        }

        for (int i = 0; i < 10 ; i++) {
            speedUpString +="⏩";
            System.out.println(speedUpString);
            try {
                Thread.sleep(1000-(i*100));
            } catch (InterruptedException e) {
                System.err.println("🛑:"+ e);
            }
        }
        addSpeed(10);
    }
    private int addSpeed(int velocidad){
        setVelocidad(this.velocidad+velocidad);
        return getVelocidad();
    }
    public void currentSpeed(){
        System.out.println("Current Speed ⏩: "+getVelocidad());
    }

    public void parking(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("¡¡🚥 Parking in Progress 🚥!!");
            try {
                Thread.sleep(1000-(i*50));
            } catch (InterruptedException e) {
                System.err.println("🛑:"+ e);
            }
        }
    }

    public void breaking(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("¡¡🚥 Braking in Progress 🚥!!");
            try {
                Thread.sleep(1000-(i*50));
            } catch (InterruptedException e) {
                System.err.println("🛑:"+ e);
            }
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}