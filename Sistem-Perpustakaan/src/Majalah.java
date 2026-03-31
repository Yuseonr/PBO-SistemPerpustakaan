/*
Nama file    : Majalah.java
Deskripsi    : Berisi Atribute dan Method dalam class Majalah
Pembuat      : 

Shafa Aqilla Zahira NIM. 24060124140146
Shofwan Fikrul Huda NIM. 24060124130106
Syifa Aeni Mudrikah NIM. 24060124120043
Rafi Anandra Dharmawan NIM. 24060124130071

Tanggal      : 26 Maret 2025
Last update  : 31 Maret 2025
*/

public class Majalah extends ItemPerpustakaan{
    /************** ATRIBUT **************/
    private int nomorEdisi;

    /************** METHODE **************/
    // Konstruktor tanpa parameter
    public Majalah() {
    }

    // Konstruktor dengan parameter idItem, judul, tahunTerbit, lokasiRak, dan nomorEdisi
    public Majalah(String idItem, String judul, int tahunTerbit, String lokasiRak, int nomorEdisi) {
        super(idItem, judul, tahunTerbit, lokasiRak);
        this.nomorEdisi = nomorEdisi;
    }

    /* SETTER GETTER */
    
    // Mengembalikan nomor edisi
    public int getNomorEdisi() {
        return nomorEdisi;
    }

    // Setter untuk nomor edisi
    public void setNomorEdisi(int nomorEdisi) {
        this.nomorEdisi = nomorEdisi;
    }

    // Override method tampilkanInfoItem
    @Override
    public void tampilkanInfoItem() {
        System.out.println("--- Data Majalah ---");
        System.out.println("ID Item: " + this.getIdItem());
        System.out.println("Judul: " + this.getJudul());
        System.out.println("Edisi: " + this.getNomorEdisi());
        System.out.println("Tahun Terbit: " + this.getTahunTerbit());
        System.out.println("Lokasi Rak: " + this.getLokasiRak());
        System.out.println("Status Tersedia: " + (this.getIsTersedia() ? "Ya" : "Tidak"));
    }

    // Implementasi pinjamItem untuk meminjam majalah
    @Override
    public void pinjamItem() {
        if (this.getIsTersedia()) {
            this.setIsTersedia(false);
            System.out.println("Majalah dengan judul '" + this.getJudul() + "' (ID: " + this.getIdItem() + ") berhasildipinjam.");
        } else {
            System.out.println("Maaf, majalah dengan judul '" + this.getJudul() + "' (ID: " + this.getIdItem() + ") tidak tersedia untuk dipinjam.");
        }
    }

    // Implementasi kembalikanItem untuk mengembalikan majalah
    @Override
    public void kembalikanItem() {
        if (!this.getIsTersedia()) {
            this.setIsTersedia(true);
            System.out.println("Majalah dengan judul '" + this.getJudul() + "' (ID: " + this.getIdItem() + ") berhasil dikembalikan.");
        } else {
            System.out.println("Majalah dengan judul '" + this.getJudul() + "' (ID: " + this.getIdItem() + ") sudah tersedia di perpustakaan.");
        }   
    }
}