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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a,b,c,d;                                                //Declarar Variables
        int prom;
        System.out.println("Ingrese una calificación(0-100):");             //Leer Variables
        a=entrada.nextInt();
        System.out.println("Ingrese la siguiente calificación(0-100):");
        b=entrada.nextInt();
        System.out.println("Ingrese la siguiente calificación(0-100):");
        c=entrada.nextInt();
        System.out.println("Ingrese la siguiente calificación(0-100):");
        d=entrada.nextInt();
        prom=(a+b+c+d)/4;                                                       //Calcular el Promedio
        if (prom>=90 && prom<=100) {                                            //Calcular y Presentar la untuacion segun el promedio
            System.out.printf("El estudiante con el promedio de calificaciones %d,tiene una puntuación de A\n",prom);
        } else {
            if (prom>=80 && prom<90) {
                System.out.printf("El estudiante con el promedio de calificaciones %d,tiene una puntuacion de B\n",prom);
            } else {
                if (prom>=70 && prom<80) {
                    System.out.printf("El estudiante con el promedio de calificaciones %d,tiene una puntuacion de C\n",prom);
                } else {
                    System.out.printf("El estudiante con el promedio de calificaciones %d,tiene una puntuacion de D\n",prom);
                }
            }
        }
      
    }
}
