/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.ciclo.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class EjercicioEVA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean opt = true;
        String nom;
        String nivel;
        String op;
        int part;
        double sumaTP = 0;
        double sumaTG = 0;
        int jugador = 0;
        int pases, goles;
        double promP, promG;
        int lim;
        int sumaP = 0;
        int sumaG = 0;
        String Cadena = String.format("\n%s\t%s\t%s\t\t%s\n", "Nombre del Jugador", "Total de Pases", "Total de Goles", "Nivel del Jugador");
        do {
            System.out.println("Ingrese el Nombre de Jugador: ");
            nom = entrada.nextLine();
            System.out.println("Ingrese el numero de Partidos Jugados:");
            lim = entrada.nextInt();
            if (lim > 0) {
                System.out.println("**\tDATOS DEL PARTIDO #1\t**");
                System.out.printf("Ingrese el total de Pases P1 :");
                pases = entrada.nextInt();
                System.out.printf("Ingrese el Total de Goles G1 : ");
                goles = entrada.nextInt();
                Cadena = String.format("%s\n%10.10s.\t\tP1:%d\t\t\tG1:%d\n", Cadena, nom, pases, goles);
                sumaP = pases;
                sumaG = goles;
            }
            for (int i = 2; i <= lim; i++) {
                System.out.printf("**\tDATOS DEL PARTIDO #%d\t**\n",i);
                System.out.printf("Ingrese el total de Pases P%d :", i);
                pases = entrada.nextInt();
                System.out.printf("Ingrese el Total de Goles G%d :", i);
                goles = entrada.nextInt();
                Cadena = String.format("%s\t\t\tP%d:%d\t\t\tG%d:%d\n", Cadena, i, pases, i, goles);
                sumaP = sumaP + pases;
                sumaG = sumaG + goles;
            }
            sumaTP = sumaTP + sumaP;
            sumaTG = sumaTG + sumaG;
            if (sumaP >= 100) {
                nivel = "Excelente";
            } else {
                if (sumaP >= 80 && sumaP <= 99) {
                    nivel = "Muy Bueno";
                } else {
                    if (sumaP >= 60 && sumaP <= 79) {
                        nivel = "Bueno";
                    } else {
                        nivel = "Regular";
                    }
                }
            }
            Cadena = String.format("%s\n\t\t\tTotal:%d\t\tTotal:%d\t\t%s\n", Cadena, sumaP, sumaG, nivel);
            entrada.nextLine();
            System.out.println("Desea Ingresar otro Jugador(S/N): ");
            op = entrada.nextLine();
            if (op.equals("N")) {
                opt = false;
            }
            jugador = jugador + 1;
        } while (opt);

        promP = sumaTP / jugador;
        promG =sumaTG / jugador;
        System.out.println("\nREPORTE DE JUGADORES DEL EQUIPO UTPL");
        System.out.printf("%s\n", Cadena);
        System.out.println("Datos Finales");
        System.out.printf("%d Jugadores Analizados.\n", jugador);
        System.out.printf("Promedio de Pases del equipo es: %.2f\n", promP);
        System.out.printf("Promedio de Goles del equipo es: %.2f\n", promG);
    }
}
