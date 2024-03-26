public class Ex1 {
    public static void main(String[] args) {

        byte xbyte = -8; // Tipe data byte digunakan untuk menyimpan data berupa bilangan bulat dalam
                         // rentang yang terbatas dari -128 hingga 127.
        System.out.println(xbyte);

        short xshort = 18000; // Tipe data short digunakan untuk menyimpan bilangan bulat yang memiliki
                              // rentang lebih besar daripada byte (-32,768 hingga 32,767).
        System.out.println(xshort);

        int xint = 8; // Tipe data int digunakan untuk menyimpan bilangan bulat dalam rentang yang
                      // cukup besar dari -2,147,483,648 hingga 2,147,483,647.
        System.out.println(xint);

        long xlong = 911111111; // Tipe data long digunakan untuk menyimpan bilangan bulat dengan rentang yang
                                // lebih besar daripada int (-9,223,372,036,854,775,808 hingga
                                // 9,223,372,036,854,775,807).
        System.out.println(xlong);

        float xfloat = 000.1f; // Tipe data float digunakan untuk menyimpan bilangan pecahan (desimal) dengan
                               // presisi yang lebih rendah dibandingkan dengan double (6 sampai 7 bilangan
                               // desimal).
        System.out.println(xfloat);

        double xdouble = 0.1111; // Tipe data double digunakan untuk menyimpan bilangan pecahan (desimal) dengan
                                 // presisi yang lebih tinggi daripada float (dapat memunculkan hingga 15
                                 // bilangan desimal).
        System.out.println(xdouble);

        boolean mybool = false; // Tipe data boolean digunakan untuk menyimpan nilai kebenaran, yaitu true atau
                                // false.
        System.out.println(mybool);

        char mychar = 'D'; // Tipe data char digunakan untuk menyimpan satu karakter dan karakter disimpan
                           // dalam bentuk ASCII.
        System.out.println(mychar);

        String myString = "Hello world"; // Tipe data String digunakan untuk menyimpan teks atau rangkaian karakter.
        System.out.println(myString);

        String[] course = { "OOP", "Database", "Calculus", "Web Programming" }; // Tipe data Array digunakan untuk
                                                                                // menyimpan kumpulan elemen dengan tipe
                                                                                // data yang sama.
        System.out.println(course[0]);

    }
}
