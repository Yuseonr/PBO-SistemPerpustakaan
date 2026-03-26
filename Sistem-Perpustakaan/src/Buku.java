// yang makei nterface buku


public class Buku extends ItemPerpustakaan{
    /******************** ATRIBUT ********************/
    private String isbn;
    private String penulis;
    private String kategori;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Buku() {}

    // Konstruktor untuk membuat Buku dengan parameter idItem, judul, tahunTerbit,lokasiRak, pengarang, penerbit, dan kategori
    public Buku(String idItem, String judul, int tahunTerbit, String lokasiRak, String isbn, String penulis,String kategori) {
        super(idItem, judul, tahunTerbit, lokasiRak);
        this.isbn = isbn;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    /* SETTER GETTER */

    // Mengembalikan ISBN
    public String getIsbn() {
        return isbn;
    }

    // Mengembalikan penulis
    public String getPenulis() {
        return penulis;
    }

    // Mengembalikan kategori
    public String getKategori() {
        return kategori;
    }

    // Setter untuk ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Setter untuk penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Setter untuk kategori
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Implementasi metode abstrak untuk menampilkan informasi buku
    @Override
    public void tampilkanInfoItem() {
        System.out.println("--- Data Buku ---");
        System.out.println("ID Item: " + this.getIdItem());
        System.out.println("Judul: " + this.getJudul());
        System.out.println("Penulis: " + this.getPenulis());
        System.out.println("Tahun Terbit: " + this.getTahunTerbit());
        System.out.println("Kategori: " + this.getKategori());
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Lokasi Rak: " + this.getLokasiRak());
        System.out.println("Status Tersedia: " + (this.getIsTersedia() ? "Ya" : "Tidak"));
    }

    // Implementasi pinjamItem untuk meminjam buku
    @Override
    public void pinjamItem() {
        if (this.getIsTersedia()) {
            this.setIsTersedia(false); // Set status tidak tersedia saat dipinjam
            System.out.println("Buku dengan ID " + this.getIdItem() + " berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku dengan ID " + this.getIdItem() + " sedang tidak tersedia untuk dipinjam.");
        }
    }

    // Implementasi  kembalikanItem untuk mengembalikan buku
    @Override
    public void kembalikanItem() {
        if (!this.getIsTersedia()) {
            this.setIsTersedia(true); // Set status tersedia saat dikembalikan
            System.out.println("Buku dengan ID " + this.getIdItem() + " berhasil dikembalikan.");
        } else {
            System.out.println("Buku dengan ID " + this.getIdItem() + " sudah tersedia di perpustakaan.");
        }
    }

}
