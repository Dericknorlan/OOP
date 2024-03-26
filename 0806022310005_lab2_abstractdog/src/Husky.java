public class Husky extends Dog {
    private boolean sukadingin;
    private boolean miripserigala;

    public Husky(String warna, String warnamata, String ukuran, char jeniskelamin, float berat, float tinggi, int paws, int jumkaki, int jummata, int jumtelinga, boolean sukadingin, boolean miripserigala) {
        super(warna, warnamata, ukuran, jeniskelamin, berat, tinggi, paws, jumkaki, jummata, jumtelinga);
        this.sukadingin = sukadingin;
        this.miripserigala = miripserigala;
    }

    public boolean issukadingin() {
        return sukadingin;
    }

    public boolean ismiripserigala() {
        return miripserigala;
    }

    public void dispDetails() {
        System.out.println("-".repeat(30));
        System.out.println("**" + "Husky details" + "**");
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
        System.out.println("Suka dingin\t: " + issukadingin());
        System.out.println("Mirip serigala\t: " + ismiripserigala());
        System.out.println("-".repeat(30));
        System.out.println("#".repeat(30));
        System.out.println("\n");
    }

}