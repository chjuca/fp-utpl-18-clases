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
public class EjercicioFinal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String Cadena;
        int contador = 1;
        double suma=0.00;
        double prom=0.00;
        double estatura;
        boolean bandera = true;
        Cadena = String.format("%s\n", "Estatura Estudiantes");
        while (bandera) {
            System.out.printf("Ingrese la estatura del estudiante %d:\n", contador);
            estatura = entrada.nextDouble();
            if(estatura<1.20){
                estatura=1.20;
            }
            suma = suma + estatura;
            Cadena = String.format("%s%.2f\n", Cadena, estatura);
            contador = contador + 1;
            
            entrada.nextLine(); 
            System.out.println("¿Desea Salir (S/N)?");
            String temporal = entrada.nextLine();
            if (temporal.equals("S")) {
                bandera = false;

            }
            
       }
            prom = suma / (contador-1);
            System.out.println("REPORTE DE ESTATURAS");
            System.out.printf("%s", Cadena);
            System.out.printf("El promedio: %.2f\n", prom);
            System.out.println("Reporte genrado por Dep.Deportes");
    }
}
