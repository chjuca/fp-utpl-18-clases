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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int ladoA1,ladoB1,ladoC1,anguloA1,anguloB1,anguloC1;                //Declarar Variables
        int ladoA2,ladoB2,ladoC2,anguloA2,anguloB2,anguloC2;
        System.out.println("**  Primer Triangulo    **");
        System.out.println("Ingrese el valor de sus lado A: ");                 //Leer Variable
        ladoA1=entrada.nextInt();
        System.out.println("Ingrese el valor de sus lado B: ");
        ladoB1=entrada.nextInt();
        System.out.println("Ingrese el valor de sus lado C: ");
        ladoC1=entrada.nextInt();
        System.out.println("Ingrese el valor de sus ángulo A: ");
        anguloA1=entrada.nextInt();
        System.out.println("Ingrese el valor de sus ángulo B: ");
        anguloB1=entrada.nextInt();
        System.out.println("Ingrese el valor de sus ángulo C: ");
        anguloC1=entrada.nextInt();
        System.out.println("--  Fin Primer Triangulo    --");
        System.out.println("");
        System.out.println("**  Segundo Triangulo    **");
        System.out.println("Ingrese el valor de su lado A: ");
        ladoA2=entrada.nextInt();
        System.out.println("Ingrese el valor de sus lado B: ");
        ladoB2=entrada.nextInt();
        System.out.println("Ingrese el valor de sus lado C: ");
        ladoC2=entrada.nextInt();
        System.out.println("Ingrese el valor de sus ángulo A: ");
        anguloA2=entrada.nextInt();
        System.out.println("Ingrese el valor de sus ángulo B: ");
        anguloB2=entrada.nextInt();
        System.out.println("Ingrese el valor de sus ángulo C: ");
        anguloC2=entrada.nextInt();
        System.out.println("--  Fin Segundo Triangulo    --");
        if (ladoA1!=ladoA2 || ladoB1!=ladoB2 || ladoC1!=ladoC2) {               //Identificar si son o no congruentes
            System.out.println("Los triangulos no son congruentes");
        } else {
            if (anguloA1!=anguloA2 || anguloB1!=anguloB2 || anguloC1!= anguloC2 ) {
                System.out.println("Los tringulos no son congruentes");             //Mostrar Resultados
            } else {
                System.out.println("Los triangulos son congruentes");
            }
        }
    }
}
