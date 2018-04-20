/*
1. Inicio
2. cant,precio,desc (i[0-n])
3. <<"Ingrese la cantidad de balones a comprar:"
4. >>cant 
5. <<"Ingrese el precio de cada balon:"
6. >>precio
7. Si(cant>0)Entonces
    Si (cant<>1)Entonces
        Si (cant<>2)Entonces
            desc=(cant*precio*80)/100;
        Sino
            desc=(cant*precio*70)/100;
        Fin_Si
    Sino
        desc=(cant*precio*50)/100
    Fin_Si
Sino
<<"Ingrese una cantidad positiva"
Fin_Si
8. <<"Cantidad de Balones:",+cant
9. <<"Precio de cada Balón:",+precio
10. <<"Descuento:",+desc
11. <<Total a Pagar:´+(precio*cant)-desc)
12.Fin
*/
package debers3;
import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Actividad4 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int cant;
        int precio;
        int desc = 0;
        System.out.println("Ingrese la cantidad de balones a comprar:");
        cant=entrada.nextInt();
        System.out.println("Ingrese el precio de cada balon:");
        precio=entrada.nextInt();
        if (cant>0) {
            if (cant!=1) {
                if (cant!=2) {
                    desc=(cant*precio*80)/100;
                } else {
                    desc=(cant*precio*70)/100;
                }
            } else {
               desc=(cant*precio*50)/100;
            }
        } else {
            System.out.println("Ingrese una cantidad positiva");
        }
        System.out.printf("Cantidad de Balones: %d\nPrecio de cada Balón: %d\nDescuento: $%d\nTotal a Pagar: $%d\n",cant,precio,desc,((precio*cant)-desc));
    }
  
}
