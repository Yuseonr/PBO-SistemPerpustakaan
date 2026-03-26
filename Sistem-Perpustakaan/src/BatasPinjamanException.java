/*
Nama file    : BatasPinjamanException.java
Deskripsi    : Berisi custom exception jika anggota melebihi batas pinjaman
Pembuat      : 
Tanggal      : 26 Mar 2026
Last update  : 26 Mar 2026
*/

public class BatasPinjamanException extends Exception {
    /************** METHODE **************/
    // Konstruktor dengan parameter pesan
    public BatasPinjamanException(String pesan) {
        super(pesan);
    }
}