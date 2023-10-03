public class Main {
    public static void main(String[] args) {

        String przedmiot = "PAM";
        int rok = 2000;

        // 1. drukowanie tekstu w konsoli
        System.out.println("Hello World!");

        // print - bez entera
        System.out.print("Liczenie: ");

        // drukowanie liczb w konsoli
        System.out.println(23.7);

        // 2. operacje matematyczne
        System.out.println(3+8*5);

        // 3. Zmienne String, int, float, zmienna - przecinkowa, bool
        System.out.println("Mój przedmiot " + przedmiot + " w roku " + rok);
        System.out.println(Math.max(5,10));
        System.out.println(Math.random());

        // 4. Instrukcje warunkowe - If
        if (rok < 2023) {
            System.out.println("Rok 2022 i wcześniej");
        } else {
            System.out.println("Rok 2023 i później");
        }

        // Switch
        switch (rok) {
            case 2000:
                System.out.println("2000");
                break;
            case 2023:
                System.out.println("2023");
                break;
            default:
                System.out.println("Inny wybór");
        }

        // While
        int i = 0;
        while (i<7) {
            System.out.println(i);
            i++;
        }

        // For
        for (int j=0; j<5; j++) {
            System.out.println("Liczba " + j);
        }

        // For-each
        String[] imiona ={"Koza", "Kaczor", "Mały kaczor", "Juzek"};
        for (String x :imiona) {
            System.out.println(x);
        }
        System.out.println(imiona[3]);
    }
}