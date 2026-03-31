/*
Nama file    : ItemTidakTersediaException.java
Deskripsi    : Berisi custom exception jika barang yang dipinjam tidak tersedia
Pembuat      : 

Shafa Aqilla Zahira NIM. 24060124140146
Shofwan Fikrul Huda NIM. 24060124130106
Syifa Aeni Mudrikah NIM. 24060124120043
Rafi Anandra Dharmawan NIM. 24060124130071

Tanggal      : 26 Mar 2026
Last update  : 31 Mar 2026
*/

public class ItemTidakTersediaException extends Exception {
    /************** METHODE **************/
    // Konstruktor dengan parameter pesan
    public ItemTidakTersediaException(String pesan) {
        super(pesan);
    }
}