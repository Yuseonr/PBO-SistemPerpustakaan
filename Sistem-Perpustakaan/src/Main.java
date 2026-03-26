import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SistemPerpustakaan sistem = new SistemPerpustakaan("Perpustakaan Universitas Diponegoro", 5000.0, 7);

        Perpustakawan pustakawan1 = new Perpustakawan(
            "P001", "Budi Santoso", "081234567890", "budi.santoso@undip.ac.id", 45,
            "NIP-2001045001", LocalTime.of(8, 0), LocalTime.of(16, 0)
        );

        Anggota anggota1 = new Anggota("A001", "Andi Prasetyo", "082111222333", "andi.prasetyo@students.undip.ac.id", 20, "24010120130001", 0);
        Anggota anggota2 = new Anggota("A002", "Sari Dewi", "082444555666", "sari.dewi@students.undip.ac.id", 21, "24010120130002", 0);
        Anggota anggota3 = new Anggota("A003", "Rizky Firmansyah", "082777888999", "rizky.firmansyah@students.undip.ac.id", 22, "24010120130003", 0);

        System.out.println("========================================");
        System.out.println("          DATA PENGGUNA SISTEM          ");
        System.out.println("========================================");
        pustakawan1.tampilkanInfoPengguna();
        System.out.println();
        anggota1.tampilkanInfoPengguna();
        System.out.println();
        anggota2.tampilkanInfoPengguna();
        System.out.println();
        anggota3.tampilkanInfoPengguna();
        System.out.println();

        Buku buku1  = new Buku("B001", "Pemrograman Java Dasar", 2020, "Rak-A1", "978-602-01-0001-1", "Tri Djoko Waluyo", "Teknologi");
        Buku buku2  = new Buku("B002", "Struktur Data dan Algoritma", 2019, "Rak-A2", "978-602-01-0002-2", "Rinaldi Munir", "Teknologi");
        Buku buku3  = new Buku("B003", "Basis Data Relasional", 2021, "Rak-A3", "978-602-01-0003-3", "Fathul Wahid", "Teknologi");
        Buku buku4  = new Buku("B004", "Kecerdasan Buatan", 2022, "Rak-A4", "978-602-01-0004-4", "Agus Naba", "Teknologi");
        Buku buku5  = new Buku("B005", "Jaringan Komputer", 2020, "Rak-A5", "978-602-01-0005-5", "Forouzan", "Teknologi");
        Buku buku6  = new Buku("B006", "Pemrograman Berorientasi Objek", 2021, "Rak-B1", "978-602-01-0006-6", "Deitel & Deitel", "Teknologi");
        Buku buku7  = new Buku("B007", "Kalkulus Diferensial", 2018, "Rak-B2", "978-602-01-0007-7", "James Stewart", "Matematika");
        Buku buku8  = new Buku("B008", "Aljabar Linear", 2019, "Rak-B3", "978-602-01-0008-8", "Howard Anton", "Matematika");
        Buku buku9  = new Buku("B009", "Statistika Dasar", 2020, "Rak-B4", "978-602-01-0009-9", "Sudjana", "Matematika");
        Buku buku10 = new Buku("B010", "Fisika Universitas", 2017, "Rak-B5", "978-602-01-0010-0", "Young & Freedman", "Sains");
        Buku buku11 = new Buku("B011", "Kimia Dasar", 2018, "Rak-C1", "978-602-01-0011-1", "Raymond Chang", "Sains");
        Buku buku12 = new Buku("B012", "Biologi Molekular", 2021, "Rak-C2", "978-602-01-0012-2", "Alberts et al.", "Sains");
        Buku buku13 = new Buku("B013", "Pengantar Ekonomi Mikro", 2019, "Rak-C3", "978-602-01-0013-3", "Mankiw", "Ekonomi");
        Buku buku14 = new Buku("B014", "Manajemen Keuangan", 2020, "Rak-C4", "978-602-01-0014-4", "Brigham & Houston", "Ekonomi");
        Buku buku15 = new Buku("B015", "Hukum Perdata Indonesia", 2018, "Rak-D1", "978-602-01-0015-5", "Subekti", "Hukum");
        Buku buku16 = new Buku("B016", "Filsafat Ilmu", 2016, "Rak-D2", "978-602-01-0016-6", "Jujun Suriasumantri", "Filsafat");
        Buku buku17 = new Buku("B017", "Psikologi Kepribadian", 2019, "Rak-D3", "978-602-01-0017-7", "Schultz", "Psikologi");
        Buku buku18 = new Buku("B018", "Sosiologi Umum", 2017, "Rak-D4", "978-602-01-0018-8", "Soerjono Soekanto", "Sosiologi");
        Buku buku19 = new Buku("B019", "Sejarah Peradaban Islam", 2020, "Rak-E1", "978-602-01-0019-9", "Philip Hitti", "Sejarah");
        Buku buku20 = new Buku("B020", "Pancasila dan Kewarganegaraan", 2021, "Rak-E2", "978-602-01-0020-0", "Kaelan", "Pendidikan");

        Majalah majalah1  = new Majalah("M001", "Tempo",            2024, "Rak-F1",  101);
        Majalah majalah2  = new Majalah("M002", "Kompas Minggu",    2024, "Rak-F1",  202);
        Majalah majalah3  = new Majalah("M003", "National Geographic Indonesia", 2024, "Rak-F2", 303);
        Majalah majalah4  = new Majalah("M004", "Intisari",         2024, "Rak-F2",  404);
        Majalah majalah5  = new Majalah("M005", "Forbes Indonesia", 2024, "Rak-F3",  505);
        Majalah majalah6  = new Majalah("M006", "Gatra",            2024, "Rak-F3",  606);
        Majalah majalah7  = new Majalah("M007", "Info Komputer",    2024, "Rak-G1",  707);
        Majalah majalah8  = new Majalah("M008", "PC Media",         2024, "Rak-G1",  808);
        Majalah majalah9  = new Majalah("M009", "Sains Indonesia",  2024, "Rak-G2",  909);
        Majalah majalah10 = new Majalah("M010", "Matematika Plus",  2024, "Rak-G2", 1010);
        Majalah majalah11 = new Majalah("M011", "Femina",           2024, "Rak-H1",  111);
        Majalah majalah12 = new Majalah("M012", "Cosmopolitan ID",  2024, "Rak-H1",  222);
        Majalah majalah13 = new Majalah("M013", "Motor Plus",       2024, "Rak-H2",  333);
        Majalah majalah14 = new Majalah("M014", "Auto Bild",        2024, "Rak-H2",  444);
        Majalah majalah15 = new Majalah("M015", "Bobo",             2024, "Rak-I1",  555);
        Majalah majalah16 = new Majalah("M016", "Kawanku",          2024, "Rak-I1",  666);
        Majalah majalah17 = new Majalah("M017", "HAI",              2024, "Rak-I2",  777);
        Majalah majalah18 = new Majalah("M018", "Trubus",           2024, "Rak-I2",  888);
        Majalah majalah19 = new Majalah("M019", "Kesehatan",        2024, "Rak-J1",  999);
        Majalah majalah20 = new Majalah("M020", "Media Indonesia",  2024, "Rak-J1", 1111);

        sistem.tambahItem(buku1);  sistem.tambahItem(buku2);  sistem.tambahItem(buku3);
        sistem.tambahItem(buku4);  sistem.tambahItem(buku5);  sistem.tambahItem(buku6);
        sistem.tambahItem(buku7);  sistem.tambahItem(buku8);  sistem.tambahItem(buku9);
        sistem.tambahItem(buku10); sistem.tambahItem(buku11); sistem.tambahItem(buku12);
        sistem.tambahItem(buku13); sistem.tambahItem(buku14); sistem.tambahItem(buku15);
        sistem.tambahItem(buku16); sistem.tambahItem(buku17); sistem.tambahItem(buku18);
        sistem.tambahItem(buku19); sistem.tambahItem(buku20);

        sistem.tambahItem(majalah1);  sistem.tambahItem(majalah2);  sistem.tambahItem(majalah3);
        sistem.tambahItem(majalah4);  sistem.tambahItem(majalah5);  sistem.tambahItem(majalah6);
        sistem.tambahItem(majalah7);  sistem.tambahItem(majalah8);  sistem.tambahItem(majalah9);
        sistem.tambahItem(majalah10); sistem.tambahItem(majalah11); sistem.tambahItem(majalah12);
        sistem.tambahItem(majalah13); sistem.tambahItem(majalah14); sistem.tambahItem(majalah15);
        sistem.tambahItem(majalah16); sistem.tambahItem(majalah17); sistem.tambahItem(majalah18);
        sistem.tambahItem(majalah19); sistem.tambahItem(majalah20);

        System.out.println("========================================");
        System.out.println("     TRANSAKSI 1 - PEMINJAMAN ANDI      ");
        System.out.println("========================================");
        List<ItemPerpustakaan> pinjamanAndi1 = new ArrayList<>();
        pinjamanAndi1.add(buku1);
        pinjamanAndi1.add(buku2);
        pinjamanAndi1.add(majalah1);
        pinjamanAndi1.add(majalah2);
        try {
            sistem.prosesPeminjaman(anggota1, pinjamanAndi1);
            System.out.println("Transaksi 1 berhasil: Andi meminjam " + pinjamanAndi1.size() + " item.");
        } catch (BatasPinjamanException | ItemTidakTersediaException e) {
            System.out.println("Transaksi 1 gagal: " + e.getMessage());
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("     TRANSAKSI 2 - PEMINJAMAN SARI      ");
        System.out.println("========================================");
        List<ItemPerpustakaan> pinjamanSari1 = new ArrayList<>();
        pinjamanSari1.add(buku3);
        pinjamanSari1.add(buku4);
        pinjamanSari1.add(buku5);
        pinjamanSari1.add(majalah3);
        pinjamanSari1.add(majalah4);
        pinjamanSari1.add(majalah5);
        try {
            sistem.prosesPeminjaman(anggota2, pinjamanSari1);
            System.out.println("Transaksi 2 berhasil: Sari meminjam " + pinjamanSari1.size() + " item.");
        } catch (BatasPinjamanException | ItemTidakTersediaException e) {
            System.out.println("Transaksi 2 gagal: " + e.getMessage());
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("     TRANSAKSI 3 - PEMINJAMAN RIZKY     ");
        System.out.println("========================================");
        List<ItemPerpustakaan> pinjamanRizky1 = new ArrayList<>();
        pinjamanRizky1.add(buku6);
        pinjamanRizky1.add(buku7);
        pinjamanRizky1.add(buku8);
        pinjamanRizky1.add(majalah6);
        pinjamanRizky1.add(majalah7);
        try {
            sistem.prosesPeminjaman(anggota3, pinjamanRizky1);
            System.out.println("Transaksi 3 berhasil: Rizky meminjam " + pinjamanRizky1.size() + " item.");
        } catch (BatasPinjamanException | ItemTidakTersediaException e) {
            System.out.println("Transaksi 3 gagal: " + e.getMessage());
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println(" TRANSAKSI 4 - EXCEPTION ITEM TIDAK    ");
        System.out.println("          TERSEDIA (BUKU1 & BUKU2)      ");
        System.out.println("========================================");
        List<ItemPerpustakaan> pinjamanAndi2 = new ArrayList<>();
        pinjamanAndi2.add(buku1);
        pinjamanAndi2.add(buku9);
        try {
            sistem.prosesPeminjaman(anggota2, pinjamanAndi2);
            System.out.println("Transaksi 4 berhasil.");
        } catch (ItemTidakTersediaException e) {
            System.out.println("[ItemTidakTersediaException] " + e.getMessage());
        } catch (BatasPinjamanException e) {
            System.out.println("[BatasPinjamanException] " + e.getMessage());
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println(" TRANSAKSI 5 - EXCEPTION BATAS PINJAMAN");
        System.out.println("     (ANGGOTA MELEBIHI 10 ITEM)         ");
        System.out.println("========================================");
        List<ItemPerpustakaan> pinjamanRizky2 = new ArrayList<>();
        pinjamanRizky2.add(buku9);
        pinjamanRizky2.add(buku10);
        pinjamanRizky2.add(buku11);
        pinjamanRizky2.add(buku12);
        pinjamanRizky2.add(buku13);
        pinjamanRizky2.add(buku14);
        pinjamanRizky2.add(majalah8);
        try {
            sistem.prosesPeminjaman(anggota3, pinjamanRizky2);
            System.out.println("Transaksi 5 berhasil.");
        } catch (BatasPinjamanException e) {
            System.out.println("[BatasPinjamanException] " + e.getMessage());
        } catch (ItemTidakTersediaException e) {
            System.out.println("[ItemTidakTersediaException] " + e.getMessage());
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("       FITUR PENCARIAN ITEM             ");
        System.out.println("========================================");
        System.out.println(">> Mencari berdasarkan judul: 'Kalkulus Diferensial'");
        ItemPerpustakaan hasilCari1 = sistem.cariItem("Kalkulus Diferensial");
        if (hasilCari1 != null) {
            hasilCari1.tampilkanInfoItem();
        } else {
            System.out.println("Item tidak ditemukan.");
        }
        System.out.println();

        System.out.println(">> Mencari berdasarkan judul dan penulis: 'Aljabar Linear' oleh 'Howard Anton'");
        ItemPerpustakaan hasilCari2 = sistem.cariItem("Aljabar Linear", "Howard Anton");
        if (hasilCari2 != null) {
            hasilCari2.tampilkanInfoItem();
        } else {
            System.out.println("Item tidak ditemukan.");
        }
        System.out.println();

        System.out.println(">> Mencari item yang tidak ada: 'Buku Hantu'");
        ItemPerpustakaan hasilCari3 = sistem.cariItem("Buku Hantu");
        if (hasilCari3 != null) {
            hasilCari3.tampilkanInfoItem();
        } else {
            System.out.println("Item dengan judul 'Buku Hantu' tidak ditemukan di koleksi.");
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("     PROSES PENGEMBALIAN TRANSAKSI 1    ");
        System.out.println("     (Andi mengembalikan TXN - 1)       ");
        System.out.println("========================================");
        sistem.prosesPengembalian("TXN - 1");
        System.out.println();

        System.out.println("========================================");
        System.out.println("     PROSES PENGEMBALIAN TRANSAKSI 2    ");
        System.out.println("     (Sari mengembalikan TXN - 2)       ");
        System.out.println("========================================");
        sistem.prosesPengembalian("TXN - 2");
        System.out.println();

        System.out.println("========================================");
        System.out.println("  PENGEMBALIAN ID TIDAK VALID / SUDAH   ");
        System.out.println("         DISELESAIKAN (TXN - 99)        ");
        System.out.println("========================================");
        sistem.prosesPengembalian("TXN - 99");
        System.out.println();

        System.out.println("========================================");
        System.out.println("     ASSERTION - TAMBAH ITEM NULL       ");
        System.out.println("========================================");
        try {
            sistem.tambahItem(null);
        } catch (AssertionError ae) {
            System.out.println("[AssertionError ditangkap] " + ae.getMessage());
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("  INFO LENGKAP SISTEM PERPUSTAKAAN      ");
        System.out.println("========================================");
        sistem.tampilkanInfoPerpustakaan();
    }
}