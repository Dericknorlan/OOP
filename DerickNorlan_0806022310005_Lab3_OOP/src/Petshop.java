import java.util.*;
public class Petshop{
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static public void main(String[] args){
        Petshop.clearScreen();
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Chihuahua Dog1 =  new Chihuahua("Small", true, "cuki", "Chihuahua");
        dogList.add(Dog1);
        Pomeranian Dog2 =  new Pomeranian("Small", false, "badut", "Pomeranian");
        dogList.add(Dog2);
        Poodel Dog3 =  new Poodel("Small", false, "coco", "Poodel");
        dogList.add(Dog3);
        Dashund Dog4 =  new Dashund("Small", true, "avatar", "Dashund");
        dogList.add(Dog4);
        Shiba Dog5 =  new Shiba("Medium", true, "sekia", "Shiba");
        dogList.add(Dog5);
        Bulldog Dog6 =  new Bulldog("Medium", false, "shipal", "Bulldog");
        dogList.add(Dog6);
        Corgy Dog7 =  new Corgy("Medium", true, "corgi", "Corgy");
        dogList.add(Dog7);
        GermanShepherd Dog8 =  new GermanShepherd("Large", false, "dawn", "German Shepherd");
        dogList.add(Dog8);
        Husky Dog9 =  new Husky("Large", true, "pepe", "Husky");
        dogList.add(Dog9);
        Herder Dog10 =  new Herder("Large", true, "manta", "Herder");
        dogList.add(Dog10);

        int i = 1;
        
        System.out.printf("----------------------------------------------------------------------------------------%n");
        System.out.printf("| Pet Shop                                                                             |%n");
        System.out.printf("+--------------------------------------------------------------------------------------+%n");
        System.out.printf("| %-3s | %-10s | %-20s | %8s | %-15s | %-13s |%n", "No.", "Nama", "Jenis", "Ukuran", "Jadwal Makan", "Status Makan");
        System.out.printf("+--------------------------------------------------------------------------------------+%n");
        for(Dog dog:dogList){
            System.out.printf("| %-3s | %-10s | %-20s | %8s | %-15s | %-13s |%n", i, (dog.getNama()), (dog.getJenis()), dog.getUkuran(), dog.getJadwalMakan() + " Kali Sehari ",(dog.getIsSudahMakan()) ? "Sudah Makan" : "Belum Makan");
            i++;
        }
        System.out.printf("+--------------------------------------------------------------------------------------+%n");
    }
}

