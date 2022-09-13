import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        double raio, c, v;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        raio = entrada.nextDouble();

        c = Calcular.circunferencia(raio);
        v = Calcular.volume(raio);

        System.out.println("A circunferência é: " + c);
        System.out.println("O volume é: " + v);

    }
}
