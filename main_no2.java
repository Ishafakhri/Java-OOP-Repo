class no2_uts {
    String nama;
    int harga;
    int jumlah;

    // Method untuk mengisi data
    public void list(String namaBarang, int hargaBarang, int jumlahBarang) {
        nama = namaBarang;
        harga = hargaBarang;
        jumlah = jumlahBarang;
    }

    // Method untuk menampilkan data
    public void data() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Jumlah: " + jumlah);
    }

    // Method untuk menghitung harga diskon
    public int hargaDiskon() {
        return (int)(harga * 0.1); // Diskon 10%
    }

    // Method untuk menghitung harga setelah diskon
    public int hargaSetelahDiskon() {
        return harga - hargaDiskon();
    }
}

public class main_no2 {
    public static void main (String [] a){
        no2_uts no2 = new no2_uts();
        no2.list("Ani", 230000, 10);
        no2.data();
        System.out.println("Dapat Diskon Rp." + no2.hargaDiskon());
        System.out.println("Setelah Diskon Rp." + no2.hargaSetelahDiskon());
    }
}