import java.util.Scanner;

class Pendataan {
    private String namaSupplier, alamatSupplier, noTelpSupplier;

    void inputDataSupplier(Scanner input) {
        System.out.print("Masukkan nama supplier: ");
        namaSupplier = input.nextLine();
        System.out.print("Masukkan alamat supplier: ");
        alamatSupplier = input.nextLine();
        System.out.print("Masukkan nomor telepon supplier: ");
        noTelpSupplier = input.nextLine();
    }

    void tampilSupplier() {
        System.out.println("Nama Supplier: " + namaSupplier);
        System.out.println("Alamat Supplier: " + alamatSupplier);
        System.out.println("Nomor Telepon Supplier: " + noTelpSupplier);
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public String getNoTelpSupplier() {
        return noTelpSupplier;
    }
}

class Transaksi {
    String kodeBarang, namaBarang, merkBarang;
    double hargaBarang;
    int jumlahBarang;

    void inputDataBarang(Scanner input) {
        System.out.print("Masukkan Kode Barang: ");
        kodeBarang = input.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.nextLine();
        System.out.print("Masukkan Merk Barang: ");
        merkBarang = input.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        hargaBarang = input.nextDouble();
        System.out.print("Masukkan Jumlah Barang: ");
        jumlahBarang = input.nextInt();
        input.nextLine(); 
    }
    double hitungDiskon() {
        double diskon = 0;
        if (jumlahBarang >= 1 && jumlahBarang <= 100) {
            diskon = 0.05;
        } else if (jumlahBarang >= 101 && jumlahBarang <= 150) {
            diskon = 0.10;
        } else if (jumlahBarang > 150) {
            diskon = 0.20;
        }
        return hargaBarang * jumlahBarang * diskon;
    }

    double hitungTotal() {
        double totalDiskon = hitungDiskon();
        return (hargaBarang * jumlahBarang) - totalDiskon;
    }

    void tampilTransaksi() {
        System.out.println("Kode Barang   : " + kodeBarang);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Merk Barang   : " + merkBarang);
        System.out.println("Harga Barang  : Rp" + hargaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Total Diskon  : Rp" + hitungDiskon());
        System.out.println("Total Bayar   : Rp" + hitungTotal());
    }
}

public class MainTokoMaterial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pendataan pemasok = new Pendataan();
        Transaksi transaksi = new Transaksi();
        int pilihanMenu;

        do {
            System.out.println("Menu:");
            System.out.println("1. Masukkan Data Pemasok");
            System.out.println("2. Masukkan Data Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihanMenu = input.nextInt();
            input.nextLine();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("Silahkan Masukkan Data Pemasok");
                    pemasok.inputDataSupplier(input);
                    break;

                case 2:
                    System.out.println("Silahkan Masukkan Data Barang");
                    transaksi.inputDataBarang(input);

                    System.out.println("\nPilih Kategori Jumlah:");
                    System.out.println("A (1-100)");
                    System.out.println("B (101-150)");
                    System.out.println("C (>150)");
                    System.out.print("Masukkan Pilihan: ");
                    char kategori = input.nextLine().charAt(0);

                    transaksi.tampilTransaksi();
                    System.out.println("\nNama Pemasok  : " + pemasok.getNamaSupplier());
                    System.out.println("Nama Barang   : " + transaksi.namaBarang);
                    System.out.println("Terimakasih sudah Memasok Keperluan Material di Tb. ABADI JAYA");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihanMenu != 0);

        input.close();
    }
}