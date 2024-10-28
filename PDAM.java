import java.util.Scanner;

class biayaAir{
    String namaPelanggan, nomorMeteran;
    double biayaBulanan, biayaPemakaian, biayaMeteran, PPN, totalTagihan;
    int penggunaanAir;

    void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        namaPelanggan = input.nextLine();
        System.out.print("Masukkan nomor meteran: ");
        nomorMeteran = input.nextLine();
        System.out.print("Masukkan penggunaan air: ");
        penggunaanAir = input.nextInt();
        input.close();
    }
    void hitungBiaya(){
        if (penggunaanAir <= 10){
            biayaPemakaian = 10000;
        } else if (penggunaanAir > 10 && penggunaanAir <= 20){
            biayaPemakaian = 20000;
        } else if (penggunaanAir > 20 && penggunaanAir <= 30){
            biayaPemakaian = 30000;
        } else if (penggunaanAir > 30 && penggunaanAir <= 40){
            biayaPemakaian = 40000;
        } else if (penggunaanAir > 40 && penggunaanAir <= 50){
            biayaPemakaian = 50000;
        } else if (penggunaanAir > 50){
            biayaPemakaian = 60000;
        }
        biayaMeteran = 5000;
        biayaBulanan = biayaPemakaian + biayaMeteran;
        PPN = biayaBulanan * 0.1;
        totalTagihan = biayaBulanan + PPN;
    }

}
public class PDAM{
    public static void main(String[] args) {
        biayaAir air = new biayaAir();
        air.inputData();
        air.hitungBiaya();
        System.out.println("Nama Pelanggan: " + air.namaPelanggan);
        System.out.println("Nomor Meteran: " + air.nomorMeteran);
        System.out.println("Biaya Pemakaian: " + air.biayaPemakaian);
        System.out.println("Biaya Meteran: " + air.biayaMeteran);
        System.out.println("Biaya Bulanan: " + air.biayaBulanan);
        System.out.println("PPN: " + air.PPN);
        System.out.println("Total Tagihan: " + air.totalTagihan);
    }
}