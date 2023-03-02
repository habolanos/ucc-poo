package co.edu.campusucc.poo;

import java.util.Date;
import java.lang.Exception;
import java.lang.Thread;

public class PgmContador {
    public static void main(String[] args) {
        System.out.println("+-------------------------------+");
        System.out.println("| PGM: PgmContador              |");
        System.out.println("| Autor: Harold Adrian          |");
        System.out.println("+-------------------------------+");
        
        try {
            System.out.println("Contando desde el shell a las "+new Date());
            for (int i = 0; i < 20; i++) {
                System.out.println("Posicion Indice: "+i);
                Thread.sleep(1000-(i*50));
            }
            System.out.println("Contador Finalizado...✨✨✨✨");
        } catch (Exception e) {
            System.err.println("🛑 "+e);
        }
        
    }
}