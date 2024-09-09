package latihan.java;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner input = new
                Scanner(System.in);
        System.out.println("Masukkan nomor1: ");
        double nomor1 = input.nextDouble();
        System.out.println("Masukkan nomor2: ");
        double nomor2 = input.nextDouble();

        System.out.println("1.Tambah");
        System.out.println("2.Kurang");
        System.out.println("3.kali");
        System.out.println("4.Bagi");
        System.out.println("5.Modulus");

        System.out.println("Pilihlah angka operasi ");
        int jumlah = input.nextInt();

        switch(jumlah){
            case 1:
                System.out.println("Hasil nya:"+(nomor1 + nomor2));
                break;
            case 2:
                System.out.println("Hasil nya:"+(nomor1 - nomor2));
                break;
            case 3:
                System.out.println("Hasil nya:"+(nomor1 * nomor2));
                break;
            case 4:
                System.out.println("Hasil nya:"+(nomor1 / nomor2));
                break;
            case 5:
                System.out.println("Hasil nya:"+(nomor1 % nomor2));
                break;
            default:
                System.out.println("Angka tidak ada");
                break;


        }
    }
}
