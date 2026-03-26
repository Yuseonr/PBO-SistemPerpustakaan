// mungkin tambahkan counter pengguna?
// mungkin ganti tampilkanInfo ke tampilkan infoPengguna?


public abstract class Pengguna {
    /******************** ATRIBUT ********************/
    private String idPengguna;
    private String nama;
    private String noHP;

    /******************** METHODE ********************/
    // Konstruktor tanpa parameter
    public Pengguna() {}

    // Konstruktor untuk membuat Pengguna dengan parameter idPengguna, nama, dan noHP
    public Pengguna(String idPengguna, String nama, String noHP) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.noHP = noHP;
    }

    // Method abstrak untuk menampilkan informasi pengguna
    public abstract void tampilkanInfo();

    /* SETTER GETTER */

    // Mengembalikan id pengguna
    public String getIdPengguna() {
        return idPengguna;
    }

    // Mengembalikan nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan no hp
    public String getNoHp() {
        return noHP;
    }

    // Setter untuk id pengguna
    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk no hp
    public void setNoHp(String noHp) {
        this.noHP = noHp;
    }
}
