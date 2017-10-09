
package boletin2_4;

import java.util.Scanner;
        
public class Boletin2_4 {

 
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in); //Creamos la clase Scanner
        
        float num1,num2; //Definimos los numeros
        
        System.out.println("Introduce el numero 1");
        
        num1= sc.nextFloat(); //Hacemos que el primer numero se introduzca en num1
        
        System.out.println("Introduce el numero 2");
        
        num2= sc.nextFloat(); //Hacemos que el segundo numero se introduzca en num2
        
        float suma= num1+num2, resta= num1-num2, prod= num1*num2, coci= num1/num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + prod);
        System.out.println("Cociente: " + coci);
    }
    
}
