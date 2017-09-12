/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println(" INGRESE UN VALOR DECIMAL ENTERO ( 0 a 15): ");
        int numero = input.nextInt();
        
        if (numero >= 0 && numero <= 9){
            System.out.println("EL VALOR HEXADECIMAL ES " + numero);
        } else if (numero >= 10 && numero <= 15){
            System.out.println("EL VALOR HEXADECIMAL ES : " + (char)(numero + 'A' - 10));
        }else { 
            System.out.println(" EL NUMERO INGRESADO ES INVALIDO");
        }
    }
    
}
