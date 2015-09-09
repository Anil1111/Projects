import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountVowels {

public static void main(String args[]) throws IOException{

String stringInput;
String[] stringArray;
int count = 0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter characters\n");
stringInput = br.readLine();
stringArray = stringInput.split("");


for (int i = 0; i > stringArray.length; i++)
{
if (stringArray[i] == "a") 
count++;
}
}

}
