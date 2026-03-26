/*
Nama file    : TransaksiPinjaman.java
Deskripsi    : Berisi Atribute dan Method dalam class TransaksiPinjaman
Pembuat      : 
Tanggal      : 26 Maret 2025
Last update  : 26 Maret 2025
*/

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
    private double dendaPerHari;
    private int batasPinjamanHari;

    /******************** METHODE ********************/
    // Konstruktor dengan parameter sistem, idPinjaman, tanggalPinjam, peminjam, dan daftarItem yang dipinjam
    public TransaksiPinjaman(SistemPerpustakaan sistem, String idPinjaman, LocalDate tanggalPinjam, Anggota peminjam, List<ItemPerpustakaan> daftarItem) {
        this.idPinjaman = idPinjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = null; 
        this.peminjam = peminjam;
        this.daftarItem = daftarItem;
        this.dendaPerHari = sistem.getDendaPerHari();
        this.batasPinjamanHari = sistem.getBatasPinjamanHari();
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

    // Mengembalikan denda per hari
    public double getDendaPerHari() {
        return dendaPerHari;
    }

    // Mengembalikan batas pinjaman dalam hari
    public int getBatasPinjamanHari() {
        return batasPinjamanHari;
    }

    // Setter untuk tanggal kembali
    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    // Method untuk menghitung denda jika telat dari tanggal kembali
    public double hitungDenda() {
        LocalDate tanggalHitung = (this.tanggalKembali != null) ? this.tanggalKembali : LocalDate.now();
        LocalDate tanggalDeadline = tanggalPinjam.plusDays(batasPinjamanHari);
        if (tanggalHitung.isAfter(tanggalDeadline)) {
            long hariTerlambat = ChronoUnit.DAYS.between(tanggalDeadline, tanggalHitung);
            return hariTerlambat * dendaPerHari * daftarItem.size();
        }
        return 0;
    }

    // Methode untuk menampilkan detail transaksi
    public void tampilkanDetailTransaksi() {
        System.out.println("ID Pinjaman: " + idPinjaman);
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + (tanggalKembali != null ? tanggalKembali : "Belum dikembalikan"));
        System.out.println("Peminjam: " + peminjam.getNama());
        System.out.println("Daftar Item:");
        for (ItemPerpustakaan item : daftarItem) {
            System.out.println("- " + item.getJudul());
        }
    }
}