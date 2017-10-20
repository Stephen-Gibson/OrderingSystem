package com.company;

import java.util.Scanner;

public class Main {

  private static final int APPLE_PRICE = 20;
  private static final int ORANGE_PRICE = 25;
  private static final int BANANA_PRICE = 30;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int shop = 1;
    int totalApple = 0;
    int totalOrange = 0;
    int totalBanana = 0;
    int appleQuantity = 0;
    int orangeQuantity = 0;
    int bananaQuantity = 0;
    int choice;
    long total;

    System.out.println("Welcome to the BMC Greengrocer");
    System.out.println("******************************");
    System.out.println();
    System.out.println("Item" + "\t" + "\t" + "\t" + "Price");
    System.out.println("****" + "\t" + "\t" + "\t" + "****************");
    System.out.println();
    System.out.println("1." + "\t" + "Apple" + "\t" + "\t" + "20");
    System.out.println("2." + "\t" + "Orange" + "\t" + "\t" + "25");
    System.out.println("3." + "\t" + "Banana" + "\t" + "\t" + "30");
    System.out.println();

    while (shop == 1) {
      System.out.print(
          "Choose what item you would like. Enter 1 for apple, 2 for orange or 3 for banana: ");
      choice = input.nextInt();

      if (choice == 1) {
        System.out.print("You have chosen apples. Type the quantity you would like: ");
        appleQuantity = appleQuantity + input.nextInt();
        System.out.print("You have chosen to buy " + appleQuantity + " apples. ");
        totalApple = (appleQuantity * APPLE_PRICE);
        System.out.println("The total price of the apples is " + totalApple + "p");
        System.out.println("Would you like to continue shopping? Enter 1 for yes or 2 for no.");
        shop = input.nextInt();
      } else {
        if (choice == 2) {
          System.out.print("You have chosen oranges. Type the quantity you would like: ");
          orangeQuantity = orangeQuantity + input.nextInt();
          System.out.print("You have chosen to buy " + orangeQuantity + " oranges. ");
          totalOrange = (orangeQuantity * ORANGE_PRICE);
          System.out.println("The total price of the oranges is " + totalOrange + "p");
          System.out.println("Would you like to continue shopping? Enter 1 for yes or 2 for no.");
          shop = input.nextInt();
        } else {
          System.out.print("You have chosen bananas. Type the quantity you would like: ");
          bananaQuantity = bananaQuantity + input.nextInt();
          System.out.print("You have chosen to buy " + bananaQuantity + " bananas. ");
          totalBanana = (bananaQuantity * BANANA_PRICE);
          System.out.println("The total price of the bananas is " + totalBanana + "p");
          System.out.println("Would you like to continue shopping? Enter 1 for yes or 2 for no.");
          shop = input.nextInt();
        }
      }
    }

    total = totalApple + totalOrange + totalBanana;
    System.out.println("Total Apples: " + appleQuantity);
    System.out.println("Total Oranges: " + orangeQuantity);
    System.out.println("Total Bananas: " + bananaQuantity);
    System.out.println("Total Cost: " + total + "p.");
  }
}
