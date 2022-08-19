import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre as medidas do triângulo X:");
        xA = ler.nextDouble();
        xB = ler.nextDouble();
        xC = ler.nextDouble();

        System.out.println("Entre as medidas do triângulo Y:");
        yA = ler.nextDouble();
        yB = ler.nextDouble();
        yC = ler.nextDouble();

        double xP = (xA + xB + xC) /2;
        double areaX = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));

        double yP = (yA + yB + yC) /2;
        double areaY = Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));

        System.out.println("A area do triângulo X é:" + areaX);
        System.out.println("A area do triângulo Y é:" + areaY);

        if(areaX > areaY){
            System.out.println("A area de X é maior");
        } else {
            System.out.println("A area de Y é maior");
        }
        
   }
}