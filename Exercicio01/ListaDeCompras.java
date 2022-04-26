package Exercicio01;


import java.util.ArrayList;
import java.util.Collections;

public class ListaDeCompras {
    
    ArrayList<String> listaProdutos = new ArrayList<String>();
    
    public void insereListaProdutos (String nome){
        if (!listaProdutos.contains (nome)){
            listaProdutos.add(nome);        
        }
        else {
            System.out.println("Produto já está na lista");
        }
    }
    
    public void imprimeListaDeCompras (){
        Collections.sort (listaProdutos); //ordenar alfabeticamente
    
        for (int i= 0; i<listaProdutos.size() ;i++){
            System.out.println(listaProdutos.get(i));
        }
    
    }
    
}

