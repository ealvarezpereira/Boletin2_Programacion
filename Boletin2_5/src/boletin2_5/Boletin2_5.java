
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

   
    public static void main(String[] args) {
       
        float m= 1852, millas, metros;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduzca las millas para la conversión:");
        
        millas= sc.nextFloat();
        
        metros = millas*m;
        
        System.out.println(millas + " Millas son " + metros + " Metros.");
        
        
    }
    
}
