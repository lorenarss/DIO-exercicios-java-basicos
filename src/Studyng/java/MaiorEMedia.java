package Studyng.java;
/*
faça um progama que leia 5 números
e informe o maior deles
e dê a media desses numeros
 */

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont =0;
        int maior =0;
        int soma = 0;

        do {
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();
            soma = soma +numero;
            cont = cont + 1;
            if(numero > maior) maior =numero;

        }while (cont < 5);
         System.out.println("O maior numero é: " + maior);
        System.out.println("A media é: " + (soma/5));
    }
}
