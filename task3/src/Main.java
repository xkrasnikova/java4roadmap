
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) throws IOException {

    String inFile = new String( Files.readAllBytes(Paths.get("inputFile.txt")));  // new Scanner(new File("inputFile.txt"));
    int minManual = 10000;
    int maxManual = -10000;

    String subArr[] = inFile.split(" ");
    int arr[] = new int [subArr.length]; //new array is created
    //fill the array
    for (int i = 0; i < subArr.length; i++) {
      arr[i] = Integer.parseInt(subArr[i]);
    }

    //get min and max automatically
    int minAuto = Arrays.stream(arr).min().getAsInt();
    int maxAuto = Arrays.stream(arr).max().getAsInt();

    //get min and max manually
    for (int i = 0; i < subArr.length; i++) {
      if (arr[i] > maxManual) {
        maxManual = arr[i];
      }
      if (arr[i] < minManual) {
        minManual = arr[i];
      }
    }

    System.setOut(new PrintStream("outputFile.txt"));
    System.out.println("Max element in array (manual) = " + maxManual);
    System.out.println("Min element in array (manual) = " + minManual);
    System.out.println("Max element in array (auto) = " + maxAuto);
    System.out.println("Min element in array (auto) = " + minAuto);
  }
}

