//Muhammad Aditya Kurniawan
//2006577340
import java.util.Scanner;
public class Tugas1OOP
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka 1");
        int angka_1 = scanner.nextInt();
        System.out.println("Masukkan angka 2");
        int angka_2 = scanner.nextInt();
        display1();
        int operator = scanner.nextInt();
        kalkulasi(operator, angka_1, angka_2);
        display2();
    }
    public static void display1() {
        System.out.println("Pilih operator");
        System.out.println("1. +\n2. -\n3. *\n4. /\ndefault. keluar\nHarap masukkan angka");
    }
    public static void display2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nMasukkan angka 1");
        int angka_1 = scanner.nextInt();
        System.out.println("Masukkan angka 2\n\n");
        int angka_2 = scanner.nextInt();
        display1();
        int operator = scanner.nextInt();
        kalkulasi(operator, angka_1, angka_2);
        display2();
    }
    public static void kalkulasi(int operator, int angka_1, int angka_2) {
        switch (operator){
        case 1: 
            System.out.println("angka 1 = "+ angka_1);
            System.out.println("angka 2 = "+ angka_2);
            System.out.println(angka_1+" + "+angka_2+" = "+(angka_1+angka_2));
        break;
        case 2: 
            System.out.println("angka 1 = "+ angka_1);
            System.out.println("angka 2 = "+ angka_2);
            System.out.println(angka_1+" - "+angka_2+" = "+(angka_1-angka_2));
        break;
        case 3: 
            System.out.println("angka 1 = "+ angka_1);
            System.out.println("angka 2 = "+ angka_2);
            System.out.println(angka_1+" * "+angka_2+" = "+(angka_1*angka_2));
        break;
        case 4: 
            System.out.println("angka 1 = "+ angka_1);
            System.out.println("angka 2 = "+ angka_2);
            System.out.println(angka_1+" / "+angka_2+" = "+((double)angka_1/(double)angka_2));
        break;
        default: System.exit(0);
        break;
        }
    }
}
