import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseString {

public static void main(String args[]) throws IOException{

String stringInput;
String[] stringArray;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter characters\n");
stringInput = br.readLine();
stringArray = stringInput.split("");

for (int i = stringArray.length -1; i > 0; i--)
{
System.out.print(stringArray[i]);
}
}
}