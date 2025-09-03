import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
    int hargaBeras, kg, hargaAwal;
    double diskon, hargaTotal, uang, kembalian;

    Scanner input = new Scanner(System.in);

    System.out.println("Penghitung Belanjaan");
    hargaBeras = 25000;
    System.out.println("Total Beras (kg) = ");
    kg = input.nextInt();
    hargaAwal = hargaBeras * kg;
    System.out.println("Harga sebelum diskon = "+hargaAwal);
    System.out.println("Masukan Diskon (%) = ");
    diskon = input.nextDouble();
    hargaTotal =hargaAwal - (hargaAwal * diskon/100);
    System.out.println("Harga Setelah Diskon = "+hargaTotal);
    System.out.println("Uang diterima = ");
    uang = input.nextInt();
    kembalian = uang - hargaTotal;
    System.out.println("Uang kembalian ="+kembalian);

    input.close();
    }
} 