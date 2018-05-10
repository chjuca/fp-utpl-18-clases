/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosciclosjava;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String CadenaFinal;
        int edad;
        int suma = 0;
        int contador = 1;
        CadenaFinal = String.format("%s\t%s\n", "Edad", "Suma");
        while (contador <= 5) {
            System.out.printf("Ingrese la Edad #%d :", contador);
            edad = entrada.nextInt();
            suma = suma + edad;
            CadenaFinal = String.format("%s%d\t%d\n", CadenaFinal, edad, suma);
            contador = contador + 1;

        }
        System.out.printf("%s", CadenaFinal);
    }
}
