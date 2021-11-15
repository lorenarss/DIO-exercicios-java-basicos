package DioDesafio;
import java.io.IOException;
import java.util.Scanner;

    public class MediaCombustivel {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);

            //declare as variaveis corretamente

            int distacia = leitor.nextInt();
            double combustivel  = leitor.nextDouble();

            double media = (distacia/combustivel) ;  //insira as variaveis de acordo com o enunciado
            System.out.println(String.format("%.3f km/l", media ));
        }

    }
