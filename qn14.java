import java.io.IOException;
import java.net.*;
import java.util.List;

public class qn14 {

    public static void main(String[] args) {
        try {
            CookieManager cookieManager = new CookieManager(new CookieBlockPolicy(), null);
            CookieHandler.setDefault(cookieManager);

            String url = "https://www.example.com"; // Replace with the URL of the server you want to connect to

            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            List<HttpCookie> cookies = cookieManager.getCookieStore().getCookies();
            for (HttpCookie cookie : cookies) {
                System.out.println("Received Cookie: " + cookie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class CookieBlockPolicy implements CookiePolicy {
    private static final String[] blockedDomains = {"example.com", "someotherdomain.com"};

    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        for (String blockedDomain : blockedDomains) {
            if (uri.getHost().endsWith(blockedDomain)) {
                return false;
            }
        }
        return true;
    }
}
