package lab5;

import java.util.Scanner;

public class ExArray2D {
    //Array 2 มิติ คือตัวแปรที่เก็บข้อม฿ลในลักษณะของตาราง แถวแนวนอน (row) และแถวแนวตั้ง(column)
    //โดยใช้เลข index 2 ตัว ในการเข้าถึงข้อมูลใน array เช่น x[0][0]

    public static void main(String[] args) {
        int x[] [] = new int[2][3]; //6 [5][10]=50, last block = [4][49]

        x[0][0] = 10;
        //input data to array 2D
        x = inputDataArray(x);

        //displar data in array
        showDataArray(x);


    }

    private static void showDataArray(int[][] x) {
        System.out.println("Data in array: ");
        int total = 0;

        for (int i = 0; i <x.length ; i++) { //วนลูปแถวแนวนอน
            for (int j = 0; j <x[i].length ; j++) { //วนลูปแถวแนวตั้ง
                System.out.print(x[i][j]+"");
                total +=x[i][j]; //นำข้อมูลทุกบล็อกมารวบรวมกันแล้วเก็บไว้ใน total

            }//j
            System.out.println();
        }//i
        //show total and average
        System.out.println("Total value : "+total);
        System.out.println("Average value: "+(total/6));
    }

    private static int[][] inputDataArray(int[][] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer to array below: ");

        for (int i = 0; i <x.length ; i++) { //วนลูปแถวแนวนอน
            for (int j = 0; j <x[i].length ; j++) { //วนลูปแถวแนวตั้ง
                System.out.print("input: ");
                x[i][j] = sc.nextInt();
            }//j
        }//i
        return x;
    }

}


