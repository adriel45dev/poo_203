import java.util.Scanner;

public class Programa {

    public static double PI = 3.14159;

    public static void main(String[] args) {

        double raio, c, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio:");

        raio = sc.nextDouble();
        c = circunferencia(raio);
        v = volume(raio);

        System.out.println("A circunferência é: " + c);
        System.out.println("O volume é: " + v);

    }

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return (4 * PI * (raio * raio * raio))/3;
    }
}
