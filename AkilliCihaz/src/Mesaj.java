public class Mesaj implements IMesaj{

    @Override
    public void sendMesaj() {
        secenekler();
    }

    private void secenekler() {
        try
        {
            Thread.sleep(1000);
            System.out.println("-----islemler-----\n");
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("1-Sogutucu Ac\n" +
                "2-Sogutucu Kapat\n" +
                "3-Sicaklik Goruntule\n" +
                "4-Cikis yap\n");
          Secenek bu=new Secenek();
          bu.Sec();
    }

    }
