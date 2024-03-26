public abstract class Dog {
    private String warna;
    private String warnamata;
    private String ukuran;
    private char jeniskelamin;
    private float berat;
    private float tinggi;
    private int paws;
    private int jumkaki;
    private int jummata;
    private int jumtelinga;

    public Dog() {
    }

    public Dog(String warna, String warnamata, String ukuran, char jeniskelamin, float berat, float tinggi, int paws, int jumkaki, int jummata, int jumtelinga) {
        this.warna = warna;
        this.warnamata = warnamata;
        this.ukuran = ukuran;
        this.jeniskelamin = jeniskelamin;
        this.berat = berat;
        this.tinggi = tinggi;
        this.berat = berat;
        this.paws = paws;
        this.jumkaki = jumkaki;
        this.jummata = jummata;
        this.jumtelinga = jumtelinga;
    }

    public void bark() {
        System.out.println("Bark\t\t: " + "woof woof");
    }

    public void run(int speed) {
        System.out.println("Running in\t: " + speed + " m/s");
    }

    public void walk(int speed) {
        System.out.println("Walking in\t: " + speed + " m/s");
    }

    public void jump(float height) {
        System.out.println("Jumping for\t: " + height + " m");
    }

    public void sleep(float time) {
        System.out.println("Sleeping for\t: " + time + " hours");
    }

    public void eat(float weight) {
        System.out.println("Eating\t\t: " + weight + " kg");
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarnamata() {
        return this.warnamata;
    }

    public void setWarnamata(String warnamata) {
        this.warnamata = warnamata;
    }

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public char getJeniskelamin() {
        return this.jeniskelamin;
    }

    public void setJeniskelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public float getBerat() {
        return this.berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public float getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public int getPaws() {
        return this.paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getjumkaki() {
        return this.jumkaki;
    }

    public void setjumkaki(int jumkaki) {
        this.jumkaki = jumkaki;
    }

    public int getjummata() {
        return this.jummata;
    }

    public void setjummata(int jummata) {
        this.jummata = jummata;
    }

    public int getjumtelinga() {
        return this.jumtelinga;
    }

    public void setjumtelinga(int jumtelinga) {
        this.jumtelinga = jumtelinga;
    }

}