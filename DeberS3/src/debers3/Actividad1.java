/*
***<Algoritmo> ***
1. Inicio
2. dia(i[1-7])
3. dia=0
4. <<"Ingrese un número entre 1 y 7:"
5. >>dia
6. Dependiendo de(dia)Hacer{
    opcion 1:
        <<"Lunes"
    opcion 2:
        <<"Martes"
    opcion 3:
        <<"Miercoles"
    opcion 4:
        <<"Jueves"
    opcion 5:
        <<"Viernes"
    opcion 6:
        <<"Sabado"
    opcion 7:
        <<"Domingo"
Fin_DD
7. Fin
 */
package debers3;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int dia;
        System.out.println("Ingrese un número entre 1 y 7:");
        dia=entrada.nextInt();
        
        switch(dia){
            case 1:
                System.out.printf("Número %s\nDia: Lunes\n",dia);
                break;
            case 2:
                System.out.printf("Número %s\nDia: Martes\n",dia);
                break;
            case 3:
                System.out.printf("Número %s\nDia: Miercoles\n",dia);
                break;
            case 4:
                System.out.printf("Número %s\nDia: Jueves\n",dia);
                break;
            case 5:
                System.out.printf("Número %s\nDia: Viernes\n",dia);
                break;
            case 6:
                System.out.printf("Número %s\nDia: Sábado\n",dia);
                break;
            case 7:
                System.out.printf("Número %s\nDia: Domingo\n",dia);
                break;
            default:
                System.out.println("Ingrese un valor Correcto");
                break;
        }
    }
}
