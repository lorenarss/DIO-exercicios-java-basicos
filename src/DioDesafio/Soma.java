package DioDesafio;
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
        import java.util.StringTokenizer;
/*
Você receberá 2 inteiros que devem ser lidos e
armazenados nas variáveis A (pimentões amarelos)
 e B (pimentões vermelhos). Faça a soma de A e B atribuindo
  o seu resultado na variável X (total de pimentões).
Apresente X como descrito na mensagem de exemplo abaixo.
 */

public class Soma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int total = a + b; // Altere o valor da variável com o cálculo esperado
        System.out.println("X = " + total);
    }
}