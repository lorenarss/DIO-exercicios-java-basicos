package Studyng.java;
import java.util.Scanner;

  /*
    Faça um progama que leia uma nota entre 0 e 10.
    Mostra uma mensagem caso o valor seja invalido
    e cotinue pedindo uma nota
    até que usuário insira um valor valido
     */

public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota <0 | nota >10) {

            System.out.println("Digite uma nota válida: ");
            nota = scan.nextInt();
        }
    }
}
