public class Dashund extends Dog {
    private boolean badanpanjang;
    private boolean mungil;

    public Dashund(String warna, String warnamata, String ukuran, char jeniskelamin, float berat, float tinggi, int paws, int jumkaki, int jummata, int jumtelinga, boolean badanpanjang, boolean mungil) {
        super(warna, warnamata, ukuran, jeniskelamin, berat, tinggi, paws, jumkaki, jummata, jumtelinga);
        this.badanpanjang = badanpanjang;
        this.mungil = mungil;
    }

    public boolean isbadanpanjang() {
        return badanpanjang;
    }

    public boolean ismungil() {
        return mungil;
    }

    public void dispDetails() {
        System.out.println("-".repeat(30));
        System.out.println("**" + "Dashund details" + "**");
        System.out.println("Warna\t\t: " + getWarna());
        System.out.println("Warnamata\t: " + getWarnamata());
        System.out.println("Ukuran\t\t: " + getUkuran());
        System.out.println("Jeniskelamin\t: " + getJeniskelamin());
        System.out.println("Berat\t\t: " + getBerat() + "kg");
        System.out.println("Tinggi\t\t: " + getTinggi() + "cm");
        System.out.println("Paws\t\t: " + getPaws());
        System.out.println("Jumkaki\t\t: " + getjumkaki());
        System.out.println("Jummata\t\t: " + getjummata());
        System.out.println("Jumtelinga\t: " + getjumtelinga());
        System.out.println("-".repeat(30));
        System.out.println("**" + "Ciri Spesifik" + "**");
        System.out.println("Body panjang\t: " + isbadanpanjang());
        System.out.println("Mungil\t\t: " + ismungil());
        System.out.println("-".repeat(30));
        System.out.println("#".repeat(30));
        System.out.println("\n");
    }

}