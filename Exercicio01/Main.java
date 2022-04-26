/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import java.util.Scanner;
public class Main {
    
    public static void main (String args[]){
        ListaDeCompras listaProdutos = new ListaDeCompras();
        Scanner teclado = new Scanner (System.in);
        int entrada=0;
        System.out.println ("Insira os produtos da lista de compras: ");
        entrada = teclado.nextInt();
        
        for (int i=0; i< entrada; i++){
            listaProdutos.insereListaProdutos(teclado.nextLine());
        }       
    }    
}
