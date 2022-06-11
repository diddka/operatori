import java.util.Scanner;
//Дадени са 3 числа.
       // int a, b, c;
        //Напишете програма, която проверява дали съществува
        //триъгълник с дължини на страните, равни на дадените числа.
        //За да съществува триъгълник с дадени дължини на страните,
        //трябва всяка страна да е по-малка от сбора на другите 2
        //страни. Също така всяка страна трябва да е положително
        //число.
        //Прочетете страните от конзолата.

public class hom4 {
    public static void testCommit(){

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a - ");
        int sideA= input.nextInt();
        System.out.print("Enter b - ");
        int sideB = input.nextInt();
        System.out.print("Enter c - ");
        int sideC = input.nextInt();

        boolean triangle = sideA<(sideB+sideC) && sideB<(sideA+sideC) && sideC<(sideA+sideB);
        System.out.println("Is there a triangle - " + triangle);
    }
}
