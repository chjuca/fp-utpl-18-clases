/*
1.Inicio
2. nombre(c[a-z],[BS],[A-Z])
3. tipo,cant,precio (i[0-n])
4. Escribir "Ingrese el nombre del Cliente:"
5. Leer nombre
6. Escribir "Ingrese el Tipo de Cliente"
7. Leer tipo
8. Escribir "Ingrese la cantidad de Celulares:"
9. Leer cant
10. Escribir "Ingrese el precio de cada Celular:"
11. Leer precio
12. Dependiendo de(tipo)Hacer{
    opcion 1:
      Escribir "Nombre:",+nombre
      Escribir "Tipo de Cliente:",+tipo
      Escribir "Cantidad de Celulares:",+cant
      Escribir "Precio por cada Celular:",+precio
      Escribir "Subtotal a Pagar: ",+(cant*precio)
      Escribir "Descuento:",+(((cant*precio)*10)/100)
      Escribir "Valor final a Pagar:",+((cant*precio)-(((cant*precio)*10)/100)))
    Opcion 2:
      Escribir "Nombre:",+nombre
      Escribir "Tipo de Cliente:",+tipo
      Escribir "Cantidad de Celulares:",+cant
      Escribir "Precio por cada Celular:",+precio
      Escribir "Subtotal a Pagar: ",+(cant*precio)
      Escribir "Descuento:",+(((cant*precio)*20)/100)
      Escribir "Valor final a Pagar:",+((cant*precio)-(((cant*precio)*20)/100)))
    Opcion 3:
      Escribir "Nombre:",+nombre
      Escribir "Tipo de Cliente:",+tipo
      Escribir "Cantidad de Celulares:",+cant
      Escribir "Precio por cada Celular:",+precio
      Escribir "Subtotal a Pagar: ",+(cant*precio)
      Escribir "Descuento:",+(((cant*precio)*30)/100)
      Escribir "Valor final a Pagar:",+((cant*precio)-(((cant*precio)*30)/100)))
Fin_DD
13. Fin
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
