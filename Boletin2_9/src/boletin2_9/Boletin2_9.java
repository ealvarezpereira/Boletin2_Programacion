
package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {

  
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        
        float euros,b100,b20,b5,m1;
        
        System.out.println("Introduzca los euros:");
        
        euros=sc.nextFloat();
        
        b100= euros/100;
        
        b20= (euros%100)/20;
        
        b5= ((euros%100)%5)/5;
        
        m1=(((euros%100)%20)%5)/1;
        
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 20: " + b20);
        System.out.println("Billetes de 5: " + b5);
        System.out.println("monedas de 1: " + m1);
        
    }
    
}
