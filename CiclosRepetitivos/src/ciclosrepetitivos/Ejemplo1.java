/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;

/**
 *
 * @author Carlos Juca
 */
public class Ejemplo1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 10;
        int contador = 1;
        
        while (contador <= limite){
            System.out.printf("Contador %d\n", contador);
            contador = contador + 1;
        }
    }
}