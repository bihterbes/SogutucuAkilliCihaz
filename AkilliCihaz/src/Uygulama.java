import java.util.Scanner;

public class Uygulama {
    private IVeritabani veriTabani;
    private Scanner scan=new Scanner(System.in);
    private static final int sure=100;

    public Uygulama() {

        veriTabani=new Veritabani();
    }

    public void giris(){
        String kullaniciAdi,sifre;
        System.out.println("Kullanıcı adı ve şifre girin.");
        System.out.print("Kullanıcı Adı:");
        kullaniciAdi=scan.next();
        System.out.print("Şifre:");
        sifre=scan.next();

        if(veriTabani.kullaniciDogrula(kullaniciAdi,sifre)){
            System.out.println("Baglanti basarili!\n");
            Mesaj m = new Mesaj();
            m.sendMesaj();
        }
        else{
            System.out.println("Kullanıcı Doğrulanamadı..");
        }
    }


}
