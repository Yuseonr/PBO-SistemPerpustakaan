

public class Anggota extends Pengguna {
    /******************** ATRIBUT ********************/
    private String nim;
    private boolean statusAktif;
    private int jumlahPinjaman;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Anggota() {}

    // Konstruktor untuk membuat Anggota dengan parameter idPengguna, nama, noHP, nim, statusAktif, dan jumlahPinjaman
    public Anggota(String idPengguna, String nama, String noHP, String nim, boolean statusAktif, int jumlahPinjaman) {
        super(idPengguna, nama, noHP);
        this.nim = nim;
        this.statusAktif = statusAktif;
        this.jumlahPinjaman = jumlahPinjaman;
    }

    /* SETTER GETTER */

    // Mengembalikan NIM
    public String getNim() {
        return nim;
    }

    // Mengembalikan status aktif
    public boolean getStatusAktif() {
        return statusAktif;
    }

    // Mengembalikan jumlah pinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Setter untuk NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Setter untuk status aktif
    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    // Setter untuk jumlah pinjaman
    public void setJumlahPinjaman(int jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    // Override method tampilkanInfo untuk menampilkan informasi anggota
    @Override
    public void tampilkanInfo() {
        System.out.println("--- Data Anggota ---");
        System.out.println("ID Pengguna: " + this.getIdPengguna());
        System.out.println("Nama: " + this.getNama());
        System.out.println("No HP: " + this.getNoHp());
        System.out.println("NIM: " + this.getNim());
        System.out.println("Status Aktif: " + (this.getStatusAktif() ? "Aktif" : "Tidak Aktif"));
        System.out.println("Jumlah Pinjaman: " + this.getJumlahPinjaman());
    }

}
