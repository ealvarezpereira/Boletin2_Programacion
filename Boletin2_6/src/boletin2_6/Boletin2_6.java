
package boletin2_6;

import java.util.Scanner;

public class Boletin2_6 {

  
    public static void main(String[] args) {
   
        Scanner sc= new Scanner(System.in);
        
        float preciopagado, preciotarifa, prc;
        
        System.out.println("Introducir el precio pagado");
        
        preciopagado= sc.nextFloat();
        
        System.out.println("Introducir el precio de la tarifa");
        
        preciotarifa= sc.nextFloat();
        
        prc=100-(preciopagado*100/preciotarifa);
        
        System.out.println(prc);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
