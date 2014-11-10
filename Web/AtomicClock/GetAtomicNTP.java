/* GetAtomicNTP.java */
import java.io.IOException;
import java.net.InetAddress;
import java.text.NumberFormat;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;

public class GetAtomicNTP
{
   public static void main(String[] args)
   {
      NTPUDPClient client = new NTPUDPClient();
      String ntpServer = "nist1-pa.ustiming.org";
      client.setDefaultTimeout(10000);
      try
      {
         client.open();
         InetAddress serverAddress = InetAddress.getByName(ntpServer);
         TimeInfo timeInfo = client.getTime(serverAddress);
         processTime(timeInfo);
      }
      catch (IOException ex) {
         ex.printStackTrace();
      }
   
   }// end main
   private static void processTime(TimeInfo time)
   {
      NtpV3Packet response = time.getMessage();
      TimeStamp timeStamp = response.getReferenceTimeStamp();
      System.out.println(timeStamp.toDateString());
   } //end processTime
}// end class