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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado;                                                                 //Declarar variables
        double ancho;
        double area;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la longitud de la habitación:");                //Leer el valor de las variables por teclado
        lado=entrada.nextDouble();
        System.out.println("Ingrese la anchura de la habitación:");
        ancho=entrada.nextDouble();
        area=lado*ancho;                                                            //Calcular el Area
        System.out.printf("La Superficie de la habitacion es: %.3f\n",area);        //Presentar el Resultado
        
    }
    
}
