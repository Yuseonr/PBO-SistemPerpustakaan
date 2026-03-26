/*
Nama file    : ItemTidakTersediaException.java
Deskripsi    : Berisi custom exception jika barang yang dipinjam tidak tersedia
Pembuat      : 
Tanggal      : 26 Mar 2026
Last update  : 26 Mar 2026
*/

public class ItemTidakTersediaException extends Exception {
    /************** METHODE **************/
    // Konstruktor dengan parameter pesan
    public ItemTidakTersediaException(String pesan) {
        super(pesan);
    }
}