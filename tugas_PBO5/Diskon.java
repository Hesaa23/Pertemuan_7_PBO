package tugas_PBO5;
import java.util.Scanner;
public class Diskon {
    public static void main(String[] args) {
        Scanner pembelian = new Scanner(System.in);
        System.out.print("Masukkan Total Pembelian: ");
            double total = pembelian.nextDouble();
        
        double potongan;
        if(total < 50000){
            potongan = total * 0.05;
        } else{
            potongan = total * 0.2;
        }
        
        double bayar = total - potongan;
        
        System.out.println("Total Pembelian\t: " + total);
        System.out.println("Besar Potongan\t: " + potongan);
        System.out.println("Jumlah Harus Dibayar\t: " + bayar);
    }
}
