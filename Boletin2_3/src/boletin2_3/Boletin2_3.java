
package boletin2_3;

import java.util.Scanner; //Importamos la libreria escaner

public class Boletin2_3 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Creamos la clase escáner
        
        float euros,cambio,dolares;
        
        System.out.println("Introduzca los euros");
        
        euros= sc.nextFloat(); //Aqui queremos que lo que introduzcamos por teclado lo guarde en euros
        
        System.out.println("Introduzca la conversión");
        
        cambio= sc.nextFloat(); //El cambio esta a 1,17€ a 05/10/2017
        
        dolares= euros*cambio;
        
        System.out.println(euros + "€ son " + dolares + " Dolares");
        
    }
    
}


    


