/* web.java */
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Web
{
public static void main(String[] args)
{
Document doc = Jsoup.connect("http://time.is/").get();

}// end main
}// end class