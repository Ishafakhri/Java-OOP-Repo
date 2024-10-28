import java.util.Scanner;

class dataBarang {
    String namaBarang, kodeBarang;
    int hargaBarang;

    void inputBarangATK(Scanner in) {
        System.out.println("Masukkan nama barang: ");
        namaBarang = in.nextLine();
        System.out.println("Masukkan kode barang: ");
        kodeBarang = in.nextLine();
        System.out.println("Masukkan harga barang: ");
        hargaBarang = in.nextInt();
        in.nextLine(); 
    }

    void tampilDaftarBarang() {
        System.out.println("        DAFTAR BARANG ATK");
        System.out.println("===================================");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Harga Barang: " + "Rp." + hargaBarang);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }
}

class daftarPembelian {
    String namaBarang, kodeBarang;
    int hargaBarang, jumlahBarang, totalHarga;

    void inputPembelian(Scanner in) {
        System.out.println("Masukkan nama barang: ");
        namaBarang = in.nextLine();
        System.out.println("Masukkan kode barang: ");
        kodeBarang = in.nextLine();
        System.out.println("Masukkan harga barang: ");
        hargaBarang = in.nextInt();
        System.out.println("Masukkan jumlah barang: ");
        jumlahBarang = in.nextInt();
        in.nextLine(); 
    }

    void tampilPembelian() {
        System.out.println("        DAFTAR PEMBELIAN ATK");
        System.out.println("===================================");
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + "Rp." + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        totalHarga = hargaBarang * jumlahBarang;
        System.out.println("Total Harga: " + "Rp." + totalHarga);
    }

    void tentukanPromo() {
        if (totalHarga < 100000) {
            System.out.println("Selamat Anda mendapatkan bonus 1 penghapus!!");
        } else if (totalHarga >= 100000 && totalHarga <= 250000) {
            System.out.println("Selamat Anda mendapatkan bonus 1 Pack Sampul Coklat!!");
        } else if (totalHarga > 250000) {
            System.out.println("Selamat anda mendapatkan bonus 1 pack buku tulis!!");
        }
    }
}

public class tokoATK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dataBarang barang = new dataBarang();
        barang.inputBarangATK(in);
        barang.tampilDaftarBarang();

        daftarPembelian beli = new daftarPembelian();
        beli.inputPembelian(in);
        beli.tampilPembelian();
        beli.tentukanPromo();

        in.close();
    }
}