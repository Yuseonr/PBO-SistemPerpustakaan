import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SistemPerpustakaan {
    /************** ATRIBUT **************/
    private String namaPerpustakaan;
    private double dendaPerHari;
    private List<ItemPerpustakaan> koleksiItem;
    private List<TransaksiPinjaman> riwayatTransaksi;

    /************** METHODE **************/
    // Konstruktor dengan parameter
    public SistemPerpustakaan(String namaPerpustakaan, double dendaPerHari) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.dendaPerHari = dendaPerHari;
        this.koleksiItem = new ArrayList<>();
        this.riwayatTransaksi = new ArrayList<>();
    }

    // Menambahkan item dengan implementasi assertion
    public void tambahItem(ItemPerpustakaan item) {
        assert item != null : "Item yang ditambahkan tidak boleh null!";
        assert item.getJudul() != null && !item.getJudul().isEmpty() : "Judul item tidak boleh kosong!";
        koleksiItem.add(item);
    }

    // Mencari item berdasarkan judul
    public ItemPerpustakaan cariItem(String judul) {
        for (ItemPerpustakaan item : koleksiItem) {
            if (item.getJudul().equalsIgnoreCase(judul)) {
                return item;
            }
        }
        return null;
    }

    // Mencari item berdasarkan judul dan penulis (Khusus Buku)
    public ItemPerpustakaan cariItem(String judul, String penulis) {
        for (ItemPerpustakaan item : koleksiItem) {
            if (item instanceof Buku) {
                Buku buku = (Buku) item;
                if (buku.getJudul().equalsIgnoreCase(judul) && buku.getPenulis().equalsIgnoreCase(penulis)) {
                    return buku;
                }
            }
        }
        return null;
    }

    // Memproses peminjaman dan dapat melempar exception
    public void prosesPeminjaman(Anggota anggota, ItemPerpustakaan item) /*throws BatasPinjamanException, ItemTidakTersediaException*/ {
        // if (!anggota.getStatusAktif()) {
        //     throw new BatasPinjamanException("Anggota tidak aktif.");
        // }
        
        // if (anggota.getJumlahPinjaman() >= 3) { // Asumsi batas maksimal 3
        //     throw new BatasPinjamanException("Batas maksimal peminjaman telah tercapai.");
        // }

        // if (!item.getIsTersedia()) {
        //     throw new ItemTidakTersediaException("Item " + item.getJudul() + " sedang dipinjam/tidak tersedia.");
        // }

        item.pinjamItem();
        anggota.setJumlahPinjaman(anggota.getJumlahPinjaman() + 1);

        List<ItemPerpustakaan> dipinjam = new ArrayList<>();
        dipinjam.add(item);

        String idPinjaman = UUID.randomUUID().toString();
        LocalDate tglPinjam = LocalDate.now();
        LocalDate tglKembali = tglPinjam.plusDays(7); // Asumsi masa pinjam 7 hari

        TransaksiPinjaman transaksi = new TransaksiPinjaman(idPinjaman, tglPinjam, tglKembali, anggota, dipinjam);
        riwayatTransaksi.add(transaksi);
    }
}