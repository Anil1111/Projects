/* web.java */
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import javax.swing.*;
public class Web
{
   public static void main(String[] args)
   {
      try
      {
      Document doc = Jsoup.connect("http://time.is/").get();
      String title = doc.title();
      
      Element time = doc.select("#twd").first();
      // <div id="twd">01:19:25<span id="ampm" style="font-size:32px;line-height:32px">pm</span></div>
      JOptionPane.showMessageDialog(null, time.text());
      }
      catch (IOException ex)
      {
      JOptionPane.showMessageDialog(null, ex.toString());
      }
   }// end main
}// end class