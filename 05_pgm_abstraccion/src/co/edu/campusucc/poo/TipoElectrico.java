package co.edu.campusucc.poo;

public class TipoElectrico extends Vehiculo {

    public TipoElectrico() {
        super();
        setTipo("Electrico");
    }

    @Override
    public void startingEngine(){
        System.out.println("โ Check Electric System...๐");
        for (int i = 0; i < 2 ; i++) {
            System.out.println("ยกยก๐ Init... ๐ก!!");
            try {
                Thread.sleep(500-(i*250));
            } catch (InterruptedException e) {
                System.err.println("๐:"+ e);
            }
        }
        System.out.println("Started...๐ก");
    }

    @Override
    public void stopingEngine() {
        System.out.println("โ Check Electric Circuit ๐");
        for (int i = 0; i < 2 ; i++) {
            System.out.println("ยกยก๐ Cutting Electric Circuit...โก!!");
            try {
                Thread.sleep(800-(i*400));
            } catch (InterruptedException e) {
                System.err.println("๐:"+ e);
            }
        }
        System.out.println("Stoped...โกโก");        
    }

    @Override
    public void speedUp(){
        String speedUpString = "speed up in Progress: ";
        for (int i = 0; i < super.getVelocidad(); i++) {
            speedUpString+="โฉ";
        }

        for (int i = 0; i < 10 ; i++) {
            speedUpString +="โฉ";
            System.out.println(speedUpString);
            try {
                Thread.sleep(500-(i*50));
            } catch (InterruptedException e) {
                System.err.println("๐:"+ e);
            }
        }
        super.addSpeed(10);
    }
}