/*
Nama file    : Perpustakawan.java
Deskripsi    : Berisi Atribute dan Method dalam class Perpustakawan
Pembuat      : 

Shafa Aqilla Zahira NIM. 24060124140146
Shofwan Fikrul Huda NIM. 24060124130106
Syifa Aeni Mudrikah NIM. 24060124120043
Rafi Anandra Dharmawan NIM. 24060124130071

Tanggal      : 26 Maret 2025
Last update  : 31 Maret 2025
*/

import java.time.LocalTime;

public class Perpustakawan extends Pengguna {

    /******************** ATRIBUT ********************/
    private String nip;
    private LocalTime jadwalMulaiShif;
    private LocalTime jadwalSelesaiShif;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Perpustakawan() {
    }

    // Konstruktor untuk membuat Perpustakawan dengan parameter idPengguna, nama, noHP,email, umur, nip, jadwalMulaiShif, jadwalSelesaiShif
    public Perpustakawan(String idPengguna, String nama, String noHP, String email, int umur, String nip, LocalTime jadwalMulaiShif, LocalTime jadwalSelesaiShif) {
        super(idPengguna, nama, noHP, email, umur);
        this.nip = nip;
        this.jadwalMulaiShif = jadwalMulaiShif;
        this.jadwalSelesaiShif = jadwalSelesaiShif;
    }

    /* SETTER GETTER */

    // Mengembalikan NIP
    public String getNip() {
        return nip;
    }

    // Mengembalikan jadwal mulai shift
    public LocalTime getJadwalMulaiShif() {
        return jadwalMulaiShif;
    }

    // Mengembalikan jadwal selesai shift
    public LocalTime getJadwalSelesaiShif() {
        return jadwalSelesaiShif;
    }

    // Setter untuk NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Setter untuk jadwal mulai shift
    public void setJadwalMulaiShif(LocalTime jadwalMulaiShif) {
        this.jadwalMulaiShif = jadwalMulaiShif;
    }

    // Setter untuk jadwal selesai shift
    public void setJadwalSelesaiShif(LocalTime jadwalSelesaiShif) {
        this.jadwalSelesaiShif = jadwalSelesaiShif;
    }

    // Override method tampilkanInfoPengguna untuk menampilkan informasi perpustakawan
    @Override
    public void tampilkanInfoPengguna() {
        System.out.println("--- Data Perpustakawan ---");
        System.out.println("ID Pengguna: " + this.getIdPengguna());
        System.out.println("Nama: " + this.getNama());
        System.out.println("No HP: " + this.getNoHp());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Umur: " + this.getUmur());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Jadwal Mulai Shift: " + this.getJadwalMulaiShif());
        System.out.println("Jadwal Selesai Shift: " + this.getJadwalSelesaiShif());
    }
}
