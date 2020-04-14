import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        String Hello = "Hi";
        System.out.println(Hello + " Musa");

       OddorEven();
       square();
       triangle();
       isosceles();
       isosceles2();
        String[] longest = {"the", "quick", "brown", "fox", "ate", "my", "chicken", "content"};
       Array(longest);
       Arr(longest);
        int[] number1 = {1, 2, 3, 4};
        int[] number2 = {11, 22, 33, 44};
        combine(number1, number2);
    }

    public static void OddorEven() {
        int x;

        System.out.println("Enter an number to check if it's odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("is even.");
        else
            System.out.println("is odd.");
    }

    public static void square() {
        int x, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number ");
        x = input.nextInt();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void triangle() {
        int x, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number ");
        x = input.nextInt();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }

    }

    public static void isosceles() {
        int i, j, k;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number ");
        number = input.nextInt();

        for (i = 1; i <= number; i++) {

            for (j = i; j <= number; j++)
                System.out.print("");
            for (k = 1; k < (i * 2); k++)
                System.out.print("#");
            System.out.println("\n");
        }

    }

    public static void isosceles2(){

    int spacecounter = 4;
    int hashcounter=1;
        for (int i=1;i<=4;i++) {
            System.out.println();
            for (int j = 1; j < spacecounter; j++)
                System.out.print(" ");
            for (int k = 1; k <= hashcounter; k++)
                System.out.print("#");

            spacecounter--;
            hashcounter = hashcounter + 2;
        }

    }


    public static void Array(String[] input) {
    String longestString = input[0];
    for (int i = 0; i < input.length; i++) {
        if (longestString.length() < input[i].length()) {
            longestString = input[i];
        }
    }
    System.out.println(longestString);
}
    public static void Arr(String[] input) {
        String longestString = input[0];
        for (int i = 0; i < input.length; i++) {
            if (longestString.length() <= input[i].length()) {
                longestString = input[i];
            }


        }
        for (int i = 0; i < input.length; i++) {
            if (longestString.length() == input[i].length()) {
                System.out.println(input[i]);
            }

        }
    }
    public static void combine(int[] number1, int[] number2){

        List<Integer> li= new ArrayList<Integer>();
        for (int i=0;i<number1.length;i++){
            if(i%2==0){
                li.add(number1[i]);
                li.add(number2[i]);
            }
            else{
                li.add(number1[i]);
                li.add(number2[i]);
            }
        }
        System.out.println(li.toString());
    }
}
