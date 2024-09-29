package tugas_PBO5;
import java.util.Scanner;
public class KriteriaKegemukan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan\t: ");
            double beratbadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan\t: ");
            double tinggibadan = input.nextDouble();
        
        double hitung = beratbadan / (tinggibadan * tinggibadan);
        String kriteria;
        if(hitung < 18.4){
            kriteria = "Berat Badan Kurang";
        } else if(hitung >= 18.5 && hitung <= 24.9){
            kriteria = "Berat Badan Ideal";
        } else if(hitung >= 25 && hitung <= 29.9){
            kriteria = "Berat Badan Lebih";
        } else if(hitung >= 30 && hitung <= 39.9){
            kriteria = "Gemuk";
        } else{
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("IMT\t\t: " + hitung);
        System.out.println("Kriteria\t: " + kriteria);
    }
}
