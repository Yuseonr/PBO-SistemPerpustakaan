/*
Nama file    : Pengguna.java
Deskripsi    : Berisi Atribute dan Method dalam abstract class Pengguna
Pembuat      : 
Tanggal      : 26 Maret 2025
Last update  : 26 Maret 2025
*/

public abstract class Pengguna {
    /******************** ATRIBUT ********************/
    private String idPengguna;
    private String nama;
    private String noHP;
    private String email;
    private int umur;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Pengguna() {
    }

    // Konstruktor untuk membuat Pengguna dengan parameter idPengguna, nama, noHP, email, dan umur
    public Pengguna(String idPengguna, String nama, String noHP, String email, int umur) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.noHP = noHP;
        this.email = email;
        this.umur = umur;
    }

    // Method abstrak untuk menampilkan informasi pengguna
    public abstract void tampilkanInfoPengguna();

    /* SETTER GETTER */

    // Mengembalikan umur
    public int getUmur() {
        return umur;
    }

    // Mengembalikan id pengguna
    public String getIdPengguna() {
        return idPengguna;
    }

    // Mengembalikan nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan email
    public String getEmail() {
        return email;
    }

    // Mengembalikan no hp
    public String getNoHp() {
        return noHP;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Setter untuk id pengguna
    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk no hp
    public void setNoHp(String noHp) {
        this.noHP = noHp;
    }

    // Setter untuk email
    public void setEmail(String email) {
        this.email = email;
    }
}
