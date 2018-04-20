/*
1.Inicio
2. nombre(c[a-z],[BS],[A-Z])
3. tipo,cant,precio (i[0-n])
4. <<"Ingrese el nombre del Cliente:"
5. <<"Ingrese el Tipo de Cliente"
6. <<"Ingrese la cantidad de Celulares:"
7. <<"Ingrese el precio de cada Celular:"
8. Dependiendo de(tipo)Hacer{
    opcion 1:
      <<"Nombre:",+nombre
      <<"Tipo de Cliente:",+tipo
      <<"Cantidad de Celulares:",+cant
      <<"Precio por cada Celular:",+precio
      <<"Subtotal a Pagar: ",+(cant*precio)
      <<"Descuento:",+(((cant*precio)*10)/100)
      <<"Valor final a Pagar:",+((cant*precio)-(((cant*precio)*10)/100)))
    Opcion 2:
      <<"Nombre:",+nombre
      <<"Tipo de Cliente:",+tipo
      <<"Cantidad de Celulares:",+cant
      <<"Precio por cada Celular:",+precio
      <<"Subtotal a Pagar: ",+(cant*precio)
      <<"Descuento:",+(((cant*precio)*20)/100)
      <<"Valor final a Pagar:",+((cant*precio)-(((cant*precio)*20)/100)))
    Opcion 3:
      <<"Nombre:",+nombre
      <<"Tipo de Cliente:",+tipo
      <<"Cantidad de Celulares:",+cant
      <<"Precio por cada Celular:",+precio
      <<"Subtotal a Pagar: ",+(cant*precio)
      <<"Descuento:",+(((cant*precio)*30)/100)
      <<"Valor final a Pagar:",+((cant*precio)-(((cant*precio)*30)/100)))
Fin_DD
9. Fin
 */
package debers3;
import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Actividad2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int tipo;
        int cant;
        int precio;

        
        System.out.println("Ingrese el nombre del Cliente:");
        nombre=entrada.nextLine();
        System.out.println("Ingrese el Tipo de Cliente");
        tipo=entrada.nextInt();
        System.out.println("Ingrese la cantidad de Celulares:");
        cant=entrada.nextInt();
        System.out.println("Ingrese el precio de cada Celular:");
        precio=entrada.nextInt();
        
        switch(tipo){
            case 1:
                System.out.println("***REPORTE***");
                System.out.printf("Nombre: %s\nTipo de Cliente: %d\nCantidad de Celulares: %d\nPrecio por cada Celular:%s\nSubtotal a Pagar:$ %d\nDescuento: $ %d\nValor final a Pagar: $ %d\n",nombre,tipo,cant,precio,(cant*precio),(((cant*precio)*10)/100),((cant*precio)-(((cant*precio)*10)/100)));
                break;
            case 2:
                System.out.println("***REPORTE***");
                System.out.printf("Nombre: %s\nTipo de Cliente: %d\nCantidad de Celulares: %d\nPrecio por cada Celular:%s\nSubtotal a Pagar:$ %d\nDescuento: $ %d\nValor final a Pagar: $ %d\n",nombre,tipo,cant,precio,(cant*precio),(((cant*precio)*20/100)),((cant*precio)-(((cant*precio)*20)/100)));
                break;
            case 3:
                System.out.println("***REPORTE***");
                System.out.printf("Nombre: %s\nTipo de Cliente: %d\nCantidad de Celulares: %d\nPrecio por cada Celular:%s\nSubtotal a Pagar:$ %d\nDescuento: $ %d\nValor final a Pagar: $ %d\n",nombre,tipo,cant,precio,(cant*precio),((cant*precio)*30/100),((cant*precio)-(((cant*precio)*30)/100)));
                break;
        }
    }
}
