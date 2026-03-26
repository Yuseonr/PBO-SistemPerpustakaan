import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class TransaksiPinjaman {
    /******************** ATRIBUT ********************/
    private String idPinjaman;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private Anggota peminjam;
    private List<ItemPerpustakaan> daftarItem;

    /******************** METHODE ********************/
    // Konstruktor dengan parameter idPinjaman, tanggalPinjam, tanggalKembali, peminjam, dan daftarItem
    public TransaksiPinjaman(String idPinjaman, LocalDate tanggalPinjam, LocalDate tanggalKembali, Anggota peminjam, List<ItemPerpustakaan> daftarItem) {
        this.idPinjaman = idPinjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.peminjam = peminjam;
        this.daftarItem = daftarItem;
    }

    /*  GETTER */

    // Mengembalikan id pinjaman
    public String getIdPinjaman() {
        return idPinjaman;
    }

    // Mengembalikan tanggal pinjam
    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    // Mengembalikan tanggal kembali (tenggat waktu)
    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    // Mengembalikan peminjam
    public Anggota getPeminjam() {
        return peminjam;
    }
    
    // Mengembalikan daftar item
    public List<ItemPerpustakaan> getDaftarItem() {
        return daftarItem;
    }

    // Method untuk menghitung denda jika telat dari tanggal kembali
    public double hitungDenda(double dendaPerHari) {
        LocalDate tanggalAktual = LocalDate.now();
        if (tanggalAktual.isAfter(tanggalKembali)) {
            long hariTerlambat = ChronoUnit.DAYS.between(tanggalKembali, tanggalAktual);
            // Mengalikan jumlah hari terlambat dengan denda per hari dan jumlah item
            return hariTerlambat * dendaPerHari * daftarItem.size();
        }
        return 0;
    }
}