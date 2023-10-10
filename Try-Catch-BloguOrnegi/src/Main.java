import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin kaçıncı değerine ulaşmak istiyorsunuz?");
        int value = scanner.nextInt();

        int[] arr = new int[10];

        try {
            int a = arr[value];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi boyutunu aştınız!");
            System.out.println(e.getMessage());
        }

        if (value < 10) {
            System.out.println("İstediğiniz değere ulaştınız!");
        }

    }
}
