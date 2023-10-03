package kalkulator;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        int a, b;
        char znak;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę a:");
        a = in.nextInt();

        System.out.println("Podaj liczbę b:");
        b = in.nextInt();

        System.out.println("Dodawanie - wciśnij +");
        System.out.println("Odejmowanie - wciśnij -");
        System.out.println("Mnożenie - wciśnij *");
        System.out.println("Dzielenie - wciśnij /");

        znak = in.next().charAt(0);

        switch (znak) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);

                if (b == 0) {
                    System.out.println("Nie można dzielić przez 0");
                }
                break;

            default:
        }

    }
}