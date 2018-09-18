import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class WebScraper {


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;

    }
    public static void main(String[] unused) {
String a = new String("https://www.bls.gov/tus/charts/chart9.txt");
        String b = urlToString(a);
System.out.println(b);
        int count = 0;
        if (!(" ".equals(b.substring(0, 1))) || !(" ".equals(b.substring(b.length() - 1))))
        {
            for (int i = 0; i < b.length(); i++)
            {
                if (b.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        System.out.println(count);

    }


}
