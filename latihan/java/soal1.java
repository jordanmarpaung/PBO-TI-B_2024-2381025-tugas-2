package latihan.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka ke-1 : ");
        int angka1 = input.nextInt();

        System.out.println("Masukan angka ke-2 : ");
        int angka2 = input.nextInt();

        if(angka2 > angka2) {
            System.out.println("Angka terbesar adalah : " + angka1);
        }else if (angka2 > angka1) {
            System.out.println("Angka terbesar adalah : " + angka2);
        } else {
            System.out.println("Angka tersebut sama");
        }

    }

}
