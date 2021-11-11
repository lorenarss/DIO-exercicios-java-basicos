package Studyng.java;

import java.util.Scanner;

/*
Faça um programa qu peça N numeros inteiros
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares
 */

public class ParEimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero, quantPares = 0, quantImpares =0, count =0;

        System.out.println("Qual a quantidade de numeros desejada? ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero %2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while (count<quantNumeros);

        System.out.println("Quantidade de numeros pares: " + quantPares);
        System.out.println("Quantidade de numeros ímpares: " + quantImpares);



    }
}
