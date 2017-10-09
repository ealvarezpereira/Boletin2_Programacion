
package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {

    public static void main(String[] args) {
  
        Scanner sc= new Scanner(System.in);
        
        double gradosc, gradosk, gradosf;
        
        System.out.println("Introducir los grados centigrados");
        
        gradosc= sc.nextFloat();
        
        gradosk = gradosc+273;
        
        gradosf = 32+1.8*gradosc;
        
        System.out.println("Grados Centigrados: " + gradosc + "ºC");
        
        System.out.println("Grados Kelvin: " + gradosk + "K");
        
        System.out.println("Grados Farenheit: " + gradosf + "F");
        
    }
    
}
