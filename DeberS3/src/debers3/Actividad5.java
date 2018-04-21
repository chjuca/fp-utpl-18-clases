/*
1. Inicio
2. opt,grado,c,f (i[0-n])
3. Escribir "Ingrese el valor de los Grados a convertir :"
4. Leer grado
5. Escribir "**** MENU DE OPCIONES ****"
6. Escribir "1. Convertir de grados Celcius (C) a Fahrenheit (F)"
7. Escribir "2. Convertir de de Fahrenheit (F) a grados Celcius (C)"
8. Escribir  "Escoja una Opcion: "
9. Leer opt
10 Dependiendo De(opt)Hacer
    Opcion 1:
        f=(grado+32)*9/5
        Escribir "RESULTADO:" ,+grado"° Celcius son iguales a ",+f"° Fahrenheit"
    Opcion 2:
        c=(grado-32)*5/9
        Escribir "RESULTADO:" ,+grado"° Fahrenheit son iguales a ",+c"° Celcius"
    Fin DD
11. Fin
        
 */
package debers3;
import java.util.Scanner;
/**
 *
 * @author Carlos Juca
 */
public class Actividad5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opt;
        int grado;
        int c;
        int f;
        
        System.out.println("Ingrese el valor de los Grados a convertir :");
        grado= entrada.nextInt();
        
        System.out.println("            ****  MENU DE OPCIONES  ****");
        System.out.println("1. Convertir de grados Celcius (C) a Fahrenheit (F");
        System.out.println("2. Convertir de de Fahrenheit (F) a grados Celcius (C)");
        
        System.out.println("Escoja una Opcion: ");
        opt=entrada.nextInt();
        
        switch (opt) {
            case 1:
                f=(grado+32)*9/5;
                System.out.printf("RESULTADO: %d° Celcius son iguales a %d° Fahrenheit\n", grado,f);
                break;
            case 2:
                c=(grado-32)*5/9;
                System.out.printf("RESULTADO: %d° Fahrenheit son iguales a %d° Celcius\n", grado,c);
                break;
            default:
                System.out.println("Ingrese una opción Válida");
        }
        
    }
}
