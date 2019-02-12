
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws IOException {

    String inFile = new String( Files.readAllBytes(Paths.get("inputFile.txt")));  // new Scanner(new File("inputFile.txt"));
    int count = 0;
    int sumManual = 0;
    int sumAuto = Arrays.stream(inFile.split(" ")).mapToInt(Integer::parseInt).sum();

    //calculate sumManual

    //fill the array
    String subArr[] = inFile.split(" ");
    int arr[] = new int [subArr.length]; //new array is created
      for (int i = 0; i < subArr.length; i++) {
        arr[i] = Integer.parseInt(subArr[i]);
      }

    for (int i = 0; i < subArr.length; i++) {
      sumManual = sumManual + arr[i];
    }

    System.setOut(new PrintStream("outputFile.txt"));
    System.out.println("Sum manual = " + sumManual);
    System.out.println("Sum auto = " + sumAuto);

  }
}

