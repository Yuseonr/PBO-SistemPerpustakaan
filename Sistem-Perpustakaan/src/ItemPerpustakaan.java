// Catatan tambahan
// Counter untuk itemperpus?

// panah interface ke buku sama majalah aja jangan ke abstract class itemperpus, karena itemperpus itu cuma template, bukan item yang bisa dipinjam



public abstract class ItemPerpustakaan implements DapatDipinjam {
    /******************** ATRIBUT ********************/
    private String idItem;
    private String judul;
    private Integer tahunTerbit;
    private boolean isTersedia;
    private String lokasiRak;

    /******************** METHODE ********************/
    // Kosntruktor tanpa parameter 
    public ItemPerpustakaan() {
    }

    // Konstruktor untuk membuat ItemPerpustakaan dengan parameter idItem, judul, tahunTerbit, dan lokasiRak
    public ItemPerpustakaan(String idItem, String judul, Integer tahunTerbit, String lokasiRak) {
        this.idItem = idItem;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.isTersedia = true; // default item tersedia saat dibuat
        this.lokasiRak = lokasiRak;
    }

    // Methode abstrak untuk menampilkan informasi item perpustakaan
    public abstract void tampilkanInfoItem();

    /* SETTER GETTER */

    // Mengembalikan id item
    public String getIdItem() {
        return idItem;
    }

    // Mengembalikan judul
    public String getJudul() {
        return judul;
    }

    // Mengembalikan tahun terbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Mengembalikan status ketersediaan
    public boolean getIsTersedia() {
        return isTersedia;
    }

    // Mengembalikan lokasi rak
    public String getLokasiRak() {
        return lokasiRak;
    }

    // Setter untuk id item
    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    // Setter untuk judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Setter untuk tahun terbit
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // Setter untuk status ketersediaan
    public void setIsTersedia(boolean isTersedia) {
        this.isTersedia = isTersedia;
    }

    // Setter untuk lokasi rak
    public void setLokasiRak(String lokasiRak) {
        this.lokasiRak = lokasiRak;
    }
}
