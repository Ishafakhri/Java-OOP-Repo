import java.util.Scanner;

class Karyawan{
    String nama;
    double gaji;

    void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan: ");
        nama = input.nextLine();
        System.out.print("Masukkan gaji karyawan: ");
        gaji = input.nextDouble();

        input.close();
    }
    void display(){
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Gaji karyawan: " + gaji);
    }
    
}
public class Payroll {
    public static void main(String[] args) {
        Karyawan krywn = new Karyawan();
        krywn.inputData();
        krywn.display(); 
    }   
}