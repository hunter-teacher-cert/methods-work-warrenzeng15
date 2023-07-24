import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * By replacing a few things from wikipedia.java, we can turn the program into one that
 * spits out links for each individual image on a web page
 */
public class Images {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        System.out.println(doc.title());

        Elements images = doc.select("img");
        for (Element image : images) {
          //  System.out.print(headline.attr("title") + "\n\t");
            System.out.println(image.absUrl("src"));
        }
    }
}
