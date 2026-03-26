// perpustakawan tambah nip

public class Perpustakawan extends Pengguna {

    /******************** ATRIBUT ********************/
    private String nip;
    private String jadwalShif;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Perpustakawan() {}

    // Konstruktor untuk membuat Perpustakawan dengan parameter idPengguna, nama, noHP, nip, dan jadwalShif
    public Perpustakawan(String idPengguna, String nama, String noHP, String nip, String jadwalShif) {
        super(idPengguna, nama, noHP);
        this.nip = nip;
        this.jadwalShif = jadwalShif;
    }

    /* SETTER GETTER */

    // Mengembalikan NIP
    public String getNip() {
        return nip;
    }

    // Mengembalikan jadwal shift
    public String getJadwalShif() {
        return jadwalShif;
    }

    // Setter untuk NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Setter untuk jadwal shift
    public void setJadwalShif(String jadwalShif) {
        this.jadwalShif = jadwalShif;
    }

    // Override method tampilkanInfo untuk menampilkan informasi perpustakawan
    @Override
    public void tampilkanInfo() {
        System.out.println("--- Data Perpustakawan ---");
        System.out.println("ID Pengguna: " + this.getIdPengguna());
        System.out.println("Nama: " + this.getNama());
        System.out.println("No HP: " + this.getNoHp());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Jadwal Shift: " + this.getJadwalShif());
    }
}
