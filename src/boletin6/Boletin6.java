/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Conta conta1=new Conta();
        System.out.println("Introduzca el nombre del titular de la cuenta");
        conta1.setNome(teclado.nextLine());
        System.out.println("Introduzca el numero de la cuenta");
        conta1.setNumCont(teclado.nextLine());
        System.out.println("Introduzca el saldo de la cuenta");
        conta1.setSaldo(teclado.nextDouble());
        Conta conta2=new Conta();
        System.out.println("Introduzca el nombre del titular de la cuenta");
        conta2.setNome(teclado.nextLine());
        System.out.println("Introduzca el numero de la cuenta");
        conta2.setNumCont(teclado.nextLine());
        System.out.println("Introduzca el saldo de la cuenta");
        conta2.setSaldo(teclado.nextDouble());
        System.out.println("El saldo de la cuenta 1 es "+conta1.getSaldo());
        System.out.println("El saldo de la cuenta 2 es "+conta2.getSaldo());
        System.out.println("Introduzca el saldo a transferir");
        conta1.transferencia(conta2, teclado.nextDouble());
        System.out.println("El nuevo saldo de la cuenta 1 es "+conta1.getSaldo()+"\nEl nuevo saldo de la cuenta 2 es "+conta2.getSaldo());
    }
    
}
