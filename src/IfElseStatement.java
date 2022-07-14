import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        //deklarasi Judul / Title dalam bentuk String
        final String Title1 = "Perhitungan Grade Nilai Mahasiswa";
        final String Title2 = "-----------------------------------";
        final String Title3 = "Penilaian";

        Scanner myInput = new Scanner(System.in); // deklarasi myInput sebagai variable input dari user
        System.out.println(Title1);
        System.out.println(Title2);

        System.out.println("Masukkan NIM :");
        String myNIM = myInput.nextLine(); // memasukkan input NIM ke variable 'myNIM'
        System.out.println("Masukkan Nama :");
        String myName = myInput.nextLine(); // memasukkan input Nama ke variable 'myName'
        System.out.println("Masukkan Kelas :");
        String myClass = myInput.nextLine(); // memasukkan input Kelas ke variable 'myClass'

        System.out.println("\n" + Title3); // cetak Title3
        System.out.println(Title2); // cetak Title2

        double nilai; // deklarasi variable 'nilai' sebagai DOUBLE
        String textlulus; // deklarasi variable 'textlulus' Sebagai String

        double[] myScore = new double[4]; // deklarasi variable 'myScore' sebagai ARRAY bertipe DOUBLE
        System.out.println("Nilai Algoritma =");
        nilai = myInput .nextDouble(); // memasukkan input Nilai Algoritma ke variable 'nilai'
        myScore[0] = nilai; // memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 0

        System.out.println("Nilai sistem basis Data =");
        nilai = myInput.nextDouble();
        myScore[1] = nilai; // memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 1

        System.out.println("Nilai Aljabar Linear =");
        nilai = myInput.nextDouble();
        myScore[2] = nilai; // memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 2

        System.out.println("Nilai Math Diskrit =");
        nilai = myInput.nextDouble();
        myScore[3] = nilai; // memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 3

        System.out.println("\n Hasil Grade Penilaian");
        System.out.println(Title2);

        if(myScore[0] > 70) { // mengecek apakah isi dari ARRAY 'myScore' alamat index ke 0 lebih besar dari 70
            textlulus = "Lulus"; // Jika lebih besar dari 70 maka 'lulus'
        }else{
            textlulus = "Gagal"; // Jika tidak lebih dari 70 maka 'gagal'
        }
        System.out.println("Nilai Algoritma Anda = " + myScore[0] + " " + textlulus);


        if (myScore[1] > 70) { // mengecek apakah isi dari ARRAY 'myScore' alamat index ke 1 lebih besar dari 70
            textlulus = "Lulus";
        }else{
            textlulus = "Gagal";
        }
        System.out.println("Nilai Sistem Basis Data Anda = " + myScore[1] + " " + textlulus);


        if (myScore[2] > 70) { // mengecek apakah isi dari ARRAY 'myScore' alamat index ke 2 lebih besar dari 70
            textlulus = "Lulus";
        }else{
            textlulus = "Gagal";
        }
        System.out.println("Nilai Sistem Basis Data Anda = " + myScore[2] + " " + textlulus);


        if (myScore[3] > 70) { // mengecek apakah isi dari ARRAY 'myScore' alamat index ke 3 lebih besar dari 70
            textlulus = "Lulus";
        }else{
            textlulus = "Gagal";
        }
        System.out.println("Nilai Sistem Basis Data Anda = " + myScore[3] + " " + textlulus);

    }
}
