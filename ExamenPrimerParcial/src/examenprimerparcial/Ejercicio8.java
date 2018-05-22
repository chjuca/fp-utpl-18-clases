/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimerparcial;
import java.util.Scanner;
/**
 *
 * @author Carlos Juca
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String a,b,c;                                   //Declarar Variables
        char x,y,z,may;
        System.out.println("Ingrese la Primera Letra");     // Leer Vaibles
        a=entrada.nextLine();
        x=a.charAt(0);
        System.out.println("Ingrese otra Letra");
        b=entrada.nextLine();
        y=b.charAt(0);
        System.out.println("Ingrese otra Letra");
        c=entrada.nextLine();
        z=c.charAt(0);
        if (x<y) {                                                  //Identificar la letra que sale primero en el abecedario
            may=x;
        } else {
            if (y<z) {
                may=y;
            } else {
                may=z;
            }
        }
        System.out.printf("La primera letra que aparece en el abecedario es %s\n",may);         //Presentar la letra
        
        }
    }

