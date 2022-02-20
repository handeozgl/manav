import java.util.Scanner;
public class manavhesap {
    public static void main(String[] args) {
        double armutkilo=2.14 , elmakilo= 3.67, domateskilo = 1.11 , muzkilo= 0.95 , patlıcankilo = 5.00, armut, elma, domates, muz, patlican, toplamtutar;
        Scanner input= new Scanner(System.in);
        System.out.println("Kac km armut istersiniz= ");
        armut = input.nextDouble();
        System.out.println("Kac km elma istersiniz= ");
        elma = input.nextDouble();
        System.out.println("Kac km domates istersiniz= ");
        domates = input.nextDouble();
        System.out.println("Kac km muz istersiniz= ");
        muz = input.nextDouble();
        System.out.println("Kac km patlican istersiniz= ");
        patlican = input.nextDouble();
        toplamtutar= (armut*armutkilo) + (muz*muzkilo) + (domates*domateskilo) + (elma*elmakilo)+ (patlican*patlıcankilo);
        System.out.println("Borcunuz: "+ toplamtutar);



    }
}
