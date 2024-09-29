package tugas_PBO5;
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NPM\t: ");
            String NPM = input.nextLine();
        System.out.print("Masukkan Nama\t: ");
            String nama = input.nextLine();
        System.out.print("Nilai Kehadiran\t: ");
            double nkehadiran = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
            double ntugas = input.nextDouble();
        System.out.print("Nilai UTS\t: ");
            double nuts = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
            double nuas = input.nextDouble();
        
        double nilaiAkhir = (0.1 * nkehadiran) + (0.2 * ntugas) + (0.3 * nuts) + (0.4 * nuas);
        
        char grade;
        String keterangan;
        
        if(nilaiAkhir >= 76){
            grade = 'A';
            keterangan = "Istimewa";
        } else if(nilaiAkhir >= 66){
            grade = 'B';
            keterangan = "Baik";
        } else if(nilaiAkhir >= 56){
            grade = 'C';
            keterangan = "Cukup";
        } else if(nilaiAkhir >= 46){
            grade = 'D';
            keterangan = "Kurang";
        } else{
            grade = 'E';
            keterangan = "Kurang Sekali";
        }
        
        System.out.println("NPM Mahasiswa\t: " + NPM);
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("Nilai Rata-rata\t: " + nilaiAkhir);
        System.out.println("Grade\t\t: " + grade);
        System.out.println("Keterangan\t: " + keterangan);
    }
}
