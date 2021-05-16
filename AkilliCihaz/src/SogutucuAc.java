

public class SogutucuAc extends SicaklikOku {
    public void SogutucuAc(){

        System.out.println("Sogutucu acildi.\n");
        try
        {
            Thread.sleep(1000);
            System.out.println("Sogutucu calıstırılıyor...\n");
            Thread.sleep(1000);
            System.out.println("Sicaklik dusuruldu.\n");
            Thread.sleep(1000);

        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        Mesaj m=new Mesaj();
        m.sendMesaj();
    }

}
