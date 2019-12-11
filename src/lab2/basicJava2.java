package lab2;

import java.util.Scanner;

public class basicJava2 {
    public static void main (String[]args){
        //input
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter you name");
//        String name = sc.nextLine();
//
//        System.out.println("You name is"+name);
//
//        System.out.print("Enter you email");
//        String email = sc.nextLine();
//        System.out.println("You email is"+email);
//
//        System.out.print("Enter you old");
//        String old = sc.nextLine();
//        System.out.println("You old is"+old);

        //input integer and floating
        System.out.print("Enter an number: ");
        int num = sc.nextInt();
        System.out.println("Your entered number:"+num);

        System.out.print("Enter a real number: ");
        double d = sc.nextDouble();
        System.out.println(d);
    }




}//class
