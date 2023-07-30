// Write a program to display all the HTTP header
import java.net.*;

public class qn20{
    public static void main(String[] args) {
        try{
            URL u = new URL("https://www.example.com");
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();
            for(int i=0; i<=7; i++){
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
            huc.disconnect();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}