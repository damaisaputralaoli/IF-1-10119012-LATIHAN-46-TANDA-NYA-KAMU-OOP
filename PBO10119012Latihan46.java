
package pbo10119012latihan46;

import java.time.Year;
import java.util.Scanner;

/**
 *  NAMA  : DAMAI SAPUTRA LAOLI
 *  KELAS : IF-1
 *  NIM   : 10119012
 */
public class PBO10119012Latihan46 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tahunLahir, tahunSekarang, umur;
        String normal = "\u001b[0m";
        String merah = "\u001B[31m";

        tahunSekarang = Year.now().getValue();
        Age user = new Age(tahunSekarang);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        user.setYearBirth(scanner.nextInt());
        tahunLahir = user.getYearBirth();
        umur = user.hitungUmur();

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+ tahunLahir);
        System.out.println("Hari ini tahun : "+tahunSekarang);
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", umur);
        System.out.println("Tandanya Kamu "+ merah+ user.tandanyaKamu(umur)+ normal);
    }
}
