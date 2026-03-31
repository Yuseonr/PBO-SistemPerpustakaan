/*
Nama file    : BatasPinjamanException.java
Deskripsi    : Berisi custom exception jika anggota melebihi batas pinjaman
Pembuat      : 

Shafa Aqilla Zahira NIM. 24060124140146
Shofwan Fikrul Huda NIM. 24060124130106
Syifa Aeni Mudrikah NIM. 24060124120043
Rafi Anandra Dharmawan NIM. 24060124130071

Tanggal      : 26 Mar 2026
Last update  : 31 Mar 2026
*/

public class BatasPinjamanException extends Exception {
    /************** METHODE **************/
    // Konstruktor dengan parameter pesan
    public BatasPinjamanException(String pesan) {
        super(pesan);
    }
}