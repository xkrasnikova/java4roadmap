
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws IOException {

    File inFile = new File("inputFile.txt");

    Scanner scanner = new Scanner(inFile);  // new Scanner(new File("inputFile.txt"));
    String a = scanner.nextLine();
    String b = scanner.nextLine();

    //fill the  arrays
    List<String> arr1  = fillArray(a);
    List<String> arr2  = fillArray(b);
    List<String> arr3  = fillArray(a);
    List<String> arr4  = fillArray(b);

    //find common elements of two arrays (auto)
    arr1.retainAll(arr2);

    //find common elements of two arrays (manual)

    ArrayList<String> arr5 = new ArrayList<String>();
    for (String temp : arr3){
      if (arr4.contains(temp)){
        arr5.add(temp);
      }
    }


    //write results to file
    System.setOut(new PrintStream("outputFile.txt"));
    System.out.println("First array = " + arr3);
    System.out.println("Second array = " + arr4);
    System.out.println("Common elements of two arrays (auto) = " + arr1);
    System.out.println("Common elements of two arrays (manual) = " + arr5);

  }

  private static ArrayList<String> fillArray(String a) {
    String subArr[] = a.split(" ");
    ArrayList<String> arr = new ArrayList<String>(); //new array is created
    arr.addAll(Arrays.asList(subArr));
    return arr;
  }
}

