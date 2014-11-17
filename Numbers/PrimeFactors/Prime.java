/* Prime.java */
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
// Sieve of Erastothenes
// See: http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

public class Prime
{

   public static void main(String[] args)
   {
   /* 
      int intIn;
      List<Integer> integers = new LinkedList<Integer>();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number: ");
      System.out.println();
      intIn = scanner.nextInt();
      for (int i = 0; i <= intIn; i++)
      {
         integers.add(i);
      }
      System.out.println("Integers added to list.\nPrinting them.");
      printList(integers);
      */
      Scanner scanner = new Scanner(System.in);
      int intIn;
      int sqrtUpperBound;
      boolean[] bool;
      System.out.println("Enter a number: ");
      intIn = scanner.nextInt();
      sqrtUpperBound = (int) Math.sqrt(intIn);
      
      bool = new boolean[intIn + 1];
      for (int i = 2; i <= sqrtUpperBound; i++)
      {
         if (!bool[i])
         {
            System.out.println(i + " ");
            for (int j = i * i; j <= intIn; j+=i)
               bool[j]=true;
         }
      }
      System.out.println("Done.");
      for (int i = sqrtUpperBound; i < intIn ; i++)
      {
      if (!bool[i])
         System.out.println(i + " ");
      }
      
   
   }
   
   private static void printList(List<Integer> list)   
   {      
      System.out.println("\nList: ");
      int width = 10;
      
           
      for (int integers : list)
      {
         
         System.out.printf("%d ", integers);
         if (integers % width == 0)
            System.out.println("\n");
      }   
   } //end
   
}// end class


