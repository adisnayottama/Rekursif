import java.util.Scanner;
public class TugasRekursif02 {

    static Scanner sc = new Scanner(System.in);
    static int fungsiHitungIteratif(int n, int[] angka) {
        int hasil = 0;

        for (int i = 0; i < angka.length; i++) {
            hasil += angka[i];
        }

        return hasil;
    }

    static int fungsiHitungRekursif(int n, int[] angka){
        if (n == 0){
            return (0);
        } else if (n == 1) {
            return (angka[0]);
        } else {
            return (angka[n - 1]) + fungsiHitungRekursif(n - 1, angka);
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        
        int[] array = new int[n];

        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            array[n - i] = sc.nextInt();
        }

        int iteratif = fungsiHitungIteratif(n, array);
        int rekursif = fungsiHitungRekursif(n, array);

        System.out.println("Total dari " + n + " angka yang dimasukkan dengan perhitungan iteratif adalah: " + iteratif);
        System.out.println("Total dari " + n + " angka yang dimasukkan dengan perhitungan rekursif adalah: " + rekursif);
        sc.close();
    }
}