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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int seg;                                                                            //Declarar Variables
        int min;
        int aux;
        System.out.println("Ingrese el un valor en segundos:");                             //Leer Variables
        seg=entrada.nextInt();
        if (seg>=60) {
            min=seg/60;                                                                     //Calcular la cantidad de minutos que hay
            aux=seg%60;                                                                     //Calcular los segundos
            System.out.printf("%d segundos es igual a %d minuto(s) y %d segundos\n",seg,min,aux);       //Presentar la respuesta
        }
    }
    
}
