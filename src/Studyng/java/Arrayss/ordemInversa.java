package Studyng.java.Arrayss;
/*
crie um vetor com 6 elementos e mostre os na ordem inversa
 */
public class ordemInversa {
    public static void main(String[] args) {

        int[] vetor1 = {1, 3 , 45, 6, 77, 7};
        System.out.println("\nVetor na ordem correta e inversa: ");
        int count = 0;
        while (count < (vetor1.length)){
            System.out.print(vetor1[count] + " ");
            count++;

        }
        for (int i = (vetor1.length - 1); i >=0; i--){
            System.out.print(vetor1[i] + " ");
        }
    }
}
