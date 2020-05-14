package hometask_JavaCore05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 10 ");
        printNumbers();
        printFive();
        notSeven();
        System.out.println("Numbers from 20 to 0 ");
        printNumbersFrom20();
        printAnotherFive();
        notSevenAgain();

        numbersInPower();

        fibonacci();

        sumOfEvenAndOddIntegers();
    }

public static void printNumbers(){
    for (int i = 1; i <= 10; i++) {
        printWithSpace(i);

    }System.out.println();
}

 public static void printFive(){
     for (int i = 1; i <=10 ; i++) {
         if(i == 5) {
             System.out.print(" Five ");
         } else printWithSpace(i);
     }System.out.println();
 }

 public static void notSeven(){
     for (int i = 1; i <=10 ; i++) {
         if(i !=7){
             printWithSpace(i);
         }
     }System.out.println();
 }

    public static void printNumbersFrom20(){
        for (int i = 20; i >= 0; i--) {
            printWithSpace(i);
        }System.out.println();
    }

    public static void printAnotherFive(){
        for (int i = 20; i >=0 ; i--) {
            if(i == 5) {
                System.out.print(" Five ");
            } else printWithSpace(i);
        }System.out.println();
    }

    public static void notSevenAgain(){
        for (int i = 20; i >=0 ; i--) {
            if(i !=7){
                printWithSpace(i);
            }
        }System.out.println();
    }


    public static void numbersInPower(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

            int result = 1;
            for (int i=1; i<=b; i++){
                result = result*a;
            }
         System.out.println("Number in power of " + a + " and " + b + " is: " + result);

    }


    public static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number for Fibonacci series: ");
        int count = sc.nextInt();
        int a = 0, b = 1;

        System.out.print("Fibonacci series of " + count + " is: ");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(a + " ");

            int result = a + b;
            a = b;
            b = result;
        }

    }


    public static List listOfIntegers(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("\n Please, enter a set of Integers: ");
        while (true)
        {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }
        return list;


        }

public static void sumOfEvenAndOddIntegers(){

        List list = listOfIntegers();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();


    for (int i = 0; i < list.size(); i++) {
        int x = (int)list.get(i);
        if (x % 2 == 0) {
            even.add(x);
        } else {
            odd.add(x);
        }
    }
    int sumOfEvens = 0;
    int sumOfOdds = 0;
    for (int i = 0; i < even.size(); i++) {
        sumOfEvens += even.get(i);
    }
    for (int i = 0; i < odd.size(); i++) {
        sumOfOdds += odd.get(i);
    }

    System.out.println("Even numbers are: " + even);
    System.out.println("The sum of even numbers is " + sumOfEvens);
    System.out.println("Odd numbers are: " + odd);
    System.out.println("The sum of odd numbers is " + sumOfOdds);

}



 public static void printWithSpace(int i){
     System.out.print(i + " ");
 }



}
