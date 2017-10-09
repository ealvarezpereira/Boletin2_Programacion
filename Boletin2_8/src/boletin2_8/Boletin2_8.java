
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {

   
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        float b100,b20,b5,m1,total;
        
        System.out.println("Introduce los billetes de 100");
        b100= sc.nextFloat(); 
        System.out.println("Introduce los billetes de 20");       
        b20= sc.nextFloat();       
        System.out.println("Introduce los billetes de 5");        
        b5= sc.nextFloat();       
        System.out.println("Introduce las monedas de 1");      
        m1= sc.nextFloat();
        
        total= (b100*100)+(b20*20)+(b5*5)+(m1*1);
        
        System.out.println("Hay: " + total + "€");
    }
    
}
