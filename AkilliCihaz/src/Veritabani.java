import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Veritabani implements IVeritabani{
    private String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
    private String userName = "postgres";
    private String password = "4658";

    private Connection baglan(){
        Connection conn=null;
        try{
            conn = DriverManager.getConnection(dbUrl,userName,password);
            if (conn != null)
               Thread.sleep(500);
            System.out.println("Veritabaniya baglanti kuruluyor...");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public boolean kullaniciDogrula(String ad, String sifre){
        Connection conn=this.baglan();
        String ifade= "SELECT \"kullaniciAdi\",\"sifre\" FROM \"kullanici\" WHERE \"kullaniciAdi\"="+"'"+ad+"'"+"AND \"sifre\"="+"'"+sifre+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(ifade);
            conn.close();
            if(!rs.next()){
                return false;
            }
            else{
                Thread.sleep(1000);
                System.out.println("Kullanıcı doğrulandı!");
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
