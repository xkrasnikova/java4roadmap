package task1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends FileHelper{

  public static void main(String[] args) throws FileNotFoundException {

    Scanner inFile = OpenInputFile();

    int age = inFile.nextInt();
    int relaxedHeartRate = inFile.nextInt();

    int maxHeartRate = 220 - age;

    int easyActivityZoneMin = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.5 + relaxedHeartRate);
    int easyActivityZoneMax = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.6 + relaxedHeartRate);

    int beginningFatBurningZoneMin = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.6 + relaxedHeartRate);
    int beginningFatBurningZoneMax = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.7 + relaxedHeartRate);

    int aerobicZoneMin = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.7 + relaxedHeartRate);
    int aerobicZoneMax = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.8 + relaxedHeartRate);

    int anaerobicZoneMin = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.8 + relaxedHeartRate);
    int anaerobicZoneMax = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.9 + relaxedHeartRate);

    int VO2Min = (int)Math.round((maxHeartRate - relaxedHeartRate) * 0.9 + relaxedHeartRate);

    WriteOutputFile(maxHeartRate, easyActivityZoneMin, easyActivityZoneMax, beginningFatBurningZoneMin, beginningFatBurningZoneMax, aerobicZoneMin, aerobicZoneMax, anaerobicZoneMin, anaerobicZoneMax, VO2Min);
  }

}

