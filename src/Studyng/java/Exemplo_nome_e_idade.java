package Studyng.java;
import java.util.Scanner;

/*
Faça um programa que leia dois valores
o primeiro representa o nome do aluno e o outro representasua idade.
pare o programa digitando 0 no campo nome.
 */

public class Exemplo_nome_e_idade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui.......");

    }
}
