import java.util.Scanner;

public class coffeShop {
    // Attributes
    private String namaKopi;
    private int hargaKopi;
    private int jumlahKopi;

    // Constructor
    public coffeShop(String namaKopi, int hargaKopi, int jumlahKopi) {
        this.namaKopi = namaKopi;
        this.hargaKopi = hargaKopi;
        this.jumlahKopi = jumlahKopi;
    }

    // Method to display the order
    public void tampilOrder() {
        System.out.println("Pesanan Anda:");
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Harga Kopi: Rp " + hargaKopi);
        System.out.println("Jumlah Kopi: " + jumlahKopi);
    }

    // Method to calculate the total payment
    public int totalPembayaran() {
        return hargaKopi * jumlahKopi;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Coffe Shop UjangDoremi!");

        System.out.println("Masukkan nama kopi : ");
        String namaKopi = input.nextLine();

        System.out.println("Masukkan harga kopi : ");
        int hargaKopi = input.nextInt();

        System.out.println("Masukkan jumlah kopi : ");
        int jumlahKopi = input.nextInt();

        coffeShop pesanan = new coffeShop(namaKopi, hargaKopi, jumlahKopi);

        pesanan.tampilOrder();

        int total = pesanan.totalPembayaran();
        System.out.println("Total Pembayaran: Rp " + total);

        input.close();
    }
}