/*
1. Inicio
2. x,y (i[0-n])
3. <<"Ingrese el valor de X:"
4. >>x
5. Si(x<>0)Entonces
   Si(x<0)Entonces
        y=3*x+10
   Sino
        y=x*2+6
    Fin_si
Sino
    y=1
6. <<"El valor de X es:",+x,"y el valor de Y es:",+y"
7.Fin
 */
package debers3;
import java.util.Scanner;
/**
 *
 * @author Carlos Juca
 */
public class Actividad3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int x;
        int y;
        System.out.println("Ingrese el valor de X:");
        x=entrada.nextInt();
        if (x!=0) {
            if (x<0) {
                y=3*x+10;
            } else {
                y=x*2+6;
            }
        } else {
            y=1;
        }
        System.out.printf("El valor de X es: %d, y el valor de Y es: %d\n",x,y);    
        }
    }
