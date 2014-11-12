/* AtomicDriver.java */


public class AtmoicDriver
{
   private GetAtomicNTP getAtomicNTP;
   public static void main(String[] args)
   {
      GetAtomicNTP getAtomicNTP = new GetAtomicNTP();
      getAtomicNTP.retrieveTime();
   }


}//end class