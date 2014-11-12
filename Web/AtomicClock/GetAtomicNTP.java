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
   private static String dateString;
   public static String retrieveTime()
   {
      
      NTPUDPClient client = new NTPUDPClient();
      String ntpServer = "nist1-pa.ustiming.org";
      client.setDefaultTimeout(10000);
      try
      {
         client.open();
         InetAddress serverAddress = InetAddress.getByName(ntpServer);
         TimeInfo timeInfo = client.getTime(serverAddress);
         NtpV3Packet response = timeInfo.getMessage();
         TimeStamp timeStamp = response.getReferenceTimeStamp();
         dateString = timeStamp.toDateString();
      }
      catch (IOException ex) {
         ex.printStackTrace();
      
      }
      return dateString;
   }
}// end class