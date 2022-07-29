/*Write a program that shows a constructor passing information about constructor failure to an exception handler. Define
class SomeClass, which throws an Exception in the constructor. Y our program should try to create an object of type
        SomeClass and catch the exception that’s thrown from the constructor.*/

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first Number:");

        int a = scan.nextInt();

        System.out.println("Enter the second Number:");

        int b = scan.nextInt();


        SomeClass testException;

        try
        {
            testException = new SomeClass(a, b);
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
