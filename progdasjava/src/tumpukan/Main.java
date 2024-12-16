package tumpukan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tumpukanGG stack = new tumpukanGG();
        int pilihan;

        do {
            System.out.println("\nMenu TumpukanGG:");
            System.out.println("1. Push (Masukkan Data)");
            System.out.println("2. Pop Ganjil");
            System.out.println("3. Pop Genap");
            System.out.println("4. Cetak Tumpukan Ganjil");
            System.out.println("5. Cetak Tumpukan Genap");
            System.out.println("6. Tampilkan Jumlah Elemen");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data (integer): ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.popGanjil();
                    break;
                case 3:
                    stack.popGenap();
                    break;
                case 4:
                    stack.cetakGanjil();
                    break;
                case 5:
                    stack.cetakGenap();
                    break;
                case 6:
                    System.out.println("Jumlah elemen ganjil: " + stack.getCountGanjil());
                    System.out.println("Jumlah elemen genap: " + stack.getCountGenap());
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 7);

        scanner.close();
    }
}
