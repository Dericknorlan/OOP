public abstract class Group {
    private String namaKetua;
    private int jumlahAnggota;
    private String judulProyek;
    private String namaGroup;

    public Group() {
    }

    public Group(String namaKetua, int jumlahAnggota, String judulProyek, String namaGroup) {
        this.namaKetua = namaKetua;
        this.jumlahAnggota = jumlahAnggota;
        this.judulProyek = judulProyek;
        this.namaGroup = namaGroup;
    }

    public String getNamaKetua() {
        return this.namaKetua;
    }

    public void setNamaKetua(String namaKetua) {
        this.namaKetua = namaKetua;
    }

    public int getJumlahAnggota() {
        return this.jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public String getJudulProyek() {
        return this.judulProyek;
    }

    public void setJudulProyek(String judulProyek) {
        this.judulProyek = judulProyek;
    }

    public String getNamaGroup() {
        return this.namaGroup;
    }

    public void setNamaGroup(String namaGroup) {
        this.namaGroup = namaGroup;
    }
}