package javaapi.src.Exercicio03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Agenda {
    ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();
    Compromisso c = new Compromisso();
    String padraoData = "aaaa/mm/dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padraoData);

    public void impreDia (Date dia){
        System.out.println("Insira o '0' para imprimir em inglês e o '1' caso contrário.");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        System.out.println("Insira o '0' para imprimir extenso e o '1' caso contrário.");
        int b = teclado.nextInt();
        for (int i = 0; i< compromissos.size(); i++){
            c = compromissos.get(i);
            if (dia == c.data){
                System.out.println(c.titulo);
                System.out.println(c.descricao);
                System.out.println(c.local);
                if (a == 0 && b == 0) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padraoData);
                    System.out.println(simpleDateFormat.format(c.data));

                }
                else if (a == 1 && b == 0) {
                    padraoData ="dd/mm/aaaa";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padraoData);
                    System.out.println(simpleDateFormat.format(c.data));

                }
                else if (a == 0 && b == 1) {
                    padraoData="mm/dd";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padraoData);
                    System.out.println(simpleDateFormat.format(c.data));

                }
                else {
                    padraoData="dd/mm";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padraoData);
                    System.out.println(simpleDateFormat.format(c.data));
                }
            }
        }
    }
}
