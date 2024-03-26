public class Group3 extends Group {
    public Group3() {
    }

    public Group3(String namaKetua, int jumlahAnggota, String judulProyek, String namaGroup) {
        super(namaKetua, jumlahAnggota, judulProyek, namaGroup);
    }

    public void displayDetails() {
        System.out.println("Nama Ketua: " + getNamaKetua());
        System.out.println("Jumlah Anggota: " + getJumlahAnggota());
        System.out.println("Judul Proyek: " + getJudulProyek());
        System.out.println("Nama Group: " + getNamaGroup());
    }

    public void displayDetails(String namaVariabel) {
        switch (namaVariabel) {
            case "namaKetua":
                System.out.println("Nama Ketua: " + getNamaKetua());
            case "jumlahAnggota":
                System.out.println("Jumlah Anggota: " + getJumlahAnggota());
            case "judulProyek":
                System.out.println("Judul Proyek: " + getJudulProyek());
            case "namaGroup":
                System.out.println("Nama Group: " + getNamaGroup());
        }
    }
}
