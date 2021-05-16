import java.util.Random;

public class SicaklikOku {

    public int SicaklikOku() {

        Random deger = new Random();
        int s=deger.nextInt(100);
        System.out.println("sicaklik: "+s+"°C");


        if(s>70){
            System.out.println("kritik sicaklik... "+"sicaklik: "+s+"°C sogutucu acmaniz tavsiye edilir\n");
        }

        Mesaj m=new Mesaj();
        m.sendMesaj();

        return s;


    }

}