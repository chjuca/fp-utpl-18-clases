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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int mes;                                            //Declarar Variable
        System.out.println("Ingrese el numero del mes: ");      //Leer Variable
        mes=entrada.nextInt();
        if (mes==2) {                                               //Calcular el tamaño de dias segun el mes ingresado
            System.out.println("El mes tiene 28 dias");
        } else {
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
                System.out.println("El mes tiene 31 dias");
            } else {
                System.out.println("El mes tiene 30 dias");
            }
        }
    }
}
