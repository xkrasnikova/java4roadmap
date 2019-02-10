package task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHelper {


  public static Scanner OpenInputFile() throws FileNotFoundException {
    return new Scanner(new FileInputStream("inputFile.txt"));
  }

  protected static void WriteOutputFile(int maxHeartRate, int easyActivityZoneMin, int easyActivityZoneMax, int beginningFatBurningZoneMin, int beginningFatBurningZoneMax, int aerobicZoneMin, int aerobicZoneMax, int anaerobicZoneMin, int anaerobicZoneMax, int VO2Min) throws FileNotFoundException {
    System.setOut(new PrintStream(new FileOutputStream("outputFile.txt")));
    System.out.println("Recommended heart rate for you:");
    System.out.println("- at easy activity zone: from " + easyActivityZoneMin + " to " + easyActivityZoneMax);
    System.out.println("- at beginning fat burning zone: from " + beginningFatBurningZoneMin + " to " + beginningFatBurningZoneMax);
    System.out.println("- at aerobic zone: from " + aerobicZoneMin + " to " + aerobicZoneMax);
    System.out.println("- at anaerobic zone: from " + anaerobicZoneMin + " to " + anaerobicZoneMax);
    System.out.println("- at VO2 max zone: from " + VO2Min + " to " + maxHeartRate);
    System.out.println("- max heart rate " + maxHeartRate);
  }
}
