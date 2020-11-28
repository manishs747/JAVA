package url;


import java.net.MalformedURLException;
import java.net.URL;

public class UrlExample {

    public static String Host = "http://stg-api.qarth-taxomanish.cdqarth.prod.manish.com";
    public static String PATH = "/taxonomy/g/store/v/~draft/nodes";



    public static void main(String[] args) throws MalformedURLException {
        URL baseUrl = new URL(Host);
        URL relativeUrl = new URL(
                baseUrl, PATH);
        System.out.println(relativeUrl);
    }

}
