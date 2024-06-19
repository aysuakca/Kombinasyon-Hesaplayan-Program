import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int n, r;
        int factN = 1;
        int factR = 1;
        int factNr = 1;
        double comb;


        Scanner inp = new Scanner(System.in);

        System.out.println("Kumenin Eleman Sayisini Giriniz (n) :");
        n = inp.nextInt();

        System.out.println("Oluşturulacak gruplarin eleman sayisini giriniz (r) :");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }

        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }
        for (int i = 1; i <= n-r; i++) {
            factNr = factNr * i;
        }

        comb = factN / (factR * factNr);

        System.out.println("C(n,r) :" + comb);
    }
}







