
package ejercicio_extra;

import java.util.Scanner;


public class Ejercicio_Extra {

    public static void main(String[] args) {
        
        
        int cc,a,v,e,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantas cocacolas consumieron?");
        cc=sc.nextInt();
        System.out.println("Cuantas aguas consumieron?");
        a=sc.nextInt();
        t=cc*3+a*2;
        System.out.println("Importe total "+t+".  Cuanto dinero entrega?");
        e=sc.nextInt();
        v=e-t;
     System.out.println("'Bar y La Luna'\n\n"
             + "Consumiciones:\n"
             + " "+cc+" Cocacolas = 15.\n"
             + " "+a+" Aguas     = 7.\n\n"
             + "Importe total= "+t+".\n\n"
             + "Entregado    = "+e+".\n"
             + "Vuelta        = "+v+".\n\n"
             + "Grazas por su visita, vuelva pronto");
    }
    
}
