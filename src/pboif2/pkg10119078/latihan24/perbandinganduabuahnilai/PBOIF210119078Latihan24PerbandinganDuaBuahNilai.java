/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan perbandingan dua buah nilai
 *
 */
package pboif2.pkg10119078.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nil1,nil2;
        String conf;
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Program Perbandingan Nilai========");

        do{
        System.out.printf("Masukan Nilai pertama: ");
        nil1 = scanner.nextInt();
        System.out.printf("Masukan Nilai kedua: ");
        nil2 = scanner.nextInt();
        if (nil1 > nil2){
            System.out.println("Hasil : " + nil1 + " Lebih besar dari " + nil2);
        }
        else if (nil1 < nil2){
            System.out.println("Hasil : " + nil1 + " Lebih kecil dari " + nil2);
        }
        else if (nil1 == nil2){
            System.out.println("Hasil : " + nil1 + " Sama dengan " + nil2);
        }
            System.out.println("Ulangi?(Y/N)");
            conf = scanner.next();
    
        } while(conf.equals("Y") || conf.equals("y"));
    }
    
}
