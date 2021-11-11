package Studyng.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
faça o fatorial de qualquer numero inteiro
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o numero faotrial? ");
        int fatorial = scan.nextInt();

        int multiplicacao =1;

        for (int i = fatorial; i>=1; i-- ){
            multiplicacao = multiplicacao * i;
        }
        System.out.println("O valor do fatorial é:" + multiplicacao);
    }
}
