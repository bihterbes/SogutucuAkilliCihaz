import java.util.Scanner;

public class Secenek {
    public static void Sec()
    {
        System.out.println("1-4 arasi tercih yapiniz... ");
        Scanner scanner = new Scanner(System.in);
        int secim= scanner.nextInt();
        if(secim==1){
            SogutucuAc ac=new SogutucuAc();
            ac.SogutucuAc();
        }
        else if(secim==2){
            SogutucuKapa kapa=new SogutucuKapa();
            kapa.SogutucuKapa();
        }
        else if(secim==3){
            SicaklikOku oku=new SicaklikOku();
            oku.SicaklikOku();
        }
        else if(secim==4){
            System.out.println("Basarili sekilde cikis yaptiniz...");
        }
        else {
            System.out.println("hatali girdi...");
        }
    }

}
