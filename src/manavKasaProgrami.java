import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95;
        int patlican = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? :");
        armut *= input.nextDouble();

        System.out.print("Elma Kaç Kilo? :");
        elma *= input.nextDouble();

        System.out.print("Domates Kaç Kilo? :");
        domates *= input.nextDouble();

        System.out.print("Muz Kaç Kilo? :");
        muz *= input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? :");
        patlican *= input.nextInt();

        double toplam = 0;

        toplam += (armut + elma + domates + muz + patlican);
        System.out.println("Toplam Tutar:" +toplam);



    }
}
