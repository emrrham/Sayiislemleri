import java.util.Scanner;

public class SayiIslemleri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int sayi = sc.nextInt();
        sc.close();
        while (sayi > 0) {
            System.out.print(sayi + " ");
            sayi -= 5;
        }
        while (sayi <= 0) {
            System.out.print(sayi + " ");
            sayi += 5;
        }
    }
}
