public class Doberman extends Dog {
    private boolean melacak;
    private boolean bulumengkilap;

    public Doberman(String warna, String warnamata, String ukuran, char jeniskelamin, float berat, float tinggi, int paws, int jumkaki, int jummata, int jumtelinga, boolean melacak, boolean bulumengkilap) {
        super(warna, warnamata, ukuran, jeniskelamin, berat, tinggi, paws, jumkaki, jummata, jumtelinga);
        this.melacak = melacak;
        this.bulumengkilap = bulumengkilap;
    }

    public boolean ismelacak() {
        return melacak;
    }

    public boolean isbulumengkilap() {
        return bulumengkilap;
    }

    public void dispDetails() {
        System.out.println("-".repeat(30));
        System.out.println("**" + "Doberman details" + "**");
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
        System.out.println("Bisa melacak\t: " + ismelacak());
        System.out.println("Bulu mengkilap\t: " + isbulumengkilap());
        System.out.println("-".repeat(30));
        System.out.println("#".repeat(30));
        System.out.println("\n");
    }

}