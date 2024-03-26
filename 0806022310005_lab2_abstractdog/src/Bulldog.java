public class Bulldog extends Dog {
    private boolean tubuhgempal;
    private boolean wajahkeriput;

    public Bulldog(String warna, String warnamata, String ukuran, char jeniskelamin, float berat, float tinggi, int paws, int jumkaki, int jummata, int jumtelinga, boolean tubuhgempal, boolean wajahkeriput) {
        super(warna, warnamata, ukuran, jeniskelamin, berat, tinggi, paws, jumkaki, jummata, jumtelinga);
        this.tubuhgempal = tubuhgempal;
        this.wajahkeriput = wajahkeriput;
    }

    public boolean istubuhgempal() {
        return tubuhgempal;
    }

    public boolean iswajahkeriput() {
        return wajahkeriput;
    }

    public void dispDetails() {
        System.out.println("-".repeat(30));
        System.out.println("**" + "Bulldog details" + "**");
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
        System.out.println("Tubuh gempal\t: " + istubuhgempal());
        System.out.println("Wajah keriput\t: " + iswajahkeriput());
        System.out.println("-".repeat(30));
        System.out.println("#".repeat(30));
        System.out.println("\n");
    }

}
