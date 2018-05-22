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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int ventas;                                         // Declarar Variables
        double porc;                                
        System.out.println("Ingrese el numero de ventas del empleado: ");       //Leer Variable
        ventas=entrada.nextInt();
        if (ventas<=500) {                                                       //Calcular el porcentaje
            porc=360.40*5/100;
        } else {
            if (ventas>500 && ventas<=1000) {
                porc=360.40*8/100;
            } else {
                if (ventas>1000 && ventas <=5000) {
                    porc=360.40*10/100;
                } else {
                    porc=360.40*15/100;
                }
            }
        }
        System.out.printf("El empleado con ventas de: %d, tenda un sueldo de: $%.2f dolares\n",ventas,360.40+(porc));       //Presentar sueldo+ el procentaje correspondiente
    }
    
}
