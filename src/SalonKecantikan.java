package Praktikum7;

import java.util.Scanner;

public class SalonKecantikan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Harga1 = 0, Harga2 = 0;
        String tambah;
        System.out.println("====SELAMAT DATANG DISALON KARTINI====");
        System.out.println("   Jl.MT.HARYONO NO.241 023-4414155   ");
        System.out.println("======================================");
        System.out.print("Masukkan Nama Anda    : ");
        String Nama = in.next();
        System.out.print("Jenis Member          : ");
        String Member = in.next();
        System.out.println("");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("| No | Nama Perawatan | Harga Perawatan |");
        System.out.println("=========================================");
        System.out.println("| 01 | Creambath      | Rp. 25.000      |");
        System.out.println("| 02 | Warna Rambut   | Rp. 65.000      |");
        System.out.println("| 03 | Rebounding     | Rp. 150.000     |");
        System.out.println("| 04 | Smoothing      | Rp. 225.000     |");
        System.out.println("| 05 | Manicure       | Rp. 20.000      |");
        System.out.println("=========================================");
        do {
            System.out.print("Kode Perawatan : ");
            String Code = in.next();
            if (Code.equals("01")) {
                Harga1 = 25000;
            } else if (Code.equals("02")) {
                Harga1 = 65000;
            } else if (Code.equals("03")) {
                Harga1 = 150000;
            } else if (Code.equals("04")) {
                Harga1 = 225000;
            } else if (Code.equals("05")) {
                Harga1 = 20000;
            } else {
                System.out.println("Kode Anda Salah");
            }
            System.out.print("Tambah (Ya/Tidak) : ");
            tambah = in.next();
            if (tambah.equalsIgnoreCase("Ya")) {
                continue;
            } else {
                break;
            }
        } while (tambah.equalsIgnoreCase("Ya"));
        System.out.println("");
        System.out.println("");
        System.out.println("======================================");
        System.out.println("| No | Nama Barang    | Harga Barang |");
        System.out.println("======================================");
        System.out.println("| 01 | Skin Whitening | Rp. 130.000  |");
        System.out.println("| 02 | Cat Kuku       | Rp. 65.000   |");
        System.out.println("| 03 | Body Scrub     | Rp. 75.000   |");
        System.out.println("| 04 | Hair Treatment | Rp. 75.000   |");
        System.out.println("======================================");
        do {
            System.out.print("Kode Barang : ");
            String Code = in.next();
            if (Code.equals("01")) {
                Harga2 = 130000;
            } else if (Code.equals("02")) {
                Harga2 = 65000;
            } else if (Code.equals("03")) {
                Harga2 = 75000;
            } else if (Code.equals("04")) {
                Harga2 = 75000;
            } else {
                System.out.println("Kode Anda Salah");
            }
            System.out.print("Tambah (Ya/Tidak) : ");
            tambah = in.next();
            if (tambah.equalsIgnoreCase("Ya")) {
                continue;
            } else {
                break;
            }
        } while (tambah.equalsIgnoreCase("Ya"));
        if (Member.equalsIgnoreCase("Premium")) {
            Premium P1 = new Premium(Nama, Member, Harga1, Harga2);
            System.out.println(P1.toString());
        } else if (Member.equalsIgnoreCase("Gold")) {
            Gold P2 = new Gold(Nama, Member, Harga1, Harga2);
            System.out.println(P2.toString());
        } else if (Member.equalsIgnoreCase("Silver")) {
            Silver P3 = new Silver(Nama, Member, Harga1, Harga2);
            System.out.println(P3.toString());
        } else if (Member.equalsIgnoreCase("NonMember")) {
            NonMember P4 = new NonMember(Nama, Member, Harga1, Harga2);
            System.out.println(P4.toString());
        }
    }
}
