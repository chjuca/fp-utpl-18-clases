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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a,b,c,d,e,f;                                        //Declarar Variables
        double x,y;
        System.out.println("Ingrese valor para la variable A: ");           //Leer Variables
        a=entrada.nextInt();
        System.out.println("Ingrese valor para la variable B: ");
        b=entrada.nextInt();
        System.out.println("Ingrese valor para la variable D: ");
        d=entrada.nextInt();
        System.out.println("Ingrese valor para la variable E: ");
        e=entrada.nextInt();
        c=a+b;                                                                   //Calcular variables faltantes
        f=d+e;  
        x=((c*e)-(b*f))/((a*e)-(b*d));                                            //Calcular Ecuaciones
        y=((c*e)-(b*f))/((a*e)-(b*d));
        System.out.printf("El valor de X es igual a: %.1f,Mientras q el valor de Y es: %.1f\n",x,y);        //Presentar el resultado
    }
}