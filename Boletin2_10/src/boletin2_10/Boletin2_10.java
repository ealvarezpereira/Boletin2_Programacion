
package boletin2_10;

import java.util.Scanner;


public class Boletin2_10 {

   
    public static void main(String[] args) {
      
        double IRPF=0.18F, SF,km,ven,dias,sscc=36;
        
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce el sueldo fijo");
        
        SF= sc.nextDouble();
        
        System.out.println("Introduce los km de desplazamiento");
        
        km= sc.nextDouble();
        
        System.out.println("Introduce las ventas");
        
        ven= sc.nextDouble();
        
        System.out.println("Introduce los dias");
        
        dias= sc.nextDouble();
        
        
        double kilo=km*2,comis=ven*0.05,dietas=dias*30,sbruto=SF+kilo+comis+dietas,sliquido=sbruto-(sbruto*IRPF+sscc);
        
        
        System.out.println("El sueldo bruto es " + (float)sbruto);
        
        System.out.println("El sueldo liquido es " + (float)sliquido);
        
    }
    
}
