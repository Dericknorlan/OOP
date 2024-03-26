public class Petshop {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Herder herder = new Herder("hitam coklat", "coklat", "besar", 'L', 50, 60, 4, 4, 2, 2, true, true);
        System.out.println("-".repeat(30));
        System.out.println("**" + "Herder Behaviours" + "**");
        herder.bark();
        herder.run(1);
        herder.walk(1);
        herder.jump(1);
        herder.sleep(1);
        herder.eat(1);
        herder.dispDetails();

        Doberman dober = new Doberman("hitam", "hitam", "besar", 'L', 45, 55, 4, 4, 2, 2, true, true);
        System.out.println("-".repeat(30));
        System.out.println("**" + "Doberman Behaviours" + "**");
        dober.bark();
        dober.run(2);
        dober.walk(2);
        dober.jump(2);
        dober.sleep(2);
        dober.eat(2);
        dober.dispDetails();

        Dashund dash = new Dashund("coklat", "hitam", "kecil", 'p', 20, 15, 4, 4, 2, 2, true, true);
        System.out.println("-".repeat(30));
        System.out.println("**" + "Dashund Behaviours" + "**");
        dash.bark();
        dash.run(2);
        dash.walk(2);
        dash.jump(2);
        dash.sleep(2);
        dash.eat(2);
        dash.dispDetails();

        Bulldog bull = new Bulldog("putih hitam", "hitam", "sedang", 'L', 35, 30, 4, 4, 2, 2, true, true);
        System.out.println("-".repeat(30));
        System.out.println("**" + "Bulldog Behaviours" + "**");
        bull.bark();
        bull.run(2);
        bull.walk(2);
        bull.jump(2);
        bull.sleep(2);
        bull.eat(2);
        bull.dispDetails();

        Husky husky = new Husky("putih", "biru", "besar", 'L', 50, 55, 4, 4, 2, 2, true, true);
        System.out.println("-".repeat(30));
        System.out.println("**" + "Husky Behaviours" + "**");
        husky.bark();
        husky.run(3);
        husky.walk(3);
        husky.jump(3);
        husky.sleep(3);
        husky.eat(3);
        husky.dispDetails();
    }
}
