package com.nymble.Util;

import java.util.Scanner;
public class ScannerUtil {
  private static final Scanner scanner = new Scanner(System.in);
  /**
   * Private constructor to prevent instantiation of this utility class.
   */
  private ScannerUtil(){

  }
  /**
   * This method returns the singleton Scanner object.
   *
   * @return The Scanner object.
   */
  public static Scanner getScanner() {
    return scanner;
  }

}
