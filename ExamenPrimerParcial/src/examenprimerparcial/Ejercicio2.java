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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double x;                                                                       //Declarar Variables
        double y;
        double z;
        double m;
        System.out.println("Ingrese el valor para la variable X:");                     //Leer el valor de las variables
        x=entrada.nextDouble();
        System.out.println("Ingrese el valor para la variable Y:");
        y=entrada.nextDouble();
        System.out.println("Ingrese el valor para la variable Z:");
        z=entrada.nextDouble() ;  
        m=(x+(y/z))/(x-(y/z));                                                          // Calcular el Resultado
        System.out.printf("El valor de m, en base a las variables:\nx= %f\n\ty= %f\n\t\tz= %f\nDa como resultado:\n\t\tm= %.1f\n",x,y,z,m); //Presentar el resultado
    }
}
