/*
Nama file    : SistemPerpustakaan.java
Deskripsi    : Berisi Atribute dan Method dalam class SistemPerpustakaan
Pembuat      :

Shafa Aqilla Zahira NIM. 24060124140146
Shofwan Fikrul Huda NIM. 24060124130106
Syifa Aeni Mudrikah NIM. 24060124120043
Rafi Anandra Dharmawan NIM. 24060124130071

Tanggal      : 26 Maret 2025
Last update  : 31 Maret 2025
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemPerpustakaan {
    /************** ATRIBUT **************/
    private String namaPerpustakaan;
    private double dendaPerHari;
    private int batasPinjamanHari;
    private List<ItemPerpustakaan> koleksiItem;
    private List<TransaksiPinjaman> riwayatTransaksi;

    /************** METHODE **************/
    // Konstruktor dengan parameter namaPerpustakaan, dedaPerhari, dan batasPinjamanHari
    public SistemPerpustakaan(String namaPerpustakaan, double dendaPerHari, int batasPinjamanHari) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.dendaPerHari = dendaPerHari;
        this.batasPinjamanHari = batasPinjamanHari;
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

    // Methode untuk menampilkan info detail perpustakaan
    public void tampilkanInfoPerpustakaan() {
        System.out.println("Nama Perpustakaan: " + namaPerpustakaan);
        System.out.println("Denda per Hari: Rp " + dendaPerHari);
        System.out.println("Batas Pinjaman: " + batasPinjamanHari + " hari");
        System.out.println("Jumlah Koleksi Item: " + koleksiItem.size());
        System.out.println("Total Transaksi: " + riwayatTransaksi.size());

        // // Menampilkan daftar item (Mengurangi output agar tidak terlalu panjang)
        // System.out.println("Daftar Item:");
        // for (ItemPerpustakaan item : koleksiItem) {
        //     item.tampilkanInfoItem();
        //     System.out.println();
        // }

        // Menampilkan riwayat transaksi
        System.out.println("Riwayat Transaksi:");
        for (TransaksiPinjaman transaksi : riwayatTransaksi) {
            transaksi.tampilkanDetailTransaksi();
            System.out.println();
        }

        // Menampilkan anggota yang sedang meminjam
        System.out.println("Anggota yang Sedang Meminjam:");
        for (TransaksiPinjaman transaksi : riwayatTransaksi) {
            if (transaksi.getTanggalKembali() == null) {
                System.out.println("- " + transaksi.getPeminjam().getNama());   
            }
        }

    }

    // Methode untuk memproses peminjaman dan dapat melempar exception
    public void prosesPeminjaman(Anggota anggota, List<ItemPerpustakaan> daftarBukuDipinjam) throws BatasPinjamanException, ItemTidakTersediaException {
        
        // Validasi exception untuk batas pinjaman (maksimal 10 buku)
        if (anggota.getJumlahPinjaman() + daftarBukuDipinjam.size() > 10) { 
            throw new BatasPinjamanException("Gagal: Total pinjaman melebihi kuota (>10).\n Saat ini anggota memiliki " + anggota.getJumlahPinjaman() + " pinjaman, dan mencoba meminjam " + daftarBukuDipinjam.size() + " buku.");
        }

        // Validasi exception untuk item tidak tersedia
        for (ItemPerpustakaan item : daftarBukuDipinjam) {
            if (!item.getIsTersedia()) {
                throw new ItemTidakTersediaException("Item " + item.getJudul() + " sedang dipinjam/tidak tersedia.");
            }
        }

        // Jika semua validasi lolos, proses peminjaman
        for (ItemPerpustakaan item : daftarBukuDipinjam) {
            item.pinjamItem();
        }
        
        // Update jumlah pinjaman anggota
        anggota.setJumlahPinjaman(anggota.getJumlahPinjaman() + daftarBukuDipinjam.size());

        // Buat transaksi baru dan tambahkan ke riwayat transaksi
        List<ItemPerpustakaan> dipinjam = new ArrayList<>(daftarBukuDipinjam);
        String idPinjaman = "TXN - " + (riwayatTransaksi.size() + 1);
        LocalDate tglPinjam = LocalDate.now();
        TransaksiPinjaman transaksi = new TransaksiPinjaman(this.dendaPerHari, this.batasPinjamanHari, idPinjaman, tglPinjam, anggota, dipinjam);
        riwayatTransaksi.add(transaksi);
    }


    // Methode untuk memproses pengembalian dan menghitung denda jika terlambat
    public void prosesPengembalian(String idPinjaman) {
        TransaksiPinjaman transaksiDitemukan = null;

        for (TransaksiPinjaman transaksi : riwayatTransaksi) {
            if (transaksi.getIdPinjaman().equals(idPinjaman) && transaksi.getTanggalKembali() == null) {
                transaksiDitemukan = transaksi;
                break;
            }
        }

        // Jika transaksi tidak ada atau sudah dikembalikan
        if (transaksiDitemukan == null) {
            System.out.println("Gagal: Transaksi dengan ID " + idPinjaman + " tidak ditemukan atau sudah diselesaikan.");
            return;
        }

        // Update tanggal kembali pada transaksi
        transaksiDitemukan.setTanggalKembali(LocalDate.now());

        // hitung denda jika terlambat 
        double denda = transaksiDitemukan.hitungDenda();
        if (denda > 0) {
            System.out.println("Peringatan: Pengembalian terlambat! Denda yang harus dibayar: Rp " + denda);
        } else {
            System.out.println("Pengembalian tepat waktu. Tidak ada denda.");
        }

        // Proses pengembalian item
        for (ItemPerpustakaan item : transaksiDitemukan.getDaftarItem()) {
            item.kembalikanItem(); 
        }

        // Update jumlah pinjaman anggota
        Anggota peminjam = transaksiDitemukan.getPeminjam();
        int jumlahItemDikembalikan = transaksiDitemukan.getDaftarItem().size();
        peminjam.setJumlahPinjaman(peminjam.getJumlahPinjaman() - jumlahItemDikembalikan);

        System.out.println("Sukses: Pengembalian untuk transaksi " + idPinjaman + " berhasil diproses.");
    }

    /* GETTER SETTER */

    // Mengembalikan batas pinjaman dalam hari
    public int getBatasPinjamanHari() {
        return batasPinjamanHari;
    }

    // Mengembalikan nama perpustakaan
    public String getNamaPerpustakaan() {
        return namaPerpustakaan;
    }

    // Mengembalikan denda per hari
    public double getDendaPerHari() {
        return dendaPerHari;
    }

    // Mengembalikan koleksi item
    public List<ItemPerpustakaan> getKoleksiItem() {
        return koleksiItem;
    }

    // Mengembalikan riwayat transaksi
    public List<TransaksiPinjaman> getRiwayatTransaksi() {
        return riwayatTransaksi;
    }

    // Setter untuk batas pinjaman dalam hari
    public void setBatasPinjamanHari(int batasPinjamanHari) {
        this.batasPinjamanHari = batasPinjamanHari;
    }

    // Setter untuk nama perpustakaan
    public void setNamaPerpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
    }

    // Setter untuk denda per hari
    public void setDendaPerHari(double dendaPerHari) {
        this.dendaPerHari = dendaPerHari;
    }

    // Setter untuk koleksi item
    public void setKoleksiItem(List<ItemPerpustakaan> koleksiItem) {
        this.koleksiItem = koleksiItem;
    }

    // Setter untuk riwayat transaksi
    public void setRiwayatTransaksi(List<TransaksiPinjaman> riwayatTransaksi) {
        this.riwayatTransaksi = riwayatTransaksi;
    }
    
}