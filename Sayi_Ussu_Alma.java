import java.util.Scanner;

public class Sayi_Ussu_Alma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int n, k;
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n= inp.nextInt();
        System.out.print("Us olacak sayiyi giriniz: ");
        k= inp.nextInt();
        int toplam = 1;

        for (int i=1; i<=k; i++)
            toplam=toplam * n;

        System.out.println(n + " uzeri " + k + ":" +toplam);



    }
}
