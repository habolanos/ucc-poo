package co.edu.campusucc.poo;

import java.util.Date;
import java.lang.Exception;
import java.lang.Thread;

public class PgmPrintf {
    public static void main(String[] args) {
        System.out.println("+-------------------------------+");
        System.out.println("| PGM: pgmPrint 🖨️             |");
        System.out.println("| Autor: Harold Adrian          |");
        System.out.println("+-------------------------------+");
        
        try {
            System.out.println("Imprimiento desde el shell a las "+new Date());
            Thread.sleep(3000);
            System.out.println("📄📄📄📄📄📄📄");
            Thread.sleep(1000);
            System.out.println("Impresion Finalizada...✨✨✨✨");
        } catch (Exception e) {
            System.err.println("🛑 "+e);
        }
        
    }
}