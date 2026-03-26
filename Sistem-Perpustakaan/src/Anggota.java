/*
Nama file    : Anggota.java
Deskripsi    : Berisi Atribute dan Method dalam class Anggota
Pembuat      : 
Tanggal      : 26 Maret 2025
Last update  : 26 Maret 2025
*/

public class Anggota extends Pengguna {
    /******************** ATRIBUT ********************/
    private String nim;
    private int jumlahPinjaman;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Anggota() {
    }

    // Konstruktor untuk membuat Anggota dengan parameter idPengguna, nama, noHP, email,umur, nim,, dan jumlahPinjaman
    public Anggota(String idPengguna, String nama, String noHP, String email, int umur, String nim, int jumlahPinjaman) {
        super(idPengguna, nama, noHP, email, umur);
        this.nim = nim;
        this.jumlahPinjaman = jumlahPinjaman;
    }

    /* SETTER GETTER */

    // Mengembalikan NIM
    public String getNim() {
        return nim;
    }

    // Mengembalikan jumlah pinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Setter untuk NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Setter untuk jumlah pinjaman
    public void setJumlahPinjaman(int jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    // Override method tampilkanInfoPengguna untuk menampilkan informasi anggota
    @Override
    public void tampilkanInfoPengguna() {
        System.out.println("--- Data Anggota ---");
        System.out.println("ID Pengguna: " + this.getIdPengguna());
        System.out.println("Nama: " + this.getNama());
        System.out.println("No HP: " + this.getNoHp());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Umur: " + this.getUmur());
        System.out.println("NIM: " + this.getNim());
        System.out.println("Jumlah Pinjaman: " + this.getJumlahPinjaman());
    }

}
